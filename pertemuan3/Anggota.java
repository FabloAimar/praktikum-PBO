public class Anggota{
    private String noKtp;
    private String nama;
    private int limitPinjaman;
    private int jumlahPinjaman;

    Anggota(String noKtp, String nama, int limitPinjaman){
        this.noKtp = noKtp;
        this.nama = nama;
        this.limitPinjaman = limitPinjaman;
        this.jumlahPinjaman = 0;
    }
    public String getKtp(){
        return noKtp;
    }
    public String getNama(){
        return nama;
    }
    public int getLimitPeminjaman(){
        return limitPinjaman;
    }
    public int getJumlahPinjaman(){
        return jumlahPinjaman;
    }
    public void pinjam(int nominal){
        if ((jumlahPinjaman+nominal)> limitPinjaman){
            System.out.println("Maaf, jumlah pinjaman melebihi limit.");
        }else {
            jumlahPinjaman += nominal;
        }
    }
    public void cicil(int nominal){
        if (nominal >= (jumlahPinjaman/10)){
            jumlahPinjaman -= nominal;
        } else {
            System.out.println("Maaf, angsuran harus 10% dari jumlah pinjaman");
        }
    }
}