package com.ace.mapper;

import com.ace.pojo.Blogs;
import com.ace.pojo.Gywm;

import java.util.List;

public interface BlogsMapper {

    int deleteByPrimaryKey(Integer blogId);

    int insert(Blogs blogs);

    int insertSelective(Blogs blogs);

    Blogs selectByPrimaryKey(Integer blogId);

    int updateByPrimaryKeySelective(Blogs blogs);

    int updateByPrimaryKey(Blogs blogs);

    List<Blogs> selectById(Integer blogId);

    List<Blogs> selectAll();

    int updatepv(Blogs blogs);

    int updatefollow(Blogs blogs);





}