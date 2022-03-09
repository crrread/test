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
@Table(name = "reader_card")
public class ReaderCard {
    @Id
    private Integer readerId;

    private String name;

    private String passwd;

    private Integer card_state;
}
