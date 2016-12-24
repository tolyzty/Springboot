package com.ace.mapper;

import com.ace.pojo.Lables;

public interface LablesMapper {
    int deleteByPrimaryKey(Integer lableId);

    int insert(Lables lables);

    int insertSelective(Lables lables);

    Lables selectByPrimaryKey(Integer lableId);

    int updateByPrimaryKeySelective(Lables lables);

    int updateByPrimaryKey(Lables lables);

    Lables findById(Lables lables);

    int insertinfo(Lables lables);


}