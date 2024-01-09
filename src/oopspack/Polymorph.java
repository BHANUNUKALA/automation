package oopspack;

//method overriding
class Animal {
    void sound() {
        System.out.println("Animal makes a sound");
    }
}

class Dog extends Animal {
    void sound() {
        System.out.println("Dog barks");
    }
}
public class Polymorph{
	public static void main(String[] args) {
	Dog myD = new Dog();
	Animal mya=new Animal();
	myD.sound();
	mya.sound();
	}
	
}