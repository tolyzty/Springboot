package com.ace.service;

import com.ace.pojo.Blogs;
import com.ace.pojo.Lables;

/**
 * Created by Administrator on 2016/12/21.
 */
public interface LablesService {
    int deleteByPrimaryKey(Integer lableId);

    int insert(Lables lables);

    int insertSelective(Lables lables);

    Lables selectByPrimaryKey(Integer lableId);

    int updateByPrimaryKeySelective(Lables lables);

    int updateByPrimaryKey(Lables lables);

    Lables findById(Lables lables);

    int insertinfo(Lables lables);


}
