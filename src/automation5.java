/*через if/else
дни недели от 1 до 7*/

import java.util.Scanner;

public class automation5 {
    public static void main (String args[]){
        Scanner in = new Scanner(System.in);
        int i = in.nextInt();
            if(i==1){
                System.out.println(i + "-ый день недели - понедельник");
            }
        else if(i==2){
                System.out.println(i + "-ой день недели - вторник");
            }
        else if(i==3){
                System.out.println(i + "-ий день недели - среда");
            }
        else if(i==4){
                System.out.println(i + "-ый день недели - четверг");
            }
        else if(i==5){
                System.out.println(i + "-ый день недели - пятница");
            }
        else if(i==6){
                System.out.println(i + "-ой день недели - суббота");
            }
        else if(i==7){
                System.out.println(i + "-ой день недели - воскресенье");
            }else System.out.println("Такого индекса у недели нету");
        }
    }
