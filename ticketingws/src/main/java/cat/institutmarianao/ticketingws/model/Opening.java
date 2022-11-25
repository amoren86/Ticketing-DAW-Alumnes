package cat.institutmarianao.ticketingws.model;

import java.io.Serializable;
import java.util.Objects;

/**
 * Opening of a ticket by an employee in a certain date
 *
 */
public class Opening extends Action implements Serializable {

	private static final long serialVersionUID = 1L;

	public Opening() {
		// POJO constructor
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
		if (!(obj instanceof Opening other)) {
			return false;
		}
		return Objects.equals(id, other.id);
	}
}
