package model;

import java.io.Serializable;

/**
 * Created by mingfei.net@gmail.com
 * 2016-08-18 09:16
 */
public class Book implements Serializable {
    private Integer id;
    private String title;

    public Book() {
    }

    public Book(Integer id, String title) {

        this.id = id;
        this.title = title;
    }

    public Integer getId() {

        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    @Override
    public String toString() {
        return "Book{" +
                "id=" + id +
                ", title='" + title + '\'' +
                '}';
    }
}
