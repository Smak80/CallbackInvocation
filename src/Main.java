public class Main {
    public static void main(String[] args) {
        A a = new A();
        B b = new B(a);
        new Thread(()->{a.get(b::setData);}).start();
        new Thread(b::run).start();
    }
}
