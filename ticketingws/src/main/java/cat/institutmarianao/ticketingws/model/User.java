package cat.institutmarianao.ticketingws.model;

import java.io.Serializable;
import java.util.Objects;

import org.hibernate.annotations.Formula;
import org.springframework.security.core.userdetails.UserDetails;

/**
 * <p>
 * A generic user of the ticketing app. It can be an employee, a technician or a
 * supervisor (see {@link User.Role})
 * </p>
 *
 * <p>
 * It is integrated with Spring Security through the implementation of
 * <code>UserDetails</code> interface
 * </p>
 *
 * <p>
 * Its <code>username</code> attribute must be unique
 * </p>
 *
 * @see UserDetails
 * @see Role
 * @see Employee
 * @see Technician
 * @see Supervisor
 */
public abstract class User implements Serializable {

	private static final long serialVersionUID = 1L;

	/* Values for role - MUST be constants (can not be enums) */
	public static final String EMPLOYEE = "EMPLOYEE";
	public static final String TECHNICIAN = "TECHNICIAN";
	public static final String SUPERVISOR = "SUPERVISOR";

	public enum Role {
		EMPLOYEE, TECHNICIAN, SUPERVISOR
	}

	public static final int MIN_USERNAME = 2;
	public static final int MAX_USERNAME = 25;
	public static final int MIN_PASSWORD = 10;
	public static final int MIN_FULL_NAME = 3;
	public static final int MAX_FULL_NAME = 100;
	public static final int MAX_EXTENSION = 9999;

	protected String username;

	protected Role role;

	protected String password;

	protected String fullName;

	protected Integer extension;

	/* Hibernate */
	@Formula("CONCAT(COALESCE((SELECT c.name FROM companies c WHERE company_id = c.id), ''), COALESCE((SELECT CONCAT(r.name, ' (', place, ')') FROM rooms r WHERE room_id = r.id), ''))")
	protected String location;

	protected User() {
		// POJO Contructor
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public Role getRole() {
		return role;
	}

	public void setRole(Role role) {
		this.role = role;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getFullName() {
		return fullName;
	}

	public void setFullName(String fullName) {
		this.fullName = fullName;
	}

	public Integer getExtension() {
		return extension;
	}

	public void setExtension(Integer extension) {
		this.extension = extension;
	}

	public String getLocation() {
		return location;
	}

	@Override
	public int hashCode() {
		return Objects.hash(username);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}
		if (!(obj instanceof User other)) {
			return false;
		}
		return Objects.equals(username, other.username);
	}
}
