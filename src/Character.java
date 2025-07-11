public abstract class Character implements Creature{
    String name;
    int hp;

    Character(String name, int hp) {
        setName(name);
        if (hp < 0) {
            throw new IllegalArgumentException("初期設定に誤りがあるため、キャラクターを作成できませんでした");
        }
        setHp(hp);
    }

    public final boolean isAlive() {
        return getHp() > 0;
    }
    public void showStatus() {
        System.out.println(getName() + ":HP " + getHp());
    }

    public void setName(String name) {
        this.name = name;
    }
    public void setHp(int hp) {
        this.hp = Math.max(hp, 0);
    }
    public int getHp() {
        return this.hp;
    }
    public String getName() {
        return this.name;
    }

}
