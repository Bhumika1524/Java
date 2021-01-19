
import java.io.*;

class Employees{
    int y;
    String name, adr;
    InputStreamReader n = new InputStreamReader(System.in);
    BufferedReader br=new BufferedReader(n);
    void input()throws IOException{
    System.out.println("Enter your year of joining");
    y=Integer.parseInt(br.readLine());
    System.out.println("Enter your Name");
    name=br.readLine();
    System.out.println("Enter your addresses");
    adr=br.readLine();
    }
    public static void main(String[] args)
    throws IOException
    {
    Employees emp=new Employees();
    emp.input();
    }
}

