package com.satish.commandserver;
import java.io.PrintWriter;

public class Action2 implements IAction{
    @Override
    public void execute(PrintWriter out){
       out.println("This is Action2");
    }  
}
