package com.hsenid.japan.controller;

import com.hsenid.japan.exception.DemoException;
import com.hsenid.japan.model.ApiResponse;
import com.hsenid.japan.model.DivisionResponse;
import com.hsenid.japan.model.ErrorResponse;
import com.hsenid.japan.service.ArithmeticService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/arithmetic")
public class ArithmeticController {

    private ArithmeticService arithmeticService;

    @Autowired
    public ArithmeticController(ArithmeticService arithmeticService) {
        this.arithmeticService = arithmeticService;
    }

    @PostMapping("/divide/{numerator}/{denominator}")
    public ResponseEntity<? extends ApiResponse> divide(@PathVariable int numerator,
                                                        @PathVariable int denominator) {
        try {
            float res = arithmeticService.divide(numerator, denominator);
            DivisionResponse response = new DivisionResponse();
            response.setResult(res);
            return new ResponseEntity<>(response, HttpStatus.OK);
        } catch (DemoException e) {
            ErrorResponse response = new ErrorResponse();
            response.setMessage(e.getMessage());
            return new ResponseEntity<>(response, HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }
}
