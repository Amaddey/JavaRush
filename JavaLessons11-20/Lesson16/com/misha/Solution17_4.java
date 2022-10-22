package com.misha;

import java.util.ArrayList;
import java.util.List;

public class Solution17_4 {
    public static volatile List<String> list = new ArrayList<>(5);

    static {
        for (int i =0;i < 5;i++){
            list.add("String " + i);
        }
    }

    public static class CountDown implements Runnable {
        private int countFrom;

        public CountDown(int countFrom) {
            this.countFrom = countFrom;
        }

        @Override
        public void run() {
            try{
                while (countFrom > 0){
                    printCountDown();
                    countFrom--;
                }
            }catch (InterruptedException e) {
                    e.printStackTrace();
            }
        }

        public void printCountDown() throws InterruptedException {
            Thread.sleep(500);
            System.out.println(list.get(countFrom-1));
        }

    }

}
