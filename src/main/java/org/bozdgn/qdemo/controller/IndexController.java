package org.bozdgn.qdemo.controller;

import org.bozdgn.qdemo.OtherThing;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class IndexController {
    @Autowired
    private OtherThing sender;

    private int number = 0;

    @GetMapping("/")
    public ResponseEntity<String> pub() {
        sender.send("Item #" + ++number);
        return new ResponseEntity<>("Item added to the queue.", HttpStatus.OK);
    }
}
