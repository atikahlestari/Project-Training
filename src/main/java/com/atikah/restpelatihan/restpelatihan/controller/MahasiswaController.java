package com.atikah.restpelatihan.restpelatihan.controller;

import com.atikah.restpelatihan.restpelatihan.entity.Mahasiswa;
import com.atikah.restpelatihan.restpelatihan.service.MahasiswaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.awt.*;
import java.util.List;

@RestController
public class MahasiswaController {

    @Autowired
    private MahasiswaService service;

    @GetMapping(value = "/mahasiswa")
    public List<Mahasiswa> mahasiswa(){
        return service.find();
    }

    @PostMapping(value = "/mahasiswa")
    public String save(@RequestBody Mahasiswa mahasiswa){
        Mahasiswa data= service.save(mahasiswa);
        if (data.getNpmMhs() == 0) {
            return "Gagal insert data";
        } else {
            return "Insert data berhasil";
        }
    }
}
