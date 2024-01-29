/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author thaip
 */
public class ContactList {
    private List<Contact> list;
    private int id;
    public ContactList() {
        list = new ArrayList<>();
    }
    
    public int increaseId() {
        return id += 1;
    }
    public void addContact(Contact a) {
        a.setID(increaseId());
        list.add(a);
        System.out.println("Successful");
    }
    
    public void deleteContact(int id) {
        int index = -1;
        boolean flag = false;
        for (int i = 0; i < list.size(); i++) {
            if(list.get(i).getID() == id){
                flag = true;
                index = i;
             }
         }
        if(flag == true){
            list.remove(list.get(index));
        for (int i = index; i < list.size(); i++) {
            list.get(i).setID(list.get(i).getID() - 1);
        }
        }
    }
    public void display(){
        System.out.printf("%-3s %-20s %-12s %-12s %-15s %-10s %-20s%n", "ID", "Name", "First Name", "Last Name", "Address", "Group", "Phone");
        for (Contact a : list) {
            System.out.println(a.toString());
        }
    }
}
