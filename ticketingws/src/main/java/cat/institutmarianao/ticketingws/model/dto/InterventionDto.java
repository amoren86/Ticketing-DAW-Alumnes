package cat.institutmarianao.ticketingws.model.dto;

import java.io.Serializable;

public class InterventionDto extends ActionDto implements Serializable {

	private static final long serialVersionUID = 1L;

	private int hours;

	private String description;

	public InterventionDto() {
		// POJO constructor
	}

	public int getHours() {
		return hours;
	}

	public void setHours(int hours) {
		this.hours = hours;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String descripcio) {
		description = descripcio.trim();
	}
}
