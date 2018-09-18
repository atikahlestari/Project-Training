package com.atikah.restpelatihan.restpelatihan.service;

import java.util.List;

public interface BaseService<T> {

    T save (T param);
    T update (T param);
    int delete (T param);

    List<T> find();

    T findById(int idFakultas);

    T findByJurusan(int idJurusan);

    T fidByMahasiswa (int npmMhs);
    T fidByKrs (int idKrs);
}
