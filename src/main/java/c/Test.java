package c;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Component;

/**
 * Created by mingfei.net@gmail.com
 * 2016-08-15 14:56
 */
@Component
public class Test {

    @Autowired
    private String string;

    public void hello() {
        System.out.println("Hello, " + string);
    }

    public static void main(String[] args) {

        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");

        Business business = (Business) applicationContext.getBean("business");
        business.saveData();

        Test test = (Test) applicationContext.getBean("test");
        test.hello();
    }
}
