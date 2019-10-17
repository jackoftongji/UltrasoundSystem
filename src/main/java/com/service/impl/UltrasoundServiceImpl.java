package com.service.impl;

import com.dao.UltrasoundDao;
import com.pojo.Ultrasound;
import com.service.UltrasoundService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UltrasoundServiceImpl implements UltrasoundService {
    @Autowired
    private UltrasoundDao ultrasoundDao;

    @Override
    public int deleteUltrasoundById(long id) {
        return ultrasoundDao.deleteUltrasoundById(id);   //在数据库中处理了数据
    }

    @Override
    public int addUltrasound(Ultrasound ultrasound) {
        return ultrasoundDao.addUltrasound(ultrasound);
    }

    @Override
    public Ultrasound queryById(long id) {
        Ultrasound ultrasound =ultrasoundDao.queryById(id);
        return ultrasound;
    }

    @Override
    public List<Ultrasound> queryAllUltrasound() {
        return ultrasoundDao.queryAllUltrasound();
    }
}
