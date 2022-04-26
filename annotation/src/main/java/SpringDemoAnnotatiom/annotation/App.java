package SpringDemoAnnotatiom.annotation;

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
    	
    	ApplicationContext ctx=new ClassPathXmlApplicationContext("beans.xml");
         car c1=(car) ctx.getBean("car");
         c1.dis();
         bike c2=(bike) ctx.getBean("bike");
         c2.display();
    }
}
