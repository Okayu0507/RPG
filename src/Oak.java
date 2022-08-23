
public class Oak extends Monster {
	public Oak(String name) {
		this.name = name;
		this.hp = 600;
		this.offensive = 65;
	}

	public void attack(Living target) {
		int damage = Rand.get(10) * this.offensive;
		target.hp -= damage;
		System.out.println(this.name + "が槍で攻撃!" + target.name + "に" + damage + "のダメージを与えた。");
	}
}
