package singleinheritance;

public class Mainsingleinheritance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
child k=new child();
k.show();
k.display();//child class extends from parent class so it can access both parent and child method
parent p=new parent();
//p.show();//here we cannot be extend parent class from child clss so it can't execute show error
p.display();

	}

}
