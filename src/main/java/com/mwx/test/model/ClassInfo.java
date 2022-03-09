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
@Table(name = "class_info")
public class ClassInfo {
    @Id
    private Integer classId;

    private String className;
}
