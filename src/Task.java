import java.util.Date;

public class Task {
	private String description = null;
	private boolean isComplete = false;
	private Date dueDate = null;
	
	public Task(String description) {
		super();
		this.description = description;
	}
	
	public Task(String description, boolean isComplete, Date inDate) {
		super();
		this.description = description;
		this.isComplete = isComplete;
		this.dueDate = inDate;
	}
	
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public boolean isComplete() {
		return isComplete;
	}
	public void setComplete(boolean isComplete) {
		this.isComplete = isComplete;
	}
	
	public Date getdueDate() {
		return this.dueDate;
	}
	
	public void setdueDate(Date inDate) {
		this.dueDate = inDate;
	}

}
