/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package maincart;
import java.util.*;
import java.io.*;
/**
 *
 * @author Baraa Arda
 */
public class ShopCart {
     int count;
     int totVal;
      ArrayList<book> list;
     public ShopCart(){
         count=0;
         totVal=0;
          list = new ArrayList<book>();
     }
     public void addbook(String name,int price,int unit){
         book newbook = new book();
         newbook.name=name;
         newbook.uPrice=price;
          newbook.unit=unit;
          
          list.add(newbook);
          
          count++;
          
          totVal=totVal+ newbook.uPrice;
         
     }
    
}
class book{
     String name; 
     int uPrice;
     int unit;
     public book(){
         unit=0;
     }
     
    
}

