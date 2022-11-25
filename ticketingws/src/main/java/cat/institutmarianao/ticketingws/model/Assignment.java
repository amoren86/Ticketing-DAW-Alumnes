package cat.institutmarianao.ticketingws.model;

import java.io.Serializable;
import java.util.Objects;

/**
 * Assignació del ticket per part del supervisor a un tècnic indicant la
 * priority corresponent en una determinada date
 *
 * Durant la creació de l'assignació: - La priority ha de tenir un valor entre 1
 * i 9, si el valor indicat està fora d'aquest rang indicar 1 - Podem suposar
 * que el tècnic no serà nul
 *
 *
 * No es pot actualitzar cap atribut a un valor incorrecte
 *
 */
public class Assignment extends Action implements Serializable {

	private static final long serialVersionUID = 1L;

	public static final int MIN_PRIORITAT = 1;
	public static final int MAX_PRIORITAT = 9;

	private Technician technician;

	private Integer priority;

	public Assignment() {
		// POJO constructor
	}

	public Technician getTechnician() {
		return technician;
	}

	public void setTechnician(Technician technician) {
		this.technician = technician;
	}

	public Integer getPriority() {
		return priority;
	}

	public void setPriority(int priority) {
		this.priority = priority;
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
		if (!(obj instanceof Assignment other)) {
			return false;
		}
		return Objects.equals(id, other.id);
	}
}
