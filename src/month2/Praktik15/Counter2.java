package month2.Praktik15;

public class Counter2 {
    private int numOfCall;

    public int getNumOfCall() {
        return numOfCall;
    }

    public void setNumOfCall(int numOfCall) {
        this.numOfCall = numOfCall;
    }

    void increment(){
        this.numOfCall++;
    }

    int factorial(){
        int sum = 1;
        if (this.numOfCall == 0) {
            return 0;
        } else {
            for (int i = this.numOfCall; i > 0; i--) {
                sum = sum * i;
            }
        }
        return sum;
    }
}
