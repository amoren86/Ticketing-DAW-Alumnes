/**
 *
 */
package cat.institutmarianao.ticketingws.model;

import java.io.Serializable;
import java.util.Objects;

/**
 * A name, there the employee is
 */

public class Company implements Serializable {

	private static final long serialVersionUID = 1L;

	public static final int MAX_COMPANY = 100;

	private Long id;

	private String name;

	public Company() {
		// POJO constructor
	}

	public Company(String name) {
		this.name = name;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Long getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public int hashCode() {
		return Objects.hash(id);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}
		if (!(obj instanceof Company other)) {
			return false;
		}
		return Objects.equals(id, other.id);
	}

}
