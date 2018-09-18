package com.atikah.restpelatihan.restpelatihan.dao;

import java.util.List;
public interface BaseDAO<T> {

    T save(T param);

    T update(T param);

    int delete(T param);

    List<T> find();

    T findByFakultas(int idFakultas);

    T findByJurusan (int idJurusan);

    T findByMahasiswa (int npmMhs);

//    T findByMatkul (int idMatkul);
//
    T findByKrs (int idKrs);
}

