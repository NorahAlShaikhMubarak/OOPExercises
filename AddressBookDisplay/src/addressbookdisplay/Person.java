/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package addressbookdisplay;

/**
 *
 * @author norahalshaikhmubarak
 */
 public class Person { 
     
private int addressID;
private String firstName; 
private String lastName; 
private String email; 
private String phoneNumber; 

public Person(){}

public Person( int id, String first, String last,String emailAddress, String phone ){
    
 setAddressID( id ); 
 setFirstName( first );
 setLastName( last );
 setEmail( emailAddress );
 setPhoneNumber( phone ); 


}

    public int getAddressID() {
        return addressID;
    }

    public void setAddressID(int id) {
        addressID = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String first) {
        firstName = first;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String last) {
        lastName = last;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String emailAddress) {
        email = emailAddress;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phone) {
        phoneNumber = phone;
    }


 }