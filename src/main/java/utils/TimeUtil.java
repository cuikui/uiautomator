package utils;

/**
 * Created by kuicui on 2017/4/19.
 */
public class TimeUtil {

    public static void sleep(int mills){
        try {
            Thread.sleep(mills);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

}
