package com.example.lab8;


import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;


//import org.junit.Before;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;

public class CustomListTest {
    private CustomList list;

    public CustomList MockCityList() {
        list = new CustomList(null, new ArrayList<>());
        return list;
    }

    @Test
    public void addCityTest() {
        list = MockCityList();
        int listSize = list.getCount();
        list.addCity(new City("Edmonton", "AB"));
        assertEquals(listSize + 1, list.getCount());
    }

    @Test
    public void hasCityTest() {
        list = MockCityList();
        City edmonton = new City("Edmonton", "AB");
        assertFalse(list.hasCity(edmonton));
        list.addCity(edmonton);
        assertTrue(list.hasCity(edmonton));
    }

    @Test
    public void deleteCityTest() {
        list = MockCityList();
        City edmonton = new City("Edmonton", "AB");
        list.addCity(edmonton);
        int listSize = list.getCount();
        list.deleteCity(edmonton);
        assertEquals(listSize - 1, list.getCount());
    }

//    @Test
//    public void countCitiesTest() {
//        list = MockCityList();
//        assertEquals(0, list.countCities());
//        list.addCity(new City("Edmonton", "AB"));
//        assertEquals(1, list.countCities());
//    }
}
