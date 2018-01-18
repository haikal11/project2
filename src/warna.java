import java.util.Scanner;
public class warna 
{
    public static void main(String args[])
{
    Scanner input=new Scanner(System.in);
    
    System.out.print("masukkan nama anda:");
    String nama=input.next();
    
    System.out.print("masukkan jantina:");
    String jantina=input.next();
    
    System.out.print("pilih warna kegemaran:");
    String war_keg=input.next();
    
   switch(war_keg)
   {
       case "merah":
       String ulasan="kekuatan";
       break;
       case "biru":
       System.out.print("ketenangan");
       break;
       case "kuning":
       System.out.print("kegembiraan");
       break;
       case "hijau":
       System.out.print("kehidupan");
   }
    
   {System.out.print(nama+"\n"+jantina+"\n"+war_keg+"\n");}
    
}
    
}
