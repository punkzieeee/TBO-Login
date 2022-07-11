/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package netbeans.projekakhirtbo;
import java.util.*;


public class PassGen {
    private Random rnd = new Random();
    private int length;
    private String pass = "";
    
    public PassGen(int length) {
        this.length = length;
    }
    
    private String match(String c){
        char[] ch = {(char)(rnd.nextInt(26)+'a'), (char)(rnd.nextInt(26)+'A'), (char)(rnd.nextInt(10)+'0')};
        if(c.matches("[a-z"))
            return "" + ch[0];
        else if(c.matches("[A-Z"))
            return "" + ch[1];
        else
            return "" + ch[2];
    }
    
    public String generator(int length){
        for(int i = 0; i < length; i++){
            String c = "" + (char)(rnd.nextInt());
            char[] ch = {(char)(rnd.nextInt(26)+'a'), (char)(rnd.nextInt(26)+'A'), (char)(rnd.nextInt(10)+'0')};
            int in = rnd.nextInt(3);
            pass += c.matches("[a-zA-Z0-9]") ? match(c) : ch[in];
        }
        return pass;
    } 
}