package com.tx.out.service;
import com.tx.out.bean.Class;

import java.util.List;

public interface Cl {
    int add (Class clas);

    int update (Class clas);

    int delete (int id);

    Class getById (int id);

Class getByName (String xm);

List<Class> getPage(String xm,int page, int size);

    long getCount(String name);

long getPageCount (String xm,int size);
}
