package org.example;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/math")
public class Adding {

    @Autowired
    Calculation calculation;

    @PostMapping("/add")
    public ResponseEntity<Long> addNumbers(@RequestBody Numbers twoNumbers) {
        long result = calculation.add(twoNumbers.getNum1(), twoNumbers.getNum2());
        return ResponseEntity.ok(result);
    }



}