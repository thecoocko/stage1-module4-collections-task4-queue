package com.epam.collections.queue;

import java.util.*;


public class DishOrderDeterminer {

    public List<Integer> determineDishOrder(int numberOfDishes, int everyDishNumberToEat) {
        List<Integer> eatenDishes = new ArrayList<>();
        int currentDish = 1;
        for (int i = 0; i < numberOfDishes; i++) {
            eatenDishes.add(currentDish);
            currentDish = (currentDish + everyDishNumberToEat - 1) % numberOfDishes + 1;
        }

        return eatenDishes;

    }
    }

