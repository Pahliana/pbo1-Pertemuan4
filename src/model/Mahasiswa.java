package model;

import java.util.ArrayList;

//SuperClass/Parent-Class
public class Mahasiswa {
    //atribut/properties

    public String npm;
    public String nama;
    public int jumlahSKS;
    public double ipk;
    private String kota;

    public String getKota() {
        return kota;
    }

    public void setKota(String kota) {
        this.kota = kota;
    }

    //behavior/method
    public void mengambilKRS(){}
    public void cetakKRS(){}

    public void tampilkanInfo(){
        System.out.println("====================================================");
        System.out.println("NPM : "+ npm);
        System.out.println("Nama : "+ nama);
        System.out.println("Jumlah SKS : "+ jumlahSKS);
        System.out.println("IPK : "+ ipk);
    }
    public boolean create(){
        String insertSQL = "INSERT INTO mahasiswa VALUES ('"+npm+"', '"+nama+"', "+jumlahSKS+", "+ipk+")";
        System.out.println(insertSQL);
        boolean berhasil = true;
        if(berhasil){
            return true;
        }else {
            return false;
        }
    }

    public ArrayList<Mahasiswa> read(){
        return null;
    }
    public boolean update(){
        return false;
    }
    public boolean delete(){
        String sql = "DELETE FROM mahasiswa WHERE npm = " +npm;
        System.out.println(sql);
        return false;
    }
    public boolean delete(int id){
        String sql = "DELETE FROM mahasiswa WHERE id = " +id;
        System.out.println(sql);
        return false;
    }
    public boolean delete(String kota){
        String sql = "DELETE FROM mahasiswa WHERE kota = " +kota;
        System.out.println(sql);
        return false;
    }
    public boolean delete(String npm, int sks){
        String sql = "DELETE FROM mahasiswa WHERE npm = " +npm;
        System.out.println(sql);
        return false;
    }
    public boolean delete(int usia, String kota){
        return false;
    }

    //Constructor
    public Mahasiswa() {
        System.out.println("Ini Adalah Constructor");
        npm = "NPM Masih Kosong";
        nama = "Nama Masih Kosong";
    }

    public Mahasiswa(String npm, String nama, int jumlahSKS, double ipk, String kota) {
        this.npm = npm;
        this.nama = nama;
        this.jumlahSKS = jumlahSKS;
        this.ipk = ipk;
        this.kota = kota;
    }

    public Mahasiswa(String npm, String nama) {
        this.npm = npm;
        this.nama = nama;
    }


    //Abstraksi
    //Enkapsulasi
    //Inheritance / pewarisan
    //Polymorphism (poly - morph - ism)
    //1. overloading = method sama, parameter berbeda, dalam 1 class
    //2. overriding = method sama, parameter sama, pada SubClass

}
