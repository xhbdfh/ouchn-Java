/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package p43;

/**
 *
 * @author liyue
 */
public class ContinueTest {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String output = "";
        int i;
        for(i=1;i<=10;i++){
            if(i==5)
                continue;//skip remaining code in this loop
            output+=i+" ";
        }
        output+="\nUsing continue to skip printing 5";
        output+="\ni = "+i;
        System.out.println(output);
    }
    
}
