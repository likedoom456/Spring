package b;

/**
 * Created by mingfei.net@gmail.com
 * 2016-08-15 14:56
 */
public class Test {
    public static void main(String[] args) {
//        Business business = new Business(new FloppyWriter());
        Business business = new Business(new USBWriter());
        business.saveData();
    }
}
