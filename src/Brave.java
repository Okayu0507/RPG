
public class Brave extends Human {
	public Brave(String name) {
		this.name = name;
		this.hp = 600;
		this.offensive = 60;
	}

	public void attack(Living target) {
		int damage = Rand.get(10) * this.offensive;
		target.hp -= damage;
		System.out.println(this.name + "が剣で攻撃!" + target.name + "に" + damage + "のダメージを与えた。");
	}
}
