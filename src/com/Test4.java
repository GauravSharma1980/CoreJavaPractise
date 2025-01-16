package com;

import java.util.ArrayList;
import java.util.List;

public class Test4 {
     public static void main(String[] args) {
         List<StringBuilder> dryFruits = new ArrayList<>();
         dryFruits.add(new StringBuilder("Walnut"));
         dryFruits.add(new StringBuilder("Apricot"));
         dryFruits.add(new StringBuilder("Almond"));
         dryFruits.add(new StringBuilder("Date"));
 
         for(int i = 0; i < dryFruits.size(); i++) 
         {
             if(i == 0) {
                 dryFruits.remove(new StringBuilder("Almond"));
             }
          }
 
         System.out.println(dryFruits);

         List<String> dryFruits1 = new ArrayList<>();
         dryFruits1.add(new String("Walnut"));
         dryFruits1.add(new String("Apricot"));
         dryFruits1.add(new String("Almond"));
         dryFruits1.add(new String("Date"));

         for(int i = 0; i < dryFruits1.size(); i++)
         {
             if(i == 0) {
                 dryFruits1.remove(new String("Almond"));
             }
         }

         System.out.println(dryFruits1);
     }
}