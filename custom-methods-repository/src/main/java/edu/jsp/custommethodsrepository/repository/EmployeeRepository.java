package edu.jsp.custommethodsrepository.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import edu.jsp.custommethodsrepository.bean.Employee;

public interface EmployeeRepository extends JpaRepository<Employee, Integer> {

    // Find an Employee by their age
    Employee findByAge(int age);

    // Find an Employee by their name
    Employee findByName(String name);

    // Find an Employee by their phone number
    Employee findByPhone(long phone);

    // Find an Employee by their phone number and password
    Employee findByPhoneAndPassword(long phone, String password);

    // Find a list of Employees with an age greater than the specified value
    List<Employee> findByAgeGreaterThan(int ageValue);

    // Find an Employee by their email
    Employee findByEmail(String email);

    // Find an Employee by their password
    Employee findByPassword(String password);
}
