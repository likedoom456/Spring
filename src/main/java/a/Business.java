package a;

/**
 * Created by mingfei.net@gmail.com
 * 2016-08-15 14:37
 */
// 业务逻辑类 - 高层应用类
// 强耦合
public class Business {

//    private FloppyWriter floppyWriter;

    private USBWriter usbWriter;

//    public Business(FloppyWriter floppyWriter) {
//        this.floppyWriter = floppyWriter;
//    }

    public Business(USBWriter usbWriter) {
        this.usbWriter = usbWriter;
    }


    //    public void setFloppyWriter(FloppyWriter floppyWriter) {
//        this.floppyWriter = floppyWriter;
//    }

    public void saveData() {
//        floppyWriter.saveToFloppy();
        usbWriter.saveToUSB();
    }
}
