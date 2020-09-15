package com.jkw.javase.day2.cxgame;

import com.jkw.javase.day2.game.Monster;
//游戏角色： 父类
public abstract class Role {
    private String name;
    private String level;
    private int blood;
    private int power;
    private int defence;
    private String kind;

    public Role() {
    }

    public Role(String name, String level, int blood, int power, int defence, String kind) {
        this.name = name;
        this.level = level;
        this.blood = blood;
        this.power = power;
        this.defence = defence;
        this.kind = kind;
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

    public int getPower() {
        return power;
    }

    public void setPower(int power) {
        this.power = power;
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
    public abstract void attack(Role role);

    // 死亡判定方法isDead()
    public boolean isDead(){
        if(this.blood<=0){
            return  false;
        }
        return true;
    }
    public void show() {
        System.out.println("角色名称:" + name);
        System.out.println("角色级别" + level);
        System.out.println("角色血量" + blood);
        System.out.println("角色攻击力" + power);
        System.out.println("角色防御力:" + defence);
        System.out.println("角色类别" + kind);
    }
}
