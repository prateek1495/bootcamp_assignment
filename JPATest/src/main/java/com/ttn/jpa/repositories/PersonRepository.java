package com.ttn.jpa.repositories;

import com.ttn.jpa.entity.Person;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

//Question 2

@Repository
public interface PersonRepository extends CrudRepository<Person,Integer> {

    //Question 4
   // Person findByFirstName(String name);
    Person findByLastName(String name);
    Person findById(Integer id);


    //Question 6
    /*@Query("SELECT firstName from Person where age=:age")
    String findByAge(@Param("age") Integer age);*/



    //Question 7
    /*
     @Query("SELECT firstName,lastName from Person where age=:age")
     List<Object[]> findByAge(@Param("age") Integer age);
*/



    //Question 8

    @Query("SELECT p from Person p where age=:age  ")
    List<Person> findByAge(@Param("age") Integer age);




    //Question 9

    @Query("SELECT count(*) from Person p where firstName=:firstName")
    Integer findByFirstName(@Param("firstName") String firstName);



    //Question 10

    int countById(Integer id);
    Person findDistinctByFirstName(String firstName);
    List<Person> findByFirstNameOrAge(String name, Integer age);
    List<Person> findByFirstNameAndAge(String name, Integer age);
    List<Person> findByAgeBetween(int min,int max);
    List<Person> findByAgeLessThan(int age);
    List<Person> findByAgeGreaterThanEqual(Integer age);
    List<Person> findByFirstNameLike(String name);
    List<Person> findByFirstNameNot(String name);
    List<Person> findByAgeIn(List<Integer> ageList);
    List<Person> findByFirstNameIgnoreCase(String name);


    //Question 11

    List<Person> findByAgeGreaterThanOrderByIdDesc(Integer age);


    //Question 12

    List<Person> findByAgeGreaterThan(Integer age,Sort sort);


    //Question 13

    Page<Person> findAll(Pageable pageable);


}
