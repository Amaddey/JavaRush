package com.misha;

public class StopwatchClass extends Thread{
    private int seconds;
    @Override
    public void run() {
        try {
            while(true){
                seconds +=1;
                Thread.sleep(1000);
            }
        }catch (InterruptedException e){
            System.out.println(seconds  );
        }
    }
}
