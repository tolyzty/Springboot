package com.ace.mapper;

import com.ace.pojo.Gywm;

import java.util.List;

public interface GywmMapper {
    int insert(Gywm gywm);

    int insertSelective(Gywm gywm);

    List<Gywm> selectById(Long id);

    Gywm selectByKey(Long id);

    List<Gywm> selectAll();

    int updateByGywm(Gywm gywm);



}