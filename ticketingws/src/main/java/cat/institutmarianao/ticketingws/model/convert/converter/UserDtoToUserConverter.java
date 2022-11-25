package cat.institutmarianao.ticketingws.model.convert.converter;

import org.springframework.beans.BeanUtils;
import org.springframework.core.convert.converter.Converter;
import org.springframework.stereotype.Component;

import cat.institutmarianao.ticketingws.model.Employee;
import cat.institutmarianao.ticketingws.model.Supervisor;
import cat.institutmarianao.ticketingws.model.Technician;
import cat.institutmarianao.ticketingws.model.User;
import cat.institutmarianao.ticketingws.model.dto.EmployeeDto;
import cat.institutmarianao.ticketingws.model.dto.SupervisorDto;
import cat.institutmarianao.ticketingws.model.dto.TechnicianDto;
import cat.institutmarianao.ticketingws.model.dto.UserDto;

@Component
public class UserDtoToUserConverter implements Converter<UserDto, User> {

	@Override
	public User convert(UserDto source) {
		if (source instanceof SupervisorDto supervisorDto) {
			// Includes Supervisor
			Supervisor supervisor = new Supervisor();
			copyCommonProperties(supervisorDto, supervisor);

			// TODO Copy company
			return supervisor;
		}
		if (source instanceof TechnicianDto technicianDto) {
			// Includes Supervisor
			Technician technician = new Technician();
			copyCommonProperties(technicianDto, technician);

			// TODO Copy company
			return technician;
		}
		if (source instanceof EmployeeDto employeeDto) {
			Employee employee = new Employee();
			copyCommonProperties(employeeDto, employee);

			// TODO Copy room and place
			return employee;
		}
		return null;
	}

	private void copyCommonProperties(UserDto userDto, User user) {
		BeanUtils.copyProperties(userDto, user);
	}
}
