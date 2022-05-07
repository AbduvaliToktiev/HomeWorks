package month2.Computer;

public class HDD extends Display {
    private int memory;
    private int disk;

    public HDD() {

    }

    public HDD(int memory, int disk) {
        this.memory = memory;
        this.disk = disk;
    }

    public int getDisk() {
        return disk;
    }

    public void setDisk(int disk) {
        this.disk = disk;
    }


    public int getMemory() {
        return memory;
    }

    public void setMemory(int memory) {
        this.memory = memory;
    }
}
