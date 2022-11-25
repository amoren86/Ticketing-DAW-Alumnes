package cat.institutmarianao.ticketingws.model;

import java.io.Serializable;
import java.util.Objects;

/**
 * <p>
 * A technical user, the one that can perform intervention actions. Can also
 * perform close actions only if he has any intervention in the referenced
 * ticket
 * </p>
 *
 * <p>
 * A technician has role <code>User.Role.TECHNICIAN</code> and his authorities
 * list contains <code>{"TECHNICIAN"}</code>
 * </p>
 *
 * @see User
 * @see Role
 * @see Intervention
 * @see Close
 */
public class Technician extends User implements Serializable {

	private static final long serialVersionUID = 1L;

	private Company company;

	public Technician() {
		// POJO constructor
	}

	public Company getCompany() {
		return company;
	}

	public void setCompany(Company company) {
		this.company = company;
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
		if (!(obj instanceof Technician technician)) {
			return false;
		}
		return Objects.equals(username, technician.username);
	}
}
