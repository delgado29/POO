import java.util.Scanner;

public class Metodos {
    public static void main(String[] args){
        Scanner scanner= new Scanner(System.in);
        System.out.println("Introdusca base:");
        int z=scanner.nextInt();
        Scanner scanner2= new Scanner(System.in);
        System.out.println("Introdusca altura:");
        int w=scanner2.nextInt();
        checar(z, w);
        int f=cachar( z, w);
        System.out.println("Y su area es de: "+f+"u.");

    }
    //Recibe y no regresa
    public static void checar(int x, int y){
        if(x==y){
            System.out.println("Su figura es un cuadrado.");
        }else
        if(x<y){
            System.out.println("Su figura es un rectangulo.");
        }else
        if(x>y){
            System.out.println("Su figura es un rectangulo.");
        }

    }
    //Recibe y regresa
     public static int cachar(int x, int y){
        int ret=x*y;
        return ret;
     }
     public static boolean error(){
        return true;
     }
     public static void no(){
        //se
     }





}