package com.spring.example;

import java.util.Date;

import org.springframework.beans.factory.annotation.Value;

public class DisplayUseCase {
    @Value("#{19 + 1}") // 20
    private double add;

    @Value("#{ 'String1 ' + 'String2' }")   // String1 String2
    private String addString;

    @Value("#{1 == 1}") // true
    private boolean equal;

    @Value("#{ 1 lt 1 }") // false
    private boolean lessThan;

    @Value("#{2 > 1 ? 'a' : 'b'}") // "a"
    private String ternary;

    @Value("#{someBean.someProperty != null ? someBean.someProperty : 'default'}")
    private String ternaryInBean;

    @Value("#{someBean.someProperty ?: 'default'}") // will inject provided string if someProperty is null
    private String elvis;

    @Value("#{'100' matches '\\d+'}") // true
    private boolean regex;

    @Value("#{someBean.someList[0]}")
    private String firstElementOfList;

    @Value("#{someBean.someMap['mapKey']}")
    private Integer mapUse;

    @Value("#{ systemProperties['user.country'] }")
    private String defaultCountryFromSystemProperty;

    @Value("#{T(java.util.Date)}")
    private Date currentDate;

    @Value("#{T(Math).PI}")
    private Double staticMethod;

    // #this is always defined and refers to the current evaluation object.
    // #root is always defined and refers to the root context object.
}
