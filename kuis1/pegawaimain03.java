public class pegawaimain03 {
    public static void main(String[] args) {
        System.out.println("==================================");
        System.out.println("Penggajian Pegawai");
        System.out.println("==================================");
        
        pegawai03 p = new pegawai03("2131710118", "Fablo Aimar", 20);
        p.getLembur();
        p.getTransport();
        p.getuangMakan();
        p.getgajiPokok();
        p.cetakPenghasilan();
        System.out.println("==================================");
        pegawai03 p2 = new pegawai03 ("2131710117", "Rubi Aldawiya", 5);
        p2.getLembur();
        p2.getTransport();
        p2.getuangMakan();
        p2.getgajiPokok();
        p2.cetakPenghasilan();
    }
}