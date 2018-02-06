package com.fnic.controller;

import com.fnic.bean.PageBean;
import com.fnic.bean.ReqData;
import com.fnic.bean.RspData;
import com.fnic.mybatis.model.Device;
import com.fnic.service.DeviceService;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

@RestController
@RequestMapping(value = "/device")
public class DeviceController extends BaseController {

    @Resource
    private DeviceService deviceService;

    @RequestMapping(value = "queryDevices")
    public RspData queryDevices(@RequestBody ReqData reqData) {
        List<Device> list = deviceService.queryDevicesByTenantId(getUser().getTenantId(),reqData.getPageBean());

        RspData rspData = new RspData();
        rspData.put("list",list);
        return rspData;
    }
}
