package cat.institutmarianao.ticketingws.model.dto;

import java.io.Serializable;

public class AssignmentDto extends ActionDto implements Serializable {

	private static final long serialVersionUID = 1L;

	public static final int MIN_PRIORITAT = 1;
	public static final int MAX_PRIORITAT = 9;

	private String technician;

	private Integer priority;

	public AssignmentDto() {
		// POJO constructor
	}

	public String getTechnician() {
		return technician;
	}

	public void setTechnician(String technician) {
		this.technician = technician;
	}

	public Integer getPriority() {
		return priority;
	}

	public void setPriority(int priority) {
		this.priority = priority;
	}
}
