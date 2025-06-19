package org.string;

public class NumberTriangle {
    public static void main(String agrs[]){
        int n=7;
        for(int i=1;i<=n;i++){
            for (int j=n;j>i;j--){
                System.out.print(" ");
            }
            for (int k=1;k<i;k++) {
                System.out.print(" "+k);
            }
            System.out.println("");
        }
    }
}
