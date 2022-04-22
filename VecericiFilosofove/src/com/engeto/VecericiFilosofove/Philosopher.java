package com.engeto.VecericiFilosofove;



public class Philosopher extends Thread{

    private int id;
    private int pieceOfFood = 0;//hodnata kolik porcí jídla filozof spořádal
    private int full;//hodnota kdy bude filozof nasycen
    private Fork rightFork, leftFork;

    public Philosopher(int id, int full, Fork rightFork, Fork leftFork) {
        this.id = id;
        pieceOfFood = 0;
        this.full = full;
        this.leftFork = leftFork;
        this.rightFork = rightFork;
    }

    @Override
    public void run() {
        try {
            while (pieceOfFood < full){
                think();
                if (leftFork.pickUpFork(this)){
                    if(rightFork.pickUpFork(this)){
                        eat();
                        rightFork.downFork(this);
                    }
                    leftFork.downFork(this);
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private void eat() throws InterruptedException{

        System.out.println(this + " eat");
        pieceOfFood++;
        System.out.println("Philosopher " + id + " ate     " + pieceOfFood + "     peaces of food");
        Thread.sleep(300);
    }

    private void think() throws InterruptedException{
        System.out.println(this + " thinking...");
        Thread.sleep(300);
    }


    @Override
    public String toString() {
        return "Philosopher " + id;
    }
}
