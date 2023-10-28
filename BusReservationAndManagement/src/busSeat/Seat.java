/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package busSeat;

/**
 *
 * @author vasan12sp
 */
public class Seat {
    int seatNumber;
    String position;//WINDOW,MIDDLE,SIDE
    String part;//left or right part
    boolean available;//true-seat is available false=seat is occupied
    public Seat(int seatNumber,String position,String part){
        this.seatNumber=seatNumber;
        this.position=position;
        this.part=part;
        this.available=true;
    }
    
    public String genSeat(){
        String returnString=String.format("%s_%d",part,seatNumber);
        return returnString;
    }
    
    void disp(){
        System.out.println("seat number: "+seatNumber);
        System.out.println("position: "+position);
        System.out.println("part: "+part);
    }
}
