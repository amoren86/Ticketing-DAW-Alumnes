package cat.institutmarianao.ticketingws.model.dto;

import java.io.Serializable;
import java.util.Date;
import java.util.Objects;

import cat.institutmarianao.ticketingws.model.Ticket;
import cat.institutmarianao.ticketingws.model.Ticket.Category;

public class TicketDto implements Serializable {

	private static final long serialVersionUID = 1L;

	private Long id;

	private Ticket.Category category;

	private String description;

	protected String performer;

	protected Date openingDate = new Date();

	public TicketDto() {
		// POJO Contructor
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Category getCategory() {
		return category;
	}

	public void setCategory(Category category) {
		this.category = category;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description.trim();
	}

	public String getPerformer() {
		return performer;
	}

	public void setPerformer(String performer) {
		this.performer = performer;
	}

	public Date getOpeningDate() {
		return openingDate;
	}

	public void setOpeningDate(Date openingDate) {
		this.openingDate = openingDate;
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
		if (!(obj instanceof TicketDto other)) {
			return false;
		}
		return Objects.equals(id, other.id);
	}
}
