/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package p41;

/**
 *
 * @author liyue
 */
public class BreakTester {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String output = "";
        int i;
        for(i=1;i<=10;i++){
            if(i==5)
                break;//break loop only if count ==5
            output+=i+" ";
        }
        output +="\nBroke out of loop at i="+i;
        System.out.println(output);
    }
    
}
