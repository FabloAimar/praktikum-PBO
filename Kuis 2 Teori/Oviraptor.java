public class Oviraptor extends Dinosaurus implements IBertelur{
    @Override
    public void makan() {
        System.out.println("Jenis : Herbivora");
    }
    @Override
    public void berjalan() {
        System.out.println("Berjalan : Menggunakan 2 kaki");
    }
    @Override
    public void bertelur(){
        System.out.println("Oviraptor merupakan hewan bertelur");
    }

    public void displaydata(){
        System.out.println("Nama Dinosaurus : Oviraptor ");
        makan();
        berjalan();
        bertelur();
    }
}
