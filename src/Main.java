/**
 * Created by user on 26.09.2016.
 */
public class Main {
    public static void main(String[] args) {
        Runnable a= new Threarrrr();
        Thread b= new Thread(a);
        b.start();
    }
}
