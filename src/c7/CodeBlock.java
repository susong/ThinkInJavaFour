package c7;

/**
 * Created by SuSong on 2014/12/27 0027.
 */

class Code {
    {
        System.out.println("Code {}");
    }

    static {
        System.out.println("Code static {}");
    }

    Code() {
        {
            System.out.println("Code constructor {}");
        }


    }
}


public class CodeBlock extends Code {

    {
        System.out.println("CodeBlock {}");
    }

    static {
        System.out.println("CodeBlock static {}");
    }


    public CodeBlock() {
        {
            System.out.println("CodeBlock constructor {}");
        }
    }

    public static void main(String[] args) {
        {
            System.out.println("CodeBlock main {}");
        }
        new CodeBlock();
    }
}
