public class TyrannosaurusRex extends Dinosaurus{
    
    @Override
    public void makan() {
        System.out.println("Jenis : Karnivora");
        
    }
    @Override
    public void berjalan() {
        System.out.println("Berjalan : Menggunakan 2 kaki");
    }

    public void displaydata(){
        System.out.println("Nama Dinosaurus : TyrannosaurusRex ");
        makan();
        berjalan();
    }
}