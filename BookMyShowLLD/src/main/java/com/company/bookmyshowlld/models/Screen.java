package com.company.bookmyshowlld.models;

import lombok.Getter;
import lombok.Setter;
import org.springframework.validation.beanvalidation.SpringConstraintValidatorFactory;

import java.util.List;

@Getter
@Setter
public class Screen extends BaseModel {
    private String name;

            private List<Features> features;
            private Theatre theatre;
            private List<Seat>seats;
}
