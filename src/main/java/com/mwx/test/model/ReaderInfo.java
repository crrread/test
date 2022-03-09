package com.mwx.test.model;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

import javax.persistence.Id;
import javax.persistence.Table;
import java.util.Date;

@Getter
@Setter
@NoArgsConstructor
@ToString
@Table(name = "reader_info")
public class ReaderInfo {
    @Id
    private Integer readerId;

    private String name;

    private String sex;

    @JsonFormat(timezone = "GTM+8:00",pattern = "yyyy-MM-dd HH:mm:ss")
    private Date birth;

    private String address;

    private String telcode;


}
