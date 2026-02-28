

import java.util.Scanner;

public class sequence {
    public static void main(String args[])
    {

        Scanner sc=new Scanner(System.in);

        String str=sc.nextLine();

        printSequence(str,new StringBuilder(),0);
    }
    static void printSequence(String str,StringBuilder sb,int idx)
    {
     
        if(idx==str.length())
        {
            System.out.println(sb.toString());
            return;
        }

            sb.append(str.charAt(idx));
        printSequence(str,sb,idx+1);
        sb.deleteCharAt(sb.length()-1);
        printSequence(str,sb,idx+1);
    }


}
