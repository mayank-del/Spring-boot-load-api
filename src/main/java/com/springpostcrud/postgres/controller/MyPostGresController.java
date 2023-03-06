package com.springpostcrud.postgres.controller;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.springpostcrud.postgres.entities.LoadApi;
import com.springpostcrud.postgres.services.LoadServices;



@RestController
public class MyPostGresController {
   @Autowired
   private LoadServices loadServices;

   @GetMapping("/home")
   public String home(){
      return "Welcome to Loading Page.";
   }

   @GetMapping("/loads")
    public List<LoadApi> getLoads(){
        return this.loadServices.getLoads();
    }
    @GetMapping("/load/{loadId}")
    public LoadApi getLoad(@PathVariable String loadId){
        return this.loadServices.getLoad(Long.parseLong(loadId));
    }
    @GetMapping("/loadsid")
    public List<LoadApi> getLoadBySid(@RequestParam String shipperId){
       return this.loadServices.getLoadBySid(shipperId);
    }
    @PostMapping("/loads")
    public LoadApi addLoad(@RequestBody LoadApi load){
        return this.loadServices.addLoad(load);
    }
    /* @PutMapping("/courses/{courseId}")
    public LoadApi updateCourse(@PathVariable String courseId,@RequestBody LoadApi course){
        return this.loadServices.updateCourse(Long.parseLong(courseId),course);
    } */
    @PutMapping("/loads")
    public LoadApi updateLoad(@RequestBody LoadApi load){
        return this.loadServices.updateLoad(load);
    }
    @DeleteMapping("/loads/{loadId}")
    public LoadApi deleteLoad(@PathVariable String loadId){
        return this.loadServices.deleteLoad(Long.parseLong(loadId));
    }

}
