package com.example.actuator.info;

import org.springframework.boot.actuate.info.Info;
import org.springframework.boot.actuate.info.InfoContributor;
import org.springframework.stereotype.Component;

import java.util.HashMap;

@Component
public class MyInfoContributor implements InfoContributor {
    @Override
    public void contribute(Info.Builder builder) {
        HashMap<String, Object> hashMap = new HashMap<>();
        hashMap.put("webName02", "SringBoot自我学习项目");
        hashMap.put("webVersion02", "这是1.0.2版本");
        builder.withDetails(hashMap);
    }
}
