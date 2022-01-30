package com.lee.web.board1.menu.model;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public class MenuVO {

    private int mid;
    private String code;
    private String codeName;
    private int sortNum;
    private String comment;
    private String regId;
    private String regDt;
}
