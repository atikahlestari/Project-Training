package com.atikah.restpelatihan.restpelatihan.dao.impl;

import com.atikah.restpelatihan.restpelatihan.common.Table;
import com.atikah.restpelatihan.restpelatihan.dao.BaseDAO;
import com.atikah.restpelatihan.restpelatihan.dao.FakultasDAO;
import com.atikah.restpelatihan.restpelatihan.entity.Fakultas;
import javafx.scene.control.Tab;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.support.GeneratedKeyHolder;
import org.springframework.jdbc.support.KeyHolder;
import org.springframework.stereotype.Repository;

import java.security.Key;
import java.sql.PreparedStatement;
import java.sql.Statement;
import java.util.List;
import java.util.Objects;

@Repository
public class FakultasDAOImpl implements FakultasDAO {

    @Autowired
    private JdbcTemplate jdbcTemplate;

    @Override
    public Fakultas save(Fakultas param) {
        String sql = "INSERT INTO " + Table.TABLE_Fakultas + " ( nama_fakultas) VALUES (?)";

        final KeyHolder keyHolder = new GeneratedKeyHolder();
        jdbcTemplate.update(con -> {
            PreparedStatement ps = con.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
            ps.setString(1, param.getNamaFakultas());
            return ps;
        }, keyHolder);

        param.setIdFakultas(Objects.requireNonNull(keyHolder.getKey().intValue()));
        return param;
    }

    @Override
    public Fakultas update(Fakultas param) {
        return null;
//       String sql= "UPDATE " + Table.TABLE_Fakultas +  "SET nama_fakultas = ?  WHERE id_fakultas= ?";
//        final KeyHolder keyHolder= new GeneratedKeyHolder();
//        jdbcTemplate.update(con -> {
//            PreparedStatement ps= con.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
//            ps.setString(1, param.getNamaFakultas());
//            ps.setInt(2, param.getIdFakultas());
//            return ps;
//        }, keyHolder);
//                param.setIdFakultas(Objects.requireNonNull(keyHolder.getKey().intValue()));
//        return param;
    }

    @Override
    public int delete(Fakultas param) {
        return 0;
    }

    @Override
    public List<Fakultas>  find() {
        String sql = "SELECT * FROM " + Table.TABLE_Fakultas;

        return jdbcTemplate.query(sql, new BeanPropertyRowMapper<>(Fakultas.class));
    }

    @Override
    public Fakultas findByFakultas(int idFakultas) {
        return null;
    }

    @Override
    public Fakultas findByJurusan(int idJurusan) {
        return null;
    }

    @Override
    public Fakultas findByMahasiswa(int npmMhs) {
        return null;
    }

    @Override
    public Fakultas findByKrs(int idKrs) {
        return null;
    }

//    @Override
//    public Fakultas findByJurusan(int idJurusan) {
//        return null;
//    }
//
//    @Override
//    public Fakultas findByMatkul(int idMatkul) {
//        return null;
//    }
//
//    @Override
//    public Fakultas findByKrs(int idKrs) {
//        return null;
//    }

}
