package com.ace.service.impl;

import com.ace.mapper.LablesMapper;
import com.ace.pojo.Lables;
import com.ace.service.LablesService;
import org.springframework.beans.factory.ListableBeanFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by Administrator on 2016/12/21.
 */
@Service
public class LablesServiceImpl implements LablesService {

    @Autowired
    LablesMapper lablesMapper;


    public int deleteByPrimaryKey(Integer lableId) {
        return this.lablesMapper.deleteByPrimaryKey(lableId);
    }

    public int insert(Lables lables) {
        return this.lablesMapper.insert(lables);
    }

    public int insertSelective(Lables lables) {
        return this.lablesMapper.insertSelective(lables);
    }

    public Lables selectByPrimaryKey(Integer lableId) {
        return this.lablesMapper.selectByPrimaryKey(lableId);
    }

    public int updateByPrimaryKeySelective(Lables lables) {
        return this.lablesMapper.updateByPrimaryKeySelective(lables);
    }

    public int updateByPrimaryKey(Lables lables) {
        return this.lablesMapper.updateByPrimaryKey(lables);
    }

    public Lables findById(Lables lables) {
        return this.lablesMapper.findById(lables);
    }

    public int insertinfo(Lables lables) {
        return this.lablesMapper.insertinfo(lables);
    }


}
