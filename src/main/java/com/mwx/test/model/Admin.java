package com.mwx.test.model;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

import javax.persistence.Id;
import javax.persistence.Table;

@Getter
@Setter
@NoArgsConstructor
@ToString
@Table(name = "Admin")
public class Admin {
    @Id
    private Integer adminId;

    private  String password;
}
