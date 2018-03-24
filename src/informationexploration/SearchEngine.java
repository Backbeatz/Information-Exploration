/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package informationexploration;

import java.util.List;
import java.util.Map;

/**
 * The search engine, each version of search will call this method 
 * @author Connor
 */




public class SearchEngine {
    // These are our  
    
    //What we seatch for
    String Prize;
    String Name;
    String LongName;
    String Gender;
    String Country;
    String BYear;
    String DYear;
    String Affil;
    
      /**
      * Creates Search object, our search engine.
      * All our words should be in lower case
      * @param DB
      */
    public static void SearchEngine( Map<String,List<Entry>> DB) {
        //Take our  usible copy of our database object
         Map<String,List<Entry>> DataBase = DB;
         
          
              
    }  
    /**
     * executes our search
     * @param DB
     */
    public void SearchExicute(Map<String,List<Entry>> DB){
        //list of objects 
        Map<String,List<Entry>> DataBase = DB;
        
        //Check if search area is null 
        if(Prize == null){
        //don't search here 
        }else{
            //exicute search in specified field
           if(DataBase.containsKey(Prize)){
           //use get then check 
           
           } 
           else {
            }
        }
        
        //Check if search area is null 
        if(Name == null){
        //don't search here 
        }else{
         //exicute search in specified field   
        }
        
    }
    /**
     * Sets our search parameters 
     * @param W
     */
    public void InputBasic(String W){
    if(!W.isEmpty()){
        String Word = W.toLowerCase();
        Prize = Word;
        Name = Word;
        LongName = Word;
        Gender = Word;
        Country = Word;
        BYear = Word;
        DYear = Word;
        Affil = Word;  
    }
    else{
        Prize = null;
        Name = null;
        LongName = null;
        Gender = null;
        Country = null;
        BYear = null;
        DYear = null;
        Affil = null;
        }
        
    
        
    }
    /**
     * Sets our Advanced input
     * Sets our search values to be lowercase
     * @param Pr     
     * @param N     
     * @param LN     
     * @param Gen     
     * @param Cou     
     * @param BY     
     * @param DY     
     * @param Af     
     */
    public void InputAdvanced(String Pr, String N, String LN, String Gen, String Cou, String BY, String DY, String Af){
        
        //Check our if we had nothing inside
        if(!Pr.isEmpty()){
            String WordPR = Pr.toLowerCase();
            Prize = WordPR;
        }
        else{
            Prize = null;
        }
        if(!N.isEmpty()){
           String WordSN = N.toLowerCase(); 
           Name = WordSN; 
        }
        else{
            Name = null;   
        }
        if(!LN.isEmpty()){
           String WordLN = LN.toLowerCase(); 
           LongName = WordLN; 
        }
        else{
            LongName = null;    
        }
        if(!Gen.isEmpty()){
            String WordGE = Gen.toLowerCase();
            Gender = WordGE;
        }
        else{
            Gender = null;    
        }
        if(!Cou.isEmpty()){
            String WordCO = Cou.toLowerCase();
            Country = WordCO;
        }
        else{
            Country = null;   
        }
        if(!BY.isEmpty()){
            String WordBY = BY.toLowerCase();
            BYear = WordBY;
        }
        else{
            BYear = null;    
        }
        if(!DY.isEmpty()){
            String WordDY = DY.toLowerCase();
            DYear = WordDY;
        }
        else{
            DYear = null;    
        }
        if(!Af.isEmpty()){
            String WordAF = Af.toLowerCase();
            Affil = WordAF;
        }
        else{
            Affil = null;  
        }
       
        //Assign our search words 
   
        
    }
    
    
    /*
    for (String key : map.keySet()) {
    // ...
    }
    for (Object value : map.values()) {
    // ...
    }
    both
    for (Map.Entry<String, Object> entry : map.entrySet()) {
    String key = entry.getKey();
    Object value = entry.getValue();
    // ...
    }
    */



    // our search will have criteria to it  
            
    //need a check for each mode
        
    
    //Our basic serch will just be a search with all the critera allowed
    
} 

//Need to check if it's in the DB
//Need to return all 
