package com.mwx.test.model;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.*;

import javax.persistence.Id;
import javax.persistence.Table;
import java.util.Date;

@Getter
@Setter
@NoArgsConstructor
@ToString
@Table(name = "Admin")
public class BookInfo {
    @Id
    private long bookId;

    private String name;

    private String author;

    private String publish;

    private String introduction;

    private String language;

    private float price;

    @JsonFormat(timezone = "GMT+8", pattern = "yyyy-MM-dd HH:mm:ss")
    private Date pubdate;

    private Integer classId;

    private Integer pressmark;

    private Integer state;
}
