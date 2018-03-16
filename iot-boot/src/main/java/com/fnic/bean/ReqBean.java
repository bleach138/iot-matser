package com.fnic.bean;

import lombok.Getter;
import lombok.Setter;

import java.util.HashMap;
import java.util.Map;

public class ReqData {

    @Getter @Setter
    private PageBean pageBean;

    @Getter @Setter
    private Map reqParam;
}
