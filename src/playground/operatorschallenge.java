package playground;

public class operatorschallenge {
    public static void main(String args[]) {
        double value = 20.00;
        double secondValue = 80.00;
        double newValue = (value + secondValue) * 100;
        double remainder = newValue % 40.00;
        boolean notZero = remainder == 0 ? false : true;
        System.out.println(notZero);
        if (notZero != true) {
            System.out.println("Got some remainder");
        }
    }
}
