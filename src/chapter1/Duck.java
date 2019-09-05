package chapter1;

public abstract class Duck {

	FlyBehaviour flyBehaviour;
	QuackBehaviour quackBehaviour;

	public Duck() {

	}

	public void setFlyBehaviour(FlyBehaviour fb) {
		flyBehaviour = fb;
	}

	public void setQuackBehaviour(QuackBehaviour qb) {
		quackBehaviour = qb;
	}

	public abstract void display();

	public void performFly() {
		flyBehaviour.fly();
	}

	public void performQuack() {
		quackBehaviour.quack();
	}

	public void swim() {
		System.out.println("All ducks float,even the decoy ducks");
	}
}
