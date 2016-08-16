package c;

import org.springframework.stereotype.Component;

/**
 * Created by mingfei.net@gmail.com
 * 2016-08-15 14:55
 */
@Component
public class USBWriter implements DeviceWriter {

    public USBWriter() {
        System.out.println("1. USBWriter constructor..."); // 1
    }

    public void saveToDevice() {
        // TODO: 2016-08-15
        System.out.println("5. saveToDevice..."); // 5
        System.out.println("6. saved to USB..."); // 6
    }
}
