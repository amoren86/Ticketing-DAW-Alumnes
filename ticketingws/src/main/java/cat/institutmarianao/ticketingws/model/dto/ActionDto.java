package cat.institutmarianao.ticketingws.model.dto;

import java.io.Serializable;
import java.util.Date;

import cat.institutmarianao.ticketingws.model.Action;

public abstract class ActionDto implements Serializable {

	private static final long serialVersionUID = 1L;

	protected Long id;

	protected Action.Type type;

	protected String performer;

	protected Date date = new Date();

	protected Long ticketId;

	protected ActionDto() {
		// POJO Contructor
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Action.Type getType() {
		return type;
	}

	public void setType(Action.Type type) {
		this.type = type;
	}

	public String getPerformer() {
		return performer;
	}

	public void setPerformer(String performer) {
		this.performer = performer;
	}

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	public Long getTicketId() {
		return ticketId;
	}

	public void setTicketId(Long ticketId) {
		this.ticketId = ticketId;
	}
}
