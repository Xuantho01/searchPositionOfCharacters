import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;

import java.util.Scanner;
public class searchPositionOfCharacters {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String str = new String();
        System.out.println("Enter String: ");
        str = scanner.nextLine();
        int count = 0;
        char string;
        System.out.println("Enter characters: ");
        string = scanner.nextLine().charAt(0);
        //        string  = scanner.nextLine();
        for(int i = 0; i < str.length(); i++){
           if(str.charAt(i) == string){
              count++;
           }
        }
        System.out.println(count);
    }

}
