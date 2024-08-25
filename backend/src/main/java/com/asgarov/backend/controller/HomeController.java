package com.asgarov.backend.controller;

import com.asgarov.backend.dto.ValueDto;
import com.fasterxml.jackson.annotation.JsonAutoDetect;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@CrossOrigin
public class HomeController {
    private List<String> toDos = new ArrayList<>();

    public HomeController() {
        toDos.add("Iron");
        toDos.add("cook");
        toDos.add("doJava");
    }

    @GetMapping("hello-world")
    public String helloWorld() {
        return "Hello World Erica";
    }

    @GetMapping("todos")
    public List<String> getToDos() {
        return toDos;
    }

    @PostMapping("todos")
    public void addToDo(@RequestBody ValueDto dto){
        toDos.add(dto.getValue());
    }

    @DeleteMapping("todos")
    public void deleteToDo(){
        toDos.remove(toDos.size()-1);
    }

}
