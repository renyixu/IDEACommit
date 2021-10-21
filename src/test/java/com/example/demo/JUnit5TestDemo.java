package com.example.demo;

import org.junit.Assert;
import org.junit.jupiter.api.*;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;
import org.junit.jupiter.params.provider.ValueSource;
import org.springframework.boot.test.context.SpringBootTest;

import java.time.Duration;
import java.util.EmptyStackException;
import java.util.Stack;
import java.util.concurrent.TimeUnit;
import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;
import static org.junit.jupiter.api.Assumptions.assumeFalse;
import static org.junit.jupiter.api.Assumptions.assumeTrue;

//@SpringBootTest
@DisplayName("JUnit5TestDemo测试类")
public class JUnit5TestDemo {

    @BeforeEach
    public void beforeEachTest() {
        System.out.println("beforeEachTest测试方法");
    }

    @BeforeAll
    public static void beforeAllTest() {
        System.out.println("beforeAllTest测试方法");
    }

    @AfterEach
    public void afterEachTest() {
        System.out.println("afterEachTest测试方法");
    }

    @AfterAll
    public static void afterAllTest() {
        System.out.println("afterAllTest测试方法");
    }

    @Test
    @DisplayName("test01测试方法")
    @Timeout(value = 500, unit = TimeUnit.MILLISECONDS)
    public void test01() throws InterruptedException {
        Thread.sleep(600);
        System.out.println("test01测试方法");
    }

    @Test
    public void assertionTest() {
        //1、简单断言
        assertEquals(3, 1 + 2, "不相等");
        assertNotEquals(4, 1 + 2, "相等");
        Object obj1 = new Object();
        Object obj2 = new Object();
        assertSame(obj1, obj2, "两个对象不指向同一个对象");
        assertNotSame(obj1, obj2, "两个对象指向同一个对象");
        assertTrue(1 == 1, "给定的值不为true");
        assertFalse(1 == 2, "给定的值不为false");
        assertNull(null, "给定的值不为null");
        assertNotNull(new Object(), "给定的值为null");

        //2、数组断言
        assertArrayEquals(new int[]{1, 2, 3, 4, 5},
                new int[]{1, 2, 4, 3, 5}, "两个数组不相等");

        //3、组合断言
        assertAll("组合断言",
                () -> assertEquals(3, 1 + 2),
                () -> assertTrue(1 < 2),
                () -> assertFalse(1 > 2)
        );

        //4、异常断言
        assertThrows(
                //抛出断言异常
                ArithmeticException.class,
                () -> System.out.println(1 / 1)
        );

        //5、超时断言
        //测试时间超过2秒就会抛出异常
        assertTimeout(Duration.ofSeconds(2),
                () -> Thread.sleep(1000));

        //6、快速失败
        fail("快速失败");
    }

    //参数化测试
    @ParameterizedTest
    //参数来源
    //@ValueSource(ints = {6, 4, 2, 1})
    @MethodSource("dataFrom")
    public void parameterizedTest(String i) {
        System.out.println(i);
    }

    //注意：方法必须是静态方法，返回值必须是Stream
    static Stream dataFrom() {
        return Stream.of("张三", "李四", "王五");
    }

    @Test
    @DisplayName("前置条件")
    public void assumeTest() {
        assumeTrue(true, "不是true");
        System.out.println(111);
        assumeFalse(true, "不是false");
    }

    @DisplayName("A stack")
    class TestingAStackDemo {

        Stack<Object> stack;

        @Test
        @DisplayName("is instantiated with new Stack()")
        void isInstantiatedWithNew() {
            new Stack<>();
        }

        @Nested
        @DisplayName("when new")
        class WhenNew {

            @BeforeEach
            void createNewStack() {
                stack = new Stack<>();
            }

            @Test
            @DisplayName("is empty")
            void isEmpty() {
                assertTrue(stack.isEmpty());
            }

            @Test
            @DisplayName("throws EmptyStackException when popped")
            void throwsExceptionWhenPopped() {
                assertThrows(EmptyStackException.class, stack::pop);
            }

            @Test
            @DisplayName("throws EmptyStackException when peeked")
            void throwsExceptionWhenPeeked() {
                assertThrows(EmptyStackException.class, stack::peek);
            }

            @Nested
            @DisplayName("after pushing an element")
            class AfterPushing {

                String anElement = "an element";

                @BeforeEach
                void pushAnElement() {
                    stack.push(anElement);
                }

                @Test
                @DisplayName("it is no longer empty")
                void isNotEmpty() {
                    assertFalse(stack.isEmpty());
                }

                @Test
                @DisplayName("returns the element when popped and is empty")
                void returnElementWhenPopped() {
                    assertEquals(anElement, stack.pop());
                    assertTrue(stack.isEmpty());
                }

                @Test
                @DisplayName("returns the element when peeked but remains not empty")
                void returnElementWhenPeeked() {
                    assertEquals(anElement, stack.peek());
                    assertFalse(stack.isEmpty());
                }
            }
        }
    }
}
