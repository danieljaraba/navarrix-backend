package edu.co.icesi.demo.controllers;

import java.util.ArrayList;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import edu.co.icesi.demo.models.MeasureModel;

import edu.co.icesi.demo.services.MeasureService;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;



@CrossOrigin(origins = "*", allowedHeaders = "*")
@RestController
@RequestMapping("/measures")
public class MeasureController {

    @Autowired
    MeasureService measureService;


    @GetMapping("/all")
    public ArrayList<MeasureModel> getMeasures() {
        return measureService.getMeasures();
    }


    @RequestMapping(value = "/add", method = RequestMethod.POST, consumes = "application/json")
    public MeasureModel saveMeasureModel(@RequestBody MeasureModel measureModel) {
        return measureService.saveMeasureModel(measureModel);
    }
    
    @GetMapping("/getmeasures")
    public ArrayList<MeasureModel> getMeasures(@RequestParam(value = "start", defaultValue = "0") long start, @RequestParam(value = "finish", defaultValue = "1000000") long finish){
        return measureService.timeMeasures(start, finish);
    }

}
