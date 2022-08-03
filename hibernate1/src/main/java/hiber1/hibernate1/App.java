package hiber1.hibernate1;



import javax.transaction.HeuristicMixedException;
import javax.transaction.HeuristicRollbackException;
import javax.transaction.RollbackException;
import javax.transaction.SystemException;
import org.hibernate.Transaction;
//import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
//import org.hibernate.service.ServiceRegistry;


/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args ) throws SecurityException, RollbackException, HeuristicMixedException, HeuristicRollbackException, SystemException
    {
        System.out.println( "Hello World!" );
        
        student s1=new student();
        s1.setName("vanitha arun");
        s1.setSno(1071);
        Configuration con=new Configuration().configure().addAnnotatedClass(student.class);
        //StandardServiceRegistryBuilder reg= (StandardServiceRegistryBuilder)new StandardServiceRegistryBuilder().applySettings(con.getProperties());
        //(ServiceRegistry) new ServiceRegistryBuilder().applySettings(config.getProperties());
        SessionFactory  sf= con.buildSessionFactory();
        Session  sc= sf.openSession();
        
        Transaction tx=sc.beginTransaction();
        sc.save(s1);
        tx.commit();
        	
    }
}
