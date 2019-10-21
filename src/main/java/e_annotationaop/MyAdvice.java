package e_annotationaop;

import org.aspectj.lang.annotation.*;
import org.springframework.aop.aspectj.MethodInvocationProceedingJoinPoint;

/**
 *
 **/
@Aspect
public class MyAdvice {

    @Pointcut("execution(* service.UserServiceImpl.*(..))")
    //@Pointcut("execution(* service.*ServiceImpl.*(..))")
    public void pointcut(){

    }

    @Before("MyAdvice.pointcut()")
    public void before()
    {
        System.out.println("这是前置通知！！！");
    }

    @AfterReturning("MyAdvice.pointcut()")
    public void afterReturning()
    {
        System.out.println("这是后置通知（如果出现异常不会调用）");
    }

    @Around("MyAdvice.pointcut()")
    public Object around(MethodInvocationProceedingJoinPoint methodInvocationProceedingJoinPoint) throws Throwable {
        System.out.println("这是环绕通知之前的部分");
        Object proceed = methodInvocationProceedingJoinPoint.proceed();
        System.out.println("这是环绕通知之后的部分");
        return  proceed;
    }

    @AfterThrowing("MyAdvice.pointcut()")
    public void afterException(){
        System.out.println("出事了！出现异常了！");
    }

    @After("MyAdvice.pointcut()")
    public void after(){
        System.out.println("这是后置通知（出现异常也会调用）");
    }

}
