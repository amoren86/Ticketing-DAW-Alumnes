package cat.institutmarianao.ticketingws.model.dto;

import java.io.Serializable;
import java.util.Objects;

public class EmployeeDto extends UserDto implements Serializable {

	private static final long serialVersionUID = 1L;

	public static final int MAX_PLACE = 100;

	private Long roomId;

	private String place;

	public EmployeeDto() {
		// POJO constructor
	}

	public Long getRoomId() {
		return roomId;
	}

	public void setRoomId(Long roomId) {
		this.roomId = roomId;
	}

	public String getPlace() {
		return place;
	}

	public void setPlace(String lloc) {
		place = lloc;
	}

	@Override
	public int hashCode() {
		return super.hashCode();
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}
		if (!(obj instanceof EmployeeDto employee)) {
			return false;
		}
		return Objects.equals(username, employee.username);
	}
}
