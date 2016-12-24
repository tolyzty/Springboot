package com.ace.service.impl;

import com.ace.mapper.GywmMapper;
import com.ace.pojo.Gywm;
import com.ace.service.GywmService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class GywmServiceImpl implements GywmService {

    @Autowired
    GywmMapper gywmMapper;

    public int insert(Gywm gywm) {
        return this.gywmMapper.insert(gywm);
    }

    public int insertSelective(Gywm gywm) {
        return this.gywmMapper.insertSelective(gywm);
    }

    public List<Gywm> selectById(Long id) {
        return this.gywmMapper.selectById(id);
    }

    public Gywm selectByKey(Long id) {
        return this.gywmMapper.selectByKey(id);
    }

    public List<Gywm> selectAll() {
        return this.gywmMapper.selectAll();
    }

    public int updateByGywm(Gywm gywm) {
        return this.gywmMapper.updateByGywm(gywm);
    }
}
