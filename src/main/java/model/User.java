package model;

import lombok.Data;

import java.io.Serializable;

/**
 * Created by mingfei.net@gmail.com
 * 2016-08-17 14:08
 */
@Data
public class User implements Serializable {
    private Integer id;
    private String email;
    private String password;
}
