package com.misha;

import java.io.BufferedInputStream;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;
import java.util.concurrent.atomic.AtomicInteger;

import com.misha.BibBen;

public class Main {
    private static volatile int id = 10;
    public static volatile int countSeconds = -8;

    public volatile static int COUNT = 4;

    static int count = 15;
    static volatile int countCreatedThreads;


    public static void main(String[] args) throws Exception {
        System.out.println(new GenerateThread());
    }

    public static class GenerateThread extends Thread {

        @Override
        public String toString()
        {
            return this.getName() + " created";
        }

        public GenerateThread() {
            super(String.valueOf(++countCreatedThreads));
            start();
        }

        @Override
        public void run()
        {
            while (countCreatedThreads < count) {
                System.out.println(new GenerateThread());
            }
        }
    }

    public static class SleepingThread extends Thread {
        private volatile int countDownIndex = COUNT;
        private static volatile int threadCount = 0;

        public SleepingThread() {
            super(String.valueOf(++threadCount));
            start();
        }

        public void run() {
            while (true) {
                System.out.println(this);
                if (--countDownIndex == 0) return;
                //add sleep here - добавь sleep тут
                try{
                    Thread.sleep(10);
                }catch (InterruptedException e)
                {
                    System.out.println("Нить прервана");
                }
            }
        }

        public String toString() {
            return "#" + getName() + ": " + countDownIndex;
        }
    }

    public static class NameOfDefferentThreads extends Thread {
        public void run() {
            for (int i = 0; i < count; i++) {
                printMsg();
            }
        }
        public void printMsg() {
            Thread t = Thread.currentThread();//присвой переменной t текущую нить
            String name = t.getName();
            System.out.println("name=" + name);
            //add sleep here - добавь sleep тут
            try{
                Thread.sleep(1);
            }catch (InterruptedException e)
            {

            }

        }
    }

    static void outInterruptMethod(){
        TestThread2.cancel = true;
    }

    public static class TestThread2 implements Runnable {
        public static boolean cancel = false;
        @Override
        public void run() {
            while (!cancel){
                try {
                    System.out.println("he-he");
                    Thread.sleep(500);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
        }
    }

    public static class TestThread extends Thread {
        @Override
        public void run() {

            while (id != 0) {
                try {
                    Thread.sleep(500);
                } catch (InterruptedException e) {
                    //throw new RuntimeException(e);
                    System.out.println("Inter");
                }
                System.out.println(id--);
}
        }
    }



    public static class RacingClock extends Thread {
        public RacingClock() {
            start();
        }

        public void run() {
            try
            {
                while (countSeconds > 0){
                    System.out.print(countSeconds + " ");
                    countSeconds--;
                    Thread.sleep(1000);
                }
                if (countSeconds == 0)
                    System.out.print("Марш!");
            }catch (InterruptedException e)
            {
                if (countSeconds >= 0)
                    System.out.println("Прервано!");
            }
        }
    }

    static class ClockItem implements Runnable {
        private int id = 0;

        public void run() {
            Thread current = Thread.currentThread();

            while (!current.isInterrupted()) {
                try {
                    Thread.sleep(1000);
                    System.out.println("Tik :" + id++);
                } catch (InterruptedException e) {
                }
            }
        }
    }

    public static boolean isClockRun = true;


    private synchronized void increment() {
        count++;
    }

    void doCounter() {
        Thread t1 = new Thread(new Runnable() {
            @Override
            public void run() {
                for (int i = 0; i < 1_000_000; i++) {
                    increment();
                }
                System.out.println(count);
            }
        });

        Thread t2 = new Thread(new Runnable() {
            @Override
            public void run() {
                for (int i = 0; i < 1_000_000; i++) {
                    increment();
                }
                System.out.println(count);
            }
        });
        t1.start();
        t2.start();
    }


    public static class Stopwatch extends Thread {
        private Runner owner;
        private int stepNumber;

        public Stopwatch(Runner runner) {
            this.owner = runner;
        }

        public void run() {
            try {
                while (!isStopped) {
                    doSeveralSteps();
                }
            } catch (InterruptedException e) {
            }
        }

        private void doSeveralSteps() throws InterruptedException {
            stepNumber++;
            //add your code here - добавь код тут
            Thread.sleep(((long) (1000 / owner.getSpeed())));
            System.out.println(owner.getName() + " делает шаг №" + stepNumber + "!");
        }
    }

    public static class Runner {
        private String name;
        private double speed;
        Stopwatch stopwatch;

        public Runner(String name, double speed) {
            this.name = name;
            this.speed = speed;
            this.stopwatch = new Stopwatch(this);
        }

        public String getName() {
            return name;
        }

        public double getSpeed() {
            return speed;
        }

        public void start() {
            stopwatch.start();
        }
    }

    public static volatile boolean isStopped = false;

    public static class Clock extends Thread {
        public Clock() {
            setPriority(MAX_PRIORITY);
            start();
        }

        @Override
        public void run() {
            try {
                while (!isStopped)
                    printTikTak();
            } catch (Exception e) {
                throw new RuntimeException(e);
            }
        }
    }

    static void printTikTak() throws Exception {
        System.out.println("Tik");
        Thread.sleep(500);
        System.out.println("Tak");
        Thread.sleep(500);
    }

    void task16_7() throws Exception {
        BibBen.ClockBen clockBen = new BibBen.ClockBen("Кривой рог", 23, 59, 59);
        Thread.sleep(1000);
        BibBen.isStopped2 = true;
        Thread.sleep(1000);
    }

    void task16_5() {
        Main.PrintListThread firstThread = new Main.PrintListThread("firstThread");
        Main.PrintListThread secondThread = new Main.PrintListThread("secondThread");
        firstThread.start();
//        firstThread.join();
        secondThread.start();


        Solution.Mouse alpha = new Solution.Mouse("#1");
        Solution.Mouse mouse1 = new Solution.Mouse("#2");
        Solution.Mouse mouse2 = new Solution.Mouse("#3");


    }

    public static class PrintListThread extends Thread {
        public PrintListThread(String name) {
            super(name);
        }

        public void run() {
            printList(getList(20), getName());
        }
    }


    public static void printList(List<String> list, String threadName) {
        for (String item : list) {
            System.out.println(String.format("%s : %s", threadName, item));
        }
    }

    public static List<String> getList(int n) {
        List<String> result = new ArrayList<String>();
        if (n < 1) return result;

        for (int i = 0; i < n; i++) {
            result.add(String.format("String %d", (i + 1)));
        }
        return result;
    }


    static class Printer2 implements Runnable {
        private String name;

        public Printer2(String name) {
            this.name = name;
        }


        @Override
        public void run() {
            System.out.print(this.name);
        }
    }


    public static class Violin implements MusicalInstrument {
        private String owner;

        public Violin(String owner) {
            this.owner = owner;
        }

        public Date startPlaying() {
            System.out.println(this.owner + " starts playing");
            return new Date();
        }

        public Date stopPlaying() {
            System.out.println(this.owner + " stops playing");
            return new Date();
        }

        @Override
        public void run() {
            Date start = startPlaying();
            sleepNSeconds(1);
            Date end = stopPlaying();
            System.out.println("Playing " + (end.getTime() - start.getTime()) + " ms");
        }
    }

    public static int delay = 1000;

    public static void sleepNSeconds(int n) {
        try {
            Thread.sleep(n * delay);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public static interface MusicalInstrument extends Runnable {
        Date startPlaying();

        Date stopPlaying();
    }
}





class Printer implements Runnable {
    private String name;

    public Printer(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    @Override
    public void run() {
        System.out.println("I'm printer : " + getName() );
    }
}







