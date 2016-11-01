package test;

import java.util.Timer;
import java.util.TimerTask;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import org.junit.Test;

/**
 * @Author zhangjian5
 * @Time 2016/10/31
 */
public class TimerTest {
    public static void main(String[] args) {
        Runnable  r = new Runnable() {
            @Override
            public void run() {
                System.out.println("hello");
            }
        };
        ScheduledExecutorService executorService = Executors.newSingleThreadScheduledExecutor();
        executorService.scheduleWithFixedDelay(r,1000,1000, TimeUnit.MILLISECONDS);

    }

    public void testTimer(){
        Timer t = new Timer();
    }
}
