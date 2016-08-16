package c;

import org.springframework.stereotype.Component;

/**
 * Created by mingfei.net@gmail.com
 * 2016-08-15 14:54
 */
@Component
public class FloppyWriter implements DeviceWriter {
    public void saveToDevice() {
        // TODO: 2016-08-15
        System.out.println("saved to Floppy...");
    }
}
