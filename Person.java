import java.util.*;

public class Person
{
    private String personName;
    private int personAge;

    public Person(String name, int age)
    {
        personName = name;
        personAge = age;
    }

    public String getName()
    {
        return personName;
    }
    
    public int getAge()
    {
        return personAge;
    }
    
    public String toString()
    {
        return "Name: " + personName + "    Age:" + personAge;
    }
}

