package com.lee.web.board1.model;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public class BoardVO {

    private int bid;
    private String title;
    private String content;
    private String tag;
    private int viewCnt;
    private String regId;
    private String regDt;
    private String editDt;
}
