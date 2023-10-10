package edu.jsp.customquerymethodsrepository.bean;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

public interface UserRepository extends JpaRepository<User, Integer>{

	@Query("SELECT u FROM User u")
	List<User> getAllUser();
	
	@Query("SELECT u FROM User u WHERE u.status= ?1")
	List<User> getByStatus(String status);
	
	@Query("SELECT u FROM User u WHERE u.status= ?1 AND u.age> ?2")
	List<User> getByStatusAndAge(String myStatus,int age);
	
	@Query("SELECT u FROM User u WHERE u.email= ?1 AND u.password = ?2")
	List<User> getByEmailAndPassword(String email,String password);
	
	
	@Query("SELECT u FROM User u WHERE u.phone=:myPhone")
	List<User> getAllByPhone(@Param("myPhone")long phone);
}
