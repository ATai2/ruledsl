package com.atai.dsl.code;


import com.atai.dsl.lable.EvalVisitor;
import com.atai.dsl.lable.LabeledExprLexer;
import com.atai.dsl.lable.LabeledExprParser;
import org.antlr.v4.runtime.ANTLRInputStream;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;

public class Calc {
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
            LabeledExprLexer lexer = new LabeledExprLexer(inputStream);
            CommonTokenStream tokenStream = new CommonTokenStream(lexer);
            LabeledExprParser parser = new LabeledExprParser(tokenStream);
            ParseTree tree = parser.prog();
            EvalVisitor visitor = new EvalVisitor();
            System.out.println(tree.toStringTree());
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
