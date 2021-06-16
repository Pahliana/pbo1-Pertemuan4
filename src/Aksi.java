import model.Mahasiswa;

import java.util.Scanner;

public class Aksi {
    public static void main(String[] args) {

        //instance/pembuatan object dari sebuah class
        //Nama Class NamaObject = new Constructor
        Mahasiswa fulan = new Mahasiswa();
        fulan.npm = "19631107";
        fulan.nama = "Fulan bin Fulan";
        fulan.jumlahSKS = 100;
        fulan.ipk = 3.11;
        fulan.tampilkanInfo();
        if (fulan.create()) {
            System.out.println("Data Berhasil Disimpan");
        } else {
            System.out.println("Data Gagal Disimpan");
        }


        Mahasiswa mahasiswa = new Mahasiswa();
        mahasiswa.npm = "19631100";
        mahasiswa.nama = "Fulanah binti Fulan";
        mahasiswa.tampilkanInfo();

    }
}
