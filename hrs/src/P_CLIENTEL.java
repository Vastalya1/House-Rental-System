
import java.util.ArrayList;
import java.sql.Statement;
import java.sql.ResultSet;
import java.sql.SQLException;
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
public class P_CLIENTEL {
    private int id;
    private String name;
    private String description;
    
    public Integer getId()
    {
        return id;
    }
    
    public void setId(Integer ID)
    {
        this.id= ID;
    }
    
    public String getName()
    {
        return name;
    }
    
    public void setName(String NAME)
    {
        this.name= NAME;
    }
    
    public String getDescription()
    {
        return this.description;
    }
    
    public void setDescription(String DESCRIPTION)
    {
        this.description = DESCRIPTION;
    }
    
    //create the class constructors
    public P_CLIENTEL(){}
    
    public P_CLIENTEL(Integer ID, String NAME, String DESCRIPTION)
    {
        this.id= ID;
        this.name= NAME;
        this.description= DESCRIPTION;
    }
    
    //create a function to return a arraylist of properties
    
    public ArrayList<P_CLIENTEL> propertyList()
            {
                ArrayList<P_CLIENTEL> list = new ArrayList<>();
                Statement st;
                ResultSet rs;
                
                String selectQuery= "SELECT * FROM `property_type`";
                
                try{
                    st= THE_CONNECTION.getTheConnection().createStatement();
                    rs= st.executeQuery(selectQuery);
                    
                    P_CLIENTEL clientel;
                    while(rs.next())
                    {
                        clientel= new P_CLIENTEL(rs.getInt(1), rs.getString(2), rs.getString(3));
                        
                        list.add(clientel);
                    }
                }catch (SQLException ex) {
            Logger.getLogger(P_TYPE.class.getName()).log(Level.SEVERE, null, ex);
                }
                
                return list;
            }
}
