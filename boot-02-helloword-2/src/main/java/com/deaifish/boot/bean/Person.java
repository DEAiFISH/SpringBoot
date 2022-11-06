package com.deaifish.boot.bean;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
@ConfigurationProperties("person")
@Data
@ToString
@NoArgsConstructor
@AllArgsConstructor
public class Person {
    private String name;
    private Integer age;
    private String gender;
    private Pet pet[];
    private List<String> hobbies;
}
