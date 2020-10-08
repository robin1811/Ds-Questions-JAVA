import java.util.*;
class subSequence{ 
    public static void subSequence(String ques, String ans){
        if(ques.length()==0){
            System.out.println(ans);
            return;
        }
        char ch = ques.charAt(0);
        subSequence(ques.substring(1),ans+ch);
        subSequence(ques.substring(1),ans);
    }
    public static void main(String[] args){
        subSequence("abc","");
    }
}