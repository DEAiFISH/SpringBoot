package com.deaifish.boot.bean;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

@Component
@ConfigurationProperties("pet")
@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class Pet {
    private String name;
    private Integer age;
    private String kind;
}
