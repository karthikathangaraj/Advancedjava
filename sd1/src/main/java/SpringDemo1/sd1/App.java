package SpringDemo1.sd1;

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
        //ctx obj for classpathxml
        welcome w1=(welcome) ctx.getBean("hw");
        w1.setName(" karthika");
        w1.dipsly();
        
    }
    
}
