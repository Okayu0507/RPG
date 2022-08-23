
public class Slime extends Monster {
	public Slime(String name) {
		this.name = name;
		this.hp = 650;
		this.offensive = 30;
	}

	public void attack(Living target) {
		int damage = Rand.get(10) * this.offensive;
		target.hp -= damage;
		System.out.println(this.name + "が体当たりで攻撃!" + target.name + "に" + damage + "のダメージを与えた。");
	}
}
