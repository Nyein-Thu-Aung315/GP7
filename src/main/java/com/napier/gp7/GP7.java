package com.napier.gp7;
//import sql Package
import java.sql.*;
import java.util.ArrayList;

public class GP7
{
    public static void main(String[] args)
    {
        // Create new Application
        GP7 a = new GP7();

        // Connect to database
        a.connect();

        //Print The list of Country Order by DESC
        ArrayList<Country> country = a.CountryDESC();
        a.printCountryDEST(country);

        //Print the list of country order by DESC that exist in a Asia
        System.out.println("\n");
        System.out.println("Country list in Asia order by largest population to smallest");
        ArrayList<Country> continent = a.continent_countryDESC();
        a.prin_countrylist_continent(continent);

        //Print the list of country order by DESC that exist in a SouthEast Asia Region
        System.out.println("\n");
        System.out.println("Country list in SouthEast Asia order by largest population to smallest");
        ArrayList<Country> clist_region = a.Regoin_CountryDESC();
        a.prin_countrylist_region(clist_region);

        //Print Top 10 populated countries in the world
        System.out.println("\n");
        System.out.println("Top 10 Populated countries in the world");
        ArrayList<Country> popcnty_world = a.mostpopcnty_world();
        a.prin_countrylist_region(popcnty_world);

        //Print Top 10 populated countries in Europe
        System.out.println("\n");
        System.out.println("Top 10 Populated countries in Europe");
        ArrayList<Country> popcnty_continent = a.mostpopcnty_continent();
        a.prin_countrylist_continent(popcnty_continent);

        //Print the list of cities order by DESC that exist in a SouthEast Asia Region
        System.out.println("\n");
        System.out.println("Top 10 Populated countries in North America Region");
        ArrayList<Country> popcity = a.popcity_world();
        a.print_popcity_world(popcity);


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
    public void connect()
    {
        try
        {
            // Load Database driver
            Class.forName("com.mysql.jdbc.Driver");
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
                con = DriverManager.getConnection("jdbc:mysql://db:3306/world?useSSL=false", "root", "example");
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
                cntry.code = rset.getString("Code");
                cntry.continent = rset.getString("Continent");
                cntry.name = rset.getString("Name");
                cntry.region = rset.getString("Region");
                cntry.population = rset.getInt("Population");
                cntry.capital = rset.getInt("Capital");
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
                            emp.population, emp.code, emp.name, emp.continent, emp.region, emp.capital);
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
                cont.code = rset.getString("Code");
                cont.continent = rset.getString("Continent");
                cont.name = rset.getString("Name");
                cont.region = rset.getString("Region");
                cont.population = rset.getInt("Population");
                cont.capital = rset.getInt("Capital");
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
                            emp.population, emp.code, emp.name, emp.continent, emp.region, emp.capital);
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
                cntry.code = rset.getString("Code");
                cntry.continent = rset.getString("Continent");
                cntry.name = rset.getString("Name");
                cntry.region = rset.getString("Region");
                cntry.population = rset.getInt("Population");
                cntry.capital = rset.getInt("Capital");
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
                            emp.population, emp.code, emp.name, emp.continent, emp.region, emp.capital);
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
                cntry.code = rset.getString("Code");
                cntry.continent = rset.getString("Continent");
                cntry.name = rset.getString("Name");
                cntry.region = rset.getString("Region");
                cntry.population = rset.getInt("Population");
                cntry.capital = rset.getInt("Capital");
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
                            emp.population, emp.code, emp.name, emp.continent, emp.region, emp.capital);
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
                cntry.code = rset.getString("Code");
                cntry.continent = rset.getString("Continent");
                cntry.name = rset.getString("Name");
                cntry.region = rset.getString("Region");
                cntry.population = rset.getInt("Population");
                cntry.capital = rset.getInt("Capital");
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
                            emp.population, emp.code, emp.name, emp.continent, emp.region, emp.capital);
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
                cntry.code = rset.getString("Code");
                cntry.continent = rset.getString("Continent");
                cntry.name = rset.getString("Name");
                cntry.region = rset.getString("Region");
                cntry.population = rset.getInt("Population");
                cntry.capital = rset.getInt("Capital");
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
                            emp.population, emp.code, emp.name, emp.continent, emp.region, emp.capital);
            System.out.println(emp_string);
        }
    }
    //End

}