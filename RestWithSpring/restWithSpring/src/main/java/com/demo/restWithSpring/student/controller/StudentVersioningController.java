package com.demo.restWithSpring.student.controller;

import com.demo.restWithSpring.student.versioning.StudentV1;
import com.demo.restWithSpring.student.versioning.StudentV2;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;
@RequestMapping("/students")
@RestController
public class StudentVersioningController {
    //using uri
    @GetMapping("/v1")
    public List<StudentV1> getStudents()
    {
        return Arrays.asList(new StudentV1("Prateek Nagar"),new StudentV1("Gagan Kushwaha"));
    }
    @GetMapping("/v2")
    public List<StudentV2> getVersion2Students()
    {
        return Arrays.asList(new StudentV2("Prateek","Nagar"),new StudentV2("Lohit","Ahooja"));
    }

    //Parameter Versioning
    @GetMapping(value = "/param",params = "version=1")
    public List<StudentV1> getStudentsV1ByParam() {
        return Arrays.asList(new StudentV1("Prateek Nagar"),new StudentV1("Gagan Kushwaha"));
    }

    @GetMapping(value = "/param",params = "version=2")
    public List<StudentV2> getStudentsV2ByParam() {
       return Arrays.asList(new StudentV2("Prateek","Nagar"),new StudentV2("Lohit","Ahooja"));
    }

    //Header Versioning
    @GetMapping(value = "/header",headers = "API-VERSION=1")
    public List<StudentV1> getPersonHeader1() {
        return Arrays.asList(new StudentV1("Prateek Nagar"),new StudentV1("Gagan Kushwaha"));
    }

    @GetMapping(value = "/header",headers = "API-VERSION=2")
    public List<StudentV2>getPersonHeader2() {
        return Arrays.asList(new StudentV2("Prateek","Nagar"),new StudentV2("Lohit","Ahooja"));
    }
}
