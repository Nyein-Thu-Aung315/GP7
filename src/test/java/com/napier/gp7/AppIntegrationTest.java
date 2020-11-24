//package com.napier.gp7;
//
//import org.junit.jupiter.api.BeforeAll;
//import org.junit.jupiter.api.Test;
//import org.junit.jupiter.api.TestInstance;
//
//import java.util.ArrayList;
//
//import static org.junit.jupiter.api.Assertions.*;
//
//public class AppIntegrationTest
//{
//    static GP7 group7;
//
//    @BeforeAll
//    static void init()
//    {
//        group7 = new GP7();
//        group7.connect("localhost:33060");
//    }
//
//    //Function 9
//    @Test
//    void checkcitylist_region_Null(){
//        System.out.println("Null Testing\n");
//        group7.print_popucitylist_region(null);
//        System.out.println("\n-----*****------*****--------");
//    }
//    @Test
//    void checkcityarray_region_Null(){
//        System.out.println("ArrayList Null Testing\n");
//        ArrayList<City> Cities = new ArrayList<City>();
//        Cities.add(null);
//        group7.print_popucitylist_region(Cities);
//        System.out.println("\n-----*****------*****--------");
//    }
//    @Test
//    void displayRegionCitylist(){
//        System.out.println("Manual Insert Data Testing\n");
//        ArrayList<City> citylist = new ArrayList<City>();
//        City cty = new City();
//        cty.setName("Yangon");
//        cty.setCountry("Myanmar");
//        cty.setPopulation(600000000);
//        cty.setContinent("Asia");
//        cty.setDistrict("MM");
//        citylist.add(cty);
//        group7.print_popucitylist_region(citylist);
//        System.out.println("\n-----*****------*****--------");
//    }
//    //End
//
//    //Function 10
//    @Test
//    void checkcitylist_country_Null(){
//        System.out.println("Null Testing\n");
//        group7.print_popucitylist_Country(null);
//        System.out.println("\n-----*****------*****--------");
//    }
//    @Test
//    void checkcityarray_country_Null(){
//        System.out.println("ArrayList Null Testing\n");
//        ArrayList<City> Cities = new ArrayList<City>();
//        Cities.add(null);
//        group7.print_popucitylist_Country(Cities);
//        System.out.println("\n-----*****------*****--------");
//    }
//
//    //Function 11
//    @Test
//    void checkcitylist_district_Null(){
//        System.out.println("Null Testing\n");
//        group7.print_popucitylist_district(null);
//        System.out.println("\n-----*****------*****--------");
//    }
//    @Test
//    void checkcityarray_district_Null(){
//        System.out.println("ArrayList Null Testing\n");
//        ArrayList<City> Cities = new ArrayList<City>();
//        Cities.add(null);
//        group7.print_popucitylist_district(Cities);
//        System.out.println("\n-----*****------*****--------");
//    }
//
//    //Function 12
//    @Test
//    void checkcitylist_world_Null(){
//        System.out.println("Null Testing\n");
//        group7.print_popucitylist_world(null);
//        System.out.println("\n-----*****------*****--------");
//    }
//    @Test
//    void checkcityarray_world_Null(){
//        System.out.println("ArrayList Null Testing\n");
//        ArrayList<City> Cities = new ArrayList<City>();
//        Cities.add(null);
//        group7.print_popucitylist_world(Cities);
//        System.out.println("\n-----*****------*****--------");
//    }
//
//    //Function 13
//    @Test
//    void checkpopcitylist_continent_Null(){
//        System.out.println("Null Testing\n");
//        group7.print_populationcity_continent(null);
//        System.out.println("\n-----*****------*****--------");
//    }
//    @Test
//    void checkpopcityarray_continent_Null(){
//        System.out.println("ArrayList Null Testing\n");
//        ArrayList<City> Cities = new ArrayList<City>();
//        Cities.add(null);
//        group7.print_populationcity_continent(Cities);
//        System.out.println("\n-----*****------*****--------");
//    }
//    //Function 14
//    @Test
//    void checkpopcitylist_region_Null(){
//        System.out.println("Null Testing\n");
//        group7.print_populationcity_region(null);
//        System.out.println("\n-----*****------*****--------");
//    }
//    @Test
//    void checkpopcityarray_region_Null(){
//        System.out.println("ArrayList Null Testing\n");
//        ArrayList<City> Cities = new ArrayList<City>();
//        Cities.add(null);
//        group7.print_populationcity_region(Cities);
//        System.out.println("\n-----*****------*****--------");
//    }
//    //Function 15
//    @Test
//    void checkpopcitylist_country_Null(){
//        System.out.println("Null Testing\n");
//        group7.print_populationcity_country(null);
//        System.out.println("\n-----*****------*****--------");
//    }
//    @Test
//    void checkpopcityarray_country_Null(){
//        System.out.println("ArrayList Null Testing\n");
//        ArrayList<City> Cities = new ArrayList<City>();
//        Cities.add(null);
//        group7.print_populationcity_country(Cities);
//        System.out.println("\n-----*****------*****--------");
//    }
//    //Function 16
//    @Test
//    void checkpopcitylist_district_Null(){
//        System.out.println("Null Testing\n");
//        group7.print_populationcity_District(null);
//        System.out.println("\n-----*****------*****--------");
//    }
//    @Test
//    void checkpopcityarray_district_Null(){
//        System.out.println("ArrayList Null Testing\n");
//        ArrayList<City> Cities = new ArrayList<City>();
//        Cities.add(null);
//        group7.print_populationcity_District(Cities);
//        System.out.println("\n-----*****------*****--------");
//    }
//}
