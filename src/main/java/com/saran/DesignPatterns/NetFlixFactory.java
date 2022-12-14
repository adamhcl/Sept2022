package com.saran.DesignPatterns;
import java.util.Scanner;

//Netflix Provider

//Factory Design Pattern comes under creational design pattern
/*
* Use case scenario
* lets say netflix provider
* StandardPlan(50 channels,SilverPlan(100 channels and Gold Plan(500 all the channels)
*/

abstract class Plan{
    protected double rate;
    abstract void getRate();
    
    public void calculate(int units) {
        System.out.println(units*rate);
    }
}

class StandardPlan extends Plan{
//100 movies can be viewed
    @Override
    void getRate() {
         rate=50;        
    }    
}

class SilverPlan extends Plan{
//300 movies can be viewed
    @Override
    void getRate() {
         rate=100;        
    }    
}

class GoldPlan extends Plan{
    //watch all  movies
        @Override
        void getRate() {
             rate=200;            
        }        
    }

//Hiding the Standard,Silver and Gold object inside the netflixfactory



public class NetFlixFactory {
    
    
    public Plan getPan(String planType) {
        if(planType == null) {
            return null;
        }
        else if(planType.equalsIgnoreCase("StandardPlan")){
            return new StandardPlan();
        }
        else if(planType.equals("SilverPlan")){
            return new SilverPlan();
        }
        else if(planType.equals("GoldPlan")){
            return new GoldPlan();
        }
        return null;
        
    }
    
    
    }
class Test{
    
    public static void main(String[] args) {
        
        NetFlixFactory planFactory=new NetFlixFactory();
        System.out.println("enter the name of the plan");
        Scanner sc=new Scanner(System.in);
        String planName=sc.next();
        System.out.println("enter the no units to be calculated");
        
        int units=Integer.parseInt(sc.next());
        Plan p=planFactory.getPan(planName);
        
        
        System.out.println("The price amount is "+planName+"of"+units);
        p.getRate();p.calculate(units);
        
        
        
    }
}
