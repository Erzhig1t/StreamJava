package com.company;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

import static java.time.LocalDate.of;

public class Main {

    public static void main(String[] args) {
	// write your code here
     User[] users = {new User("Asan", 1996), new User("Sanjar", 1995),
                new User("Kayrat", 1994),
                new User("Kay", 2005),
                new User("Kaat", 2007)};

        ArrayList<User> arrayList = new ArrayList<>(Arrays.asList(users));

        int a = 2022;

        List<Integer> s = (List<Integer>) arrayList.stream().map(x-> a - x.getLocalDate()).collect(Collectors.toList());
        System.out.println(s);

        List<String>list=arrayList.stream().map(x->(2022-x.getLocalDate()>18 ?"Jashy jetken":"Jashy jetken jok")).collect(Collectors.toList());
        System.out.println(list);

       
    }
}
