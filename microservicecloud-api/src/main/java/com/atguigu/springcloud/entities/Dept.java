package com.atguigu.springcloud.entities;


import java.io.Serializable;

public class Dept implements Serializable{

    private Long deptno;//主键

    private String dname; //部门名称

    private String db_source; //来自哪个数据库，因为微服务架构每个服务可以存放不同的库

    public Long getDeptno() {
        return deptno;
    }

    public void setDeptno(Long deptno) {
        this.deptno = deptno;
    }

    public String getDname() {
        return dname;
    }

    public void setDname(String dname) {
        this.dname = dname;
    }

    public String getDb_source() {
        return db_source;
    }

    public void setDb_source(String db_source) {
        this.db_source = db_source;
    }

    @Override
    public String toString() {
        return "Dept{" +
                "deptno=" + deptno +
                ", dname='" + dname + '\'' +
                ", db_source='" + db_source + '\'' +
                '}';
    }
}