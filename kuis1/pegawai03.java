public class pegawai03 {
    private String Nama, noPegawai;
    private double gajiPokok, lemburan, uangMakan, uangTransport, totalGaji;
    private int jumlahJamKerja;

    pegawai03 (String noPegawai, String Nama, int jumlahJamKerja){
        this.noPegawai = noPegawai;
        this.Nama = Nama;
        this.jumlahJamKerja = jumlahJamKerja;
    }
    public void setNama (String Nama){
        this.Nama = Nama;
    }
    public void setNoPegawai (String noPegawai){
        this.noPegawai = noPegawai;
    }
    public void setGajiPokok (double gajiPokok){
        this.gajiPokok = gajiPokok;
    }
    public void setLemburan (double lemburan){
        this.lemburan = lemburan;
    }
    public void setUangMakan (double uangMakan){
        this.uangMakan = uangMakan;
    }
    public void setUangTransport (double uangTransport){
        this.uangTransport = uangTransport;
    }
    public void setJamKerja(int jumlahJamKerja){
        this.jumlahJamKerja = jumlahJamKerja;
    }
    public void cetakPenghasilan(){
        System.out.println("No Pegawai\t\t : " + getNip());
        System.out.println("Nama Pegawai\t\t : " + getNama());
        System.out.println("Gaji Pokok\t\t : Rp." + getgajiPokok());
        System.out.println("Lembur\t\t\t : " + getLembur());
        System.out.println("Uang Makan\t\t : Rp." + getuangMakan());
        System.out.println("Transport Lembur\t : Rp." + getTransport());
        System.out.println("Total gaji yang diterima : Rp." + getTotalGaji());
        System.out.println(" ");
    }
    public String getNama(){
        return Nama;
    }
    public String getNip(){
        return noPegawai;
    }
    public double getgajiPokok(){
        return (double) jumlahJamKerja * 2000;
    }
    public double getLembur(){
        if(jumlahJamKerja > 7 ){
            return (jumlahJamKerja - 7) * (gajiPokok * 1.5);
        } else {
            return 0.0;
        }
    }
    public double getuangMakan(){
        if(jumlahJamKerja >= 8){
            return gajiPokok + 3500;
        } else {
            return 0.0;
        }
    }
    public double getTransport(){
        if(jumlahJamKerja >= 9){
            return gajiPokok + 4000;
        } else {
            return 0.0;
        }
    }
    public int getJumlahJamKerja(){
        return jumlahJamKerja;
    }
    public double getTotalGaji(){
        return getgajiPokok() + getLembur() + getuangMakan() + getTransport();
    }
}