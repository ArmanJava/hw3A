package com.company;

public class Main {


    public static void main(String[] args) throws InterruptedException {
        Runnable ping = new Runnable() {
            public void run() {
//                System.out.println("Ping");
//                System.out.println(Thread.currentThread().getName());
                    pingpong();

            }
        };
                Thread thread = new Thread(ping);
                thread.start();


        Runnable pong = new Runnable() {
            public void run() {
//                System.out.println("Pong");
//                System.out.println(Thread.currentThread().getName());
               pingpong();

            }
        };
                Thread thread2 = new Thread(pong);
                thread2.start();


    }


    public static  void pingpong() {
        if (Thread.currentThread().getName().equals("Thread-0")) {
            System.out.println("ping");

        }
        if (Thread.currentThread().getName().equals("Thread-1")) {
            System.out.println("pong");
        }

    }


}

