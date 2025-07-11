public abstract class Monster implements Creature {
    String name;
    int hp;
    char suffix;

    Monster(char suffix,int hp) {
        setSuffix(suffix);
        if (hp < 0) {
            throw new IllegalArgumentException("初期設定に誤りがあるため、キャラクターを作成できませんでした");
        }
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
        this.hp = Math.max(hp, 0);
    }
    public abstract String getName();
    public char getSuffix() {
        return this.suffix;
    }
    public int getHp() {
        return this.hp;
    }

}
