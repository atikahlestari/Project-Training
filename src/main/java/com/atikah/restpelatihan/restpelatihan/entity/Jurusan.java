package com.atikah.restpelatihan.restpelatihan.entity;

import java.io.Serializable;

public class Jurusan implements Serializable {

    private int idJurusan;
    private int idFakultas;
    private String namaJurusan;

    public Jurusan(){

    }

    public Jurusan(int idJurusan, int idFakultas){
        this.idJurusan=idJurusan;
        this.idFakultas=idFakultas;
    }

    public Jurusan (String namaJurusan){
        this.namaJurusan=namaJurusan;
    }

    public int getIdJurusan() {
        return idJurusan;
    }

    public void setIdJurusan(int idJurusan) {
        this.idJurusan = idJurusan;
    }

    public int getIdFakultas() {
        return idFakultas;
    }

    public void setIdFakultas(int idFakultas) {
        this.idFakultas = idFakultas;
    }


    public String getNamaJurusan() {
        return namaJurusan;
    }

    public void setNamaJurusan(String namaJurusan) {
        this.namaJurusan = namaJurusan;
    }

    @Override
    public String toString() {
        return "Jurusan{" +
                "idJurusan=" + idJurusan +
                "idFakultas='" + idFakultas +
                ", namaJurusan='" + namaJurusan + '\'' +
                '}';
    }
}
