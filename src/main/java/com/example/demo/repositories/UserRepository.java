package com.example.demo.repositories;

import org.springframework.data.repository.CrudRepository;

import com.example.demo.entities.NameEntity;

//This will be AUTO IMPLEMENTED by Spring into a Bean called userRepository
//CRUD refers Create, Read, Update, Delete

public interface UserRepository extends CrudRepository<NameEntity, Long> {

//	@Query("select t from Member t where name=:name and age < :age")
//	List<Member> findByNameAndAgeLessThanSQL(@Param("name") String name, @Param("age") int age);
	
	
}