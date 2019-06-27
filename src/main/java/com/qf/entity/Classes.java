package com.qf.entity;

import com.baomidou.mybatisplus.annotation.TableName;

@TableName("t_class")
public class Classes {
    private Integer id;
    private String cname;
    private Integer ssum;

    public Classes(Integer id, String cname, Integer ssum) {
        this.id = id;
        this.cname = cname;
        this.ssum = ssum;
    }

    public Classes() {
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getCname() {
        return cname;
    }

    public void setCname(String cname) {
        this.cname = cname;
    }

    public Integer getSsum() {
        return ssum;
    }

    public void setSsum(Integer ssum) {
        this.ssum = ssum;
    }
}
