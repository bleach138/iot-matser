package com.fnic.service.impl;

import com.fnic.bean.PageBean;
import com.fnic.mybatis.dao.DeviceMapper;
import com.fnic.mybatis.model.Device;
import com.fnic.mybatis.model.DeviceExample;
import com.fnic.service.DeviceService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class DeviceServiceImpl implements DeviceService {

    @Resource
    private DeviceMapper deviceMapper;

    @Override
    public List<Device> queryDevicesByTenantId(String tenantId, PageBean pageBean) {

        DeviceExample example = new DeviceExample();
        example.createCriteria().andTenantIdEqualTo(tenantId);
        example.setLimitStart(pageBean.getPageStart());
        example.setLimitEnd(pageBean.getPageSize());

        List<Device> list = deviceMapper.selectByExample(example);

        return list;
    }
}
