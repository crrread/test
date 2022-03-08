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
@Table(name = "user")
public class User {
    @Id
    private Integer id;

    private String name;

    private String password;



}
