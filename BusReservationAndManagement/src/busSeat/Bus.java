/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package busSeat;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.JOptionPane;

/**
 *
 * @author vasan12sp
 */
public class Bus {
    String busNumber;
    String startPoint,dropPoint;
    int left,seatsPerLeft,right,seatsPerRight;//inputs by admin
    int totalSeats=(left*seatsPerLeft)+(right*seatsPerRight);
    Seat s[]=new Seat[totalSeats];
    
    
    

    public Bus(String busno,String start,String drop,int left,int spl,int right,int spr){
        busNumber=busno;
        startPoint=start;
        dropPoint=drop;
        this.left=left;
        seatsPerLeft=spl;
        this.right=right;
        seatsPerRight=spr;
    }
    
    
    
    public void insertSeats(String busid,String date){
        try {
    Class.forName("com.mysql.cj.jdbc.Driver");
    Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/busbooking", "root", "");
    Statement st = con.createStatement();
    int total=(left*seatsPerLeft)+(right*seatsPerRight);
    System.out.println(total);
    
    for(int i=0;i<total;i++){
        
        s[i].disp();
        String seatNum=s[i].genSeat();
        String qToInsertSeat = String.format("insert into services (busid, date, seat, passenger, age, id) values('%s', '%s', '%s', '', null, '')", busid, date, seatNum);
    
        st.executeUpdate(qToInsertSeat);
    }
    
    
    

    

    con.close();

} catch (Exception e) {
    e.printStackTrace(); // Print the exception for debugging
    JOptionPane.showMessageDialog(null, "Exception Occurred");
}
    }


    public void allocateSeats(){
        int total=(left*seatsPerLeft)+(right*seatsPerRight);
        
            for(int i=1;i<=total;i++){
                if(seatsPerLeft==3 && seatsPerRight==3){
                    if(i%seatsPerLeft==1 && i<=(left*seatsPerLeft)){
                    s[i]=new Seat(i,"Window","Left");
                }else if(i%seatsPerLeft==2 && i<=(left*seatsPerLeft)){
                    s[i]=new Seat(i,"Middle","Left");
                }else if(i%seatsPerLeft==0 && i<=(left*seatsPerLeft)){
                    s[i]=new Seat(i,"Side","Left");
                }
                if(i%seatsPerLeft==1 && i>(left*seatsPerLeft)){
                    s[i]=new Seat(i,"Window","Right");
                }else if(i%seatsPerLeft==2 && i>(left*seatsPerLeft)){
                    s[i]=new Seat(i,"Middle","Right");
                }else if(i%seatsPerLeft==0 && i>(left*seatsPerLeft)){
                    s[i]=new Seat(i,"Side","Right");
                }
                }
                else if(seatsPerLeft==2 && seatsPerRight==3){
                    if(i%seatsPerLeft==1 && i<=(left*seatsPerLeft)){
                    s[i]=new Seat(i,"Window","Left");
                }
                else if(i%seatsPerLeft==0 && i<=(left*seatsPerLeft)){
                    s[i]=new Seat(i,"Side","Left");
                }
                if(i%seatsPerLeft==1 && i>(left*seatsPerLeft)){
                    s[i]=new Seat(i,"Window","Right");
                }else if(i%seatsPerLeft==2 && i>(left*seatsPerLeft)){
                    s[i]=new Seat(i,"Middle","Right");
                }else if(i%seatsPerLeft==0 && i>(left*seatsPerLeft)){
                    s[i]=new Seat(i,"Side","Right");
                }
                }else if(seatsPerLeft==3 && seatsPerRight==2){
                    if(i%seatsPerLeft==1 && i<=(left*seatsPerLeft)){
                    s[i]=new Seat(i,"Window","Left");
                }else if(i%seatsPerLeft==2 && i<=(left*seatsPerLeft)){
                    s[i]=new Seat(i,"Middle","Left");
                }else if(i%seatsPerLeft==0 && i<=(left*seatsPerLeft)){
                    s[i]=new Seat(i,"Side","Left");
                }
                if(i%seatsPerLeft==1 && i>(left*seatsPerLeft)){
                    s[i]=new Seat(i,"Window","Right");
                }
                else if(i%seatsPerLeft==0 && i>(left*seatsPerLeft)){
                    s[i]=new Seat(i,"Side","Right");
                }
                }
                
            }
        
            
        
    }
}
