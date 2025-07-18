package org.string;

public class Reverseeachword {
    public static void main(String args[]){
        String s="binoy ravi";
        String[] words=s.split(" ");
        for(String word:words){
            String rev="";
            for(int i=word.length()-1;i>=0;i--){
                rev=rev+word.charAt(i);
            }
            System.out.print(rev+" ");
        }
    }
}
