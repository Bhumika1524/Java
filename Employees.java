import java.io.*;
class Employees{
    InputStreamReader n = new InputStreamReader(System.in);
    BufferedReader br=new BufferedReader(n);
    void input()throws IOException{
    System.out.println("Enter your year of joining");
    int y=Integer.parseInt(br.readLine());
    System.out.println("Enter your Name");
    String name=br.readLine();
    System.out.println("Enter your addresses");
    String adr=br.readLine();
    }
    public static void main(String[] args)throws IOException{
    Employees emp=new Employees();
    int num = 3;
    for(int i =1; i <= num; i++){
        emp.input();
    }
    }
}
