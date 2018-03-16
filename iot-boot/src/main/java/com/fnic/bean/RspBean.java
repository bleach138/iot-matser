package com.fnic.bean;

import java.util.HashMap;


public class RspBean extends HashMap {

    public RspBean() {
        this.setRspCode("0000");
        this.setRspDesc("success");
    }

    public void setRspCode(String rspCode) {
        this.put("rspCode",rspCode);
    }

    public void setRspDesc(String rspDesc) {
        this.put("rspDesc",rspDesc);
    }
}
