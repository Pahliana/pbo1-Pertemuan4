package model;

//SubClass/Child-Class/
public class MahasiswaTransfer extends Mahasiswa {
    private int jumlahSksSebelumnya;
    private String namaKampusSebelumnya;

    public boolean delete(){
        String sql = "DELETE FROM mahasiswa WHERE npm = " +npm + " - Ini Overriding";
        System.out.println(sql);
        return false;
    }

    @Override
    public boolean delete(int id) {
        return super.delete(id);
    }

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
