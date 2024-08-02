//s23011
//ポリモフィズムの課題

//スーバークラスAnimalの定義
class Animal {
	public void makeSound() {
		System.out.println("動物の音"); 
	}
	public void test() {
		System.out.println("テスト出力");
	}
}

//継承したサブクラスDogの定義
class Dog extends Animal {
	public void makeSound() {
		System.out.println("ワンワンわん");
	}
}

//kadai
class Cat extends Animal {
		public void makeSound() {
				System.out.println("ニャー");
		}
}
public class d48Q2kadai {
	public static void main(String[] args) {
		Animal a = new Dog(); //インスタンス化
		a.makeSound(); //どのような処理になるでしょう
		a.test(); //どのような処理になるでしょう
		Animal a2 = new Cat();
		a2.makeSound();
		a2.test();
	}
}
