package com.atikah.restpelatihan.restpelatihan.service.impl;

import com.atikah.restpelatihan.restpelatihan.dao.MahasiswaDAO;
import com.atikah.restpelatihan.restpelatihan.entity.Mahasiswa;
import com.atikah.restpelatihan.restpelatihan.service.MahasiswaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MahasiswaServiceImpl implements MahasiswaService {

    @Autowired
    private MahasiswaDAO mahasiswaDAO;

    @Override
    public Mahasiswa save(Mahasiswa param) {
        return mahasiswaDAO.save(param);
    }

    @Override
    public Mahasiswa update(Mahasiswa param) {
        return null;
    }

    @Override
    public int delete(Mahasiswa param) {
        return 0;
    }

    @Override
    public List<Mahasiswa> find() {
        return mahasiswaDAO.find();
    }

    @Override
    public Mahasiswa findById(int idFakultas) {
        return null;
    }

    @Override
    public Mahasiswa findByJurusan(int idJurusan) {
        return null;
    }

    @Override
    public Mahasiswa fidByMahasiswa(int npmMhs) {
        return null;
    }

    @Override
    public Mahasiswa fidByKrs(int idKrs) {
        return null;
    }
}
