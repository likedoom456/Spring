package c;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by mingfei.net@gmail.com
 * 2016-08-15 14:56
 */
public class Test {
    public static void main(String[] args) {
//        Business business = new Business(new FloppyWriter());
//        Business business = new Business(new USBWriter());
//        business.saveData();

        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");
        Business business = (Business) applicationContext.getBean("business");
        business.saveData();
    }
}
