package cat.institutmarianao.ticketingws.model;

import java.io.Serializable;
import java.util.Objects;

/**
 * Close of a ticket by a performer in a certain date
 */
public class Close extends Action implements Serializable {

	private static final long serialVersionUID = 1L;

	public Close() {
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
		if (!(obj instanceof Close other)) {
			return false;
		}
		return Objects.equals(id, other.id);
	}
}
