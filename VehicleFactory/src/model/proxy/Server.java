package model.Proxy;

public class Server implements IServer{
    private int ip;
    private String info;
    public Server(int ip){
        this.ip = ip;
    }
    public void connect(int ip) {}

    public void setInfo(String info) {
        this.info = info;
    }

    public String getInfo() {
        return info;
    }
}
