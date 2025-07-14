public class Goblin extends Monster{

    Goblin(String name, char suffix,int hp){
        super(name, suffix,hp);
    }

    public void attack(Creature target) {
        System.out.println(this.getName() + this.getSuffix() + "はナイフで切りつけた！ " + target.getName() + "に8のダメージを与えた！");
        target.setHp(target.getHp() - 8);
    }
}
