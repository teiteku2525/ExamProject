public final class Slime extends Monster{
    Slime(char suffix,int hp) {
        super(suffix,hp);
    }

    @Override
    public void attack(Creature target) {
        System.out.println("スライム" + this.getSuffix() + "は体当たり攻撃！ " +target.getName() + "に5のダメージを与えた！");
        target.setHp(this.getHp()-5);
    }
}
