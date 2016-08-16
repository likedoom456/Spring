package c;

import org.springframework.stereotype.Component;

/**
 * Created by mingfei.net@gmail.com
 * 2016-08-15 14:55
 */
@Component
public class USBWriter implements DeviceWriter {

    public void saveToDevice() {
        // TODO: 2016-08-15
        System.out.println("saved to USB...");
    }
}
