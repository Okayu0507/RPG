
public class Dragon extends Monster {
	public Dragon(String name) {
		this.name = name;
		this.hp = 900;
		this.offensive = 80;
	}

	public void attack(Living target) {
		int damage = Rand.get(10) * this.offensive;
		target.hp -= damage;
		System.out.println(this.name + "が炎で攻撃!" + target.name + "に" + damage + "のダメージを与えた。");
	}
}
