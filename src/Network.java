public class Network implements Connectable {

    private String networkName;

    @Override
    public void connectToNetwork(String networkName) {
        this.networkName = networkName;
        System.out.println("Csatlakozva a " + networkName + " nevű hálozathoz.");
    }

    @Override
    public void disconnectFromNetwork() {
        System.out.println("Lecsatlakozva a " + this.networkName + " nevű hálozatról.");
    }

}
