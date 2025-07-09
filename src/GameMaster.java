public class GameMaster {
    public static void main(String[] args) {

        Hero hero = new Hero("勇者", 100, "剣");
        Wizard wizard = new Wizard("魔法使い", 60, 40);
        Thief thief = new Thief("盗賊", 70);
        Character[] party = {hero, wizard, thief};

        Matango matango = new Matango('A', 45);
        Goblin goblin = new Goblin('A', 50);
        Slime slime = new Slime('A', 40);
        Monster[] enemy = {matango, goblin, slime};

        System.out.println("---味方パーティ---");

    }
}
