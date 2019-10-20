package a_annotation;

import com.itcast.bean.User;
import org.junit.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 *
 **/
public class Demo {
    @Test
    public void fun1()
    {
        // @AliasFor("scopeName")
        // String value() default "";

        ClassPathXmlApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");
        User user = (User) applicationContext.getBean("user");
        System.out.println(user);
        User user2 = (User) applicationContext.getBean("user");
        System.out.println(user==user2);
        applicationContext.close();
    }
}
