import Service.Service;

public class ServiceLocatorPatterDemo {
    public static void main(String[] args) {
        Service service = ServiceLocator.getService("Service1");
        service.execute();
        Service service1 = ServiceLocator.getService("Service2");
        service1.execute();
        Service service2 = ServiceLocator.getService("Service1");
        service2.execute();
        Service service3 = ServiceLocator.getService("Service2");
        service3.execute();
    }
}
