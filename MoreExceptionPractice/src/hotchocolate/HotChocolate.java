package hotchocolate;

import java.util.concurrent.TimeUnit;

public class HotChocolate {

    public static final double tooHot = 185;
    public static final double tooCold = 160;

    public static void drinkHotChocolate(double cocoaTemp) throws TooHotException, TooColdException {
        if (cocoaTemp >= tooHot) {
            throw new TooHotException();
        } else if (cocoaTemp <= tooCold) {
            throw new TooColdException();
        }
    }

    public static void main(String[] args) throws InterruptedException {

        double currentCocoaTemp = 200;
        boolean wrongTemp = true;
        while (wrongTemp) {
            try {
                drinkHotChocolate(currentCocoaTemp);
                System.out.println("That was good!");
                wrongTemp = false;
            } catch (TooHotException e1) {
                System.out.println("Thats too hot!");
                currentCocoaTemp = currentCocoaTemp - 5;
            } catch (TooColdException e2) {
                System.out.println("Thats too cold!");
                currentCocoaTemp = currentCocoaTemp + 5;
            }
            TimeUnit.SECONDS.sleep(2);
        }

        System.out.println("The hot chocolate is gone.");
    }
}
