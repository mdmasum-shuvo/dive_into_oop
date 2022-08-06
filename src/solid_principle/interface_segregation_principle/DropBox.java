package solid_principle.interface_segregation_principle;

public class DropBox implements CloudStorageProvider{
    @Override
    public void storeFile(String name) {

    }

    @Override
    public void getFile(String name) {

    }
}
