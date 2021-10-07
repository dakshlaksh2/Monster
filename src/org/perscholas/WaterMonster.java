package org.perscholas;

public class WaterMonster extends Monster{
    public WaterMonster(String name){
        super(name);
    }

    public WaterMonster() {
        super();
    }

    @Override
    public String attack() {
        return "Attack with water";
    }
}
