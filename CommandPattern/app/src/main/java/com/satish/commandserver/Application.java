package com.satish.commandserver;
import java.io.*;
import java.net.*;

public class Application {
    public static void main(String[] args) throws Exception{
        System.out.println("Server Signing ON");
        ServerSocket ss  = new ServerSocket(9095);
        Socket soc = ss.accept();
        PrintWriter nos = new PrintWriter(
                              new BufferedWriter(
                                  new OutputStreamWriter(
                                          soc.getOutputStream()
                                  )
                              )
        ,true);

        BufferedReader nis = new BufferedReader(
                                 new InputStreamReader(
                                     soc.getInputStream()
                                 )
        );

        String str = nis.readLine();
        while(!str.equals("End")){
            System.out.println("Server received "+ str);
            try{
               Class c = Class.forName("com.satish.commandserver."+str);
               IAction a = (IAction) c.newInstance();
               a.execute(nos);   
            }catch(ClassNotFoundException | 
                   InstantiationException | 
                   IllegalAccessException e)
            {
                DefaultAction b = new DefaultAction();
                b.execute(nos);
            }

            str = nis.readLine();
        }
        nos.println("End");
        System.out.println("Server Signing OFF");   
    }
}
