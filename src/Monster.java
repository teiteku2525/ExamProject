public abstract class Monster implements Creature {
    String name;
    int hp;
    char suffix;

    Monster(char suffix,int hp) {
        setSuffix(suffix);
        setHp(hp);
    }

    public final boolean isAlive() {
        return hp > 0;
    }
    public void showStatus() {
        System.out.println(getName() + getSuffix() + ": HP" + getHp());
    }


    public void setSuffix(char suffix) {
        this.suffix = suffix;
    }
    public void setHp(int hp) {
        this.hp = hp;
    }
    public String getName() {
        return this.name;
    }
    public char getSuffix() {
        return this.suffix;
    }
    public int getHp() {
        return this.hp;
    }

}
