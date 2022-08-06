package solid_principle.interface_segregation_principle;

public class Amazon implements CloudHostingProvider,CDNProvider,CloudStorageProvider {

    @Override
    public void getCDNAddress() {

    }

    @Override
    public void createServer(String region) {

    }

    @Override
    public void listServer(String region) {

    }

    @Override
    public void storeFile(String name) {

    }

    @Override
    public void getFile(String name) {

    }
}
