package com.satish.commandserver;
import java.io.PrintWriter;

public class DefaultAction implements IAction{
    @Override
    public void execute(PrintWriter out){
       out.println("This is DefaultAction");
    }  
}
