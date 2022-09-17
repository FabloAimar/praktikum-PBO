public class EncapTest
{
    public static void main(String[] args) {
        EncapDemo encap =new EncapDemo();

        encap.setName("James");
        System.out.println("Name: " + encap.getName());
        encap.setAge(35);
        System.out.println();

        encap.setName("Ardi");
        encap.setAge(28);
        System.out.println("Name: "+encap.getName());
        System.out.println("Age: "+encap.getAge());
        System.out.println();

        encap.setName("Fablo");
        System.out.println("Name: "+encap.getName());
        encap.setAge(16);
        System.out.println();
    }
}