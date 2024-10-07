public class Network implements Connectable {

    @Override
    public void connectToNetwork(String networkName) {
        System.out.println("Csatlakozva a hálozathoz.");
    }

    @Override
    public void disconnectFromNetwork() {
        System.out.println("Lecsatlakozva a hálozatról.");
    }

}
