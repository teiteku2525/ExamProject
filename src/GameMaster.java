import java.util.ArrayList;
public class GameMaster {
    public static void main(String[] args) {

        Hero hero = new Hero("勇者", 100, "剣");
        Wizard wizard = new Wizard("魔法使い", 60, 40);
        Thief thief = new Thief("盗賊", 70);
        ArrayList<Character> party = new ArrayList<Character>();
        party.add(hero);
        party.add(wizard);
        party.add(thief);

        Matango matango = new Matango("お化けキノコ",'A', 45);
        Goblin goblin = new Goblin("ゴブリン",'A', 50);
        Slime slime = new Slime("スライム", 'A', 40);
        ArrayList<Monster> enemy = new ArrayList<Monster>();
        enemy.add(matango);
        enemy.add(goblin);
        enemy.add(slime);

        //エンティティの状態表示
        System.out.println("---味方パーティ---");
        for (Character member : party) {
            member.showStatus();
        }
        System.out.println("---敵グループ---");
        for (Monster member: enemy) {
            member.showStatus();
        }
        //ここから戦闘開始
        System.out.println("\n味方の総攻撃！");
        for (Character tripleAtk: party) { //殴るクリーチャーを変更
            for (int i = 0; i < 3; i++) { //殴られるクリーチャーを変更
                tripleAtk.attack(enemy.get(i));
            }
        }
        System.out.println("\n敵の総攻撃！");
        for (Monster tripleAtk: enemy) { //殴るクリーチャーを変更
            for (int i = 0; i < 3; i++) { //殴られるクリーチャーを変更
                tripleAtk.attack(party.get(i));
            }
        }
        System.out.println("\nダメージを受けた" + hero.getName() + "が突然光りだした！");
        System.out.println(hero.getName() + "はスーパーヒーローに進化した");
        SuperHero sHero = new SuperHero(hero);
        party.set(0, sHero); //ここでジョブチェン
        for (int i = 0; i < 3; i++) {
            sHero.attack(enemy.get(i));
        }

        System.out.println("\n味方パーティ最終ステータス");
        for (Character member : party) {
            member.showStatus();
            if(member.isAlive()) {
                System.out.println("生存状況:生存");
            } else {
                System.out.println("生存状況:戦闘不能");
            }
        }

        System.out.println("\n敵グループ最終ステータス");
        for (Monster member : enemy) {
            member.showStatus();
            if(member.isAlive()) {
                System.out.println("生存状況:生存");
            } else {
                System.out.println("生存状況:討伐済み");
            }
        }
    }
}
