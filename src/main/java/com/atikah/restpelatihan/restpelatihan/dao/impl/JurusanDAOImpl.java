package com.atikah.restpelatihan.restpelatihan.dao.impl;

        import com.atikah.restpelatihan.restpelatihan.common.Table;
        import com.atikah.restpelatihan.restpelatihan.dao.JurusanDAO;
        import com.atikah.restpelatihan.restpelatihan.entity.Jurusan;
        import org.springframework.beans.factory.annotation.Autowired;
        import org.springframework.jdbc.core.BeanPropertyRowMapper;
        import org.springframework.jdbc.core.JdbcTemplate;
        import org.springframework.jdbc.support.GeneratedKeyHolder;
        import org.springframework.jdbc.support.KeyHolder;

        import org.springframework.stereotype.Repository;
        import java.sql.PreparedStatement;
        import java.sql.Statement;
        import java.util.List;
        import java.util.Objects;

@Repository
public class JurusanDAOImpl implements JurusanDAO {

    @Autowired
    private JdbcTemplate jdbcTemplate;

    @Override
    public Jurusan save(Jurusan param) {
        String sql = "INSERT INTO " + Table.TABLE_Jurusan + " ( id_fakultas, nama_jurusan) VALUES (?,?)";

        final KeyHolder keyHolder = new GeneratedKeyHolder();
        jdbcTemplate.update(con -> {
            PreparedStatement ps = con.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
            ps.setInt(1, param.getIdFakultas());
            ps.setString(2, param.getNamaJurusan());
            return ps;
        }, keyHolder);
        param.setIdJurusan(Objects.requireNonNull(keyHolder.getKey()).intValue());
        return param;
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
    public List<Jurusan> find() {
        String sql = "SELECT * FROM " + Table.TABLE_Jurusan;

        return jdbcTemplate.query(sql, new BeanPropertyRowMapper<>(Jurusan.class));
    }

    @Override
    public Jurusan findByFakultas(int idFakultas) {
        return null;
    }

    @Override
    public Jurusan findByJurusan(int idJurusan) {
        return null;
    }

    @Override
    public Jurusan findByMahasiswa(int npmMhs) {
        return null;
    }

    @Override
    public Jurusan findByKrs(int idKrs) {
        return null;
    }

}
