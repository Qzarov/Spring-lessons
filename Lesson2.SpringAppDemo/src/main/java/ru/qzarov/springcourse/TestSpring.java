package ru.qzarov.springcourse;

import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author Qzarov
 */
public class TestSpring {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(
            "applicationContext.xml"
        );

        TestBean test_bean = context.getBean("testBean", TestBean.class);

        System.out.println(test_bean.getName());

        context.close();
    }
}
