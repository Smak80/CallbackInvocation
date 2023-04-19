import java.util.Random;

public class B {
    private UI a;
    private String data;
    public B(UI a){
        this.a = a;
    }

    public void run(){
        var r = new Random();
        var delay = r.nextLong(1000, 10000);
        try {
            Thread.sleep(delay);
            var s = "Привет!";
            a.show(s);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }

    public Void setData(String s){
        data = s;
        return null;
    }

}
