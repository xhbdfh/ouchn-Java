/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package p42;

/**
 *
 * @author liyue
 */
public class MultiTable {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        for(int i=1;i<=9;i++){
            for(int j=1;j<=9;j++){
                if(j>i)
                    break;
                System.out.print("   "+i+" * "+j+" =" +i*j);
                }
            System.out.println();
            }
        }
    }
    
