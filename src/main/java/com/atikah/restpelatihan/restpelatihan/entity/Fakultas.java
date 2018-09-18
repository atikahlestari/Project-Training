package com.atikah.restpelatihan.restpelatihan.entity;

import java.io.Serializable;
import java.util.List;

public class Fakultas implements Serializable {

    private int idFakultas;
    private  String namaFakultas;

    public Fakultas(){

    }

    public Fakultas (int idFakultas){
        this.idFakultas= idFakultas;
    }

    public Fakultas (String namaFakultas){

        this.namaFakultas= namaFakultas;
    }

    public int getIdFakultas() {
        return idFakultas;
    }

    public void setIdFakultas(int idFakultas) {
        this.idFakultas = idFakultas;
    }

    public String getNamaFakultas() {
        return namaFakultas;
    }

    public void setNamaFakultas(String namaFakultas) {
        this.namaFakultas = namaFakultas;
    }

    @Override
    public String toString() {
        return "Fakultas{" +
                "idFakultas=" + idFakultas +
                ", namaFakultas='" + namaFakultas + '\'' +
                '}';
    }
}
