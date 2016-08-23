package model;

import java.io.Serializable;

/**
 * Created by mingfei.net@gmail.com
 * 2016-08-18 09:16
 */
public class Book implements Serializable {
    private Long id;
    private String title;

    public Book() {
    }

    public Book(Long id, String title) {
        this.id = id;
        this.title = title;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
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
