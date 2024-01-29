/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

/**
 *
 * @author thaip
 */
public class Contact {
    private int id;
    private String fullname, group, address,phone, lastName, firstName;

    public Contact() {
    }

    public Contact(int id, String fullname, String group, String address, String phone) {
        this.id = id;
        this.fullname = fullname;
        this.group = group;
        this.address = address;
        this.phone = phone;
        
    }

    public int getID() {
        return id;
    }

    public void setID(int id) {
        this.id = id;
    }

    public String getFullname() {
        return fullname;
    }

    public void setFullname(String fullname) {
        this.fullname = fullname;
    }

    public String getGroup() {
        return group;
    }

    public void setGroup(String group) {
        this.group = group;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    
    
    public String getFirst(){
        String str = getFullname().trim();
        if(str.indexOf(" ") >= 0){
            int firstIndex = str.indexOf(" ");
            
             firstName = str.substring(0, firstIndex);
            
        }
        return firstName;
    }
    public String getLast(){
        String str = getFullname().trim();
        if(str.indexOf(" ") >= 0){
            int lastIndex = str.lastIndexOf(" ");
            
             lastName = str.substring(lastIndex + 1);
            
        }
        return lastName;
    }

    @Override
    public String toString() {
        return String.format("%-3d %-25s %-12s %-12s %-10s %-10s %-20s",
            id, fullname, getFirst(), getLast(), group, address, phone);
    }
    
    
}
