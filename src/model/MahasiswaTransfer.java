package model;

//SubClass/Child-Class/
public class MahasiswaTransfer extends Mahasiswa {
    private int jumlahSksSebelumnya;
    private String namaKampusSebelumnya;

    public int getJumlahSksSebelumnya() {
        return jumlahSksSebelumnya;
    }

    public void setJumlahSksSebelumnya(int jumlahSksSebelumnya) {
        this.jumlahSksSebelumnya = jumlahSksSebelumnya;
    }

    public String getNamaKampusSebelumnya() {
        return namaKampusSebelumnya;
    }

    public void setNamaKampusSebelumnya(String namaKampusSebelumnya) {
        this.namaKampusSebelumnya = namaKampusSebelumnya;
    }

    public void konversiNilai(){

    }

}
