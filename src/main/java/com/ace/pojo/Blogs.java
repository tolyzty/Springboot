package com.ace.pojo;

import java.util.Date;

public class Blogs {
    private Integer blogId;

    private Integer blogUserid;

    private String blogTitle;

    private String blogAbstract;

    private String blogContent;

    private String blogKeyword;

    private Integer blogPv;

    private Integer blogFollow;

    private Date blogTime;

    private Integer blogZt;

    public Integer getBlogId() {
        return blogId;
    }

    public void setBlogId(Integer blogId) {
        this.blogId = blogId;
    }

    public Integer getBlogUserid() {
        return blogUserid;
    }

    public void setBlogUserid(Integer blogUserid) {
        this.blogUserid = blogUserid;
    }

    public String getBlogTitle() {
        return blogTitle;
    }

    public void setBlogTitle(String blogTitle) {
        this.blogTitle = blogTitle == null ? null : blogTitle.trim();
    }

    public String getBlogAbstract() {
        return blogAbstract;
    }

    public void setBlogAbstract(String blogAbstract) {
        this.blogAbstract = blogAbstract == null ? null : blogAbstract.trim();
    }

    public String getBlogContent() {
        return blogContent;
    }

    public void setBlogContent(String blogContent) {
        this.blogContent = blogContent == null ? null : blogContent.trim();
    }

    public String getBlogKeyword() {
        return blogKeyword;
    }

    public void setBlogKeyword(String blogKeyword) {
        this.blogKeyword = blogKeyword == null ? null : blogKeyword.trim();
    }

    public Integer getBlogPv() {
        return blogPv;
    }

    public void setBlogPv(Integer blogPv) {
        this.blogPv = blogPv;
    }

    public Integer getBlogFollow() {
        return blogFollow;
    }

    public void setBlogFollow(Integer blogFollow) {
        this.blogFollow = blogFollow;
    }

    public Date getBlogTime() {
        return blogTime;
    }

    public void setBlogTime(Date blogTime) {
        this.blogTime = blogTime;
    }

    public Integer getBlogZt() {
        return blogZt;
    }

    public void setBlogZt(Integer blogZt) {
        this.blogZt = blogZt;
    }
}