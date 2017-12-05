import java.util.*;
import java.lang.*;

public class Group
{
    ArrayList<Person> groupList;
    private Person oldest;
    ArrayList<Person> adultList;
    ArrayList<Person> oldestList;
    ArrayList<Person> youngestList;
    
    public Group()
    {
        groupList = new ArrayList<Person>();
        adultList = new ArrayList<Person>();
        oldestList = new ArrayList<Person>();
        youngestList = new ArrayList<Person>();
    }
    
    public void printResult()
    {
        System.out.println("Oldest Person : " + getOldestName() + ", Age " + getOldestAge());
        System.out.println("Total Age : " + totalAge() + "  Mean average: "+ averageAge() + "    Standard Deviation : " + groupSD());
    }
    
    public void fillAdultList()
    {
        for (Person p: groupList){
            if(p.getAge()>17){
                adultList.add(p);
            }
        }
    }
    
    public void fillOldestList()
    {
        Person start = new Person("invalid", 0);
        oldest = start;
        for (Person o: groupList){
            if(oldest.getAge()<o.getAge()){
                oldest=o;
            }
        }
        for (Person r: groupList){
            if(oldest.getAge()==r.getAge()){
                oldestList.add(r);
            }
        }        
    }
    
    public void fillYoungestList()
    {
        Person start = new Person("invalid", 0);
        oldest = start;
        for (Person o: groupList){
            if(oldest.getAge()<o.getAge()){
                oldest=o;
            }
        }   
        for (Person u: groupList){
            if(u.getAge()<oldest.getAge()){
                youngestList.add(u);
            }
        }          
    }
    
    public void addPerson(Person x)
    {
        groupList.add(x);
    }
    
    public int getGroupSize()
    {
        return groupList.size();
    }
    
    public Person getOldestPerson()
    {
        Person start = new Person("invalid", 0);
        oldest = start;
        for (Person i: groupList){
            if(oldest.getAge()<i.getAge()){
                oldest = i;
            }
        }
        return oldest;
    }
    
    public int getOldestAge(){
        getOldestPerson();
        return oldest.getAge();
    }
    
    public String getOldestName(){
        getOldestPerson();
        return oldest.getName();
    }    
    
    public int totalAge(){
        int total = 0;
        for (Person j: groupList){
            total += j.getAge();
        }
        return total;
    }
    
    public double averageAge(){
        double average = 0;
        double sum = 0;
        double size = 0;
        sum = this.totalAge();
        size = this.getGroupSize();
        average = sum/size;
        return average;
    }
    
    public double groupSD(){
        double n = getGroupSize();
        double subtotal = 0;
        for (Person k: groupList){
            subtotal += (k.getAge() - averageAge())*(k.getAge() - averageAge());
        }
        double sd = subtotal/n;
        sd = Math.sqrt(sd);
        return sd;
    }
    

}
