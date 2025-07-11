public class Matango extends Monster {
    Matango(char suffix, int hp) {
        super(suffix,hp);
    }

    String name = "お化けキノコ";
    public void attack(Creature target) {
        System.out.println(getName() + getSuffix() + "は体当たり攻撃！ " + target.getName() + "に6のダメージを与えた！");
        target.setHp(target.getHp() - 6);
    }

    public String getName() {
        return name;
    }
}
