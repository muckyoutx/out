package com.tx.out.service;

import com.github.pagehelper.PageHelper;
import com.tx.out.bean.Class;
import com.tx.out.bean.ClassExample;
import com.tx.out.dao.ClassMapper;
import lombok.extern.log4j.Log4j;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.CacheEvict;
import org.springframework.cache.annotation.CachePut;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
@Service
@Slf4j
public class ClImpl implements Cl {
    @Autowired
    ClassMapper clm;
    @Transactional
    @Override
    @CachePut(value="abc")
    public int add(Class clas) {
        int i = clm.insert(clas);
        log.info("增加"+i+"条数据");
        return i;
    }
    @Transactional
    @Override
    @CacheEvict(value="abc123" ,allEntries=true)
    public int update(Class clas) {
        int i = clm.updateByPrimaryKey(clas);
        return i;
    }

    @Override
    public int delete(int id) {
        int i = clm.deleteByPrimaryKey(id);
        return i;
    }

    @Override
    public Class getById(int id) {
        Class clas = clm.selectByPrimaryKey(id);
        return clas;
    }

    @Override
    public Class getByName(String xm) {
        ClassExample ce = new ClassExample();
        ClassExample.Criteria c = ce.createCriteria();
        c.andXmEqualTo(xm);
        List<Class> list = clm.selectByExample(ce);
        return list.get(0);
    }

    @Transactional
    @Override
    @Cacheable(value="abc")
    public List<Class> getPage(String xm, int page, int size) {
        PageHelper.startPage(page, size);
        ClassExample ce = new ClassExample();
        ClassExample.Criteria c = ce.createCriteria();
        c.andXmLike("%" + xm + "%");
        List<Class> list = clm.selectByExample(ce);
        return list;
    }

    @Transactional
    @Override
    @Cacheable(value="abc")
    public long getCount(String xm) {

        ClassExample ce = new ClassExample();
        ClassExample.Criteria c = ce.createCriteria();
        c.andXmLike("%" + xm + "%");
        long l = clm.countByExample(ce);
        return l;
    }

    @Transactional
    @Override
    @Cacheable(value="abc")
    public long getPageCount(String xm, int size) {
        long count = getCount(xm);
        if (count % size == 0) {
            return count / size;
        } else {
            return (count / size) + 1;

        }
    }
}