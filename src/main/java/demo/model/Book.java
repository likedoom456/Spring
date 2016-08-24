package demo.model;

import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * Created by mingfei.net@gmail.com
 * 2016-08-18 09:16
 */
@Data
@EqualsAndHashCode(callSuper = true)
public class Book extends BaseModel {
    private Long id;
    private String title;
}
