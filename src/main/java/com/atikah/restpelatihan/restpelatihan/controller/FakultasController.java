package com.atikah.restpelatihan.restpelatihan.controller;


import com.atikah.restpelatihan.restpelatihan.entity.Fakultas;
import com.atikah.restpelatihan.restpelatihan.service.FakultasService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.awt.*;
import java.util.List;

@RestController
public class FakultasController {
    private final FakultasService service;


    @Autowired
    public FakultasController(FakultasService service) {
        this.service = service;
    }

    @GetMapping(value = "/fakultas")
    public List<Fakultas> fakultas() {
        return service.find();
    }

    @PostMapping(value = "/fakultas")
    public String save(@RequestBody Fakultas fakultas) {
        Fakultas data = service.save(fakultas);
        if (data.getIdFakultas() == 0) {
            return "Gagal insert data";
        } else {
            return "Insert data berhasil";
        }
    }

//        @PutMapping(value = "/fakultas")
//        public String update (@RequestBody Fakultas fakultas){
//            Fakultas data = service.update(fakultas);
//            if (data.getIdFakultas() == 0) {
//                return "Gagal update data";
//            } else {
//                return "Update data berhasil";
//            }
//        }

}
