package com.atguigu.springcloud.service;

import com.atguigu.springcloud.entities.Dept;

import java.util.List;

/**
 * @description:
 * @author: gxl
 * @createDate: 2021/9/13 20:29
 */
public interface DeptService {

    public boolean add(Dept dept);

    Dept get(Long id);

    List<Dept> list();
}
