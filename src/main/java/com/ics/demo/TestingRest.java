package com.ics.demo;

import com.ics.demo.models.Appointment;
import com.ics.demo.models.Department;
import com.ics.demo.models.Movie;
import com.ics.demo.models.Student;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.web.client.RestTemplate;

import java.lang.reflect.Type;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

@Component
public class TestingRest implements CommandLineRunner {

    private final FeignRestClient feignRestClient;

    public TestingRest(FeignRestClient feignRestClient) {
        this.feignRestClient = feignRestClient;
    }


    @Override
    public void run(String... args) throws Exception {

        Student student =new Student(95049,"Charles Wafula Shitanda");
        feignRestClient.createStudent(student);
        feignRestClient.RequestAttachment((long)6,(long)24);
        feignRestClient.RequestDepartment((long)6,(long)24,(long)12);
        feignRestClient.RejectDepartment(new Department(24,8,6));

        //{"id":24,"studentNumber":"95049","firstName":"Charles Wafula Shitanda","score":3,"attachment":null}
        //{"id":31,"company":{"id":6,"name":"Villa Rosa Kempinski"},"department":null,"rejected":false}
        //{"id":31,"company":{"id":6,"name":"Villa Rosa Kempinski"},"department":{"id":8,"name":"Tractor Assembly","company":{"id":5,"name":"Car and General"}},"rejected":false}

        }
    }
