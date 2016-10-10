import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Created by user on 26.09.2016.
 */
public class Threarrrr implements Runnable {
    BufferedReader keyboard = new BufferedReader(new InputStreamReader(System.in));
    @Override
    public void run() {
        for (int i=0; i<10;i++){
            try {
                String a= keyboard.readLine();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
