/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pack;

import java.util.Arrays;
import java.util.List;

/**
 *
 * @author centricgateway
 */
public class Questiion2 {
    
       
    public static void returnLowest(Integer []array){
    
        int highest=0;
        
        int start=1;
        
        int result=0;
        
        String status="not found";
        
        List list = Arrays.asList(array);
             
        for(int num:array){
          if(num>highest){
              highest=num;
          }
        } 
        
        for(int count=0;count<array.length;count++){
           if(list.contains(start)){
               start++;              
           }else{
              result=start;
                System.out.println("the positive value is..."+result) ;
                status="found";
           }
                               
        }
        
        if(status.equals("not found")){           
            int a=++highest;
             result=a;
             System.out.println("The positive number is... "+result);

        }
 
    }
    
public static void main(String[] args) {
        Integer [] arr={1,3,6,4,1,2};
       Questiion2.returnLowest(arr);
    }
    
   
}
