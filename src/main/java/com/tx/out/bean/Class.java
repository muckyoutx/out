package com.tx.out.bean;

import cn.afterturn.easypoi.excel.annotation.Excel;
import cn.afterturn.easypoi.excel.annotation.ExcelTarget;
import lombok.Data;

import java.io.Serializable;

@ExcelTarget("Class")
@Data
public class Class implements Serializable {
    private static final long serialVersionUID = 5940487088227676169L;
   // @Excel(name="主键",orderNum="0",type=1,width=20)
    private Integer id;
    @Excel(name="班级",orderNum="0",type=1,width=20)
    private String bj;
    @Excel(name="姓名",orderNum="0",type=1,width=20)
    private String xm;
    @Excel(name="性别",orderNum="0",type=1,width=20)
    private String xb;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getBj() {
        return bj;
    }

    public void setBj(String bj) {
        this.bj = bj == null ? null : bj.trim();
    }

    public String getXm() {
        return xm;
    }

    public void setXm(String xm) {
        this.xm = xm == null ? null : xm.trim();
    }

    public String getXb() {
        return xb;
    }

    public void setXb(String xb) {
        this.xb = xb == null ? null : xb.trim();
    }
}