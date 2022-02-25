package com.tx.out.controller;

import com.tx.out.bean.Class;
import com.tx.out.config.DummyConfig;
import com.tx.out.service.Cl;
import com.tx.out.utils.ExcelUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletResponse;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@RestController
@RequestMapping(value= {"class","b"})
public class ClAction {
    @Autowired
    Cl service;
    @Autowired
    private DummyConfig dummyConfig;
    @RequestMapping("add")
    public void add(Class clas){
        int i= service.add(clas);
    }
    @RequestMapping("export")
    public void export(HttpServletResponse response) throws Exception {
        long count=service.getCount("");
        List<Class> list =service.getPage("", 1, (int)count);

        ExcelUtil.exportExcel(list, "标题一", "工作一", Class.class, "导出.xls", response);
    }
    @GetMapping("/health")
    public String health() {
        return "success";
    }
    @GetMapping("/hello")
    public String hello() {
        return dummyConfig.getMessage()
                + " ["
                + new SimpleDateFormat().format(new Date())
                + "]";
    }
}
