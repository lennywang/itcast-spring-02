package d_springaop;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import service.UserService;

import javax.annotation.Resource;

/**
 *
 **/

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:d_springaop/applicationContext.xml")
public class Demo {
   @Resource(name = "userService")
    private UserService userService;

   @Test
   public void fun1(){
       userService.save();
   }
}
