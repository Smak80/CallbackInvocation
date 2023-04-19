import java.util.function.Function;

public interface UI {
    void show(String s);
    void get(Function<String, Void> p);
}
