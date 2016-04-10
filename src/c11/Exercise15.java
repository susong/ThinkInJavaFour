package c11;

import java.util.Stack;

/**
 * Created by SuSong on 2015-01-12 21:01.
 */
public class Exercise15 {
    public static void main(String[] args) {
        Stack<Character> stack = new Stack<>();
        String str = "+U+n+c---+e+r+t---+a-+i-+n+t+y---+ -+r+u--+l+e+s---";
        char[] chars = str.toCharArray();
        for(int i=0;i<chars.length;){
            switch (chars[i++]){
                case '+':
                    stack.push(chars[i++]);
                    break;
                case '-':
                    System.out.print(stack.pop());
                    break;
            }
        }


    }
}
