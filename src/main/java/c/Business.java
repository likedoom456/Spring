package c;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

/**
 * Created by mingfei.net@gmail.com
 * 2016-08-15 14:56
 */
// 松散耦合
// 强耦合 > 松散耦合 解耦合
@Component // 组件
public class Business {

    @Autowired // 自动装配
    @Qualifier("USBWriter")
    private DeviceWriter deviceWriter;

    public void saveData() {
        System.out.println("saveData...");
        deviceWriter.saveToDevice();
    }
}
