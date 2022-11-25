package cat.institutmarianao.ticketingws.model;

import java.io.Serializable;

/**
 * <p>
 * A technician who supervises other ones. It performs assignments of tickets to
 * another technicians. He can also close tickets
 * </p>
 * <p>
 * A supervidor has role <code>User.Role.SUPERVISOR</code> and his authorities
 * list contains <code>{"SUPERVISOR","TECHNICIAN"}</code>, since a supervisor is
 * also a technician.
 * </p>
 *
 * @see User
 * @see Role
 * @see Intervention
 * @see Close
 */
public class Supervisor extends Technician implements Serializable {

	private static final long serialVersionUID = 1L;

	public Supervisor() {
		// POJO Contructor
	}
}
