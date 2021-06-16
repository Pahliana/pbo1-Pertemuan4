package model;

import javax.swing.*;

public class MahasiswaAksi {
    public static void main(String[] args){
        Mahasiswa m1 = new Mahasiswa();
        m1.npm = "1";

        //Overloading dalam Constructor
        Mahasiswa m2 = new Mahasiswa("19639876","enol");
        Mahasiswa m3 = new Mahasiswa("19634567","Satu",10,3.4,"Bjb");

        //Contoh Overloading Method
        m1.delete();
        m1.delete(2);
        m1.delete("Bjb");
        m1.delete("19631234",24);

        MahasiswaTransfer mt = new MahasiswaTransfer();
        m1.delete();
        mt.delete();
    }
}
