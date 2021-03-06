import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;
public class ArrayListProgram{
    private static ArrayList name = new ArrayList();
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        ArrayList age = new ArrayList();
        
        int choose = 0;
        try{
        do{
           System.out.println("[1]Add Name\n[2]Remove name\n[3]Edit Name\n[4]Search Name\n[5]Sort Name\n[6]Display Name\n[7]Exit");
           choose = sc.nextInt();
           switch(choose){
                case 1: System.out.println("Enter new name: ");       
                String addName = sc.next();
                System.out.println("Enter age of "+addName+": ");
                int addAge = sc.nextInt();
                
                name.add(addName);
                age.add(addAge);
                System.out.println("Successfully added!!!");
                break;
                
                case 2: System.out.println("Enter name to be remove: ");
                String removeName = sc.next();
                for(int index = 0; index < name.size(); index++){
                   if(removeName.equals(name.get(index))){
                      name.remove(index);
                      age.remove(index);
                      System.out.println("Successfully removed!!!");
                      index = -1;
                      break;
                   } 
                   else if(index == -1 || index > name.size()-1){
                       System.out.println("No stored data on "+removeName);  
                    }
                }
                break;
                
                case 3: System.out.println("Enter name to be edited: ");
                String editName = sc.next();
                for(int index = 0; index < name.size(); index++){
                   if(editName.equals(name.get(index))){
                      System.out.println("Enter new name: ");
                      String newName = sc.next();
                      System.out.println("Enter new age for "+newName+": ");
                      int newAge = sc.nextInt();
                      
                      name.set(index, newName);
                      age.set(index, newAge);
                      index = -1;
                      break;
                   } 
                   else if(index == -1 || index > name.size()-1){
                       System.out.println("No stored data on "+editName);   
                   }
                }
                break;
                
                case 4:System.out.println();
                
               
           }

            
        }while(choose!=7);
      }catch(InputMismatchException x){
         System.out.println("Wrong input");
      }
      catch(ArrayIndexOutOfBoundsException x){
        System.out.println("Wrong index has been accessed");    
      }
    }
}
