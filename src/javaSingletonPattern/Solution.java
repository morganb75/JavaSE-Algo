package javaSingletonPattern;

public class Solution {

	public static void main(String[] args) {
		Singleton singletonInstance = Singleton.getSingleInstance();
		singletonInstance.sayHello("hello world");

	}

}
