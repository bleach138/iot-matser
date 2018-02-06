package com.fnic.service;

import com.fnic.bean.PageBean;
import com.fnic.mybatis.model.Device;

import java.util.List;

public interface DeviceService {

    public List<Device> queryDevicesByTenantId(String tenantId, PageBean pageBean);
}
