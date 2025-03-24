
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author AVS Vastalya
 */
public class P_CLIENT {
    private int id;
    private String firstName;
    private String lastName ;
    private String phone;
    private String email;
    private String address;
    
    public int getId()
    {
        return this.id;
    }
    
    public void setId(int Id)
    {
        this.id= Id;
    }
    
    public String getFristName()
    {
        return this.firstName;
    }
    
    public void setFirstName(String Fname)
    {
        this.firstName=Fname;
    }
    
    public String getLastName()
    {
        return this.lastName;
    }
    
    public void setLastName(String Lname)
    {
        this.lastName=Lname;
    }
    
    public void setPhone(String Phone)
    {
        this.phone=Phone;
    }
    
    public String getEmail()
    {
        return this.email;
    }
    
    public void setEmail(String Email)
    {
        this.email=Email;
    }
    
    public String getPhone()
    {
        return this.phone;
    }
    
    public String getAddress()
    {
        return this.address;
    }
    
    public void setAddress(String Address)
    {
        this.address= Address;
    }
    
    public P_CLIENT(){}

    
    public P_CLIENT(int Id, String Fname, String Lname, String Phone, String Email, String Address)
    {
        this.id= Id;
        this.firstName=Fname;
        this.lastName=Lname;
        this.phone=Phone;
        this.email=Email;
        this.address=Address;
    }
    //create a function to add a new owner
    //first create the owner in the database.
    
    public boolean addNewClient(P_CLIENT client)
    {
        PreparedStatement ps;
        
        String addQuery = "INSERT INTO `property_client`(`fname`, `lname`, `phone`, `email`, `address`) VALUES (?,?,?,?,?)";
        
        
       
        try {
            ps= THE_CONNECTION.getTheConnection().prepareStatement(addQuery);
            ps.setString(1,client.getFristName());
            ps.setString(2,client.getLastName());
            ps.setString(3,client.getPhone());
            ps.setString(4,client.getEmail());
            ps.setString(5,client.getAddress());
            
            return (ps.executeUpdate() > 0);
            
            
            
        } catch (SQLException ex) {
            Logger.getLogger(P_CLIENT.class.getName()).log(Level.SEVERE, null, ex);
            return false;
        }
    }
    
    //create a function to edit the selected owner data
    
    public boolean editClientData(P_CLIENT client)
    {
        PreparedStatement ps;
        
        String editQuery= "UPDATE `property_client` SET `fname`=?,`lname`=?,`phone`=?,`email`=?,`address`=? WHERE `id`=?";
        
        try 
        {
            ps= THE_CONNECTION.getTheConnection().prepareStatement(editQuery);
            ps.setString(1,client.getFristName());
            ps.setString(2,client.getLastName());
            ps.setString(3, client.getPhone());
            ps.setString(4,client.getEmail());
            ps.setString(5, client.getAddress());
            ps.setInt(6, client.getId());
            
            return (ps.executeUpdate() >0 );
            
        } catch (SQLException ex) {
            Logger.getLogger(P_CLIENT.class.getName()).log(Level.SEVERE, null, ex);
            return false;
        }
    }
    
    
    //create a function to delete the selected owner
    public boolean deleteClientData(int clientId)
    {
        PreparedStatement ps;
        
        String deleteQuery="DELETE FROM `property_client` WHERE `id`=?";
        
        try{
            ps= THE_CONNECTION.getTheConnection().prepareStatement(deleteQuery);
            ps.setInt(1, clientId);
            
            return (ps.executeUpdate() >0);
            
        } catch (SQLException ex) {
            Logger.getLogger(P_CLIENT.class.getName()).log(Level.SEVERE, null, ex);
            return false;
        }
        
    }
    
    
    
    //create a function to return an arraylist of owners 
    public ArrayList<P_CLIENT> ClientsList()
    {
        ArrayList<P_CLIENT> list = new ArrayList<>();
        
        Statement st;
        ResultSet rs;
        
        String selectQuery="SELECT * FROM `property_client`";
        
        try {
            st= THE_CONNECTION.getTheConnection().createStatement();
            rs=st.executeQuery(selectQuery);
            
            P_CLIENT client;
            while(rs.next()){
                client= new P_CLIENT(rs.getInt(1), rs.getString(2), rs.getString(3), rs.getString(4), rs.getString(5), rs.getString(6));
                
                list.add(client);
            }
        } catch (SQLException ex) {
            Logger.getLogger(P_TYPE.class.getName()).log(Level.SEVERE, null, ex);
        }

        return list;
    }
    
    
    
    
}
