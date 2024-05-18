package Inheritance_Demo;

public class ParentMain {

	public static void main(String[] args) {
		Parent pp;
		pp= new Parent();
		pp.eat();
		pp.sleep();
		
		System.out.println(" ");
		
		Child cc= new Child();
		cc.eat();
		cc.sleep();
		cc.cry();
		cc.play();
		System.out.println(" ");
		
		Grandchild gg= new Grandchild();
		gg.eat();
		gg.play();
		gg.sleep();
		gg.cry();
		gg.run();
		gg.study();
		gg.coding();
		System.out.println(" ");

		
		greatgrandchild ggc = new greatgrandchild();
		ggc.eat();
		ggc.play();
		ggc.sleep();
		ggc.cry();
		ggc.run();
		ggc.study();
		ggc.coding();
		ggc.codeDebug();
		
		System.out.println(" ");

	}

}
