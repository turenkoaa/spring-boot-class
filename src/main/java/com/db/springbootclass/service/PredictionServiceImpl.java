package com.db.springbootclass.service;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

@Service
public class PredictionServiceImpl implements PredictionService {
    @Override
    public boolean willSurviveThisWinter(String name) {
        return name.toLowerCase().contains("stark");
    }
}
