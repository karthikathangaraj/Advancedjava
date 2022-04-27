package Springcons.aop;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        ApplicationContext context=new AnnotationConfigApplicationContext(appconfig.class);
      student s1=context.getBean(student.class);
      s1.show();
    }
}
