/*через switch
дни недели от 1 до 7*/

import java.util.Scanner;

public class automation6 {
    public static void main (String args[]){
        Scanner in = new Scanner(System.in);
        int i = in.nextInt();
        switch (i) {
            case 1:
            System.out.println(i + "-ый день недели - понедельник");
            break;
            case 2:
                System.out.println(i + "-ой день недели - вторник");
                break;
            case 3:
                System.out.println(i + "-ий день недели - среда");
                break;
            case 4:
                System.out.println(i + "-ый день недели - четверг");
                break;
            case 5:
                System.out.println(i + "-ый день недели - пятница");
                break;
            case 6:
                System.out.println(i + "-ой день недели - суббота");
                break;
            case 7:
                System.out.println(i + "-ой день недели - воскресенье");
                break;
            default:
                System.out.println("Такого индекса у недели нету");
        }
    }
}