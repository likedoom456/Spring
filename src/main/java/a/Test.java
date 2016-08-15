package a;

/**
 * Created by mingfei.net@gmail.com
 * 2016-08-15 14:40
 */
public class Test {
    public static void main(String[] args) {
//        Business business = new Business(new FloppyWriter());
        Business business = new Business(new USBWriter());
//        business.setFloppyWriter(new FloppyWriter());

        business.saveData();
    }
}
