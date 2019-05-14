package builder;

public class Car {
	private String body; //车架
	private String engine; // 引擎
	private String tyre; // 轮胎
	private String exhaustPipe; //排气管
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
		System.out.println("这是一辆炫酷的跑车");
	}
}
