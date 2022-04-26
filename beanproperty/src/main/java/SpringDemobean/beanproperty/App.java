package SpringDemobean.beanproperty;

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
    	ApplicationContext ctx=new ClassPathXmlApplicationContext("springs.xml");
          bike  c1=(bike) ctx.getBean("bike");
          System.out.println(c1);
           c1.display();
      
       
    }
}
