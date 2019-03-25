package com.ttn.jpa;

import com.ttn.jpa.entity.Person;
import com.ttn.jpa.repositories.PersonRepository;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort;

import java.util.Arrays;
import java.util.List;

public class JPATest {
    public static void main(String[] args) {
       ApplicationContext applicationContext=new AnnotationConfigApplicationContext(PersistenceContext.class);

       //Question 3

       Person person=new Person();
       person.setFirstName("Prateek");
       person.setLastName("Nagar");
       person.setAge(25);
       person.setSalary(20000);
       PersonRepository personRepository=applicationContext.getBean(PersonRepository.class);
       personRepository.save(person);
        System.out.println("---Question 1 ----");
       System.out.println(personRepository.findByFirstName("Prateek"));
       Person person1=personRepository.findById(1);
       person1.setFirstName("Lohit");
       personRepository.save(person1);
/*
       personRepository.delete(1);
*/
       System.out.println(person1);



       Person person2=new Person();
       person2.setFirstName("Peter");
       person2.setLastName("Gupta");
       person2.setSalary(23000);
       person2.setAge(25);
       personRepository.save(person2);


        Person person4=new Person();
        person4.setFirstName("gagan");
        person4.setLastName("kushwaha");
        person4.setSalary(23000);
        person4.setAge(27);
        personRepository.save(person4);

        Person person5=new Person();
        person5.setFirstName("Vagish");
        person5.setLastName("Dixit");
        person5.setSalary(23000);
        person5.setAge(28);
        personRepository.save(person5);




        //Question 5

        System.out.println("---Question 5 ----");
        System.out.println(personRepository.findByFirstName("Lohit"));
        System.out.println(personRepository.findByLastName("Nagar"));
        System.out.println(personRepository.findById(1));


        //Question 6

         //System.out.println("---Question 6 ----");

        //System.out.println(personRepository.findByAge(23));


        //Question 7

            //        System.out.println("---Question 7 ----");
           //personRepository.findByAge(23).forEach(e-> System.out.println(Arrays.toString(e)));


        //Question 8

        System.out.println("---Question 8 ----");
        System.out.println(personRepository.findByAge(25));



        //Question 9

        System.out.println("---Question 9 ----");
        System.out.println("No of Persons"+personRepository.findByFirstName("Peter"));




        //Question 10
        System.out.println("---Question 10 ----");

        List<Integer> ages=Arrays.asList(23,24,25);

        Integer count=personRepository.countById(1);
        System.out.println(count);

        System.out.println(personRepository.findDistinctByFirstName("Peter"));

        System.out.println(personRepository.findByFirstNameOrAge("Peter",25));

        System.out.println(personRepository.findByFirstNameAndAge("Peter",25));

        System.out.println(personRepository.findByAgeBetween(20,27));

        System.out.println(personRepository.findByAgeLessThan(27));

        System.out.println(personRepository.findByAgeGreaterThanEqual(25));

        System.out.println(personRepository.findByAgeIn(ages));

        System.out.println(personRepository.findByFirstNameLike("Lohit"));

        System.out.println(personRepository.findByFirstNameNot("Peter"));

        System.out.println(personRepository.findByFirstNameIgnoreCase("peter"));



        //Question 11

        System.out.println("---Question 11 ----");
        System.out.println(personRepository.findByAgeGreaterThanOrderByIdDesc(25));


        //Question 12

        System.out.println("---Question 12 ----");
        Sort sort = new Sort(new Sort.Order(Sort.Direction.DESC, "id"));
        List<Person> persons = personRepository.findByAgeGreaterThan(25, sort);
        for(Person p : persons){
            System.out.println(p);
        }


        //Question 13

        System.out.println("---Question 13 ----");
        Page<Person> personPage= personRepository.findAll(new PageRequest(0,3,new Sort(Sort.Direction.DESC,"id")));
        List<Person> personList=personPage.getContent();
        System.out.println(personList);

    }
}
