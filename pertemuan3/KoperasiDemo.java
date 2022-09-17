import java.util.Scanner;

public class KoperasiDemo {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            Anggota fablo = new Anggota("12345678", "Fablo", 4000000);
            System.out.println("Nama Anggota: "+ fablo.getNama());
            System.out.println("Limit Pinjaman: "+ fablo.getLimitPeminjaman());
            System.out.println();
            char pilihan1, pilihan2;
            do{
                System.out.print("Apakah anda ingin melakukan pinjaman ? (y/t)");
                pilihan1 = sc.next().charAt(0);
                if (pilihan1 == 'y' || pilihan1 == 'Y'){
                    System.out.print("Masukkan jumlah pinjaman : ");
                    fablo.pinjam(sc.nextInt());
                    System.out.println("Jumlah Pinjaman saat ini : " + fablo.getJumlahPinjaman());
                } else {
                    break;
                }
                System.out.println();
            } while(pilihan1 != 'n' || pilihan1 != 'N');
            do{
                System.out.print("Apakah anda ining melakukan angsuran ? (y/t)");
                pilihan2 = sc.next().charAt(0);
                if (pilihan2 == 'y' || pilihan2 == 'Y'){
                    System.out.print("Masukkan jumlah angsuran : ");
                    fablo.cicil(sc.nextInt());
                    System.out.println("Jumlah pinjaman saat ini : " + fablo.getJumlahPinjaman());
                } else{
                    break;
                }
                System.out.println();
            } while (pilihan2 != 't' || pilihan2 != 'T');
             System.out.println("Jumlah pinjaman saat ini : "+ fablo.getJumlahPinjaman());
        }
    }
}
