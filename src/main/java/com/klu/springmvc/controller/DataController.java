
package com.klu.springmvc.controller;

import org.springframework.web.bind.annotation.*;
import org.springframework.beans.factory.annotation.Autowired;
import com.klu.springmvc.entity.Data;
import com.klu.springmvc.repository.DataRepository;
import java.util.List;

@RestController
@RequestMapping("/api")
public class DataController {

    @Autowired
    private DataRepository repository;

    @GetMapping("/data")
    public List<Data> getData() {
        return repository.findAll();
    }

    @PostMapping("/data")
    public Data saveData(@RequestBody Data data) {
        return repository.save(data);
    }
}
