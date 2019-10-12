/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Furkan
 */
public class StringUtils {
    public static boolean included(String word, String searched){
        boolean x;
        if(word.toLowerCase().contains(searched.trim().toLowerCase()) || word.contains(searched.toUpperCase()))
            x=true;
        else
            x=false;
        return x;
    }
}
