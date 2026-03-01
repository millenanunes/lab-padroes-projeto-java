package one.digitalinnovation.gof.singleton;

public class SingletonLazyHolder {

    private static class InstanceHolder {
        private static final SingletonLazyHolder instance = new SingletonLazyHolder();
    }

    private SingletonLazyHolder() { }

    public static SingletonLazyHolder getInstance() {
        return InstanceHolder.instance;
    }
}