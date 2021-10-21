package com.example.controller;

import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.example.pojo.Person;
import com.example.pojo.User;
import com.example.service.PersonService;
import com.example.service.UserService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.data.redis.core.StringRedisTemplate;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import javax.servlet.http.HttpSession;
import java.io.File;
import java.io.IOException;
import java.util.*;

@Slf4j
@Controller
public class TestController {
    @Autowired
    private JdbcTemplate jdbcTemplate;
    @Autowired
    private PersonService personService;
    @Autowired
    private UserService userService;
    @Autowired
    private StringRedisTemplate redisTemplate;

    @RequestMapping("test02")
    public String test() {
        System.out.println("test method()......");
        return "test method()......";
    }

    @RequestMapping("test03")
    public String test03() {
        return "test03";
    }

    @GetMapping("user")
    public String getUser() {
        return "Get User";
    }

    @PostMapping("user")
    public String postUser() {
        return "Post User";
    }

    @PutMapping("user")
    public String putUser() {
        return "Put User";
    }


    // /matrix/1;name=zhangsan;age=30/2;name=lisi;age=40
    @PostMapping("/matrix/{BossId}/{EmpId}")
    public Map<String, Object> matrix(@MatrixVariable(value = "name", pathVar = "BossId") String name,
                                      @MatrixVariable(value = "age", pathVar = "EmpId") Integer age) {
        Map<String, Object> map = new HashMap<String, Object>();
        map.put("BossName", name);
        map.put("EmpAge", age);
        return map;
    }

    @RequestMapping("/save")
    @ResponseBody
    public String save(String weiboContent, MultipartFile fileImg) throws IOException {
        System.out.println("微博内容是：" + weiboContent);
        System.out.println(fileImg.getOriginalFilename());
        final String imagePathRoot = "D:\\图片\\test-image\\";
        File f = new File(imagePathRoot);
        if (!f.exists()) {
            f.mkdirs();
        }

        String fileName = fileImg.getOriginalFilename();
        String fileType = fileName.substring(fileName.lastIndexOf("."));
        String uuid = UUID.randomUUID().toString().replace("-", "");
        String imageFilePath = imagePathRoot + uuid + fileType;
        fileImg.transferTo(new File(imageFilePath));
        return "upload ok";
    }

    @RequestMapping("thymeleafTest")
    public String thymeleafTest(Model model) {
        model.addAttribute("msg", "thymeleafhahahaha");
        model.addAttribute("link", "https://www.baidu.com");
        return "thymeleaf"; //不需要写后缀
    }


    //访问默认页面以及首页跳转至登录页面
    @GetMapping({"/", "/login"})
    public String index() {
        return "login";
    }

    //登录操作
    @PostMapping("/login")
    public String login(User user, HttpSession session, Model model) {
        if (user != null) {
            if ("zhangsan".equals(user.getName()) && "pgmx0835".equals(user.getPsw())) {
                session.setAttribute("user", user);
                return "redirect:/index.html";
            }
        }
        System.out.println("登录失败,账号密码错误......");
        model.addAttribute("msg", "账号密码错误");
        return "login";
    }

    @GetMapping("/index.html")
    public String main(HttpSession session, Model model) {
        if (session.getAttribute("user") != null) {
            Integer indexCount = Integer.parseInt(redisTemplate.opsForValue().get("/index.html"));
            model.addAttribute("indexCount", indexCount);
            return "index";
        }
        model.addAttribute("msg", "请重新登录");
        return "login";
    }

    @GetMapping("/form_layouts.html")
    public String form_layouts() {
        return "form_layouts";
    }

    @PostMapping("/uploadFile")
    public String uploadFile(String email, String password,
                             @RequestParam("txImg") MultipartFile txImg,
                             @RequestParam("fileImg") MultipartFile[] fileImg) throws IOException {
        //获取文件原始名字（仅为名字，不包含路径）
        String txFileName = txImg.getOriginalFilename();
        log.info("email is {};password is {};txImg's name is{};", email, password, txFileName);
        File file = new File("D://SpringBoot文件上传");
        if (!file.exists()) {
            file.mkdir();
        }
        //单文件上传
        txImg.transferTo(new File("D://SpringBoot文件上传//" + txFileName));
        //多文件上传，遍历
        for (MultipartFile multipartFile : fileImg) {
            log.info(multipartFile.getOriginalFilename());
            multipartFile.transferTo(new File("D://SpringBoot文件上传//" +
                    multipartFile.getOriginalFilename()));
        }
        return "index";
    }

    @ResponseBody
    @GetMapping("/sqlquery")
    public String sqlQuery() {
        Long aLong = jdbcTemplate.queryForObject(
                "select count(*) from person", Long.class);
        log.info("记录总数是:" + aLong);
        return aLong.toString();
    }

    @ResponseBody
    @GetMapping("/getPerson")
    public Person getPersonById(@RequestParam Integer pid) {
        return personService.getPersonById(pid);
    }

    @ResponseBody
    @GetMapping("/personList")
    public List<Person> getAllPerson() {
        return personService.getAllPerson();
    }

    @RequestMapping("/dynamic_table.html")
    public String dynamic(@RequestParam(value = "cp", defaultValue = "1") Integer cp, Model model) {
        ModelAndView mav = new ModelAndView();
//        List<Person> personList = userService.list();
        Page<Person> page = new Page<>(cp, 5); //参数说明：当前页，一页的数据条数
        Page<Person> pageData = userService.page(page, null); //queryWrapper是查询条件
        model.addAttribute("pageData", pageData);
        //在打包成jar文件进行部署时，return HTML页面时需要把前面的"/"去掉
        return "dynamic_table";
    }

    @GetMapping("/deleteUser/{id}")
    public String deleteUser(@PathVariable("id") Long id,
                             @RequestParam(value = "cp", defaultValue = "1") Integer cp,
                             RedirectAttributes ra) {
        boolean removeById = userService.removeById(id);
        System.out.println(removeById);
        //重定向参数
        ra.addAttribute("cp", cp); //在重定向时，会自动将该参数传递过去
        //重定向
        return "redirect:/dynamic_table.html";
    }

    @Value("${person.pname:张三张三}")
    private String personName;

    @RequestMapping("/getPersonName")
    public String getPersonName() {
        return personName;
    }
}
