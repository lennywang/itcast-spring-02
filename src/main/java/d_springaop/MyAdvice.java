package d_springaop;

import org.springframework.aop.aspectj.MethodInvocationProceedingJoinPoint;

/**
 *
 **/
public class MyAdvice {

    public void before()
    {
        System.out.println("这是前置通知！！！");
    }

    public void afterReturning()
    {
        System.out.println("这是后置通知（如果出现异常不会调用）");
    }

    public Object around(MethodInvocationProceedingJoinPoint methodInvocationProceedingJoinPoint) throws Throwable {
        System.out.println("这是环绕通知之前的部分");
        Object proceed = methodInvocationProceedingJoinPoint.proceed();
        System.out.println("这是环绕通知之后的部分");
        return  proceed;
    }

    public void afterException(){
        System.out.println("出事了！出现异常了！");
    }

    public void after(){
        System.out.println("这是后置通知（出现异常也会调用）");
    }
}
