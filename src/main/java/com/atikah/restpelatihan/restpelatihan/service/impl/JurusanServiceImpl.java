package com.atikah.restpelatihan.restpelatihan.service.impl;


import com.atikah.restpelatihan.restpelatihan.dao.FakultasDAO;
import com.atikah.restpelatihan.restpelatihan.dao.JurusanDAO;
import com.atikah.restpelatihan.restpelatihan.entity.Jurusan;
import com.atikah.restpelatihan.restpelatihan.service.JurusanService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class JurusanServiceImpl implements JurusanService {

    @Autowired
    private JurusanDAO jurusanDAO;


    @Override
    public Jurusan save(Jurusan param) {
        return jurusanDAO.save(param);
    }

    @Override
    public Jurusan update(Jurusan param) {
        return null;
    }

    @Override
    public int delete(Jurusan param) {
        return 0;
    }



    @Override
    public List<Jurusan> find(){
       return jurusanDAO.find();
    }

    @Override
    public Jurusan findById(int idFakultas) {
        return null;
    }

    @Override
    public Jurusan findByJurusan(int idJurusan) {
        return null;
    }

    @Override
    public Jurusan fidByMahasiswa(int npmMhs) {
        return null;
    }

    @Override
    public Jurusan fidByKrs(int idKrs) {
        return null;
    }


}