package com.jkw.javase.day2.cxgame;

import com.jkw.javase.day2.game.Hero;

public class Monster extends Role{
    public Monster() {
    }
    public Monster(String name, String level, int blood, int power, int defence, String kind) {
        super(name, level, blood, power, defence, kind);
    }
    public void attack(Role h){
        //英雄的失血量 = 怪兽的攻击力 - 英雄的防御力
        int blood = this.getPower() - h.getDefence();
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
}
