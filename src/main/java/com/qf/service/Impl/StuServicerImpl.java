package com.qf.service.Impl;

import com.qf.Dao.StuMapper;
import com.qf.entity.Classes;
import com.qf.entity.Student;
import com.qf.service.IClaService;
import com.qf.service.IStuService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Service
public class StuServicerImpl implements IStuService {

    @Autowired
    private StuMapper stuMapper;


    @Autowired
    private IClaService claService;

    @Override
    public List<Student> queryAll() {
        List<Student> students = stuMapper.selectList(null);
        for(Student student:students){
            Classes classes = claService.selectById(student.getId());
            student.setClasses(classes);
        }
        return students;

    }

    @Override
    public int toInsert(Student student) {
        return stuMapper.insert(student);
    }

    @Override
    public int toDel(Integer id) {
        return stuMapper.deleteById(id);
    }


}
