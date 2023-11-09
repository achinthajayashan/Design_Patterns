package creational.singleton_design_package;

public class SingletonDemo {
    public static void main(String[] args) {
        SingletonObject instance = SingletonObject.getInstance();
        instance.showMessage();
    }
}
