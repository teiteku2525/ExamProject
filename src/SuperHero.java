public class SuperHero extends Hero {
    SuperHero(Hero hero) {
        super(hero.name,hero.hp,hero.weapon);
    }
    public void attack(Creature target) {
        System.out.println(getName() + "は" + getWeapon() + "で攻撃！ " + target.getName() + "に25のダメージを与えた！" );
        target.setHp(target.getHp() - 25);
    }
}
