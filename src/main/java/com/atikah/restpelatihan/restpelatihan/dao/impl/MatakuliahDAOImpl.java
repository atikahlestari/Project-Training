//package com.atikah.restpelatihan.restpelatihan.dao.impl;
//
//import com.atikah.restpelatihan.restpelatihan.common.Table;
//import com.atikah.restpelatihan.restpelatihan.dao.MahasiswaDAO;
//import com.atikah.restpelatihan.restpelatihan.entity.Fakultas;
//import com.atikah.restpelatihan.restpelatihan.entity.Matakuliah;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.jdbc.core.BeanPropertyRowMapper;
//import org.springframework.jdbc.core.JdbcTemplate;
//import org.springframework.jdbc.support.GeneratedKeyHolder;
//import org.springframework.jdbc.support.KeyHolder;
//import org.springframework.stereotype.Repository;
//
//import java.sql.PreparedStatement;
//import java.sql.Statement;
//import java.util.List;
//import java.util.Objects;
//
//@Repository
//public class MatakuliahDAOImpl implements MahasiswaDAO {
//
//    @Autowired
//    private JdbcTemplate jdbcTemplate;
//
//    @Override
//    public Matakuliah save(Matakuliah param) {
//        String sql = "INSERT INTO" + Table.TABLE_Matakuliah + "(nama_matkul, sks_matkul) VALUES (?,?)";
//
//        final KeyHolder keyHolder = new GeneratedKeyHolder();
//        jdbcTemplate.update(con -> {
//            PreparedStatement ps = con.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
//            ps.setString(1, param.getNamaMatkul());
//            ps.setString(2, param.getSksMatkul());
//            return ps;
//        }, keyHolder);
//
//        param.setIdMatkul(Objects.requireNonNull(keyHolder.getKey()).intValue());
//        return param;
//    }
//
//    @Override
//    public Matakuliah update(Matakuliah param{
//        return null;
//    }
//
//    @Override
//    public int delete(Matakuliah param) {
//        return 0;
//    }
//
//    @Override
//    public List<Matakuliah> find() {
//        String sql = "SELECT * FROM " + Table.TABLE_Matakuliah;
//
//        return jdbcTemplate.query(sql, new BeanPropertyRowMapper<>(Matakuliah.class));
//    }
//
//
//}
