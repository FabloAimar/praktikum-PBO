public class MotorDemo {
    public static void main(String[] args) {
        Motor motor = new Motor ();

        motor.nyalakanMesin();
        motor.printStatus();

        for(int i=0; i<20; i++){
            motor.tambahKecepatan();
            motor.printStatus();
        }

        motor.matikanMesin();
        motor.printStatus();
    }
}