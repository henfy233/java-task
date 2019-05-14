package builder;

abstract class Builder {
	protected Car car = new Car();
	public abstract void buildBody();
	public abstract void buildEngine();
	public abstract void buildTyre();
	public abstract void buildExhaustPipe();
	public Car getResult() {
		return car;
	}
}
