package com.laba_04.Chef;

import com.laba_04.Vegetables.Vegetable;

public class CaloriesComparator implements java.util.Comparator<Vegetable>{
    public int compare(Vegetable v1, Vegetable v2) {
        return (int) (v1.getCalories() - v2.getCalories());
    }
}