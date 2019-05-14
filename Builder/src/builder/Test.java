package builder;

public class Test {
	public static void main(String[] args) {
		ProjectManger m = new ProjectManger(new ConcreteBuilder());
		Car p = m.decorate();
		p.show();
		System.out.println(p.getEngine());
	}
}
