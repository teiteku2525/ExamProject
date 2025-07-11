public class Goblin extends Monster{

    String name = "ゴブリン";
    Goblin(char suffix,int hp){
        super(suffix,hp);
    }

    @Override
    public void attack(Creature target) {
        System.out.println(getName() + this.getSuffix() + "はナイフで切りつけた！ " + target.getName() + "に8のダメージを与えた！");
        target.setHp(target.getHp() - 8);
    }
    public String getName() {
        return name;
    }
}
