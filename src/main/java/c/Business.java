package c;

/**
 * Created by mingfei.net@gmail.com
 * 2016-08-15 14:56
 */
// 松散耦合
// 强耦合 > 松散耦合 解耦合
public class Business {
    private DeviceWriter deviceWriter;

    public Business() {
        System.out.println("2. Business constructor..."); // 3
    }

//    public Business(DeviceWriter deviceWriter) {
//        this.deviceWriter = deviceWriter;
//    }


    public void setDeviceWriter(DeviceWriter deviceWriter) {
        System.out.println("3. setter..."); // 3
        this.deviceWriter = deviceWriter;
    }

    public void saveData() {
        System.out.println("4. saveData..."); // 4
        deviceWriter.saveToDevice();
    }
}
