public final class Slime extends Monster{
    String name = "スライム";
    Slime(char suffix,int hp) {
        super(suffix,hp);
    }

    public void attack(Creature target) {
        System.out.println(getName() + this.getSuffix() + "は体当たり攻撃！ " +target.getName() + "に5のダメージを与えた！");
        target.setHp(target.getHp()-5);
    }
    public String getName() {
        return name;
    }
}
