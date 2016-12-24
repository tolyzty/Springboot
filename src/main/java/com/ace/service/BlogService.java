package com.ace.service;

import com.ace.pojo.Blogs;
import com.ace.pojo.Gywm;


import java.util.List;

/**
 * Created by Administrator on 2016/12/16.
 */
public interface BlogService {
    int deleteByPrimaryKey(Integer blogId);

    int insert(Blogs blogs);

    int insertSelective(Blogs blogs);

    Blogs selectByPrimaryKey(Integer blogId);

    int updateByPrimaryKeySelective(Blogs blogs);

    int updateByPrimaryKey(Blogs blogs);

    List<Blogs> selectById(Integer blogId);

    List<Blogs> selectAll();

    /**
     * 修改浏览量
     * @param
     * @return
     */
    int updatepv(Blogs blogs);

    int updatefollow(Blogs blogs);



}
