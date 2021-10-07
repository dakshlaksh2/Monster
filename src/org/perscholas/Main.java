package org.perscholas;

public class Main {

    public static void main(String[] args) {
        Monster m1 = new FireMonster();
        Monster m2 = new WaterMonster();
        Monster m3 = new StoneMonster();
        // write your code here

        System.out.println(m1.attack());
        System.out.println(m2.attack());
        System.out.println(m3.attack());
        //new monster
        m1 = new StoneMonster();
        System.out.println(m1.attack());
        Monster m4= new Monster();
        System.out.println(m4.attack());

    }
}
