package garden;

import garden.Flower.Leaf;

public class Main {

	public static void main(String[] args) {
		Flower f = new Flower("プバルディア");
		f.bloom();
		Leaf l = f.makeLeaf();
		System.out.println(l.getName());
		
		Rose r = new Rose("クリスマスローズ");
		r.smell();
		

	}

}
