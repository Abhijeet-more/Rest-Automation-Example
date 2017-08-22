public class RestServer {

    private final String protocol;
    private final String host;
    private final int port;

    public RestServer(String protocol, String host, int port) {
        this.protocol = protocol;
        this.host = host;
        this.port = port;
    }

    public String getHost() {
        return String.format(protocol + "://" + host + ":" + port);
    }

}