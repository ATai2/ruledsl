package com.atai.dsl.gen;

public class ShortToUnicodeString extends HelloBaseListener{
    @Override
    public void enterInit(HelloParser.InitContext ctx) {
        System.out.println("\"");
    }

    @Override
    public void exitInit(HelloParser.InitContext ctx) {
        System.out.println("\"");
    }

    @Override
    public void enterValue(HelloParser.ValueContext ctx) {
        int i = Integer.parseInt(ctx.INT().getText());
        System.out.printf("\\u%04x",i);
    }
}
