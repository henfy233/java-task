package builder;

public class ConcreteBuilder extends Builder{
	public void buildBody() {
		car.setBody("ȫ̼��ά����");
	}
	public void buildEngine() {
		car.setEngine("��ɯ����V8������");
	}
	public void buildTyre() {
		car.setTyre("��������̥");
	}
	public void buildExhaustPipe() {
		car.setExhaustPipe("��ھ������� x4");
	}
}
