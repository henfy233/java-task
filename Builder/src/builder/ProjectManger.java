package builder;

public class ProjectManger {
	private Builder builder;
	public ProjectManger(Builder builer){
		this.builder = builer;
	}
	public Car decorate(){
		builder.buildBody();
		builder.buildEngine();
		builder.buildTyre();
		builder.buildExhaustPipe();
		return builder.getResult();
	}
}
