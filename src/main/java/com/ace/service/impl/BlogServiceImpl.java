package com.ace.service.impl;

import com.ace.mapper.BlogsMapper;
import com.ace.pojo.Blogs;
import com.ace.pojo.Gywm;
import com.ace.service.BlogService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by Administrator on 2016/12/16.
 */
@Service
public class BlogServiceImpl implements BlogService {

    @Autowired
    BlogsMapper blogsMapper;


    public int deleteByPrimaryKey(Integer blogId) {
        return this.blogsMapper.deleteByPrimaryKey(blogId);
    }

    public int insert(Blogs blogs) {
        return this.blogsMapper.insert(blogs);
    }

    public int insertSelective(Blogs blogs) {
        return this.blogsMapper.insertSelective(blogs);
    }

    public Blogs selectByPrimaryKey(Integer blogId) {
        return this.blogsMapper.selectByPrimaryKey(blogId);
    }

    public int updateByPrimaryKeySelective(Blogs blogs) {
        return this.blogsMapper.updateByPrimaryKeySelective(blogs);
    }

    public int updateByPrimaryKey(Blogs blogs) {
        return this.updateByPrimaryKey(blogs);
    }

    public List<Blogs> selectById(Integer blogId) {
        return this.blogsMapper.selectById(blogId);
    }

    public List<Blogs> selectAll() {
        return this.blogsMapper.selectAll();
    }

    public int updatepv(Blogs blogs) {

        return this.blogsMapper.updatepv(blogs);
    }

    public int updatefollow(Blogs blogs) {
        return this.blogsMapper.updatefollow(blogs);
    }


}
