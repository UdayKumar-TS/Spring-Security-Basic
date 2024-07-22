package com.insp.Security.Model;

import lombok.Getter;
import lombok.Setter;
import org.springframework.data.mongodb.core.mapping.Document;

@Setter
@Getter
@Document("springSecurity")
public class Student {
    private int id;
    private String name;
    private int age;
    private String address;

}
