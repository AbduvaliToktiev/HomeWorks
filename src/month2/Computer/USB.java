package month2.Computer;

public class USB extends SSD {
    private double portType;
    private int idPort;

    public USB() {

    }

    public USB(double portType, int idPort) {
        this.portType = portType;
        this.idPort = idPort;
    }

    public int getIdPort() {
        return idPort;
    }

    public void setIdPort(int idPort) {
        this.idPort = idPort;
    }

    public double getPortType() {
        return portType;
    }

    public void setPortType(double portType) {
        this.portType = portType;
    }
}
