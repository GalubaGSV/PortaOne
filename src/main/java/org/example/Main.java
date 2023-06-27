package org.example;

public class Main {
    public static void main(String[] args) {
        String str = "The Tao gave birth to machine language.  Machine language gave birth\n"
                + "to the assembler.\n"
                + "The assembler gave birth to the compiler.  Now there are ten thousand\n"
                + "languages.\n"
                + "Each language has its purpose, however humble.  Each language\n"
                + "expresses the Yin and Yang of software.  Each language has its place within\n"
                + "the Tao.\n"
                + "But do not program in COBOL if you can avoid it.\n"
                + "        -- Geoffrey James, \"The Tao of Programming\"";

        StringHandler stringHandler = new StringHandler();
        System.out.println(stringHandler.findMagicSymbol(str));
    }
}