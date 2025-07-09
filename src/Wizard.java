public class Wizard extends Character{
    int mp;

    Wizard(String name, int hp, int mp) {
        super(name, hp);
    }

    public void attack(Creature target) {
        System.out.println(this.getName() + "は火の玉を放った！ " + target.getName() + "に3のダメージを与えた！");
        target.setHp(this.getHp() - 3);
        this.setMp(this.getMp() - 1);
    }


    public void setMp(int mp) {
        this.mp = mp;
    }
    public int getMp() {
        return this.mp;
    }
}
