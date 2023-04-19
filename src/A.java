import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Random;
import java.util.function.Function;

public class A implements UI{
    @Override
    public void show(String s){
        System.out.println(s);
    }

    @Override
    public void get(Function<String, Void> call) {
        var r = new Random();
        var delay = r.nextLong(1000, 5000);
        try {
            Thread.sleep(delay);
            System.out.println("Можно что-то ввести: ");
            var br = new BufferedReader(new InputStreamReader(System.in));
            var s = br.readLine();
            call.apply(s);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
