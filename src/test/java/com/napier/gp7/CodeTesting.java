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

    //Function 11
    @Test
    void checkcitylist_district_Null(){
        System.out.println("Null Testing\n");
        group7.print_popucitylist_district(null);
        System.out.println("\n-----*****------*****--------");
    }
    @Test
    void checkcityarray_district_Null(){
        System.out.println("ArrayList Null Testing\n");
        ArrayList<City> Cities = new ArrayList<City>();
        Cities.add(null);
        group7.print_popucitylist_district(Cities);
        System.out.println("\n-----*****------*****--------");
    }

    //Function 12
    @Test
    void checkcitylist_world_Null(){
        System.out.println("Null Testing\n");
        group7.print_popucitylist_world(null);
        System.out.println("\n-----*****------*****--------");
    }
    @Test
    void checkcityarray_world_Null(){
        System.out.println("ArrayList Null Testing\n");
        ArrayList<City> Cities = new ArrayList<City>();
        Cities.add(null);
        group7.print_popucitylist_world(Cities);
        System.out.println("\n-----*****------*****--------");
    }

    //Function 13
    @Test
    void checkpopcitylist_continent_Null(){
        System.out.println("Null Testing\n");
        group7.print_populationcity_continent(null);
        System.out.println("\n-----*****------*****--------");
    }
    @Test
    void checkpopcityarray_continent_Null(){
        System.out.println("ArrayList Null Testing\n");
        ArrayList<City> Cities = new ArrayList<City>();
        Cities.add(null);
        group7.print_populationcity_continent(Cities);
        System.out.println("\n-----*****------*****--------");
    }
    //Function 14
    @Test
    void checkpopcitylist_region_Null(){
        System.out.println("Null Testing\n");
        group7.print_populationcity_region(null);
        System.out.println("\n-----*****------*****--------");
    }
    @Test
    void checkpopcityarray_region_Null(){
        System.out.println("ArrayList Null Testing\n");
        ArrayList<City> Cities = new ArrayList<City>();
        Cities.add(null);
        group7.print_populationcity_region(Cities);
        System.out.println("\n-----*****------*****--------");
    }
    //Function 15
    @Test
    void checkpopcitylist_country_Null(){
        System.out.println("Null Testing\n");
        group7.print_populationcity_country(null);
        System.out.println("\n-----*****------*****--------");
    }
    @Test
    void checkpopcityarray_country_Null(){
        System.out.println("ArrayList Null Testing\n");
        ArrayList<City> Cities = new ArrayList<City>();
        Cities.add(null);
        group7.print_populationcity_country(Cities);
        System.out.println("\n-----*****------*****--------");
    }

    //Function 17
    @Test
    void checkpopCapitalCityWorld_Null(){
        System.out.println("Null Testing\n");
        group7.printCapitalcityWorld(null);
        System.out.println("\n-----*****------*****--------");
    }
    @Test
    void checkpopCapitalCityWoldArray_Null(){
        System.out.println("ArrayList Null Testing\n");
        ArrayList<City> Cities = new ArrayList<City>();
        Cities.add(null);
        group7.printCapitalcityWorld(Cities);
        System.out.println("\n-----*****------*****--------");
    }

    //Function 18
    @Test
    void checkpopCapitalCityContinent_Null(){
        System.out.println("Null Testing\n");
        group7.printCapcityContinent(null);
        System.out.println("\n-----*****------*****--------");
    }
    @Test
    void checkpopCapitalCityContinentArray_Null(){
        System.out.println("ArrayList Null Testing\n");
        ArrayList<City> Cities = new ArrayList<City>();
        Cities.add(null);
        group7.printCapcityContinent(Cities);
        System.out.println("\n-----*****------*****--------");
    }

    //Function 19
    @Test
    void checkpopCapitalCityRegion_Null(){
        System.out.println("Null Testing\n");
        group7.printCapcityRegion(null);
        System.out.println("\n-----*****------*****--------");
    }
    @Test
    void checkpopCapitalCityRegionArray_Null(){
        System.out.println("ArrayList Null Testing\n");
        ArrayList<City> Cities = new ArrayList<City>();
        Cities.add(null);
        group7.printCapcityRegion(Cities);
        System.out.println("\n-----*****------*****--------");
    }

    //Function 20
    @Test
    void checkCapitalCityWorld_Null(){
        System.out.println("Null Testing\n");
        group7.print_popcapcity_world(null);
        System.out.println("\n-----*****------*****--------");
    }
    @Test
    void checkCaptialCityWorldArray_Null(){
        System.out.println("ArrayList Null Testing\n");
        ArrayList<City> Cities = new ArrayList<City>();
        Cities.add(null);
        group7.print_popcapcity_world(Cities);
        System.out.println("\n-----*****------*****--------");
    }

    //Function 21
    @Test
    void checkCapitalCityContinent_Null(){
        System.out.println("Null Testing\n");
        group7.printpopCapcityContinent(null);
        System.out.println("\n-----*****------*****--------");
    }
    @Test
    void checkCaptialCityContinentArray_Null(){
        System.out.println("ArrayList Null Testing\n");
        ArrayList<City> Cities = new ArrayList<City>();
        Cities.add(null);
        group7.printpopCapcityContinent(Cities);
        System.out.println("\n-----*****------*****--------");
    }

    //Function 22
    @Test
    void checkCapitalCityRegion_Null(){
        System.out.println("Null Testing\n");
        group7.print_popcapcity_Region(null);
        System.out.println("\n-----*****------*****--------");
    }
    @Test
    void checkCaptialCityRegionArray_Null(){
        System.out.println("ArrayList Null Testing\n");
        ArrayList<City> Cities = new ArrayList<City>();
        Cities.add(null);
        group7.print_popcapcity_Region(Cities);
        System.out.println("\n-----*****------*****--------");
    }


    //Function 24
    @Test
    void checkPopWorld_Null(){
        System.out.println("Null Testing\n");
        group7.printallPopulationWorld(null);
        System.out.println("\n-----*****------*****--------");
    }
    @Test
    void checkPopWorldArray_Null(){
        System.out.println("ArrayList Null Testing\n");
        ArrayList<Long> cty = new ArrayList<Long>();
        cty.add(null);
        group7.printallPopulationWorld(cty);
        System.out.println("\n-----*****------*****--------");
    }

    //Function 25
    @Test
    void checkPopContinent_Null(){
        System.out.println("Null Testing\n");
        group7.printallPopulationContinent(null);
        System.out.println("\n-----*****------*****--------");
    }
    @Test
    void checkPopContinentArray_Null(){
        System.out.println("ArrayList Null Testing\n");
        ArrayList<Country> Cities = new ArrayList<Country>();
        Cities.add(null);
        group7.printallPopulationContinent(Cities);
        System.out.println("\n-----*****------*****--------");
    }

    //Function 26
    @Test
    void checkPopRegion_Null(){
        System.out.println("Null Testing\n");
        group7.printallPopulationRegion(null);
        System.out.println("\n-----*****------*****--------");
    }
    @Test
    void checkPopRegionArray_Null(){
        System.out.println("ArrayList Null Testing\n");
        ArrayList<Country> Cities = new ArrayList<Country>();
        Cities.add(null);
        group7.printallPopulationRegion(Cities);
        System.out.println("\n-----*****------*****--------");
    }

    //Function 27
    @Test
    void checkPopCountry_Null(){
        System.out.println("Null Testing\n");
        group7.printallPopulationCountry(null);
        System.out.println("\n-----*****------*****--------");
    }
    @Test
    void checkPopCountryArray_Null(){
        System.out.println("ArrayList Null Testing\n");
        ArrayList<City> Cities = new ArrayList<City>();
        Cities.add(null);
        group7.printallPopulationCountry(Cities);
        System.out.println("\n-----*****------*****--------");
    }

    //Function 28
    @Test
    void checkPopDistrict_Null(){
        System.out.println("Null Testing\n");
        group7.printallPopulationDistrict(null);
        System.out.println("\n-----*****------*****--------");
    }
    @Test
    void checkPopDistrictArray_Null(){
        System.out.println("ArrayList Null Testing\n");
        ArrayList<City> Cities = new ArrayList<City>();
        Cities.add(null);
        group7.printallPopulationDistrict(Cities);
        System.out.println("\n-----*****------*****--------");
    }

    //Function 29
    @Test
    void checkPopCity_Null(){
        System.out.println("Null Testing\n");
        group7.printallPopulationCity(null);
        System.out.println("\n-----*****------*****--------");
    }
    @Test
    void checkPopCityArray_Null(){
        System.out.println("ArrayList Null Testing\n");
        ArrayList<City> Cities = new ArrayList<City>();
        Cities.add(null);
        group7.printallPopulationCity(Cities);
        System.out.println("\n-----*****------*****--------");
    }
    //Function 30
    @Test
    void check_printallivingNonLivngRegionNull(){
        System.out.println("Null Testing\n");
        group7.printallivingNonLivngRegion(null);
        System.out.println("\n-----*****------*****--------");
    }
    @Test
    void checkprintallivingNonLivngRegion_Null(){
        System.out.println("ArrayList Null Testing\n");
        ArrayList<Country> Cities = new ArrayList<Country>();
        Cities.add(null);
        group7.printallivingNonLivngRegion(Cities);
        System.out.println("\n-----*****------*****--------");
    }

    //Function 31
    @Test
    void check_printLanguageWorldNull(){
        System.out.println("Null Testing\n");
        group7.printLanguageWorld(null,null);
        System.out.println("\n-----*****------*****--------");
    }
    @Test
    void checkprintLanguageWorld_Null(){
        System.out.println("ArrayList Null Testing\n");
        ArrayList<Language> Cities = new ArrayList<Language>();
        ArrayList<Long> Cities1 = new ArrayList<Long>();
        Cities.add(null);
        group7.printLanguageWorld(Cities, Cities1);
        System.out.println("\n-----*****------*****--------");
    }
}
