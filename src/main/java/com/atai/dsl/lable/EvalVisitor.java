package com.atai.dsl.lable;

import java.util.HashMap;
import java.util.Map;

public class EvalVisitor extends LabeledExprBaseVisitor<Integer> {

    Map<String,Integer> memory = new HashMap<String,Integer>();


}
