package com.jkw.javase.day2.game;

public class Test {
    public static void main(String[] args) {


    Equip e1 = new Equip("无尽之刃","SSS","金色","暴击攻击类",80,0);
    Equip e2 = new Equip("兰顿之兆","S","黄色","护甲防御类",0,50);
    Equip e3 = new Equip("血手","SS","红色","攻击防御类",40,30);
    Hero hero = new Hero("Vayne","11",1200,130,50,"艾欧尼亚");
    Monster monster = new Monster("Nash Dragon","15",2000,200,80,"龙");
    //添加装备
        hero.addEquip(e1);
        hero.addEquip(e2);
        hero.addEquip(e3);
        hero.show();
        monster.show();
        //回合制攻击
        int count=0;
        while (true){
            count++;
            System.out.println("---------------当前第"+count+"回合-----------------------");
            // 英雄先发动攻击
            hero.attack(monster);
            //判断怪兽是否死亡
            if (!monster.isDead()){
                System.exit(0);

            }
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            monster.attack(hero);
            if(!hero.isDead()){
                System.exit(0);
            }
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

   }
}
