package b;

/**
 * Created by mingfei.net@gmail.com
 * 2016-08-15 14:56
 */
// 松散耦合
// 强耦合 > 松散耦合 解耦合
public class Business {
    private DeviceWriter deviceWriter;

    public Business(DeviceWriter deviceWriter) {
        this.deviceWriter = deviceWriter;
    }

    public void saveData() {
        deviceWriter.saveToDevice();
    }
}
