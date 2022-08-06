package solid_principle.interface_segregation_principle;

public interface CloudHostingProvider {
    void createServer(String region);
    void listServer(String region);
}
