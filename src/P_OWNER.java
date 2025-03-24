/**
 *
 * @author AVS Vastalya
 */
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;


public class P_OWNER {
    
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
    
    public P_OWNER(){}

    
    public P_OWNER(int Id, String Fname, String Lname, String Phone, String Email, String Address)
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
    
    public boolean addNewOwner(P_OWNER owner)
    {
        PreparedStatement ps;
        
        String addQuery = "INSERT INTO `property_owner`(`fname`, `lname`, `phone`, `email`, `address`) VALUES (?,?,?,?,?)";
        
        
       
        try {
            ps= THE_CONNECTION.getTheConnection().prepareStatement(addQuery);
            ps.setString(1,owner.getFristName());
            ps.setString(2,owner.getLastName());
            ps.setString(3,owner.getPhone());
            ps.setString(4,owner.getEmail());
            ps.setString(5,owner.getAddress());
            
            return (ps.executeUpdate() > 0);
            
            
            
        } catch (SQLException ex) {
            Logger.getLogger(P_OWNER.class.getName()).log(Level.SEVERE, null, ex);
            return false;
        }
    }
    
    //create a function to edit the selected owner data
    
    public boolean editOwnerData(P_OWNER owner)
    {
        PreparedStatement ps;
        
        String editQuery= "UPDATE `property_owner` SET `fname`=?,`lname`=?,`phone`=?,`email`=?,`address`=? WHERE `id`=?";
        
        try 
        {
            ps= THE_CONNECTION.getTheConnection().prepareStatement(editQuery);
            ps.setString(1,owner.getFristName());
            ps.setString(2,owner.getLastName());
            ps.setString(3, owner.getPhone());
            ps.setString(4,owner.getEmail());
            ps.setString(5, owner.getAddress());
            ps.setInt(6, owner.getId());
            
            return (ps.executeUpdate() >0 );
            
        } catch (SQLException ex) {
            Logger.getLogger(P_OWNER.class.getName()).log(Level.SEVERE, null, ex);
            return false;
        }
    }
    
    
    //create a function to delete the selected owner
    public boolean deleteOwnerData(int ownerId)
    {
        PreparedStatement ps;
        
        String deleteQuery="DELETE FROM `property_owner` WHERE `id`=?";
        
        try{
            ps= THE_CONNECTION.getTheConnection().prepareStatement(deleteQuery);
            ps.setInt(1, ownerId);
            
            return (ps.executeUpdate() >0);
            
        } catch (SQLException ex) {
            Logger.getLogger(P_OWNER.class.getName()).log(Level.SEVERE, null, ex);
            return false;
        }
        
    }
    
    
    
    //create a function to return an arraylist of owners 
    public ArrayList<P_OWNER> ownersList()
    {
        ArrayList<P_OWNER> list = new ArrayList<>();
        
        Statement st;
        ResultSet rs;
        
        String selectQuery="SELECT * FROM `property_owner`";
        
        try {
            st= THE_CONNECTION.getTheConnection().createStatement();
            rs=st.executeQuery(selectQuery);
            
            P_OWNER owner;
            while(rs.next()){
                owner= new P_OWNER(rs.getInt(1), rs.getString(2), rs.getString(3), rs.getString(4), rs.getString(5), rs.getString(6));
                
                list.add(owner);
            }
        } catch (SQLException ex) {
            Logger.getLogger(P_TYPE.class.getName()).log(Level.SEVERE, null, ex);
        }

        return list;
    }
    
    
    
    
    public P_OWNER getOwnerDetails(int ownerId)
    {
        PreparedStatement ps;
        ResultSet rs;
        P_OWNER owner = null;
        String searchQuery="SELECT * FROM `property_owner` WHERE `id`=?";
        
        try {
            ps = THE_CONNECTION.getTheConnection().prepareStatement(searchQuery);
            ps.setInt(1, ownerId);
            rs = ps.executeQuery();
            if(rs.next()){
                owner= new P_OWNER(
                        rs.getInt("id"),
                        rs.getString("fname"),
                        rs.getString("lname"),
                        rs.getString("phone"),
                        rs.getString("email"),
                        rs.getString("address"));
            }
            return owner;
        } catch (SQLException ex) {
            Logger.getLogger(P_OWNER.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        return owner;
    }
    
    
    
    
}
