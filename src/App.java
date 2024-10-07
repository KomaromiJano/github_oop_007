public class App {
    public static void main(String[] args) throws Exception {
        Network network = new Network();
        network.connectToNetwork("Kulker");
        network.disconnectFromNetwork();
    }
}
