package com.napier.gp7;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;
public class CodeTesting {
    static GP7 group7;
    @BeforeAll
    static void init()
    {
        group7 = new GP7();
    }
    //Function 9
    @Test
    void checkcitylist_region_Null(){
        System.out.println("Null Testing\n");
        group7.print_popucitylist_region(null);
        System.out.println("\n-----*****------*****--------");
    }
    @Test
    void checkcityarray_region_Null(){
        System.out.println("ArrayList Null Testing\n");
        ArrayList<City> Cities = new ArrayList<City>();
        Cities.add(null);
        group7.print_popucitylist_region(Cities);
        System.out.println("\n-----*****------*****--------");
    }
    @Test
    void displayRegionCitylist(){
        System.out.println("Manual Insert Data Testing\n");
        ArrayList<City> citylist = new ArrayList<City>();
        City cty = new City();
        cty.setName("Yangon");
        cty.setCountry("Myanmar");
        cty.setPopulation(600000000);
        cty.setContinent("Asia");
        cty.setDistrict("MM");
        citylist.add(cty);
        group7.print_popucitylist_region(citylist);
        System.out.println("\n-----*****------*****--------");
    }
    //End

    //Function 10
    @Test
    void checkcitylist_country_Null(){
        System.out.println("Null Testing\n");
        group7.print_popucitylist_Country(null);
        System.out.println("\n-----*****------*****--------");
    }
    @Test
    void checkcityarray_country_Null(){
        System.out.println("ArrayList Null Testing\n");
        ArrayList<City> Cities = new ArrayList<City>();
        Cities.add(null);
        group7.print_popucitylist_Country(Cities);
        System.out.println("\n-----*****------*****--------");
    }
}
