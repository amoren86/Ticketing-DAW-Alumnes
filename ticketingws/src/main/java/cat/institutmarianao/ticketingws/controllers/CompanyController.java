package cat.institutmarianao.ticketingws.controllers;

import java.util.List;
import java.util.Optional;

import javax.validation.constraints.Positive;

import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import cat.institutmarianao.ticketingws.model.Company;

@RestController
@RequestMapping("/companies")
@Validated
public class CompanyController {

//	@Autowired
//	private CompanyService companyService;

	@GetMapping(value = "/find/all")
	public List<Company> findAll() {
		// TODO find all companies
		return null;
	}

	@GetMapping("/find/by/id/{id}")
	public Optional<Company> findById(@PathVariable("id") @Positive Long id) {
		// TODO find a company by its id
		return null;
	}
}
