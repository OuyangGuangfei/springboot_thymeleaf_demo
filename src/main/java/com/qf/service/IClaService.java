package com.qf.service;

import com.qf.entity.Classes;

import java.util.List;

public interface IClaService {
    Classes selectById(Integer id);
    List<Classes> queryAll();
}
