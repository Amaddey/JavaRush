package com.misha;

public class BibBen extends Thread {
    public static volatile boolean isStopped2 = false;

        public static class ClockBen extends Thread {
            private String cityName;
            private int hours,minutes, seconds;

            public ClockBen(String cityName, int hours, int minutes, int seconds) {
                this.cityName = cityName;
                this.hours = hours;
                this.minutes = minutes;
                this.seconds = seconds;
                start();
            }

            public void run() {
                try {
                    while (!isStopped2) {
                        printTime();
                    }
                } catch (InterruptedException e) {
                }
            }

            private void printTime() throws InterruptedException {
                Thread.sleep(1000);
                seconds++;
                if(seconds == 60){
                    seconds =0;
                    minutes++;
                    if(minutes ==60){
                        hours++;
                        minutes=0;
                        if(hours==24){
                            hours=0;
                        }
                    }
                }
                if(seconds == 0 && minutes == 0 && hours == 0){
                    System.out.println(String.format("В г. %s сейчас полночь!",cityName));
                }else {
                    System.out.println(String.format("В г. %s сейчас %d:%d:%d!",cityName,hours,minutes,seconds));
                }
        }
    }
}
