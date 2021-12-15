package com.company.netflixcapstone.controllers;


import com.company.netflixcapstone.model.TShirt;
import com.company.netflixcapstone.serviceLayer.GameStoreServiceLayer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class TShirtController {

    @Autowired
    private GameStoreServiceLayer serviceLayer;

    @RequestMapping(value= "/tshirts", method= RequestMethod.POST)
    @ResponseStatus(value= HttpStatus.CREATED)
    public TShirt createTShirt(@RequestBody TShirt tShirt) {
        return serviceLayer.addTShirt(tShirt);
    }

    @RequestMapping(value= "/tshirts/{id}", method= RequestMethod.GET)
    @ResponseStatus(value= HttpStatus.OK)
    public TShirt getTShirt(@PathVariable int id) {
        return serviceLayer.getTShirt(id);
    }

    @RequestMapping(value= "/tshirts", method= RequestMethod.GET)
    @ResponseStatus(value= HttpStatus.OK)
    public List<TShirt> getAllTShirts() {
        return serviceLayer.getAllTShirts();
    }

    @RequestMapping(value= "/tshirts", method= RequestMethod.PUT)
    @ResponseStatus(value= HttpStatus.NO_CONTENT)
    public void updateTShirt(@RequestBody TShirt tShirt) {
        serviceLayer.updateTShirt(tShirt);
    }

    @RequestMapping(value= "/tshirts/{id}", method= RequestMethod.DELETE)
    @ResponseStatus(value= HttpStatus.NO_CONTENT)
    public void deleteTShirt(@PathVariable int id) {
        serviceLayer.deleteTShirt(id);
    }

    @RequestMapping(value= "/tshirts/color/{color}", method= RequestMethod.GET)
    @ResponseStatus(value= HttpStatus.OK)
    public List<TShirt> getTShirtsByColor(@PathVariable String color) {
        return null;
    }

    @RequestMapping(value= "/tshirts/size/{size}", method= RequestMethod.GET)
    @ResponseStatus(value= HttpStatus.OK)
    public List<TShirt> getTShirtsBySize(@PathVariable String size) {
        return null;
    }

}
