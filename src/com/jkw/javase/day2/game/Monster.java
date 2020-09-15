package com.jkw.javase.day2.game;

public class Monster {
    private String name;
    private String level;
    private int blood;
    private int power;
    private int defence;
    private String kind;

    public Monster() {
    }

    public Monster(String name, String level, int blood,int power, int defence, String kind) {
        this.name = name;
        this.level = level;
        this.blood = blood;
        this.power = power;
        this.defence = defence;
        this.kind = kind;
    }

    public int getPower() {
        return power;
    }

    public void setPower(int power) {
        this.power = power;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLevel() {
        return level;
    }

    public void setLevel(String level) {
        this.level = level;
    }

    public int getBlood() {
        return blood;
    }

    public void setBlood(int blood) {
        this.blood = blood;
    }

    public int getDefence() {
        return defence;
    }

    public void setDefence(int defence) {
        this.defence = defence;
    }

    public String getKind() {
        return kind;
    }

    public void setKind(String kind) {
        this.kind = kind;
    }
    public void attack(Hero h){
        //英雄的失血量 = 怪兽的攻击力 - 英雄的防御力
        int blood = this.power - h.getDefence();
        if(blood>0){
            //产生有效攻击,设置英雄血量
            h.setBlood(h.getBlood()-blood);
            System.out.println("此回合英雄的失血量为："+blood+",英雄的剩余血量为:"+h.getBlood());
        }
        else{
            //产生无效攻击
            System.out.println("此回合攻击无效");
        }
    }
    public boolean isDead(){
        if(this.blood<=0){
            //代表已死
            return false;
        }
        return true;
    }
    public void show(){
        System.out.println("怪兽名称:"+name);
        System.out.println("怪兽级别:"+level);
        System.out.println("怪兽血量:"+blood);
        System.out.println("怪兽攻击力:"+power);
        System.out.println("怪兽防御力:"+defence);
        System.out.println("怪兽类别:"+kind);
    }
}

