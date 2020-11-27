package com.napier.gp7;

public class City {
    //Create variable for Country_name
    private String name;
    //getter for name
    public String getName() {
        return name;
    }
    // Setter for name
    public void setName(String newcode) {
        this.name = newcode;
    }
    //end

    //Create variable for Country
    private String country;
    //getter for code
    public String getCountry() {
        return country;
    }
    // Setter for code
    public void setCountry(String newcode) {
        this.country = newcode;
    }
    //end

    //Create variable for District
    private String district;
    //getter for district
    public String getDistrict() {
        return district;
    }
    // Setter for district
    public void setDistrict(String newcode) {
        this.district = newcode;
    }
    //end

    //Create variable for population
    private int population;
    //getter for population;
    public int getPopulation() {
        return population;
    }
    // Setter for code
    public void setPopulation(int newcode) {
        this.population = newcode;
    }
    //end

    //Create variable for continent
    private String continent;
    //getter for population;
    public String getContinent() {
        return continent;
    }
    // Setter for code
    public void setContinent(String newcode) {
        this.continent = newcode;
    }
    //end

    //Create variable for continent
    private long poplong;
    //getter for populationlong;
    public long getPopulationLong(long population) {
        return poplong;
    }
    // Setter for Populationlong
    public void setPopulationLong(long newcode) {
        this.poplong = newcode;
    }
    //end

    //Create variable for city population
    private long ctyPopulation;
    // Getter for city population
    public long getCtyPopulation() {
        return ctyPopulation;
    }
    // Setter for city population
    public void setCtyPopulation(long newPop) {
        this.ctyPopulation = newPop;
    }
    //end
}
