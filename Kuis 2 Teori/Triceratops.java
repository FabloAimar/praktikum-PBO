public class Triceratops extends Dinosaurus {
    @Override
    public void makan() {
        System.out.println("Jenis : Herbivora ");
    }
    @Override
    public void berjalan() {
        System.out.println("Berjalan : Menggunakan 4 kaki");
    }

    public void displaydata(){
        System.out.println("Nama Dinosaurus : Triceratops ");
        makan();
        berjalan();
    }
}
