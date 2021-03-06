package com.atai.dsl.code;


import com.atai.dsl.gen.HelloLexer;
import com.atai.dsl.gen.HelloParser;
import com.atai.dsl.gen.ShortToUnicodeString;
import org.antlr.v4.runtime.ANTLRInputStream;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.tree.ParseTreeWalker;

import java.io.FileInputStream;
import java.io.IOException;

public class Test {
    public static void main(String[] args) {
//        init();
//        translateInt2Unicode();
        expression();
    }

    private static void expression() {
//        try {
//            String inputFile = null;
//            ANTLRInputStream input = new ANTLRInputStream(new FileInputStream(inputFile));
        String str = "2*3\n";
//        String str = "1+34*8-5/2";
        try {
            ANTLRInputStream inputStream = new ANTLRInputStream(str.toCharArray(), str.length());
            HelloLexer lexer = new HelloLexer(inputStream);
            CommonTokenStream tokenStream = new CommonTokenStream(lexer);
            HelloParser parser = new HelloParser(tokenStream);
            ParseTree tree = parser.prog();
            System.out.println(tree.toStringTree());
        } catch (Exception e) {
            e.printStackTrace();
        }
    }


    /**
     * 2. 简单转换
     */
    private static void translateInt2Unicode() {
        String str = "{1,56,4}";
        try {
            ANTLRInputStream inputStream = new ANTLRInputStream(str.toCharArray(), str.length());

            HelloLexer lexer = new HelloLexer(inputStream);
            CommonTokenStream tokenStream = new CommonTokenStream(lexer);
            HelloParser parser = new HelloParser(tokenStream);
            ParseTree tree = parser.init();
            System.out.println(tree.toStringTree(parser));

            ParseTreeWalker walker = new ParseTreeWalker();
            walker.walk(new ShortToUnicodeString(), tree);
            System.out.println();
        } catch (Exception e) {
            e.printStackTrace();
        }

    }

    /**
     * 启动
     */
    private static void init() {
        String str = "{1,{2,3},4}";
        try {
            ANTLRInputStream inputStream = new ANTLRInputStream(str.toCharArray(), str.length());

            HelloLexer lexer = new HelloLexer(inputStream);
            CommonTokenStream tokenStream = new CommonTokenStream(lexer);
            HelloParser parser = new HelloParser(tokenStream);
            ParseTree initContext = parser.init();
            System.out.println(initContext.toStringTree(parser));

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
