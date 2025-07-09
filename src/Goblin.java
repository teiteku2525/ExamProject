public class Goblin extends Monster{
    Goblin(char suffix,int hp){
        super(suffix,hp);
    }

    @Override
    public void attack(Creature target) {
        System.out.println("ゴブリン" + this.getSuffix() + "はナイフで切りつけた！ " + target.getName() + "に8のダメージを与えた！");
        target.setHp(this.getHp() - 8);

    }
}
