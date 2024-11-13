package org.example;

public class Main {
    public void operatorsTest() {
        int count = 10;
        int extracount = 2;
        int totalcount = count;
        if(extracount == 1 ^ count < 100){
            totalcount = count + extracount;
        }
        System.out.println(totalcount);
    }
    public static void main(String[] args) {
        Main obj = new Main();
        obj.operatorsTest();
    }

}