package solid_principle.interface_segregation_principle;

public interface CloudStorageProvider {
    void storeFile(String name);
    void getFile(String name);
}
