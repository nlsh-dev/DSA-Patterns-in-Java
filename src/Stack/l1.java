package Stack;

import java.util.Stack;

public class l1 {


    public static void main(String[] args) {

        Stack<Character> st = new Stack<>();
        String s = "hello";

        for(int i = 0 ; i<s.length(); i++){


            st.push(s.charAt(i));    //

        }

        String revesed = "" ;



        while(!st.isEmpty()){
            revesed = revesed+st.pop();

        }
        System.out.println(revesed);
    }





}
