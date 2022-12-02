public class DinosaurusMain {
    public static void main(String[] args) {
        TyrannosaurusRex trex = new TyrannosaurusRex();
        Triceratops tric = new Triceratops();
        Oviraptor ovir = new Oviraptor();
        Pemburu pem = new Pemburu();
        AnakPemburu anpem = new AnakPemburu();

        trex.displaydata();
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
        System.out.println();
        tric.displaydata();
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
        System.out.println();
        ovir.displaydata();
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
        System.out.println();
        pem.setTrex("TyrannosaurusRex");
        System.out.println("Pemburu memburu : " +pem.getTrex());
        anpem.mengambilTelur(trex);

    }
}
