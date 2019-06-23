package com.hsenid.japan.service;

import com.hsenid.japan.exception.DemoException;
import org.springframework.stereotype.Service;

@Service
public class ArithmeticService {
    public float divide(int numerator, int denominator) throws DemoException {
        try {
            return numerator / denominator;
        } catch (ArithmeticException e) {
            throw new DemoException("Division by zero", e);
        }
    }
}
