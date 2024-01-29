/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controller;

import Library.Library;
import Model.Contact;
import Model.ContactList;
import View.Menu;
import java.util.Scanner;

/**
 *
 * @author thaip
 */
public class Execute extends Menu<String>{
    private static String[] mc={"Add a contact", "Display all contact", "Delete a contact", "Exit"};
    private ContactList list = new ContactList();
    public Execute() {
        super("========= Contact program =========",mc);
     }
    
    @Override
    public void execute(int n) {
        switch(n) {
            case 1: addContact(); break;
            case 2: print(); break;
            case 3: deleteContact(); break;
            case 4: System.exit(0);
        }
    }
    public void addContact(){
        String name = Menu.getString("Enter Name : ");
        String group = Menu.getString("Enter Address : ");
        String address = Menu.getString("Enter Group : ");
        boolean flag = false;
        String phone = "";
        do{
          phone = Menu.getString("Enter Phone : ");
         if(Library.isValidPhoneNumber(phone)){
             flag = true;
             break;
         }
         else{
             System.out.println("Invalid Phone"
                     + "Please input Phone flow\n" +
                            "• 1234567890\n" +
                            "• 123-456-7890 \n" +
                            "• 123-456-7890 x1234\n" +
                            "• 123-456-7890 ext1234\n" +
                            "• (123)-456-7890\n" +
                            "• 123.456.7890\n" +
                            "• 123 456 7890");
         }
        }while(flag == false);
        list.addContact(new Contact(0, name, group, address, phone));
        
    }
    public void print(){
        System.out.println("--------------------------------- Display all Contact ----------------------------");
        list.display();
    }
    public void deleteContact(){
        int id = Library.inputNumInt();
        list.deleteContact(id);
    }
}
