package com.misha;

public class Solution {
        public static class Mouse extends Thread {
            public Mouse(String name){
                super(name);
                start();
            }
            public void run(){
                System.out.println(getName() + " starts eating");
                eating();
                System.out.println(getName() + " finished");
            }
        }
        private static void eating(){
            try {
                Thread.sleep(2000);
            }catch (InterruptedException e){
            }
        }
}
