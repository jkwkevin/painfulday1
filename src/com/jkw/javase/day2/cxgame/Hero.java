package com.jkw.javase.day2.cxgame;

public class Hero extends Role {

    public Hero() {
    }

    public Hero(String name, String level, int blood, int power, int defence, String kind) {
        super(name, level, blood, power, defence, kind);
    }

    private Equip[] equips = new Equip[3];
    //装备的数量

    public void setEquips(Equip[] equips) {
        this.equips = equips;
    }

    private int index=0;

    public void attack(Role m){
        //拥有一定几率打出暴击 随机数
        int random =(int)(Math.random()*10+1);
        // 暴击率
        int block = 0;
        if(random>3){
            block = random*2;
        }
        // 怪兽失血量 = 英雄攻击力 + 暴击率 - 怪兽的防御力
        int blood = this.getPower() +block -m.getDefence();
        if(blood>0){
            //设置怪兽的失血量
            m.setBlood(m.getBlood()-blood);
            System.out.println("此回合怪兽的失血量为："+blood+",怪兽的剩余血量为:"+m.getBlood());
        }
        else{
            //本轮攻击无效
            System.out.println("此回合攻击无效");
        }
    }
    // 添加装备的方法addEquip(Equip e)
    public void addEquip(Equip e){
        if(index>=equips.length){
            System.out.println("装备已满");
            return;
        }
        //添加装备
        equips[index++] = e;
        this.setPower(e.getPower()+this.getPower());
        this.setDefence(e.getDefence()+this.getDefence());
    }
    public void show(){
        System.out.println("---------------------英雄信息------------------------");
        super.show();
        System.out.println("=================装备信息===================");
        for(int i=0;i<index;i++){
            equips[i].show();
            System.out.println("-----------------------");
        }
    }
}
