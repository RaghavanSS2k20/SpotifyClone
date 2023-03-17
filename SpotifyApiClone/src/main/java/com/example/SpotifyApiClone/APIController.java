package com.example.SpotifyApiClone;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api/v1")
public class APIController {
    @GetMapping
    public String index(){
        return "App has started";
    }


}
