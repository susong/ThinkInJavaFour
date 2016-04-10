package c10;

/**
 * Created by SuSong on 2015-01-07 0:13.
 */

interface Service{
    void method1();
    void method2();
}

interface ServiceFactory{
    Service getService();
}

public class Factories {

    public static void serviceConsumer(ServiceFactory fact){
        Service s = fact.getService();
        s.method1();
        s.method2();
    }

    public static void main(String[] args) {
        serviceConsumer(new ServiceFactory() {
            @Override
            public Service getService() {
                return new Service() {
                    @Override
                    public void method1() {
                        System.out.println("imp1 method1");
                    }

                    @Override
                    public void method2() {
                        System.out.println("imp1 method2");
                    }
                };
            }
        });

        serviceConsumer(new ServiceFactory() {
            @Override
            public Service getService() {
                return new Service() {
                    @Override
                    public void method1() {
                        System.out.println("imp2 method1");
                    }

                    @Override
                    public void method2() {
                        System.out.println("imp2 method2");
                    }
                };
            }
        });
    }
}
