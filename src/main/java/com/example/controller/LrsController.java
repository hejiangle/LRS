package com.example.controller;

import com.example.service.LrsService;
import com.example.model.Room;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
public class LrsController {

    @Autowired
    private LrsService lrsService;

    @RequestMapping("/create")
    public String create(@RequestBody Room room){
        return lrsService.create(room);
    }

    @RequestMapping("/join")
    public ResponseEntity<?> join(@RequestParam String number){
        String role = lrsService.join(number);
        if(role == null)return ResponseEntity.noContent().build();
        return ResponseEntity.ok(role);
    }

    @RequestMapping("/room/{number}")
    public ResponseEntity<?> room(@PathVariable String number){
        Room room = lrsService.room(number);
        if(room == null){
            return ResponseEntity.noContent().build();
        }
        return ResponseEntity.ok(room);
    }
}
