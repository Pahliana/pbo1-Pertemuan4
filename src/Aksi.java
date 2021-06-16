import model.Mahasiswa;

import java.util.Scanner;

public class Aksi {
    public static void main(String[] args) {

        //instance/pembuatan object dari sebuah class
        //Nama Class NamaObject = new Constructor
        //Contructor merupakan method
        //Contructor tidak punya return value dan tidak punya void
        //Constructor sama dengan Class
        //Constructor jalan ketika object di buat atau di-instance

        Mahasiswa fulan = new Mahasiswa();
        fulan.npm = "19631107";
        fulan.nama = "Fulan bin Fulan";
        fulan.jumlahSKS = 100;
        fulan.ipk = 3.11;
        fulan.setKota("Bjb");
        fulan.tampilkanInfo();
        fulan.create();

        Mahasiswa mahasiswa = new Mahasiswa();
        mahasiswa.npm = "19631100";
        mahasiswa.nama = "Fulanah binti Fulan";
        mahasiswa.tampilkanInfo();
        mahasiswa.create();

        Mahasiswa m = new Mahasiswa();
        m.tampilkanInfo();
    }
}
