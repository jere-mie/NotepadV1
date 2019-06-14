/*
Jeremie Bornais
Mrs. Campbell
ICS4U
06/10/2019
Notepad Application
*/

//Importing the io required to work with files
import java.io.*;
import java.util.*;
class Main {
  public static void main(String[] args) {
    Scanner input = new Scanner (System.in);
    int choice;
    int y = 0;
    while (y==0){
    
    System.out.println();        
    System.out.println("*********************************************");              
    System.out.println("Welcome To The Notepad Application");
    System.out.println();
    System.out.println();
    System.out.println("To Open A File, Press 1");
    System.out.println("To Write A File, Press 2");
    System.out.println("To Read The Help Document, Press 3");
    System.out.println("To Exit, Press Any Other Number");
    System.out.println("*********************************************");              
    System.out.println();        

    choice = input.nextInt();

      //to read a file
      if (choice == 1){
        System.out.println("Please Write The Name of the File You Wish To Open");    System.out.println();        

        String fileName = "";
        fileName = input.next();
        System.out.println("*********************************************");            
        System.out.println();        
     
        String line = null;

          try {
              //FileReader class is required to read from files
              FileReader readTheFile = 
                  new FileReader(fileName);

              //BufferedReader class is required to read from files
              BufferedReader file = 
                  new BufferedReader(readTheFile);

              //printing the line when it isn't null (or empty)
              while((line = file.readLine()) != null) {
                  System.out.println(line);
              }   

              //closing the file
              file.close();         
          }
        
          //error handling
          catch(IOException ex) {
              System.out.println("Error");                  
          }
      
      //to write a file
      }else if (choice == 2){
        String writeName = "";
        System.out.println("Please Write The Name of the File You Wish To Write");
        writeName = input.next(); 
        System.out.println("*********************************************");              
        System.out.println("Please Input Your Text");        
        System.out.println("You May Input As Many Lines As You Like");        
        System.out.println("If You Wish To Finish,");        
        System.out.println("Simply Write 'DONE' On One of the Lines");        
        System.out.println("*********************************************");              
        System.out.println();              

        try {
            //FileWriter class is required to write to documents
            FileWriter writeTheFile = new FileWriter(writeName);
            //BufferedWriter class is required to write to documents
            BufferedWriter file = new BufferedWriter(writeTheFile);
          int x = 0;
          while (x==0){
            String ln = input.nextLine();
            if (ln.equals("DONE")){
              x = 1;
            }else {
              file.write(ln);
              file.newLine();
            }
          }
            //Closing the file
            file.close();
        }
        //Error catch
        catch(IOException ex) {
            System.out.println("Error");
        }     
    }else if (choice == 3){

            String line = null;

          try {
              //FileReader class is required to read from files
              FileReader readTheFile = 
                  new FileReader("Help.txt");

              //BufferedReader class is required to read from files
              BufferedReader file = 
                  new BufferedReader(readTheFile);

              //printing the line when it isn't null (or empty)
              while((line = file.readLine()) != null) {
                  System.out.println(line);
              }   

              //closing the file
              file.close();         
          }
        
          //error handling
          catch(IOException ex) {
              System.out.println("Error");                  
          }
        
      }else {
        y = 1;
      }
    }
  }
}