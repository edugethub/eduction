package com.education.model;

public class Classes {
    private Integer id;

    private String classtitle;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getClasstitle() {
        return classtitle;
    }

    public void setClasstitle(String classtitle) {
        this.classtitle = classtitle == null ? null : classtitle.trim();
    }
}