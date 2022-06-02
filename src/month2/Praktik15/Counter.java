package month2.Praktik15;

public class Counter {
    private static int numOfCalls;

    static void increment() {
        numOfCalls++;
    }

    int factorial() {
        int sum = 1;
        if (numOfCalls == 0) {
            return 0;
        } else {
            for (int i = numOfCalls; i > 0; i--) {
                sum = sum * i;
            }
        }
        return sum;
    }
}
