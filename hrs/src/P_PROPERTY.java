
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.sql.ResultSet;
import java.sql.Statement;


/**
 *
 * @author AVS Vastalya
 */
public class P_PROPERTY {

    private int id;
    private int type;
    private int size;
    private int ownerId;
    private String price;
    private String address;
    private int bedrooms;
    private int bathrooms;
    private int age;
    private String description;
    private boolean balcony;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getType() {
        return type;
    }

    public void setType(int type) {
        this.type = type;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public int getOwnerId() {
        return ownerId;
    }

    public void setOwnerId(int ownerId) {
        this.ownerId = ownerId;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public int getBedrooms() {
        return bedrooms;
    }

    public void setBedrooms(int bedrooms) {
        this.bedrooms = bedrooms;
    }

    public int getBathrooms() {
        return bathrooms;
    }

    public void setBathrooms(int bathrooms) {
        this.bathrooms = bathrooms;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public boolean isBalcony() {
        return balcony;
    }

    public void setBalcony(boolean balcony) {
        this.balcony = balcony;
    }
    

    public P_PROPERTY() {
    }

    public P_PROPERTY(int ID, int TYPE, int SIZE, int OWNERID, String PRICE,
            String ADDRESS, int BEDROOMS, int BATHROOMS, int AGE,
            String DESCRIPTION, boolean BALCONY) {
        this.id = ID;
        this.type = TYPE;
        this.size = SIZE;
        this.ownerId = OWNERID;
        this.price = PRICE;
        this.address = ADDRESS;
        this.bedrooms = BEDROOMS;
        this.bathrooms = BATHROOMS;
        this.age = AGE;
        this.description = DESCRIPTION;
        this.balcony = BALCONY;
    }
    
    //create a fuction to add a new property
    public boolean addNewProperty(P_PROPERTY property)
    {
        PreparedStatement ps;
        
        String addQuery = "INSERT INTO `the_property`(`type`, `square_feet`, `ownerId`, `price`, `address`, `bedrooms`, `bathrooms`, `age`, `balcony`, `description`) VALUES (?,?,?,?,?,?,?,?,?,?)";
        
        try {
            ps= THE_CONNECTION.getTheConnection().prepareStatement(addQuery);
            ps.setInt(1,property.getType());
            ps.setInt(2,property.getSize());
            ps.setInt(3,property.getOwnerId());
            ps.setString(4,property.getPrice());
            ps.setString(5,property.getAddress());
            ps.setInt(6,property.getBedrooms());
            ps.setInt(7,property.getBathrooms());
            ps.setInt(8,property.getAge());
            ps.setBoolean(9,property.isBalcony());
            ps.setString(10,property.getDescription());
            
            return (ps.executeUpdate() > 0);
            
        } catch (SQLException ex) {
            Logger.getLogger(P_PROPERTY.class.getName()).log(Level.SEVERE, null, ex);
            return false;
        }
        
    }
    
    //create a fuction to edit property
    public boolean editProperty(P_PROPERTY property)
    {
        PreparedStatement ps;
        
        String editQuery = "UPDATE `the_property` SET `type`=?,`square_feet`=?,`ownerId`=?,`price`=?,`address`=?,`bedrooms`=?,`bathrooms`=?,`age`=?,`balcony`=?,`description`=? WHERE `id`=?";
        
        try {
            ps= THE_CONNECTION.getTheConnection().prepareStatement(editQuery);
            ps.setInt(1,property.getType());
            ps.setInt(2,property.getSize());
            ps.setInt(3,property.getOwnerId());
            ps.setString(4,property.getPrice());
            ps.setString(5,property.getAddress());
            ps.setInt(6,property.getBedrooms());
            ps.setInt(7,property.getBathrooms());
            ps.setInt(8,property.getAge());
            ps.setBoolean(9,property.isBalcony());
            ps.setString(10,property.getDescription());
            ps.setInt(11,property.getId());
            
            return (ps.executeUpdate() > 0);
            
        } catch (SQLException ex) {
            Logger.getLogger(P_PROPERTY.class.getName()).log(Level.SEVERE, null, ex);
            return false;
        }
        
    }
    
    //create a fuction to delete property
    public boolean removeProperty(int propertyId)
    {
        PreparedStatement ps;
        
        String deleteQuery="DELETE FROM `the_property` WHERE `id`=?";
        
        try{
            ps= THE_CONNECTION.getTheConnection().prepareStatement(deleteQuery);
            ps.setInt(1, propertyId);
            
            return (ps.executeUpdate() >0);
            
        } catch (SQLException ex) {
            Logger.getLogger(P_PROPERTY.class.getName()).log(Level.SEVERE, null, ex);
            return false;
        }
    }
    
    //create a fuction to search property
    public P_PROPERTY findProperty(int propertyId)
    {
        PreparedStatement ps;
        ResultSet rs;
        P_PROPERTY property = null;
        
        String searchQuery = "SELECT * FROM `the_property` WHERE `id` = ?";
        
        try {
            
            ps= THE_CONNECTION.getTheConnection().prepareStatement(searchQuery);
            ps.setInt(1,propertyId);
            rs= ps.executeQuery();
            if(rs.next())
            {
             
                property= new P_PROPERTY(rs.getInt("id"),
                                        rs.getInt("type"),
                                        rs.getInt("square_feet"),
                                        rs.getInt("ownerId"),
                                        rs.getString("price"),
                                        rs.getString("address"),
                                        rs.getInt("bedrooms"),
                                        rs.getInt("bathrooms"),
                                        rs.getInt("age"),
                                        rs.getString("description"), 
                                        rs.getBoolean("balcony"));
            }
            
            return property;
            
        } catch (SQLException ex) {
            Logger.getLogger(P_PROPERTY.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        return property;
    }
    
    //create a function to return an arraylist of properties 
    public ArrayList<P_PROPERTY> propertiesList()
    {
        ArrayList<P_PROPERTY> list = new ArrayList<>();
        Statement st;
        ResultSet rs;
        
        String selectQuery="SELECT * FROM `the_property`";
        
        try {
            
            st= THE_CONNECTION.getTheConnection().createStatement();
            rs=st.executeQuery(selectQuery);
            
            P_PROPERTY property;
            while(rs.next()){
                property= new P_PROPERTY(rs.getInt("id"),
                                        rs.getInt("type"),
                                        rs.getInt("square_feet"),
                                        rs.getInt("ownerId"),
                                        rs.getString("price"),
                                        rs.getString("address"),
                                        rs.getInt("bedrooms"),
                                        rs.getInt("bathrooms"),
                                        rs.getInt("age"),
                                        rs.getString("description"), 
                                        rs.getBoolean("balcony"));
                
                list.add(property);
            }
        } catch (SQLException ex) {
            Logger.getLogger(P_TYPE.class.getName()).log(Level.SEVERE, null, ex);
        }

        return list;        
    }
}
