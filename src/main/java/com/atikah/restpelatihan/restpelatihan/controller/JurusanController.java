package com.atikah.restpelatihan.restpelatihan.controller;


import com.atikah.restpelatihan.restpelatihan.entity.Jurusan;
import com.atikah.restpelatihan.restpelatihan.service.JurusanService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class JurusanController {
    private final JurusanService service;


    @Autowired
    public JurusanController(JurusanService service) {
        this.service = service;
    }

    @GetMapping(value = "/jurusan")
    public List<Jurusan> jurusan(){
        return service.find();
    }

    @PostMapping(value = "/jurusan")
    public String save(@RequestBody Jurusan jurusan) {
        Jurusan data = service.save(jurusan);
        if (data.getIdJurusan() == 0) {
            return "Gagal insert data";
        } else {
            return "Insert data berhasil";
        }
    }

}
