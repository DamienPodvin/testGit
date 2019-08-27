package fr.formation.inti.spring;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import fr.formation.inti.beans.HelloBean;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        AbstractApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        HelloBean hb = (HelloBean) context.getBean("helloBean");
        hb.hello();     
        
//         boolean single = context.isSingleton("hello");
//         System.out.println("is singleton : "+ single);
        context.close();
    }
}
