package com.qf.service.Impl;

import com.qf.Dao.IClaMapper;
import com.qf.entity.Classes;
import com.qf.service.IClaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ClaServiceImpl implements IClaService {

    @Autowired
    private IClaMapper claMapper;

    @Override
    public Classes selectById(Integer id) {
        return claMapper.selectById(id);
    }

    @Override
    public List<Classes> queryAll() {
        return claMapper.selectList(null);
    }
}
