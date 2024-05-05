package com.java8.lambda;

import java.util.ArrayList;
import java.util.List;

public class StreamApiWithLambda {
   static ArrayList<String> places= new ArrayList<>();
   public  static List getPlace(){
       places.add("India, Uttar Pradesh");
       places.add("Nepal, Kathmandu");
       places.add("Nepal, Pokhara");
       places.add("India, Delhi");
       places.add("USA, New York");
       places.add("Africa, Nigeria");
       places.add("India, Andhra Pradesh");
       return  places;
   }
    public static void main(String[] args) {
        List<String>myPlaces= getPlace();

        myPlaces.stream().filter(i->i.startsWith("India"))
                .map(j->j.toUpperCase())
                .sorted()
                .forEach(System.out::println);
    }
}
/*
INDIA, ANDHRA PRADESH
INDIA, DELHI
INDIA, UTTAR PRADESH
 */
