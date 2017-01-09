import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import java.util.Scanner;

 

class FileVowels {

 

    public static void main(String[] args) throws Exception {

        

    	FileInputStream fis = new FileInputStream("D:\\DemoFile.txt");

 

       

        Scanner input = new Scanner(fis);

         

             

        String fileContent = "";

 

        

        while (input.hasNext()) {

            fileContent += input.next() + " ";

      }

        

        input.close();

 

        

        char[] charArr = fileContent.toCharArray();

 

        

        int counter = 0;

        for(char c : charArr)

        {

              if(c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u')

                   counter++;

        }

        

        

        System.out.println("Number of Vowels: " + counter);


    }
}
