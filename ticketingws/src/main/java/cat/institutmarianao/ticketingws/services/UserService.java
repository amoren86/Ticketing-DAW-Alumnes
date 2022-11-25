package cat.institutmarianao.ticketingws.services;

import java.util.List;
import java.util.Optional;

import javax.validation.Valid;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

import org.springframework.data.domain.Sort.Order;

import cat.institutmarianao.ticketingws.model.User;
import cat.institutmarianao.ticketingws.model.User.Role;

public interface UserService {

	List<User> findAll(List<Order> orders, Role role, String fullName);

	Optional<User> findByUsername(@NotBlank String username);

	User getUserByUsername(@NotBlank String username);

	User save(@NotNull @Valid User user);

	User update(@NotNull @Valid User user);

	void deleteByUsername(@NotBlank String username);
}