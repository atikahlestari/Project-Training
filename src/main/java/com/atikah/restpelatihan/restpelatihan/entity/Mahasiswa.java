package com.atikah.restpelatihan.restpelatihan.entity;

import java.io.Serializable;
import java.sql.Date;

public class Mahasiswa implements Serializable {
    private int npmMhs;
    private String namaMhs;
    private String tempatLahirMhs;
    private Date tglLahirMhs;
    private String alamatMhs;
    private String ayahMhs;
    private String ibuMhs;
    private int idJurusan;

    public Mahasiswa(){

    }

    public Mahasiswa(int npmMhs, int idJurusan){
    this.npmMhs=npmMhs;
    this.idJurusan=idJurusan;
    }

    public Mahasiswa(String namaMhs, String tempatLahirMhs,
                     String alamatMhs, String ayahMhs, String ibuMhs){

        this.namaMhs=namaMhs;
        this.tempatLahirMhs=tempatLahirMhs;
        this.alamatMhs=alamatMhs;
        this.ayahMhs=ayahMhs;
        this.ibuMhs=ibuMhs;
    }

    public Mahasiswa(Date tglLahirMhs){

        this.tglLahirMhs=tglLahirMhs;
    }

    public int getNpmMhs() {
        return npmMhs;
    }

    public void setNpmMhs(int npmMhs) {
        this.npmMhs = npmMhs;
    }

    public String getNamaMhs() {
        return namaMhs;
    }

    public void setNamaMhs(String namaMhs) {
        this.namaMhs = namaMhs;
    }

    public String getTempatLahirMhs() {
        return tempatLahirMhs;
    }

    public void setTempatLahirMhs(String tempatLahirMhs) {
        this.tempatLahirMhs = tempatLahirMhs;
    }

    public  Date getTglLahirMhs() {
        return tglLahirMhs;
    }

    public void setTglLahirMhs(Date tglLahirMhs) {
        this.tglLahirMhs = tglLahirMhs;
    }

    public String getAlamatMhs() {
        return alamatMhs;
    }

    public void setAlamatMhs(String alamatMhs) {
        this.alamatMhs = alamatMhs;
    }

    public String getAyahMhs() {
        return ayahMhs;
    }

    public void setAyahMhs(String ayahMhs) {
        this.ayahMhs = ayahMhs;
    }

    public String getIbuMhs() {
        return ibuMhs;
    }

    public void setIbuMhs(String ibuMhs) {
        this.ibuMhs = ibuMhs;
    }

    public int getIdJurusan() {
        return idJurusan;
    }

    public void setIdJurusan(int idJurusan) {
        this.idJurusan = idJurusan;
    }

    @Override
    public String toString() {
        return "Mahasiswa{" +
                "npmMhs=" + npmMhs +
                ", namaMhs='" + namaMhs + '\'' +
                ", tempatLahirMhs='" + tempatLahirMhs + '\'' +
                "tglLahirMhs=" + tglLahirMhs +
                ", alamatMhs='" + alamatMhs + '\'' +
                ", ayahMhs='" + ayahMhs + '\'' +
                ", ibuMhs='" + ibuMhs + '\'' +
                "idJurusan=" + idJurusan +
                '}';
    }

}
