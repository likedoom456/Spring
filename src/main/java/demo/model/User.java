package demo.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

/**
 * Created by mingfei.net@gmail.com
 * 2016-08-17 14:08
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode(callSuper = true)
public class User extends BaseModel {
    private Integer id;
    private String email;
    private String password;
}
