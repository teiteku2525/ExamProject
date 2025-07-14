public final class Slime extends Monster{
    Slime(String name, char suffix,int hp) {
        super(name,suffix,hp);
    }

    public void attack(Creature target) {
        System.out.println(this.getName() + this.getSuffix() + "は体当たり攻撃！ " +target.getName() + "に5のダメージを与えた！");
        target.setHp(target.getHp()-5);
    }
}
