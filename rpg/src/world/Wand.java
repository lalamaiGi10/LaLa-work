package world;

public class Wand {
	private String name;
	private double power;
	
	public Wand(String name) {
		setName(name);
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		if (name == null) {
			throw new IllegalArgumentException("名前が空っぽ!!処理中断!!!");
		}
		if (name.length() < 3) {
			throw new IllegalArgumentException("名前が短すぎ!!処理中断!!!");
		}
		this.name = name;
	}

	public double getPower() {
		return power;
	}

	public void setPower(double power) {
		if (power >= 0.5 && power <= 100.0) {
			this.power = power;
		} else {
			throw new IllegalArgumentException("増幅率は0.5~100.0まで!!!");
		}
	}

}
