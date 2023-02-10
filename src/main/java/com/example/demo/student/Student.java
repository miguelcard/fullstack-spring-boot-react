package com.example.demo.student;

import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
@EqualsAndHashCode
//@Data this would replace all the above, but this means that all fields are made final by default and we dont want that
// (when connected to JPA/DB these can not be final)
public class Student {

    private long id;

    private String name;

    private String email;

    private Gender gender;

}
