package builder;

public class ConcreteBuilder extends Builder{
	public void buildBody() {
		car.setBody("全碳纤维车架");
	}
	public void buildEngine() {
		car.setEngine("玛莎拉蒂V8发动机");
	}
	public void buildTyre() {
		car.setTyre("米其林轮胎");
	}
	public void buildExhaustPipe() {
		car.setExhaustPipe("大口径排气管 x4");
	}
}
