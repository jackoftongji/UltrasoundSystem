package com.service;
import com.pojo.Ultrasound;

import java.util.List;
public interface UltrasoundService {

    int deleteUltrasoundById(long id);

    int addUltrasound(Ultrasound ultrasound);


    Ultrasound queryById(long id);


    List<Ultrasound> queryAllUltrasound();
}
