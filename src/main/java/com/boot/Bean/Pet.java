package com.boot.Bean;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;
import org.springframework.stereotype.Controller;

@Data
@ToString
@AllArgsConstructor
@NoArgsConstructor
public class Pet {
    private String name;
    private int age;

}
