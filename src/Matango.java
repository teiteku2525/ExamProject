public class Matango extends Monster {
    Matango(String name, char suffix, int hp) {
        super(name, suffix,hp);
    }

    public void attack(Creature target) {
        System.out.println(this.getName() + getSuffix() + "は体当たり攻撃！ " + target.getName() + "に6のダメージを与えた！");
        target.setHp(target.getHp() - 6);
    }


}
