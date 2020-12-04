package com.baomidou.mybatis3.domain;

import java.util.List;

public class BlogTitleContentDTO {
    private String title;
    private String content;
    private BlogTitleContentDTO child;
    private BlogTitleContentDTOChild childOther;
    private List<BlogTitleContentDTOChild> childList;

    public BlogTitleContentDTO getChild() {
        return child;
    }

    public void setChild(BlogTitleContentDTO child) {
        this.child = child;
    }

    public BlogTitleContentDTOChild getChildOther() {
        return childOther;
    }

    public BlogTitleContentDTO setChildOther(BlogTitleContentDTOChild childOther) {
        this.childOther = childOther;
        return this;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getTitle() {
        return title;
    }

    public String getContent() {
        return content;
    }

    public List<BlogTitleContentDTOChild> getChildList() {
        return childList;
    }

    public BlogTitleContentDTO setChildList(List<BlogTitleContentDTOChild> childList) {
        this.childList = childList;
        return this;
    }
}
