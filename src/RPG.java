import java.util.ArrayList;
import java.util.List;

public class RPG {
	public static void main(String[] args) {
		List<Human> humanList = new ArrayList<>();
		Human brave = new Brave("ゆう");
		humanList.add(brave);
		Human fighter = new Fighter("たた");
		humanList.add(fighter);
		Human wizard = new Wizard("まほ");
		humanList.add(wizard);
		List<Monster> monsterList = new ArrayList<>();
		Monster slime = new Slime("スライム");
		monsterList.add(slime);
		Monster oak = new Oak("オーク");
		monsterList.add(oak);
		Monster dragon = new Dragon("ドラゴン");
		monsterList.add(dragon);

//		System.out.println(human.hp);
		while (true) {
			Human human = humanList.get(Rand.get(humanList.size()));// Rand.get(3)と同じ
//			System.out.println(human.name);
			Monster monster = monsterList.get(Rand.get(monsterList.size()));
//			System.out.println(monster.name);

			System.out.println("人間のターン！");
			human.attack(monster);
			// monster.hpが０以下ならばモンスター死亡
			if (monster.hp <= 0) {
				System.out.println("モンスター：" + monster.name + "が倒れた");
				monsterList.remove(monster);
			}
			// モンスターリストに誰もいなくなれば人間の勝利で繰り返し終了
			if (monsterList.size() == 0) {
				System.out.println("人間の勝利！");
				break;
			}
//			System.out.println(monster.hp);
			System.out.println("モンスターのターン！");
			monster.attack(human);
			// human.hpが０以下ならば人間死亡
			if (human.hp <= 0) {
				System.out.println("人間：" + human.name + "が倒れた");
				humanList.remove(human);
			}
			// ヒューマンリストに誰もいなくなればモンスターの勝利で繰り返し終了
			if (humanList.size() == 0) {
				System.out.println("モンスターの勝利！");
				break;
			}
		}

	}
}
