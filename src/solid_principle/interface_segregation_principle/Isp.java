package solid_principle.interface_segregation_principle;

public class Isp {
    public static void main(String[] args) {

        Amazon amazon=new Amazon();
        amazon.listServer("Asia");
        amazon.createServer("Asia");
        amazon.getCDNAddress();
        amazon.getFile("server");
        amazon.storeFile("file");

    }
}
