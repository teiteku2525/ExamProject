public class Hero extends Character {
    String weapon;

    Hero(String name, int hp, String weapon) {
        super(name, hp);
        this.weapon = weapon;
    }

    public void attack(Creature target) {
        System.out.println(getName() + "は" + getWeapon() + "で攻撃！ " + target.getName() + "に10のダメージを与えた！" );
        target.setHp(target.getHp() - 10);
    }



    public String getWeapon() {
        return this.weapon;
    }
}
