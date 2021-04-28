package top.flobby.boot.quickstart.utils;

import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

/**
 * @author :Flobby
 * @version :1.0
 * @date :2021/4/23
 * @description :
 */

@Component
public class Task1 {
    private int count = 0;
    DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy年MM月dd日 HH:mm:ss");

    final String CRON = "0/5 * * * * ?";

    @Scheduled(cron = CRON)
    private void process(){
        System.out.println("this is scheduler task running \t" + (count++));
//        System.out.println("现在时间："+dtf.format(LocalDateTime.now()));
    }

    @Scheduled(fixedRate = 3000)
    public void reportCurrentTime1(){
        System.out.println(Thread.currentThread().getName()+"现在时间1："+ dtf.format(LocalDateTime.now()));
        System.out.println("现在时间1："+dtf.format(LocalDateTime.now()));
    }

    @Scheduled(fixedDelay = 2000)
    public void reportCurrentTime2(){
        System.out.println("现在时间2："+dtf.format(LocalDateTime.now()));
        System.out.println(Thread.currentThread().getName()+"现在时间2："+ dtf.format(LocalDateTime.now()));
    }

    @Scheduled(initialDelay = 3000, fixedDelay = 2000)
    public void reportCurrentTime3(){
        System.out.println("现在时间3："+dtf.format(LocalDateTime.now()));
        System.out.println(Thread.currentThread().getName()+"现在时间3："+ dtf.format(LocalDateTime.now()));
    }
}
