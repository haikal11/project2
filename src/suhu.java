import java.util.Scanner;
public class suhu 
{
    public static void main(String args[])
{
    Scanner input=new Scanner(System.in);
    
    System.out.print("Masukkan suhu badan pesakit:");
    Double suhu=input.nextDouble();
 
    {System.out.println("Anda mungkin "+suhu);}
    
    if (suhu >=37)
    {System. out.print("menghidapi DEMAM PANAS");}
    
    else
    {System.out.print("TIDAK DEMAM");}
    
    
}

}
