package builder;

public class Car {
	private String body; //����
	private String engine; // ����
	private String tyre; // ��̥
	private String exhaustPipe; //������
	public void setBody(String body) {
		this.body = body;
	}
	public void setEngine(String engine) {
		this.engine = engine;
	}
	public void setTyre(String tyre) {
		this.tyre = tyre;
	}
	public void setExhaustPipe(String exhaustPipe) {
		this.exhaustPipe = exhaustPipe;
	}
	public String getBody() {
		return body;
	}
	public String getEngine() {
		return engine;
	}
	public String getTyre() {
		return tyre;
	}
	public String getExhaustPipe() {
		return exhaustPipe;
	}
	public void show() {
		System.out.println("����һ���ſ���ܳ�");
	}
}
