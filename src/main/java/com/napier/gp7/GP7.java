package com.napier.gp7;
//import sql Package
import java.math.BigDecimal;
import java.math.BigInteger;
import java.sql.*;
import java.util.ArrayList;
import java.util.Arrays;

public class GP7<Decimal>
{
    public static void main(String[] args)
    {
        // Create new Application
        GP7 a = new GP7();

        // Connect to database
        if (args.length < 1)
        {
            a.connect("localhost:3306");
        }
        else
        {
            a.connect(args[0]);
        }

        //Print The list of Country Order by DESC
        System.out.println("Country list in World order by largest population to smallest");
        System.out.println("***************************************************************");
        ArrayList<Country> country = a.CountryDESC();
        a.printCountryDEST(country);

        //Print the list of country order by DESC that exist in a Asia
        System.out.println("\n");
        System.out.println("Country list in Asia order by largest population to smallest");
        System.out.println("***************************************************************");
        ArrayList<Country> continent = a.continent_countryDESC();
        a.prin_countrylist_continent(continent);

        //Print the list of country order by DESC that exist in a SouthEast Asia Region
        System.out.println("\n");
        System.out.println("Country list in SouthEast Asia order by largest population to smallest");
        System.out.println("***********************************************************************");
        ArrayList<Country> clist_region = a.Regoin_CountryDESC();
        a.prin_countrylist_region(clist_region);

        //Print Top 10 populated countries in the world
        System.out.println("\n");
        System.out.println("Top 10 Populated countries in the world");
        System.out.println("******************************************");
        ArrayList<Country> popcnty_world = a.mostpopcnty_world();
        a.prin_countrylist_region(popcnty_world);

        //Print Top 10 populated countries in Europe
        System.out.println("\n");
        System.out.println("Top 10 Populated countries in Europe");
        System.out.println("**************************************");
        ArrayList<Country> popcnty_continent = a.mostpopcnty_continent();
        a.prin_countrylist_continent(popcnty_continent);

        //Print the list of cities order by DESC that exist in a SouthEast Asia Region
        System.out.println("\n");
        System.out.println("Top 10 Populated countries in North America Region");
        System.out.println("****************************************************");
        ArrayList<Country> popcity = a.popcity_world();
        a.print_popcity_world(popcity);

        //Print Top 10 populated countries in Europe
        System.out.println("\n");
        System.out.println("City list in the world order by largest population to smallest");
        System.out.println("***************************************************************");
        ArrayList<City> popcnty_region = a.mostpopcnty_region();
        a.prin_popcnty_region(popcnty_region);

        //Print Top 10 populated countries in Europe
        System.out.println("\n");
        System.out.println("City list in Asia order by largest population to smallest");
        System.out.println("***************************************************************");
        ArrayList<City> popcity_continent = a.popcity_continent();
        a.print_popcity_continent(popcity_continent);

        //Print populated countries in China
        System.out.println("\n");
        System.out.println("City list in China order by largest population to smallest");
        System.out.println("***************************************************************");
        ArrayList<City> popcity_country = a.pcity_Country();
        a.print_popucitylist_region(popcity_country);

        //Print populated countries in Eastern Asia
        System.out.println("\n");
        System.out.println("City list in Eastern Asia order by largest population to smallest");
        System.out.println("***************************************************************");
        ArrayList<City> popcity_region = a.pcity_region();
        a.print_popucitylist_Country(popcity_region);

        //Print populated countries in a District
        System.out.println("\n");
        System.out.println("City list in a district order by largest population to smallest");
        System.out.println("***************************************************************");
        ArrayList<City> popcity_district = a.pcity_district();
        a.print_popucitylist_district(popcity_district);

        //Print populated countries in a World
        System.out.println("\n");
        System.out.println("Top 10 populated cities in the world");
        System.out.println("***************************************");
        ArrayList<City> popcity_world = a.pcitylist_world();
        a.print_popucitylist_world(popcity_world);


        //Print Top 10 populated cities in the continent
        System.out.println("\n");
        System.out.println("Top 10 Populated cities in the continent");
        System.out.println("******************************************");
        ArrayList<City> popcity_continent1= a.mostpopcity_world();
        a.print_populationcity_continent(popcity_continent1);

        //Print Top 10 populated cities in a region
        System.out.println("\n");
        System.out.println("Top 10 Populated cities in the region");
        System.out.println("********************************************");
        ArrayList<City> pcity_world = a.pcity_world();
        a.print_populationcity_region(pcity_world);

        //Print Top 10 populated cities in a country
        System.out.println("\n");
        System.out.println("Top 10 Populated cities in Burmese country");
        System.out.println("**************************************************");
        ArrayList<City> popcitylistcountry = a.pop_city_country();
        a.print_populationcity_country(popcitylistcountry);

        //Print Top 10 populated cities in a district
        System.out.println("\n");
        System.out.println("Top 10 Populated cities in Liaoning District");
        System.out.println("**************************************************");
        ArrayList<City> popcitylistdistrict = a.pop_city_district();
        a.print_populationcity_District(popcitylistdistrict);

        //Print Population of CapitalCity in the world
        System.out.println("\n");
        System.out.println("Population of Capital Cities in the world");
        System.out.println("**************************************************");
        ArrayList<City> capitalCtyWorld = a.capitalCityWorld();
        a.printCapitalcityWorld(capitalCtyWorld);

        //Print Population of CapitalCity in the Region
        System.out.println("\n");
        System.out.println("Population of Capital Cities in the Region");
        System.out.println("**************************************************");
        ArrayList<City> capCtyRegion = a.capCityRegion();
        a.printCapcityRegion(capCtyRegion);

       //Print Population of CapitalCity in the Continent
       System.out.println("\n");
       System.out.println("Population of Capital Cities in the Continent");
        System.out.println("**************************************************");
       ArrayList<City> capCtyContinent = a.capCityContinent();
       a.printCapcityContinent(capCtyContinent);

        //Print populated capital cities in a World
        System.out.println("\n");
        System.out.println("Top 10 populated Capitical Cities in the world");
        System.out.println("**************************************************");
        ArrayList<City> popcapcity_world = a.popcapcity_world();
        a.print_popcapcity_world(popcapcity_world);

        //Print populate capital cities in the continent
        System.out.println("\n");
        System.out.println("Top 10 populated Capitical Cities in the Continent");
        System.out.println("**************************************************");
        ArrayList<City> popcapCtyContinent = a.popcapCityContinent();
        a.printpopCapcityContinent(popcapCtyContinent);

        //Print populated capital cities in a Region
        System.out.println("\n");
        System.out.println("Top 10 populated Capitical Cities in the Region");
        System.out.println("***********************************************");
        ArrayList<City> popcapcity_Region = a.popcapcity_Region();
        a.print_popcapcity_Region(popcapcity_Region);

        a.peopleListContinent();

        //All Population in the world
        System.out.println("\n");
        System.out.println("All Population in the world");
        System.out.println("*********************************");
        ArrayList<Long> allPopWorld = a.allPopulationWorld();
        a.printallPopulationWorld(allPopWorld);

        //All Population in the world
        System.out.println("\n");
        System.out.println("All Population in the Continent");
        System.out.println("*********************************");
        ArrayList<Country> allContinent = a.allPopulationContinent();
        a.printallPopulationContinent(allContinent);

        //All Population in the Region
        System.out.println("\n");
        System.out.println("All Population in the Region");
        System.out.println("*********************************");
        ArrayList<Country> allRegion = a.allPopulationRegion();
        a.printallPopulationRegion(allRegion);

        //All Population in the Country
        System.out.println("\n");
        System.out.println("All Population in the Countries");
        System.out.println("*********************************");
        ArrayList<City> allCountry = a.allPopulationCountry();
        a.printallPopulationCountry(allCountry);

        //All Population in the District
        System.out.println("\n");
        System.out.println("All Population in the District");
        System.out.println("********************************");
        ArrayList<City> allDistrict = a.allPopulationDistrict();
        a.printallPopulationDistrict(allDistrict);

        //All Population in the City
        System.out.println("\n");
        System.out.println("All Population in the City");
        System.out.println("****************************");
        ArrayList<City> allCity = a.allPopulationCity();
        a.printallPopulationCity(allCity);

        //Language percentage
        System.out.println("\n");
        System.out.println("Percentage of Using language in the world");
        System.out.println("******************************************");
        ArrayList<Language> languages = a.languageWorld();
        ArrayList<Long> totalp = a.allPopulationWorld();
        a.printLanguageWorld(languages,totalp);


        //All Population in the City
        System.out.println("\n");
        System.out.println("Living and Non Living population in each Country");
        System.out.println("*************************************************");
        ArrayList<Country> lpop = a.livingNonLivngCountry();
        a.printallivingNonLivngCountry(lpop);

        //All Population in the City
        System.out.println("\n");
        System.out.println("Living and Non Living population in each region");
        System.out.println("************************************************");
        ArrayList<Country> lpop1 = a.livingNonLivngRegion();
        a.printallivingNonLivngRegion(lpop1);

        // ArrayList<Country> peopleList = a.peopleListCountry();
//        a.printPeopleListCountry(peopleList);


        // Disconnect from database
        a.disconnect();
    }
    /**
     * Connection to MySQL database.
     */
    private Connection con = null;

    /**
     * Connect to the MySQL database.
     */
    public void connect(String s)
    {
        try
        {
            // Load Database driver
            Class.forName("com.mysql.cj.jdbc.Driver");
        }
        catch (ClassNotFoundException e)
        {
            System.out.println("Could not load SQL driver");
            System.exit(-1);
        }

        int retries = 100;
        for (int i = 0; i < retries; ++i)
        {
            System.out.println("Connecting to database...");
            try
            {
                // Wait a bit for db to start
                Thread.sleep(3000);
                // Connect to database
                con = DriverManager.getConnection("jdbc:mysql://" + s + "/world?allowPublicKeyRetrieval=true&useSSL=false", "root", "example");
                System.out.println("Successfully connected");
                break;
            }
            catch (SQLException sqle)
            {
                System.out.println("Failed to connect to database attempt " + Integer.toString(i));
                System.out.println(sqle.getMessage());
            }
            catch (InterruptedException ie)
            {
                System.out.println("Thread interrupted? Should not happen.");
            }
        }
    }

    /**
     * Disconnect from the MySQL database.
     */
    public void disconnect()
    {
        if (con != null)
        {
            try
            {
                // Close connection
                con.close();
            }
            catch (Exception e)
            {
                System.out.println("Error closing connection to database");
            }
        }
    }
    public ArrayList<Country> CountryDESC()
    {
        try
        {
            // Create an SQL statement
            Statement stmt = con.createStatement();
            // Create string for SQL statement
            String ctlist = "SELECT Code, Name, Continent, Region, Population, Capital FROM country ORDER BY Population DESC";
            // Execute SQL statement
            ResultSet rset = stmt.executeQuery(ctlist);
            // Extract employee information
            ArrayList<Country> Country = new ArrayList<Country>();
            while (rset.next())
            {
                Country cntry = new Country();
                cntry.setCode(rset.getString("Code"));
                cntry.setContinent(rset.getString("Continent"));
                cntry.setName(rset.getString("Name"));
                cntry.setRegion(rset.getString("Region"));
                cntry.setPopulation(rset.getInt("Population"));
                cntry.setCapital(rset.getInt("Capital"));
                Country.add(cntry);
            }
            return Country;
        } catch (Exception e) {
            System.out.println(e.getMessage());
            System.out.println("Fail to print Country list");
            return null;
        }
    }
    public void printCountryDEST(ArrayList<Country> Country)
    {
        // Print header
        System.out.println(String.format("%-10s %-30s %-45s %-55s %-60s %-65s", "Population", "Code", "Country Name", "continent", "region", "capital" ));
        // Loop over all employees in the list
        for (Country emp : Country) {
            String emp_string =
                    String.format("%-10s %-30s %-45s %-55s %-60s %-65s",
                            emp.getPopulation(), emp.getCode(), emp.getName(), emp.getContinent(), emp.getRegion(), emp.getCapital());
            System.out.println(emp_string);
        }
    }
    //End


    //Function 2
    public ArrayList<Country> continent_countryDESC()
    {
        try
        {
            // Create an SQL statement
            Statement stmt = con.createStatement();
            // Create string for SQL statement
            String conlist = "SELECT Code, Name, Continent, Region, Population, Capital FROM country WHERE Continent = 'Asia' ORDER BY Population DESC";
            // Execute SQL statement
            ResultSet rset = stmt.executeQuery(conlist);
            // Extract employee information
            ArrayList<Country> cty = new ArrayList<Country>();
            while (rset.next())
            {
                Country cont = new Country();
                cont.setCode(rset.getString("Code"));
                cont.setContinent(rset.getString("Continent"));
                cont.setName(rset.getString("Name"));
                cont.setRegion(rset.getString("Region"));
                cont.setPopulation(rset.getInt("Population"));
                cont.setCapital(rset.getInt("Capital"));
                cty.add(cont);
            }
            return cty;
        } catch (Exception e) {
            System.out.println(e.getMessage());
            System.out.println("Fail to print Country list");
            return null;
        }
    }
    public void prin_countrylist_continent(ArrayList<Country> Country)
    {
        // Print header
        System.out.println(String.format("%-10s %-30s %-45s %-55s %-60s %-65s", "Population", "Code", "Country Name", "continent", "region", "capital" ));
        // Loop over all employees in the list
        for (Country emp : Country) {
            String emp_string =
                    String.format("%-10s %-30s %-45s %-55s %-60s %-65s",
                            emp.getPopulation(), emp.getCode(), emp.getName(), emp.getContinent(), emp.getRegion(), emp.getCapital());
            System.out.println(emp_string);
        }
    }
    //End


    //Function 3
    public ArrayList<Country> Regoin_CountryDESC()
    {
        try
        {
            // Create an SQL statement
            Statement stmt = con.createStatement();
            // Create string for SQL statement
            String regionlist = "SELECT Code, Name, Continent, Region, Population, Capital FROM country WHERE Region = 'Southeast Asia' ORDER BY Population DESC";
            // Execute SQL statement
            ResultSet rset = stmt.executeQuery(regionlist);
            // Extract employee information
            ArrayList<Country> Country = new ArrayList<Country>();
            while (rset.next())
            {
                Country cntry = new Country();
                cntry.setCode(rset.getString("Code"));
                cntry.setContinent(rset.getString("Continent"));
                cntry.setName(rset.getString("Name"));
                cntry.setRegion(rset.getString("Region"));
                cntry.setPopulation(rset.getInt("Population"));
                cntry.setCapital(rset.getInt("Capital"));
                Country.add(cntry);
            }
            return Country;
        } catch (Exception e) {
            System.out.println(e.getMessage());
            System.out.println("Fail to print Country list");
            return null;
        }
    }
    public void prin_countrylist_region(ArrayList<Country> Country)
    {
        // Print header
        System.out.println(String.format("%-10s %-30s %-45s %-55s %-60s %-65s", "Population", "Code", "Country Name", "continent", "region", "capital" ));
        // Loop over all employees in the list
        for (Country emp : Country) {
            String emp_string =
                    String.format("%-10s %-30s %-45s %-55s %-60s %-65s",
                            emp.getPopulation(), emp.getCode(), emp.getName(), emp.getContinent(), emp.getRegion(), emp.getCapital());
            System.out.println(emp_string);
        }
    }
    //End


    //Function 4
    public ArrayList<Country> mostpopcnty_world()
    {
        try
        {
            // Create an SQL statement
            Statement stmt = con.createStatement();
            // Create string for SQL statement
            String regionlist = "SELECT Code, Name, Continent, Region, Population, Capital FROM country ORDER by Population DESC limit 10";
            // Execute SQL statement
            ResultSet rset = stmt.executeQuery(regionlist);
            // Extract employee information
            ArrayList<Country> Country = new ArrayList<Country>();
            while (rset.next())
            {
                Country cntry = new Country();
                cntry.setCode(rset.getString("Code"));
                cntry.setContinent(rset.getString("Continent"));
                cntry.setName(rset.getString("Name"));
                cntry.setRegion(rset.getString("Region"));
                cntry.setPopulation(rset.getInt("Population"));
                cntry.setCapital(rset.getInt("Capital"));
                Country.add(cntry);
            }
            return Country;
        } catch (Exception e) {
            System.out.println(e.getMessage());
            System.out.println("Fail to print Country list");
            return null;
        }
    }
    public void prin_popcnty_world(ArrayList<Country> Country1)
    {
        // Print header
        System.out.println(String.format("%-10s %-30s %-45s %-55s %-60s %-65s", "Population", "Code", "Country Name", "continent", "region", "capital" ));
        // Loop over all employees in the list
        for (Country emp : Country1) {
            String emp_string =
                    String.format("%-10s %-30s %-45s %-55s %-60s %-65s",
                            emp.getPopulation(), emp.getCode(), emp.getName(), emp.getContinent(), emp.getRegion(), emp.getCapital());
            System.out.println(emp_string);
        }
    }
    //End


    //Function 5
    public ArrayList<Country> mostpopcnty_continent()
    {
        try
        {
            // Create an SQL statement
            Statement stmt = con.createStatement();
            // Create string for SQL statement
            String regionlist = "SELECT Code, Name, Continent, Region, Population, Capital FROM country WHERE Continent = 'Europe' ORDER by Population DESC limit 10";
            // Execute SQL statement
            ResultSet rset = stmt.executeQuery(regionlist);
            // Extract employee information
            ArrayList<Country> Country = new ArrayList<Country>();
            while (rset.next())
            {
                Country cntry = new Country();
                cntry.setCode(rset.getString("Code"));
                cntry.setContinent(rset.getString("Continent"));
                cntry.setName(rset.getString("Name"));
                cntry.setRegion(rset.getString("Region"));
                cntry.setPopulation(rset.getInt("Population"));
                cntry.setCapital(rset.getInt("Capital"));
                Country.add(cntry);
            }
            return Country;
        } catch (Exception e) {
            System.out.println(e.getMessage());
            System.out.println("Fail to print Country list");
            return null;
        }
    }
    public void prin_popcnty_continent(ArrayList<Country> Country2)
    {
        // Print header
        System.out.println(String.format("%-10s %-30s %-45s %-55s %-60s %-65s", "Population", "Code", "Country Name", "continent", "region", "capital" ));
        // Loop over all employees in the list
        for (Country emp : Country2) {
            String emp_string =
                    String.format("%-10s %-30s %-45s %-55s %-60s %-65s",
                            emp.getPopulation(), emp.getCode(), emp.getName(), emp.getContinent(), emp.getRegion(), emp.getCapital());
            System.out.println(emp_string);
        }
    }
    //End

    //Function 6
    public ArrayList<Country> popcity_world()
    {
        try
        {
            // Create an SQL statement
            Statement stmt = con.createStatement();
            // Create string for SQL statement
            String regionlist = "SELECT Code, Name, Continent, Region, Population, Capital FROM country WHERE Region = 'North America' ORDER by Population DESC limit 10";
            // Execute SQL statement
            ResultSet rset = stmt.executeQuery(regionlist);
            // Extract employee information
            ArrayList<Country> Country = new ArrayList<Country>();
            while (rset.next())
            {
                Country cntry = new Country();
                cntry.setCode(rset.getString("Code"));
                cntry.setContinent(rset.getString("Continent"));
                cntry.setName(rset.getString("Name"));
                cntry.setRegion(rset.getString("Region"));
                cntry.setPopulation(rset.getInt("Population"));
                cntry.setCapital(rset.getInt("Capital"));
                Country.add(cntry);
            }
            return Country;
        } catch (Exception e) {
            System.out.println(e.getMessage());
            System.out.println("Fail to print Country list");
            return null;
        }
    }
    public void print_popcity_world(ArrayList<Country> Country3)
    {
        // Print header
        System.out.println(String.format("%-10s %-30s %-45s %-55s %-60s %-65s", "Population", "Code", "Country Name", "continent", "region", "capital" ));
        // Loop over all employees in the list
        for (Country emp : Country3) {
            String emp_string =
                    String.format("%-10s %-30s %-45s %-55s %-60s %-65s",
                            emp.getPopulation(), emp.getCode(), emp.getName(), emp.getContinent(), emp.getRegion(), emp.getCapital());
            System.out.println(emp_string);
        }
    }
    //End


    //Function 7
    public ArrayList<City> mostpopcnty_region()
    {
        try
        {
            // Create an SQL statement
            Statement stmt = con.createStatement();
            // Create string for SQL statement
            String regionlist = "SELECT Name, CountryCode, District, Population FROM city ORDER by Population DESC";
            // Execute SQL statement
            ResultSet rset = stmt.executeQuery(regionlist);
            // Extract employee information
            ArrayList<City> City = new ArrayList<City>();
            while (rset.next())
            {
                City city = new City();
                city.setDistrict(rset.getString("District"));
                city.setName(rset.getString("Name"));
                city.setPopulation(rset.getInt("Population"));
                city.setCountry(rset.getString("CountryCode"));
                City.add(city);
            }
            return City;
        } catch (Exception e) {
            System.out.println(e.getMessage());
            System.out.println("Fail to print Country list");
            return null;
        }
    }
    public void prin_popcnty_region(ArrayList<City> City1)
    {
        // Print header
        System.out.println(String.format("%-10s %-30s %-45s %-55s", "Population", "Country Name", "Country Code", "District" ));
        // Loop over all employees in the list
        for (City emp : City1) {
            String emp_string =
                    String.format("%-10s %-30s %-45s %-55s",
                            emp.getPopulation(), emp.getName(), emp.getDistrict(), emp.getCountry());
            System.out.println(emp_string);
        }
    }
    //End

    //Function 8
    public ArrayList<City> popcity_continent()
    {
        try
        {
            // Create an SQL statement
            Statement stmt = con.createStatement();
            //Create String for SQL statement1
            String regionlist = "SELECT city.Name, city.CountryCode, city.District, city.Population,country.Code, country.Continent FROM city,country Where city.CountryCode = country.code and country.Continent = 'Asia' ORDER by Population DESC";
            // Execute SQL statement1
            ResultSet rset = stmt.executeQuery(regionlist);
            // Extract employee information
            ArrayList<City> City = new ArrayList<City>();
            while (rset.next())
            {
                City city = new City();
                city.setDistrict(rset.getString("District"));
                city.setName(rset.getString("Name"));
                city.setPopulation(rset.getInt("Population"));
                city.setCountry(rset.getString("CountryCode"));
                city.setContinent(rset.getString("country.Continent"));
                City.add(city);
            }
            return City;
        } catch (Exception e) {
            System.out.println(e.getMessage());
            System.out.println("Fail to print Country list");
            return null;
        }
    }
    public void print_popcity_continent(ArrayList<City> City1)
    {
        // Print header
        System.out.println(String.format("%-10s %-30s %-45s %-55s %-60s", "Population", "Country Name", "Country Code", "District", "Continent" ));
        // Loop over all employees in the list
        for (City emp : City1) {
            String emp_string =
                    String.format("%-10s %-30s %-45s %-55s %-60s",
                            emp.getPopulation(), emp.getName(), emp.getDistrict(), emp.getCountry(), emp.getContinent());
            System.out.println(emp_string);
        }
    }
    //End

    //Function 9
    public ArrayList<City> pcity_region()
    {
        try
        {
            // Create an SQL statement
            Statement stmt = con.createStatement();
            // Create string for SQL statement
            String regionlist = "SELECT city.Name, city.CountryCode, city.District, city.Population,country.Code, country.Continent FROM city,country Where city.CountryCode = country.code and country.Region = 'Eastern Asia' ORDER by Population DESC";
            // Execute SQL statement
            ResultSet rset = stmt.executeQuery(regionlist);
            // Extract employee information
            ArrayList<City> City = new ArrayList<City>();
            while (rset.next())
            {
                City city = new City();
//                city.setCode(rset.getString("Code"));
                city.setContinent(rset.getString("Continent"));
                city.setName(rset.getString("Name"));
//                city.setRegion(rset.getString("Region"));
                city.setPopulation(rset.getInt("Population"));
                city.setDistrict(rset.getString("District"));
                City.add(city);
            }
            return City;
        } catch (Exception e) {
            System.out.println(e.getMessage());
            System.out.println("Fail to print Country list");
            return null;
        }
    }
    public void print_popucitylist_region(ArrayList<City> City1)
    {
        // Check employees is not null
        if (City1 == null)
        {
            System.out.println("No City Information!");
            return;
        }
        // Print header
        System.out.println(String.format("%-10s %-30s %-45s %-55s", "Population", "Country Name", "continent","district" ));
        // Loop over all employees in the list
        for (City emp : City1) {
            if (emp == null)
                continue;
            String emp_string =
                    String.format("%-10s %-30s %-45s %-55s",
                            emp.getPopulation(), emp.getName(), emp.getContinent(),emp.getDistrict());
            System.out.println(emp_string);
        }
    }
    //End

    //Function 10
    public ArrayList<City> pcity_Country()
    {
        try
        {
            // Create an SQL statement
            Statement stmt = con.createStatement();
            // Create string for SQL statement
            String regionlist = "SELECT city.Name, city.CountryCode, city.District, city.Population,country.Code, country.Continent FROM city,country Where city.CountryCode = country.code and country.Name = 'China' ORDER by Population DESC";
            // Execute SQL statement
            ResultSet rset = stmt.executeQuery(regionlist);
            // Extract employee information
            ArrayList<City> City = new ArrayList<City>();
            while (rset.next())
            {
                City city = new City();
//                city.setCode(rset.getString("Code"));
                city.setContinent(rset.getString("Continent"));
                city.setName(rset.getString("Name"));
//                city.setRegion(rset.getString("Region"));
                city.setPopulation(rset.getInt("Population"));
                city.setDistrict(rset.getString("District"));
                City.add(city);
            }
            return City;
        } catch (Exception e) {
            System.out.println(e.getMessage());
            System.out.println("Fail to print Country list");
            return null;
        }
    }
    public void print_popucitylist_Country(ArrayList<City> City1)
    {
        //Check null
        if(City1 == null){
            System.out.println("No City List information in China country");
            return;
        }
        // Print header
        System.out.println(String.format("%-10s %-30s %-45s %-55s", "Population", "Country Name", "continent","district" ));
        // Loop over all employees in the list
        for (City emp : City1) {
            if (emp == null)
                continue;
            String emp_string =
                    String.format("%-10s %-30s %-45s %-55s",
                            emp.getPopulation(), emp.getName(), emp.getContinent(),emp.getDistrict());
            System.out.println(emp_string);
        }
    }
    //End

    //Function 11
    public ArrayList<City> pcity_district()
    {
        try
        {
            // Create an SQL statement
            Statement stmt = con.createStatement();
            // Create string for SQL statement
            String regionlist = "SELECT city.Name, city.CountryCode, city.District, city.Population FROM city WHERE city.District = 'Liaoning' ORDER by Population DESC";
            // Execute SQL statement
            ResultSet rset = stmt.executeQuery(regionlist);
            // Extract employee information
            ArrayList<City> City = new ArrayList<City>();
            while (rset.next())
            {
                City city = new City();
//                city.setCode(rset.getString("Code"));
                city.setCountry(rset.getString("CountryCode"));
                city.setName(rset.getString("Name"));
//                city.setRegion(rset.getString("Region"));
                city.setPopulation(rset.getInt("Population"));
                city.setDistrict(rset.getString("District"));
                City.add(city);
            }
            return City;
        } catch (Exception e) {
            System.out.println(e.getMessage());
            System.out.println("Fail to print Country list");
            return null;
        }
    }
    public void print_popucitylist_district(ArrayList<City> City1)
    {
        //Check null
        if(City1 == null){
            System.out.println("No City List information in District");
            return;
        }
        // Print header
        System.out.println(String.format("%-10s %-30s %-45s %-55s", "Population", "Country Name", "continent","district" ));
        // Loop over all employees in the list
        for (City emp : City1) {
            if (emp == null)
                continue;
            String emp_string =
                    String.format("%-10s %-30s %-45s %-55s",
                            emp.getPopulation(), emp.getName(), emp.getCountry(),emp.getDistrict());
            System.out.println(emp_string);
        }
    }
    //End

    //Function 12
    public ArrayList<City> pcitylist_world()
    {
        try
        {
            // Create an SQL statement
            Statement stmt = con.createStatement();
            // Create string for SQL statement
            String regionlist = "SELECT city.Name, city.CountryCode, city.District, city.Population FROM city ORDER by Population DESC Limit 10";
            // Execute SQL statement
            ResultSet rset = stmt.executeQuery(regionlist);
            // Extract employee information
            ArrayList<City> City = new ArrayList<City>();
            while (rset.next())
            {
                City city = new City();
//                city.setCode(rset.getString("Code"));
                city.setCountry(rset.getString("CountryCode"));
                city.setName(rset.getString("Name"));
//                city.setRegion(rset.getString("Region"));
                city.setPopulation(rset.getInt("Population"));
                city.setDistrict(rset.getString("District"));
                City.add(city);
            }
            return City;
        } catch (Exception e) {
            System.out.println(e.getMessage());
            System.out.println("Fail to print Country list");
            return null;
        }
    }
    public void print_popucitylist_world(ArrayList<City> City1)
    {
        //Check null
        if(City1 == null){
            System.out.println("No City List information in World");
            return;
        }
        // Print header
        System.out.println(String.format("%-10s %-30s %-45s %-55s", "Population", "Country Name", "continent","district" ));
        // Loop over all employees in the list
        for (City emp : City1) {
            if (emp == null)
                continue;
            String emp_string =
                    String.format("%-10s %-30s %-45s %-55s",
                            emp.getPopulation(), emp.getName(), emp.getCountry(),emp.getDistrict());
            System.out.println(emp_string);
        }
    }
    //End

    //Function 13
    public ArrayList<City> mostpopcity_world()
    {
        try
        {
            // Create an SQL statement
            Statement stmt = con.createStatement();
            // Create string for SQL statement
            String regionlist = "SELECT city.Name, city.CountryCode, city.District, city.Population,country.Code, country.Continent FROM city,country Where city.CountryCode = country.code and country.Continent = 'Asia' ORDER by Population DESC Limit 10";
            // Execute SQL statement
            ResultSet rset = stmt.executeQuery(regionlist);
            // Extract employee information
            ArrayList<City> City = new ArrayList<City>();
            while (rset.next())
            {
                City city = new City();
//                city.setCode(rset.getString("Code"));
                city.setContinent(rset.getString("Continent"));
                city.setName(rset.getString("Name"));
//                city.setRegion(rset.getString("Region"));
                city.setPopulation(rset.getInt("Population"));
                city.setDistrict(rset.getString("District"));
                City.add(city);
            }
            return City;
        } catch (Exception e) {
            System.out.println(e.getMessage());
            System.out.println("Fail to print Country list");
            return null;
        }
    }
    public void print_populationcity_continent(ArrayList<City> City1)
    {
        //Check null
        if(City1 == null){
            System.out.println("No Population City List information in Continent");
            return;
        }
        // Print header
        System.out.println(String.format("%-10s %-30s %-45s %-55s", "Population", "Country Name", "continent","district" ));
        // Loop over all employees in the list
        for (City emp : City1) {
            if (emp == null)
                continue;
            String emp_string =
                    String.format("%-10s %-30s %-45s %-55s",
                            emp.getPopulation(), emp.getName(), emp.getContinent(),emp.getDistrict());
            System.out.println(emp_string);
        }
    }
    //End

    //Function 14
    public ArrayList<City> pcity_world()
    {
        try
        {
            // Create an SQL statement
            Statement stmt = con.createStatement();
            // Create string for SQL statement
            String regionlist = "SELECT city.Name, city.CountryCode, city.District, city.Population,country.Code, country.Continent FROM city,country Where city.CountryCode = country.code and country.Region = 'Eastern Asia' ORDER by Population DESC Limit 10";
            // Execute SQL statement
            ResultSet rset = stmt.executeQuery(regionlist);
            // Extract employee information
            ArrayList<City> City = new ArrayList<City>();
            while (rset.next())
            {
                City city = new City();
//                city.setCode(rset.getString("Code"));
                city.setContinent(rset.getString("Continent"));
                city.setName(rset.getString("Name"));
//                city.setRegion(rset.getString("Region"));
                city.setPopulation(rset.getInt("Population"));
                city.setDistrict(rset.getString("District"));
                City.add(city);
            }
            return City;
        } catch (Exception e) {
            System.out.println(e.getMessage());
            System.out.println("Fail to print Country list");
            return null;
        }
    }
    public void print_populationcity_region(ArrayList<City> City1)
    {
        //Check null
        if(City1 == null){
            System.out.println("No Population City List information in Region");
            return;
        }
        // Print header
        System.out.println(String.format("%-10s %-30s %-45s %-55s", "Population", "Country Name", "continent","district" ));
        // Loop over all employees in the list
        for (City emp : City1) {
            if (emp == null)
                continue;
            String emp_string =
                    String.format("%-10s %-30s %-45s %-55s",
                            emp.getPopulation(), emp.getName(), emp.getContinent(),emp.getDistrict());
            System.out.println(emp_string);
        }
    }
    //End

    //Function 15
    public ArrayList<City> pop_city_country(){
        try
        {
            // Create an SQL statement
            Statement stmt = con.createStatement();
            // Create string for SQL statement
            String citylist = "SELECT city.Name, city.CountryCode, city.District, city.Population,country.Code, country.Continent FROM city,country Where city.CountryCode = country.code and country.Name = 'Myanmar' ORDER by Population DESC Limit 10";
            // Execute SQL statement
            ResultSet rset = stmt.executeQuery(citylist);
            // Extract employee information
            ArrayList<City> City = new ArrayList<City>();
            while (rset.next())
            {
                City city = new City();
//                city.setCode(rset.getString("Code"));
                //city.setContinent(rset.getString("Continent"));
                city.setName(rset.getString("Name"));
                city.setCountry(rset.getString("CountryCode"));
                city.setPopulation(rset.getInt("Population"));
                city.setDistrict(rset.getString("District"));
                City.add(city);
            }
            return City;
        } catch (Exception e) {
            System.out.println(e.getMessage());
            System.out.println("Fail to print Country list");
            return null;
        }
    }
    public void print_populationcity_country(ArrayList<City> City1)
    {
        //Check null
        if(City1 == null) {
            System.out.println("No Population City List information in Country");
            return;
        }
        // Print header
        System.out.println(String.format("%-10s %-30s %-45s %-55s", "Population", "City Name", "Country Name","district" ));
        // Loop over all employees in the list
        for (City emp : City1) {
            if (emp == null)
                continue;
            String emp_string =
                    String.format("%-10s %-30s %-45s %-55s",
                            emp.getPopulation(), emp.getName(), emp.getCountry(),emp.getDistrict());
            System.out.println(emp_string);
        }
    }
    //End
    //Function 16
    public ArrayList<City> pop_city_district(){
        try
        {
            // Create an SQL statement
            Statement stmt = con.createStatement();
            // Create string for SQL statement
            String citylist = "SELECT city.Name, city.CountryCode, city.District, city.Population FROM city Where city.District = 'Liaoning' ORDER by Population DESC Limit 10";
            // Execute SQL statement
            ResultSet rset = stmt.executeQuery(citylist);
            // Extract employee information
            ArrayList<City> City = new ArrayList<City>();
            while (rset.next())
            {
                City city = new City();
//                city.setCode(rset.getString("Code"));
                city.setCountry(rset.getString("CountryCode"));
                city.setName(rset.getString("Name"));
//                city.setRegion(rset.getString("Region"));
                city.setPopulation(rset.getInt("Population"));
                city.setDistrict(rset.getString("District"));
                City.add(city);
            }
            return City;
        } catch (Exception e) {
            System.out.println(e.getMessage());
            System.out.println("Fail to print Country list");
            return null;
        }
    }
    public void print_populationcity_District(ArrayList<City> City1)
    {
        //Check null
        if(City1 == null) {
            System.out.println("No Population City List information in District");
            return;
        }
        // Print header
        System.out.println(String.format("%-10s %-30s %-45s %-55s", "Population", "City Name", "Country Name","district" ));
        // Loop over all employees in the list
        for (City emp : City1) {
            if (emp == null)
                continue;
            String emp_string =
                    String.format("%-10s %-30s %-45s %-55s",
                            emp.getPopulation(), emp.getName(), emp.getCountry(),emp.getDistrict());
            System.out.println(emp_string);
        }
    }
    //End

    //Function 17
    public ArrayList<City> capitalCityWorld(){
        try
        {
            // Create an SQL statement
            Statement stmt = con.createStatement();
            // Create string for SQL statement
            String citylist = "Select city.Population,city.ID, city.Name, city.District, city.CountryCode, country.Capital from city,country where city.ID = country.Capital Order By city.Population DESC ";
            // Execute SQL statement
            ResultSet rset = stmt.executeQuery(citylist);
            // Extract employee information
            ArrayList<City> City = new ArrayList<City>();
            while (rset.next())
            {
                City city = new City();
//                city.setCode(rset.getString("Code"));
                city.setCountry(rset.getString("CountryCode"));
                city.setName(rset.getString("Name"));
//                city.setRegion(rset.getString("Region"));
                city.setPopulation(rset.getInt("Population"));
                city.setDistrict(rset.getString("District"));
                City.add(city);
            }
            return City;
        } catch (Exception e) {
            System.out.println(e.getMessage());
            System.out.println("Fail to print Country list");
            return null;
        }
    }
    public void printCapitalcityWorld(ArrayList<City> City1)
    {
        //Check null
        if(City1 == null) {
            System.out.println("No Population City List information in District");
            return;
        }
        // Print header
        System.out.println(String.format("%-10s %-30s %-45s %-55s", "Population", "City Name", "Country Name","district" ));
        // Loop over all employees in the list
        for (City emp : City1) {
            if (emp == null)
                continue;
            String emp_string =
                    String.format("%-10s %-30s %-45s %-55s",
                            emp.getPopulation(), emp.getName(), emp.getCountry(),emp.getDistrict());
            System.out.println(emp_string);
        }
    }
    //End

    //Function 18
    public ArrayList<City> capCityContinent(){
        try
        {
            // Create an SQL statement
            Statement stmt = con.createStatement();
            // Create string for SQL statement
            String citylist = "Select city.Population,city.ID, city.Name, city.District, city.CountryCode, country.Capital from city,country where city.ID = country.Capital and country.Continent = 'Europe' Order By city.Population DESC ";
            // Execute SQL statement
            ResultSet rset = stmt.executeQuery(citylist);
            // Extract employee information
            ArrayList<City> City = new ArrayList<City>();
            while (rset.next())
            {
                City city = new City();
//                city.setCode(rset.getString("Code"));
                city.setCountry(rset.getString("CountryCode"));
                city.setName(rset.getString("Name"));
//                city.setRegion(rset.getString("Region"));
                city.setPopulation(rset.getInt("Population"));
                city.setDistrict(rset.getString("District"));
                City.add(city);
            }
            return City;
        } catch (Exception e) {
            System.out.println(e.getMessage());
            System.out.println("Fail to print Country list");
            return null;
        }
    }
    public void printCapcityContinent(ArrayList<City> City1)
    {
        //Check null
        if(City1 == null) {
            System.out.println("No Population City List information in Region");
            return;
        }
        // Print header
        System.out.println(String.format("%-10s %-30s %-45s %-55s", "Population", "City Name", "Country Name","district" ));
        // Loop over all employees in the list
        for (City emp : City1) {
            if (emp == null)
                continue;
            String emp_string =
                    String.format("%-10s %-30s %-45s %-55s",
                            emp.getPopulation(), emp.getName(), emp.getCountry(),emp.getDistrict());
            System.out.println(emp_string);
        }
    }
    //End

    //Function 19.
    
    public ArrayList<City> capCityRegion(){
        try
        {
            // Create an SQL statement
            Statement stmt = con.createStatement();
            // Create string for SQL statement
            String citylist = "Select city.Population,city.ID, city.Name, city.District, city.CountryCode, country.Capital from city,country where city.ID = country.Capital and country.Region = 'Southeast Asia' Order By city.Population DESC ";
            // Execute SQL statement
            ResultSet rset = stmt.executeQuery(citylist);
            // Extract employee information
            ArrayList<City> City = new ArrayList<City>();
            while (rset.next())
            {
                City city = new City();
//                city.setCode(rset.getString("Code"));
                city.setCountry(rset.getString("CountryCode"));
                city.setName(rset.getString("Name"));
//                city.setRegion(rset.getString("Region"));
                city.setPopulation(rset.getInt("Population"));
                city.setDistrict(rset.getString("District"));
                City.add(city);
            }
            return City;
        } catch (Exception e) {
            System.out.println(e.getMessage());
            System.out.println("Fail to print Country list");
            return null;
        }
    }
    public void printCapcityRegion(ArrayList<City> City1)
    {
        //Check null
        if(City1 == null) {
            System.out.println("No Population City List information in Region");
            return;
        }
        // Print header
        System.out.println(String.format("%-10s %-30s %-45s %-55s", "Population", "City Name", "Country Name","district" ));
        // Loop over all employees in the list
        for (City emp : City1) {
            if (emp == null)
                continue;
            String emp_string =
                    String.format("%-10s %-30s %-45s %-55s",
                            emp.getPopulation(), emp.getName(), emp.getCountry(),emp.getDistrict());
            System.out.println(emp_string);
        }
    }
    //End

    //Function 20.
    
    public ArrayList<City> popcapcity_world()
    {
        try
        {
            // Create an SQL statement
            Statement stmt = con.createStatement();
            // Create string for SQL statement
            String regionlist = "Select city.Population,city.ID, city.Name, city.District, city.CountryCode, country.Capital from city,country where city.ID = country.Capital Order By city.Population DESC Limit 10";
            // Execute SQL statement
            ResultSet rset = stmt.executeQuery(regionlist);
            // Extract employee information
            ArrayList<City> City = new ArrayList<City>();
            while (rset.next())
            {
                City city = new City();
//                city.setCode(rset.getString("Code"));
                city.setCountry(rset.getString("CountryCode"));
                city.setName(rset.getString("Name"));
//                city.setRegion(rset.getString("Region"));
                city.setPopulation(rset.getInt("Population"));
                city.setDistrict(rset.getString("District"));
                City.add(city);
            }
            return City;
        } catch (Exception e) {
            System.out.println(e.getMessage());
            System.out.println("Fail to print Country list");
            return null;
        }
    }
    public void print_popcapcity_world(ArrayList<City> City1)
    {
        //Check null
        if(City1 == null){
            System.out.println("No City List information in World");
            return;
        }
        // Print header
        System.out.println(String.format("%-10s %-30s %-45s %-55s", "Population", "Country Name", "continent","district" ));
        // Loop over all employees in the list
        for (City emp : City1) {
            if (emp == null)
                continue;
            String emp_string =
                    String.format("%-10s %-30s %-45s %-55s",
                            emp.getPopulation(), emp.getName(), emp.getCountry(),emp.getDistrict());
            System.out.println(emp_string);
        }
    }
    //End
    //Function 21
    public ArrayList<City> popcapCityContinent(){
        try
        {
            // Create an SQL statement
            Statement stmt = con.createStatement();
            // Create string for SQL statement
            String citylist = "Select city.Population,city.ID, city.Name, city.District, city.CountryCode, country.Capital from city,country where city.ID = country.Capital and country.Continent = 'Europe' Order By city.Population DESC Limit 10 ";
            // Execute SQL statement
            ResultSet rset = stmt.executeQuery(citylist);
            // Extract employee information
            ArrayList<City> City = new ArrayList<City>();
            while (rset.next())
            {
                City city = new City();
//                city.setCode(rset.getString("Code"));
                city.setCountry(rset.getString("CountryCode"));
                city.setName(rset.getString("Name"));
//                city.setRegion(rset.getString("Region"));
                city.setPopulation(rset.getInt("Population"));
                city.setDistrict(rset.getString("District"));
                City.add(city);
            }
            return City;
        } catch (Exception e) {
            System.out.println(e.getMessage());
            System.out.println("Fail to print Country list");
            return null;
        }
    }
    public void printpopCapcityContinent(ArrayList<City> City1)
    {
        //Check null
        if(City1 == null) {
            System.out.println("No Population City List information in Region");
            return;
        }
        // Print header
        System.out.println(String.format("%-10s %-30s %-45s %-55s", "Population", "City Name", "Country Name","district" ));
        // Loop over all employees in the list
        for (City emp : City1) {
            if (emp == null)
                continue;
            String emp_string =
                    String.format("%-10s %-30s %-45s %-55s",
                            emp.getPopulation(), emp.getName(), emp.getCountry(),emp.getDistrict());
            System.out.println(emp_string);
        }
    }
    //End

    //Function 22
        public ArrayList<City> popcapcity_Region()
        {
            try
            {
                // Create an SQL statement
                Statement stmt = con.createStatement();
                // Create string for SQL statement
                String regionlist = "Select city.Population,city.ID, city.Name, city.District, city.CountryCode, country.Capital from city,country where city.ID = country.Capital and country.Region = 'Southeast Asia' Order By city.Population DESC Limit 10";
                // Execute SQL statement
                ResultSet rset = stmt.executeQuery(regionlist);
                // Extract employee information
                ArrayList<City> City = new ArrayList<City>();
                while (rset.next())
                {
                    City city = new City();
    //                city.setCode(rset.getString("Code"));
                    city.setCountry(rset.getString("CountryCode"));
                    city.setName(rset.getString("Name"));
    //                city.setRegion(rset.getString("Region"));
                    city.setPopulation(rset.getInt("Population"));
                    city.setDistrict(rset.getString("District"));
                    City.add(city);
                }
                return City;
            } catch (Exception e) {
                System.out.println(e.getMessage());
                System.out.println("Fail to print Country list");
                return null;
            }
        }
        public void print_popcapcity_Region(ArrayList<City> City1)
        {
            //Check null
            if(City1 == null){
                System.out.println("No City List information in Region");
                return;
            }
            // Print header
            System.out.println(String.format("%-10s %-30s %-45s %-55s", "Population", "Country Name", "continent","district" ));
            // Loop over all employees in the list
            for (City emp : City1) {
                if (emp == null)
                    continue;
                String emp_string =
                        String.format("%-10s %-30s %-45s %-55s",
                                emp.getPopulation(), emp.getName(), emp.getCountry(),emp.getDistrict());
                System.out.println(emp_string);
            }
        }
        //End


    //    Function 23
//    public ArrayList<Country> peopleListCountry(){
//        try
//        {
//            // Create an SQL statement
//            Statement stmt = con.createStatement();
//            // Create string for SQL statement
//            String ctypeoplelist = "Select city.Population,city.Name,country.Population, country.Code from city,country where city.CountryCode = country.Code and country.Name = 'Myanmar'";
//            // Execute SQL statement
//            ResultSet rset1 = stmt.executeQuery(ctypeoplelist);
//            // Extract employee information
//            ArrayList<Country> City = new ArrayList<Country>();
//            while (rset1.next())
//            {
//                Country city = new Country();
//                city.setPopulation(rset1.getInt("Population"));
//                city.setPopulation(rset1.getInt("Population"));
//                city.setName(rset1.getString("Name"));
//                City.add(city);
//            }
//            return City;
//        } catch (Exception e) {
//            System.out.println(e.getMessage());
//            System.out.println("Fail to print Country list");
//            return null;
//        }
//    }
//    public void printPeopleListCountry(ArrayList<Country> City1)
//    {
//        //Check null
//        if(City1 == null) {
//            System.out.println("No Population City List information in District");
//            return;
//        }
//        // Print header
//        //System.out.println(String.format("%-10s", "Population"));
//        // Loop over all employees in the list
//        for (Country emp : City1) {
//            if (emp == null)
//                continue;
//            String emp_string = ("Population in Myanmar :"+ emp.getPopulation() +".");
//            System.out.println(emp_string);
//        }
//        for (Country emp : City1) {
//            if (emp == null)
//                continue;
//            String emp_string = ("Population in Myanmar :"+ emp.getPopulation() +".");
//            System.out.println(emp_string);
//        }
//    }
    //End
    //    Function 23
    public void peopleListContinent(){
        try
        {
            // Create an SQL statement
            Statement stmt = con.createStatement();
            // Create string for SQL statement
            String conPeopleList = "SELECT Continent, SUM(Population) as PopulationSum from country Group By Continent";

            // Execute SQL statement
            ResultSet rset1 = stmt.executeQuery(conPeopleList);
            // Extract employee information
            ArrayList<Country> City = new ArrayList<Country>();

            while (rset1.next())
            {
                Country cty = new Country();
                cty.setCtyPopulation(rset1.getLong("PopulationSum"));
                cty.setContinent(rset1.getString("Continent"));
                System.out.println("Population of Country in "+cty.getContinent()+" Continent: "+cty.getCtyPopulation());
                City.add(cty);
            }

            //Result set 3
            for(Country con : City) {
                String conName = con.getContinent();
                long continentPop = con.getCtyPopulation();
                long cityPop = new Long("0");
                long livPop = new Long("0");
                long notlivPop = new Long("0");
                String countryCode = "SELECT Code from country Where Continent='" + conName + "'";
                ResultSet rset3 = stmt.executeQuery(countryCode);
                while (rset3.next()) {
                    com.napier.gp7.Country country = new Country();
                    country.setCode(rset3.getString("Code"));
                    String ctyPeopleList = "SELECT Population from city where CountryCode = '" + country.getCode() + "'";
                    long cityPop1 = livingCityPop(ctyPeopleList);
                    cityPop = Long.sum(cityPop,cityPop1);

                }
                System.out.println("\n");
                System.out.println("Continent Name: "+conName);
                System.out.println("Living in city: "+cityPop);
                System.out.println("No living in city: "+Math.subtractExact(continentPop, cityPop));

            }

        } catch (Exception e) {
            System.out.println(e.getMessage());
            System.out.println("Fail to print Country list");
        }
    }
    public Long livingCityPop(String query){
        try
        {
            // Create an SQL statement
            Statement stmt = con.createStatement();
            // Execute SQL statement
            ResultSet rset = stmt.executeQuery(query);
            long livingPop = new Long("0");
            while (rset.next())
            {
                City city = new City();
                livingPop = rset.getLong("Population");
            }
            return livingPop;
        } catch (Exception e) {
            System.out.println(e.getMessage());
            System.out.println("Fail to print Country list");
            return null;
        }
    }
    //End

    //Function 24
    public ArrayList<Long> allPopulationWorld()
    {
        try
        {
            // Create an SQL statement
            Statement stmt = con.createStatement();
            // Create string for SQL statement
            String regionlist = "Select SUM(Population) as SumPop From country GROUP By Continent";
            // Execute SQL statement
            ResultSet rset = stmt.executeQuery(regionlist);
            // Extract employee information
            ArrayList<Long> City = new ArrayList<Long>();
            while (rset.next())
            {
                Country city = new Country();
                city.setCtyPopulation(rset.getLong("SumPop"));
                City.add(city.getCtyPopulation());
            }
            return City;
        } catch (Exception e) {
            System.out.println(e.getMessage());
            System.out.println("Fail to print Country list");
            return null;
        }
    }
    public void printallPopulationWorld(ArrayList<Long> City1)
    {
        //Check null
        if(City1 == null){
            System.out.println("No City List information in Region");
            return;
        }
        Long allPopWorld = new Long("0");
        // Print header
        // Loop over all employees in the list
        for (Long emp : City1) {
            if (emp == null)
                continue;
            Long allPop = emp;
            allPopWorld = Long.sum(allPopWorld,allPop);

        }
        System.out.println("Total Population in the World: "+allPopWorld);
    }
    //End

    //Function 25
    public ArrayList<Country> allPopulationContinent()
    {
        try
        {
            // Create an SQL statement
            Statement stmt = con.createStatement();
            // Create string for SQL statement
            String regionlist = "Select SUM(Population) as SumPop, Continent From country GROUP By Continent";
            // Execute SQL statement
            ResultSet rset = stmt.executeQuery(regionlist);
            // Extract employee information
            ArrayList<Country> City = new ArrayList<Country>();
            while (rset.next())
            {
                Country city = new Country();
                city.setCtyPopulation(rset.getLong("SumPop"));
                city.setContinent(rset.getString("Continent"));
                City.add(city);
            }
            return City;
        } catch (Exception e) {
            System.out.println(e.getMessage());
            System.out.println("Fail to print Country list");
            return null;
        }
    }
    public void printallPopulationContinent(ArrayList<Country> City1)
    {
        //Check null
        if(City1 == null){
            System.out.println("No City List information in Region");
            return;
        }
        // Print header
        // Loop over all employees in the list
        for (Country emp : City1) {
            if (emp == null)
                continue;
            System.out.println("Total Population of "+emp.getContinent()+" Continent: "+emp.getCtyPopulation());
        }

    }
    //End

    //Function 26
    public ArrayList<Country> allPopulationRegion()
    {
        try
        {
            // Create an SQL statement
            Statement stmt = con.createStatement();
            // Create string for SQL statement
            String regionlist = "Select SUM(Population) as SumPop, Region From country GROUP By Region";
            // Execute SQL statement
            ResultSet rset = stmt.executeQuery(regionlist);
            // Extract employee information
            ArrayList<Country> City = new ArrayList<Country>();
            while (rset.next())
            {
                Country city = new Country();
                city.setCtyPopulation(rset.getLong("SumPop"));
                city.setRegion(rset.getString("Region"));
                City.add(city);
            }
            return City;
        } catch (Exception e) {
            System.out.println(e.getMessage());
            System.out.println("Fail to print Country list");
            return null;
        }
    }
    public void printallPopulationRegion(ArrayList<Country> City1)
    {
        //Check null
        if(City1 == null){
            System.out.println("No Population information in Region");
            return;
        }
        // Print header
        // Loop over all employees in the list
        for (Country emp : City1) {
            if (emp == null)
                continue;
            System.out.println("Total Population of "+emp.getRegion()+" Region: "+emp.getCtyPopulation());
        }

    }
    //End

    //Function 27
    public ArrayList<City> allPopulationCountry()
    {
        try
        {
            // Create an SQL statement
            Statement stmt = con.createStatement();
            // Create string for SQL statement
            String regionlist = "Select SUM(Population) as SumPop, CountryCode From city GROUP By CountryCode";
            // Execute SQL statement
            ResultSet rset = stmt.executeQuery(regionlist);
            // Extract employee information
            ArrayList<City> City = new ArrayList<City>();
            while (rset.next())
            {
                City city = new City();
                city.setCtyPopulation(rset.getLong("SumPop"));
                city.setCountry(rset.getString("CountryCode"));
                City.add(city);
            }
            return City;
        } catch (Exception e) {
            System.out.println(e.getMessage());
            System.out.println("Fail to print Country list");
            return null;
        }
    }
    public void printallPopulationCountry(ArrayList<City> City1)
    {
        //Check null
        if(City1 == null){
            System.out.println("No Population information in Country");
            return;
        }
        // Print header
        // Loop over all employees in the list
        for (City emp : City1) {
            if (emp == null)
                continue;
            System.out.println("Total Population of "+emp.getCountry()+" CountryCode: "+emp.getCtyPopulation());
        }

    }
    //End

    //Function 28
    public ArrayList<City> allPopulationDistrict()
    {
        try
        {
            // Create an SQL statement
            Statement stmt = con.createStatement();
            // Create string for SQL statement
            String regionlist = "Select SUM(Population) as SumPop, District From city GROUP By District";
            // Execute SQL statement
            ResultSet rset = stmt.executeQuery(regionlist);
            // Extract employee information
            ArrayList<City> City = new ArrayList<City>();
            while (rset.next())
            {
                City city = new City();
                city.setCtyPopulation(rset.getLong("SumPop"));
                city.setDistrict(rset.getString("District"));
                City.add(city);
            }
            return City;
        } catch (Exception e) {
            System.out.println(e.getMessage());
            System.out.println("Fail to print Country list");
            return null;
        }
    }
    public void printallPopulationDistrict(ArrayList<City> City1)
    {
        //Check null
        if(City1 == null){
            System.out.println("No Population information in District");
            return;
        }
        // Print header
        // Loop over all employees in the list
        for (City emp : City1) {
            if (emp == null)
                continue;
            System.out.println("Total Population of "+emp.getDistrict()+" District: "+emp.getCtyPopulation());
        }

    }
    //End

    //Function 28
    public ArrayList<City> allPopulationCity()
    {
        try
        {
            // Create an SQL statement
            Statement stmt = con.createStatement();
            // Create string for SQL statement
            String regionlist = "Select Population as SumPop, Name From city";
            // Execute SQL statement
            ResultSet rset = stmt.executeQuery(regionlist);
            // Extract employee information
            ArrayList<City> City = new ArrayList<City>();
            while (rset.next())
            {
                City city = new City();
                city.setCtyPopulation(rset.getLong("SumPop"));
                city.setName(rset.getString("Name"));
                City.add(city);
            }
            return City;
        } catch (Exception e) {
            System.out.println(e.getMessage());
            System.out.println("Fail to print Country list");
            return null;
        }
    }
    public void printallPopulationCity(ArrayList<City> City1)
    {
        //Check null
        if(City1 == null){
            System.out.println("No Population information in City");
            return;
        }
        // Print header
        // Loop over all employees in the list
        for (City emp : City1) {
            if (emp == null)
                continue;
            System.out.println("Total Population of "+emp.getName()+" City: "+emp.getCtyPopulation());
        }

    }
    //End
    //function 29
    public ArrayList<Country> livingNonLivngCountry()
    {
        try
        {
            // Create an SQL statement
            Statement stmt = con.createStatement();
            // Create string for SQL statement
            String regionlist = "Select country.Name, sum(country.Population) as SumPop,sum(city.Population) as ctyPop , country.Code from country,city where country.Code = city.CountryCode Group By country.Code";
            // Execute SQL statement
            ResultSet rset = stmt.executeQuery(regionlist);
            // Extract employee information
            ArrayList<Country> City = new ArrayList<Country>();
            while (rset.next())
            {
                Country city = new Country();
                city.setCtyPopulation(rset.getLong("ctyPop"));
                city.setCounPopulation(rset.getLong("SumPop"));
                city.setName(rset.getString("Name"));
                City.add(city);
            }
            return City;
        } catch (Exception e) {
            System.out.println(e.getMessage());
            System.out.println("Fail to print Country list");
            return null;
        }
    }
    public void printallivingNonLivngCountry(ArrayList<Country> City1) {
        //Check null
        if (City1 == null) {
            System.out.println("No Population information in City");
            return;
        }
        // Print header
        System.out.println(String.format("%-30s %-30s %-30s ","Country Name", "Living Population(Percent)","Non Living Population(Percent)" ));
        // Loop over all employees in the list
        for (Country emp : City1) {
            if (emp == null)
                continue;
            BigDecimal perc = new BigDecimal("100");
            BigDecimal city = new BigDecimal(emp.getCtyPopulation());
            BigDecimal citypercentage = city.multiply(perc).divide( new BigDecimal (emp.getCounPopulation()), 2);
            Long total = emp.getCounPopulation() - emp.getCtyPopulation();
            BigDecimal noncitypercentage = new BigDecimal(total).multiply(perc).divide( new BigDecimal (emp.getCounPopulation()),2);
            System.out.format("%-30s %-30s %-25s\n",
                            emp.getName(), emp.getCtyPopulation()+"("+citypercentage+"%)", total+"("+noncitypercentage+"%)");
        }
    }
    //End

    //function 29
    public ArrayList<Country> livingNonLivngRegion()
    {
        try
        {
            // Create an SQL statement
            Statement stmt = con.createStatement();
            // Create string for SQL statement
            String regionlist = "Select country.Region, sum(country.Population) as SumPop,sum(city.Population) as ctyPop from country,city where country.Code = city.CountryCode Group By country.Region";
            // Execute SQL statement
            ResultSet rset = stmt.executeQuery(regionlist);
            // Extract employee information
            ArrayList<Country> City = new ArrayList<Country>();
            while (rset.next())
            {
                Country city = new Country();
                city.setCtyPopulation(rset.getLong("ctyPop"));
                city.setCounPopulation(rset.getLong("SumPop"));
                city.setName(rset.getString("Region"));
                City.add(city);
            }
            return City;
        } catch (Exception e) {
            System.out.println(e.getMessage());
            System.out.println("Fail to print Country list");
            return null;
        }
    }
    public void printallivingNonLivngRegion(ArrayList<Country> City1) {
        //Check null
        if (City1 == null) {
            System.out.println("No Population information in City");
            return;
        }
        // Print header
        System.out.println(String.format("%-30s %-30s %-30s ","Region Name", "Living Population(Percent)","Non Living Population(Percent)" ));
        // Loop over all employees in the list
        for (Country emp : City1) {
            if (emp == null)
                continue;
            BigDecimal perc = new BigDecimal("100");
            BigDecimal city = new BigDecimal(emp.getCtyPopulation());
            BigDecimal citypercentage = city.multiply(perc).divide( new BigDecimal (emp.getCounPopulation()), 2);
            Long total = emp.getCounPopulation() - emp.getCtyPopulation();
            BigDecimal noncitypercentage = new BigDecimal(total).multiply(perc).divide( new BigDecimal (emp.getCounPopulation()),2);
            System.out.format("%-30s %-30s %-25s\n",
                    emp.getName(), emp.getCtyPopulation()+"("+citypercentage+"%)", total+"("+noncitypercentage+"%)");
        }
    }
    //End

    //function29
    public ArrayList<Language> languageWorld()
    {
        try
        {
            // Create an SQL statement
            Statement stmt = con.createStatement();
            // Create string for SQL statement
            double Total = 0.0;
            String regionlist = "Select countrylanguage.Language,countrylanguage.Percentage,countrylanguage.CountryCode,country.Population From country,countrylanguage where countrylanguage.CountryCode = country.Code and Language IN ('Chinese','English','Hindi','Spanish','Arabic')";
            // Execute SQL statement
            ResultSet rset1 = stmt.executeQuery(regionlist);
            // Extract employee information
            ArrayList<Language> City = new ArrayList<Language>();
            ArrayList<Language> finalper = new ArrayList<>();
            while (rset1.next())
            {
                Language city = new Language();
                city.setLanguage(rset1.getString("countrylanguage.Language"));
                city.setPercentage(rset1.getDouble("countrylanguage.Percentage"));
                city.setName(rset1.getString("countrylanguage.CountryCode"));
                city.setPopulation(rset1.getLong("country.Population"));
                City.add(city);
            }
            ArrayList<Language> langarr = new ArrayList<>();
            for (Language lang : City){
                Language language = new Language();
                Total = lang.getPercentage()*lang.getPopulation()/100;
                language.setTotal(Total);
                language.setLanguage(lang.getLanguage());
                langarr.add(language);
                //System.out.println("In "+lang.getName()+" "+Total+" of people are using "+lang.getLanguage()+" Language");

            }
            ArrayList<String> list = new ArrayList<String>();
            list.add("Chinese");
            list.add("English");
            list.add("Hindi");
            list.add("Spanish");
            list.add("Arabic");
            for (String p : list) {
                Language fper = new Language();
                Double percent = 0.0;
                for (Language per : langarr){
                if (per.getLanguage().equals(p)) {
                    percent += per.getTotal();
                    fper.setTotal(percent);
                    fper.setLanguage(p);
                }
                }
                finalper.add(fper);
            }

//            for (Language p : finalper){
//                System.out.println(p.getLanguage()+": "+p.getTotal());
//            }
            return finalper;

        } catch (Exception e) {
            System.out.println(e.getMessage());
            System.out.println("Fail to print Language Percentage list");}
            return null;
    }
    public void printLanguageWorld(ArrayList<Language> languages, ArrayList<Long> totalpopulation)
    {
        //Check null
        if(languages == null){
            System.out.println("No Language information in City");
            return;
        }
        Long allPopWorld = new Long("0");
        // Print header
        // Loop over all employees in the list
        for (Long emp : totalpopulation) {
            if (emp == null)
                continue;
            Long allPop = emp;
            allPopWorld = Long.sum(allPopWorld,allPop);

        }

        // Print header
        // Loop over all employees in the list

        for (Language emp : languages) {
            if (emp == null)
                continue;
                Double Total= emp.getTotal();
                Double hundread = 100.0;
                Double Percentage = Total*hundread/allPopWorld;
                BigInteger P= new BigInteger(String.valueOf(Double.valueOf(Percentage)));
                System.out.println(emp.getLanguage()+": "+Percentage);

        }

    }

    //end
}


