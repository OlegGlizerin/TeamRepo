package model.Proxy;



public class ServerProxy implements IServer{
    private Server server;
    private int ip;
    private String info;
    public ServerProxy(Server serv){
        this.server = serv;
        this.ip = generateProxyIP();
    }
    public void connect(int ip) {
        this.info = getInfoFromWebServer();
        sendInfoToServer();
    }

    private void sendInfoToServer() {
        server.setInfo(this.info);
    }

    private String getInfoFromWebServer() {
        return null;
    }

    private int generateProxyIP() {
        return 0;
    }

    @Override
    public String getInfo() {
        return info;
    }
}
