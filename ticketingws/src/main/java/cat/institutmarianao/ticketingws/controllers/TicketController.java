package cat.institutmarianao.ticketingws.controllers;

import java.util.Date;
import java.util.List;
import java.util.Optional;

import javax.validation.Valid;
import javax.validation.constraints.Positive;
import javax.validation.constraints.PositiveOrZero;

import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import cat.institutmarianao.ticketingws.model.Ticket;
import cat.institutmarianao.ticketingws.model.Ticket.Category;
import cat.institutmarianao.ticketingws.model.Ticket.Status;
import cat.institutmarianao.ticketingws.model.dto.ActionDto;
import cat.institutmarianao.ticketingws.model.dto.TicketDto;
import cat.institutmarianao.ticketingws.validation.groups.OnActionCreate;
import cat.institutmarianao.ticketingws.validation.groups.OnTicketCreate;

@RestController
@RequestMapping("/tickets")
@Validated
public class TicketController {
	private static final String DATE_PATTERN = "dd/MM/yyyy HH:mm:ss";

//	@Autowired
//	private UserService userService;
//	@Autowired
//	private TicketService ticketService;
//	@Autowired
//	private ActionService actionService;
//
//	@Autowired
//	private ConversionService conversionService; //Used to convert from/to dto

	@GetMapping("/find/all")
	public List<TicketDto> findAll(@RequestParam(value = "page", required = false) @PositiveOrZero Integer page,
			@RequestParam(value = "size", required = false) @Positive Integer size,
			@RequestParam(value = "sort", required = false, defaultValue = "date,asc") String[] sortDtoFields,
			@RequestParam(value = "status", required = false) Status status,
			@RequestParam(value = "reportedBy", required = false) String reportedBy,
			@RequestParam(value = "category", required = false) Category category,
			@RequestParam(value = "from", required = false) @DateTimeFormat(pattern = DATE_PATTERN) Date from,
			@RequestParam(value = "to", required = false) @DateTimeFormat(pattern = DATE_PATTERN) Date to) {

		// TODO find all tickets
		return null;
	}

	@GetMapping("/find/all/PENDING")
	public List<TicketDto> findAllPending(@RequestParam(value = "page", required = false) @PositiveOrZero Integer page,
			@RequestParam(value = "size", required = false) @Positive Integer size,
			@RequestParam(value = "sort", required = false, defaultValue = "date,asc") String[] sortDtoFields,
			@RequestParam(value = "reportedBy", required = false) String reportedBy,
			@RequestParam(value = "category", required = false) Category category,
			@RequestParam(value = "from", required = false) @DateTimeFormat(pattern = DATE_PATTERN) Date from,
			@RequestParam(value = "to", required = false) @DateTimeFormat(pattern = DATE_PATTERN) Date to) {

		// TODO find all pending tickets (tickets with only openings)
		return null;
	}

	@GetMapping("/find/all/IN_PROCESS")
	public List<TicketDto> findAllInProcess(
			@RequestParam(value = "page", required = false) @PositiveOrZero Integer page,
			@RequestParam(value = "size", required = false) @Positive Integer size,
			@RequestParam(value = "sort", required = false, defaultValue = "date,asc") String[] sortDtoFields,
			@RequestParam(value = "reportedBy", required = false) String reportedBy,
			@RequestParam(value = "category", required = false) Category category,
			@RequestParam(value = "from", required = false) @DateTimeFormat(pattern = DATE_PATTERN) Date from,
			@RequestParam(value = "to", required = false) @DateTimeFormat(pattern = DATE_PATTERN) Date to) {

		// TODO find all tickets in process (tickets with assignment or interventions)
		return null;
	}

	@GetMapping("/find/all/HISTORICAL")
	public List<Ticket> findAllHistorical(@RequestParam(value = "page", required = false) @PositiveOrZero Integer page,
			@RequestParam(value = "size", required = false) @Positive Integer size,
			@RequestParam(value = "sort", required = false, defaultValue = "date,asc") String[] sortFields,
			@RequestParam(value = "reportedBy", required = false) String reportedBy,
			@RequestParam(value = "category", required = false) Category category,
			@RequestParam(value = "from", required = false) @DateTimeFormat(pattern = DATE_PATTERN) Date from,
			@RequestParam(value = "to", required = false) @DateTimeFormat(pattern = DATE_PATTERN) Date to) {

		// TODO find all historical tickets (tickets closed)
		return null;
	}

	@GetMapping("/find/by/id/{ticketId}")
	public Optional<TicketDto> findById(@PathVariable("ticketId") @Positive Long ticketId) {
		// TODO find a ticket by its id
		return null;
	}

	@GetMapping("/find/tracking/by/id/{ticketId}")
	public Iterable<ActionDto> findTrackingByTicketId(@PathVariable("ticketId") @Positive Long ticketId) {
		// TODO find all actions of a ticket
		return null;
	}

	@PostMapping("/save")
	@Validated(OnTicketCreate.class)
	public TicketDto save(@RequestBody @Valid TicketDto ticketDto) {
		// TODO save a ticket (with its opening action)
		return null;
	}

	@PostMapping("/save/action")
	@Validated(OnActionCreate.class)
	public ActionDto saveAction(@RequestBody @Valid ActionDto actionDto) {
		// TODO save an action (assignment, intervention or close) of the ticket
		return null;
	}

	@DeleteMapping("/delete/by/id/{ticket_id}")
	public void deleteById(@PathVariable("ticket_id") @Positive Long ticketId) {
		// TODO delete a ticket by its id
	}
}
