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
@Table(name = "lend_list")
public class LendList {
    @Id
    private Integer sernum;

    private long bookId;

    private Integer readerId;

    @JsonFormat(timezone = "GTM+8:00",pattern = "yyyy-MM-dd HH:mm:ss")
    private Date lendDate;

    @JsonFormat(timezone = "GTM+8:00",pattern = "yyyy-MM-dd HH:mm:ss")
    private Date backDate;

}
