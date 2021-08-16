
public class task {

	private String taskId;
	private String name;
	private String description;
	
	public task(String taskId, String name, String description) {
		if(taskId == null || taskId.length()>10) {
			throw new IllegalArgumentException("Invalid Task Id");
		}
		if(name == null || name.length()>20) {
			throw new IllegalArgumentException("Invalid Name");
		}
		if(description == null || description.length()>50) {
			throw new IllegalArgumentException("Invalid description");
		}
		this.taskId = taskId;
		this.name = name;
		this.description = description;
			
	}
	
	public String gettaskId(){
		return taskId;
	
	}
	public String getname(){
		return name;
	
	}
	public String getdescription(){
		return description;
	
	}
	
	
	
	
	
	
	
	
}
