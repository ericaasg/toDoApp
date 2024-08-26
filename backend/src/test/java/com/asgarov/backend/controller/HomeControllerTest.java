package com.asgarov.backend.controller;

import com.asgarov.backend.dto.ValueDto;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class HomeControllerTest {
    @Test
    void example(){
        int a = 2;
        int b = 3;
        int result = a +b;
        assertEquals(5, result );
    }

    @Test
    void testThatDefaultToDosHaveSizeOfThree(){
        //given I have a home controller
        HomeController homeController = new HomeController();

        //when I call my toDos
        List<String> something=homeController.getToDos();

        //then I receive correct default amount of toDos
        assertEquals(3,something.size());


    }

    @Test
    void actualSizeFour(){
        //GIVEN that I have a home controller
        HomeController homeController = new HomeController();

        //AND I have a ValueDto
        ValueDto hello = new ValueDto();
        hello.setValue("hello");

        //WHEN a new value is added to the list
        homeController.addToDo(hello);

        //THEN it will check the right amount for 4
        List<String> something= homeController.getToDos();
        assertEquals(4, something.size());
    }



    @Test
    void checkIfDeletetEqualsTwo() {
        //GIVEN home controller
        HomeController homeController = new HomeController();

        //WHEN i call delete
        homeController.deleteToDo();

        //THEN it checks that is has deletet one toDo
        List<String> something= homeController.getToDos();
        assertEquals(2, something.size());
    }

}
