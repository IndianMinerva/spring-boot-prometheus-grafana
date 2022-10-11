package com.im.springbootprometheusgrafana.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Getter
public class User {
    public Long id;
    public String firstName;
    public String lastName;
    public int age;
}
