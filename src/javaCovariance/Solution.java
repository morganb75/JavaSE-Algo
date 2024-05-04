package javaCovariance;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

class Flower {

	public String whatsYourName() {
		return "I have many names and types";
	}
}

class Jasmine extends Flower {

	@Override
	public String whatsYourName() {
		return "Jasmine";
	}

}

class Lily extends Flower {

	@Override
	public String whatsYourName() {
		return "Lily";
	}

}

class Region {
	public Flower yourNationalFlower() {
		Flower flower = new Flower();
		return flower;
	}
}

class WestBengal extends Region {

	@Override
	public Flower yourNationalFlower() {
		Jasmine jasmine = new Jasmine();
		return jasmine;
	}

}

class AndhraPradesh extends Region {

	@Override
	public Flower yourNationalFlower() {
		Lily lily = new Lily();
		return lily;
	}

}

public class Solution {
	public static void main(String[] args) throws IOException {
		String pathFile = "source/javaCovariance/input.txt";
		BufferedReader reader = new BufferedReader(new FileReader(pathFile));
		String s = reader.readLine().trim();
		Region region = null;
		switch (s) {
		case "WestBengal":
			region = new WestBengal();
			break;
		case "AndhraPradesh":
			region = new AndhraPradesh();
			break;
		}
		Flower flower = region.yourNationalFlower();
		System.out.println(flower.whatsYourName());
	}
}
