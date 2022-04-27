package Springcons.aop1;

import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.context.annotation.EnableAspectJAutoProxy;
import org.springframework.stereotype.Component;
@Component
@Aspect
@EnableAspectJAutoProxy
public class helper {
	
	//advice -before after 
	//pointcut- define when and where to call
	
	@Before("execution(public void show())")
	public void log()
	{
		
		System.out.println("show logs");
	}

}
