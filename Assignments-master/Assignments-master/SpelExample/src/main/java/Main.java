

import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
 
    public static void main(String[] args) {
     
            ConfigurableApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
            Author author = (Author) context.getBean("authorBean");
            System.out.println(author.toString());
            context.close();
    }
    
}    
    
