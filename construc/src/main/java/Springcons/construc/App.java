package Springcons.construc;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        ApplicationContext ctx= new ClassPathXmlApplicationContext("s1.xml");
        
        Student s2=(Student) ctx.getBean("s1");
        s2.display();
}
}

