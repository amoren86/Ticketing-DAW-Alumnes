package cat.institutmarianao.ticketingws.model.dto;

import java.io.Serializable;
import java.util.Objects;

public class TechnicianDto extends UserDto implements Serializable {

	private static final long serialVersionUID = 1L;

	public static final int MAX_COMPANY = 100;

	private Long companyId;

	public TechnicianDto() {
		// POJO constructor
	}

	public Long getCompanyId() {
		return companyId;
	}

	public void setCompanyId(Long companyId) {
		this.companyId = companyId;
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
		if (!(obj instanceof TechnicianDto technician)) {
			return false;
		}
		return Objects.equals(username, technician.username);
	}
}
