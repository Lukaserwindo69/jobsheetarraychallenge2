/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package challenge02;

/**
 *
 * @author KANG_SNAKE
 */
public class Challenge02 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
               int nilai [] = new int [3];
        nilai [0] = 78;
        nilai [1] = 89;
        nilai [2] = 90;
        nilai [3] = 100;
        nilai [4] = 95;
        double ratarata;
        
        ratarata = (nilai[0] + nilai[1] + nilai[2] + nilai[3] + nilai[4])/5;
        
        
        if (ratarata <= 69) { 
             System.out.println("Nilai rata rata :" + ratarata);
        System.out.println("--kurang--");
        System.out.println("--anda harus belajar--");
        
    }    else if (ratarata >= 69) {
         System.out.println("Nilai rata rata :" + ratarata);
        System.out.println("--cukup--");
        System.out.println("--dipertahankan--");
                
    }
     
}
    }
    

