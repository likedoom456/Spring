package c;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by mingfei.net@gmail.com
 * 2016-08-15 14:56
 */
public class Test {

    private String string;

    public void setString(String string) {
        this.string = string;
    }

    public void hello() {
        System.out.println("Hello, " + string);
    }

    public static void main(String[] args) {
//        Business business = new Business(new FloppyWriter());
//        Business business = new Business(new USBWriter());
//        business.saveData();

        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");
//        Business business = (Business) applicationContext.getBean("business");
//        business.saveData();
//        FloppyWriter floppyWriter = (FloppyWriter) applicationContext.getBean("floppyWriter");
//        floppyWriter.saveToDevice();
//        USBWriter usbWriter = (USBWriter) applicationContext.getBean("usbWriter");
//        usbWriter.saveToDevice();

        Test test = (Test) applicationContext.getBean("test");
//        System.out.println(test);
        test.hello();
    }

    @Override
    public String toString() {return "this is an instance of Test class.";

    }
}
