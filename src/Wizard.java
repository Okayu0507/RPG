
public class Wizard extends Human {
	public Wizard(String name) {
		this.name = name;
		this.hp = 550;
		this.offensive = 65;
	}

	public void attack(Living target) {
		int damage = Rand.get(10) * this.offensive;
		target.hp -= damage;
		System.out.println(this.name + "が魔法で攻撃!" + target.name + "に" + damage + "のダメージを与えた。");
	}
}
