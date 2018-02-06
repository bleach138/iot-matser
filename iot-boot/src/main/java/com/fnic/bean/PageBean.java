package com.fnic.bean;

import lombok.Getter;
import lombok.Setter;

public class PageBean {

    @Getter @Setter
    private int pageNum;

    @Getter @Setter
    private int pageSize;

    public int getPageStart() {
        return (pageNum - 1) * pageSize;
    }

    public int getPageEnd() {
        return pageNum + pageSize;
    }
}
