package iste.crime.web;

import iste.crime.service.actionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Map;

@CrossOrigin(origins = "http://localhost:4200")
@RestController
@RequestMapping("/api")
public class actionResource {
    @Autowired
    private actionService action;
    @PostMapping("/murder")
    public void postMurder(@RequestBody Map<String,Object> blogData){
        action.postMurder(blogData);
    }
    @PostMapping("/missing")
    public void postMissing(@RequestBody Map<String,Object> textData){
        action.postMissing(textData);
    }
    @PostMapping("/kidnapping")
    public void postKidnapping(@RequestBody Map<String,Object> rawData){
        action.postKidnapping(rawData);
    }
    @PostMapping("/theft")
    public void postTheft(@RequestBody Map<String,Object> theftData){
        action.postTheft(theftData);
    }
    @PostMapping("/user")
    public void postUser(@RequestBody Map<String,Object> userData){
        action.postUser(userData);
    }


}
