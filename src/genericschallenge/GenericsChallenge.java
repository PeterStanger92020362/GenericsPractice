/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package genericschallenge;

import java.util.ArrayList;
/**
 *
 * @author Peter
 */
public class GenericsChallenge {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        ArrayList duplicatedList = new ArrayList();
        duplicatedList.add(10);
        duplicatedList.add(10);
        duplicatedList.add(11);
        duplicatedList.add(12);
        duplicatedList.add(13);
        duplicatedList.add(13);
        duplicatedList.add(14);
        duplicatedList.add(17);
        duplicatedList.add(17);
        duplicatedList.add(18);
        
        System.out.println(duplicatedList);
        
        System.out.println( removeDuplicates( duplicatedList ) );

        
    }
    
    
    
    public static <E extends Comparable<E>> ArrayList<E> removeDuplicates( ArrayList<E> list ){
        
        ArrayList<E> noDuplicates = new ArrayList<>();
        
        noDuplicates.add(list.get(0));  // get first element of list to start off with
        
        boolean foundDuplicate = false;
        if(list.size()==0){
            return list;
        }
        
        
        for (int i = 1; i< list.size(); i++){
            for (int j=0; j< noDuplicates.size(); j++){
                if( list.get(i).compareTo(noDuplicates.get(j)) == 0 ){
                    foundDuplicate = true;
                    break;
                }
            }
            if(foundDuplicate != true){
                noDuplicates.add(list.get(i));
            }
            foundDuplicate = false;
            
        };
        
        /*  Removes any values that are duplicated 
        
        var count = 0;
        
        for(var i = 0; i < list.size(); i++){
            E checkingValue = list.get(i);
            for(E each : list){
                if ( each == checkingValue ){
                    count++;
                };
            }
            if(count < 2 ){
                noDuplicates.add(list.get(i));
            }
            count = 0;
        };
        
        */

        
        return noDuplicates;
    };
    
}
