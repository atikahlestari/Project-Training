package com.atikah.restpelatihan.restpelatihan.service.impl;


import com.atikah.restpelatihan.restpelatihan.dao.FakultasDAO;
import com.atikah.restpelatihan.restpelatihan.entity.Fakultas;
import com.atikah.restpelatihan.restpelatihan.service.FakultasService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import java.util.List;

@Service
public class FakultasServiceImpl  implements FakultasService{

    @Autowired
    private FakultasDAO fakultasDAO;

    @Override
    public Fakultas save (Fakultas param){
        return  fakultasDAO.save(param);
    }

    @Override
    public Fakultas update(Fakultas param){

        return null;
//                fakultasDAO.update(param);
    }

    @Override
    public int delete(Fakultas param){
        return 0;
    }

    @Override
    public List<Fakultas> find(){

        return fakultasDAO.find();
    }

    @Override
    public Fakultas findById(int id_fakultas){
        return null;
    }

    @Override
    public Fakultas findByJurusan(int idJurusan) {
        return null;
    }

    @Override
    public Fakultas fidByMahasiswa(int npmMhs) {
        return null;
    }

    @Override
    public Fakultas fidByKrs(int idKrs) {
        return null;
    }

}
