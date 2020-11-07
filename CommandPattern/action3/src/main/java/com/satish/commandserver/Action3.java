package com.satish.commandserver;
import java.io.PrintWriter;

public class Action3 implements IAction{
    @Override
    public void execute(PrintWriter out){
       out.println("This is Action3");
    }  
}
