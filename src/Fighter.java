
public class Fighter extends Human {
	public Fighter(String name) {
		this.name = name;
		this.hp = 500;
		this.offensive = 80;
	}

	public void attack(Living target) {
		int damage = Rand.get(10) * this.offensive;
		target.hp -= damage;
		System.out.println(this.name + "が斧で攻撃!" + target.name + "に" + damage + "のダメージを与えた。");
	}
}
