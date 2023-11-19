
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import javax.swing.JButton;
import javax.swing.JOptionPane;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */

/**
 *
 * @author vasan12sp
 */
public class seatSelection extends javax.swing.JFrame {

    /**
     * Creates new form seatSelection
     */
    String busid,date,mobno;
    int max;
    ArrayList<Integer>availableSeats=new ArrayList<>();
    ArrayList<Integer>selectedSeats=new ArrayList<>();
    public seatSelection(String busid, String date, int max,String mobno) {
        initComponents();
        this.busid=busid;
        this.date=date;
        this.max=max;
        this.mobno=mobno;
        
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con= DriverManager.getConnection("jdbc:mysql://localhost:3306/busbooking","root","");
            Statement st = con.createStatement();
            String q = String.format("select * from services where busid='%s'and date='%s'",busid,date);
            ResultSet rs=st.executeQuery(q);
            String passenger;
            int seat;
            while(rs.next()){
                passenger=rs.getString("passenger");
                seat=rs.getInt("seat");
                if(passenger.equals("")){
                    availableSeats.add(seat);
                }
                
            }
            
            con.close();
            
            
            
            for(int i=1;i<76;i++){
                if(availableSeats.contains(i)){
                    switch(i){
                    case 1:mw(s1);
                    case 2:mw(s2);
                    case 3:mw(s3);
                    case 4: mw(s4);
                    case 5: mw(s5);
                    case 6: mw(s6);
                    case 7: mw(s7);
                    case 8: mw(s8);
                    case 9: mw(s9);
                    case 10: mw(s10);
                    case 11: mw(s11);
                    case 12: mw(s12);
                    case 13: mw(s13);
                    case 14: mw(s14);
                    case 15: mw(s15);
case 16: mw(s16);
case 17: mw(s17);
case 18: mw(s18);
case 19: mw(s19);
case 20: mw(s20);
case 21: mw(s21);
case 22: mw(s22);
case 23: mw(s23);
case 24: mw(s24);
case 25: mw(s25);
case 26: mw(s26);
case 27: mw(s27);
case 28: mw(s28);
case 29: mw(s29);
case 30: mw(s30);
case 31: mw(s31);
case 32: mw(s32);
case 33: mw(s33);
case 34: mw(s34);
case 35: mw(s35);
case 36: mw(s36);
case 37: mw(s37);
case 38: mw(s38);
case 39: mw(s39);
case 40: mw(s40);
case 41: mw(s41);
case 42: mw(s42);
case 43: mw(s43);
case 44: mw(s44);
case 45: mw(s45);
case 46: mw(s46);
case 47: mw(s47);
case 48: mw(s48);
case 49: mw(s49);
case 50: mw(s50);
case 51: mw(s51);
case 52: mw(s52);
case 53: mw(s53);
case 54: mw(s54);
case 55: mw(s55);
case 56: mw(s56);
case 57: mw(s57);
case 58: mw(s58);
case 59: mw(s59);
case 60: mw(s60);
case 61: mw(s61);
case 62: mw(s62);
case 63: mw(s63);
case 64: mw(s64);
case 65: mw(s65);
case 66: mw(s66);
case 67: mw(s67);
case 68: mw(s68);
case 69: mw(s69);
case 70: mw(s70);
case 71: mw(s71);
case 72: mw(s72);
case 73: mw(s73);
case 74: mw(s74);
                       case 75: mw(s75);
                }
                }else{
                    switch(i){
case 1:mw1(s1);case 2:mw1(s2);case 3:mw1(s3);case 4: mw1(s4);case 5: mw1(s5);case 6: mw1(s6);case 7: mw1(s7);case 8: mw1(s8);case 9: mw1(s9);case 10: mw1(s10);case 11: mw1(s11);case 12: mw1(s12);case 13: mw1(s13);case 14: mw1(s14);case 15: mw1(s15);
case 16: mw1(s16);case 17: mw1(s17);case 18: mw1(s18);case 19: mw1(s19);case 20: mw1(s20);case 21: mw1(s21);case 22: mw1(s22);case 23: mw1(s23);case 24: mw1(s24);case 25: mw1(s25);case 26: mw1(s26);case 27: mw1(s27);case 28: mw1(s28);case 29: mw1(s29);case 30: mw1(s30);case 31: mw1(s31);case 32: mw1(s32);case 33: mw1(s33);case 34: mw1(s34);case 35: mw1(s35);case 36: mw1(s36);case 37: mw1(s37);case 38: mw1(s38);case 39: mw1(s39);
case 40: mw1(s40);case 41: mw1(s41);case 42: mw1(s42);case 43: mw1(s43);case 44: mw1(s44);case 45: mw1(s45);case 46: mw1(s46);case 47: mw1(s47);case 48: mw1(s48);case 49: mw1(s49);case 50: mw1(s50);case 51: mw1(s51);case 52: mw1(s52);case 53: mw1(s53);case 54: mw1(s54);case 55: mw1(s55);case 56: mw1(s56);
case 57: mw1(s57);case 58: mw1(s58);case 59: mw1(s59);case 60: mw1(s60);case 61: mw1(s61);case 62: mw1(s62);case 63: mw1(s63);case 64: mw1(s64);case 65: mw1(s65);case 66: mw1(s66);case 67: mw1(s67);case 68: mw1(s68);case 69: mw1(s69);case 70: mw1(s70);case 71: mw1(s71);case 72: mw1(s72);case 73: mw1(s73);case 74: mw1(s74);case 75: mw1(s75);
                }
                }
            }
            
            
            addListener(s1);addListener(s2);addListener(s3);addListener(s4);addListener(s5);
            addListener(s6);addListener(s7);addListener(s8);addListener(s9);addListener(s10);
            addListener(s11);addListener(s12);addListener(s13);addListener(s14);addListener(s15);
            addListener(s16);addListener(s17);addListener(s18);addListener(s19);addListener(s20);
            addListener(s21);addListener(s22);addListener(s23);addListener(s24);addListener(s25);
            addListener(s26);addListener(s27);addListener(s28);addListener(s29);addListener(s30);
            addListener(s31);addListener(s32);addListener(s33);addListener(s34);addListener(s35);
            addListener(s36);addListener(s37);addListener(s38);addListener(s39);addListener(s40);
            addListener(s41);addListener(s42);addListener(s43);addListener(s44);addListener(s45);
            addListener(s46);addListener(s47);addListener(s48);addListener(s49);addListener(s50);
            addListener(s51);addListener(s52);addListener(s53);addListener(s54);addListener(s55);
            addListener(s56);addListener(s57);addListener(s58);addListener(s59);addListener(s60);
            addListener(s61);addListener(s62);addListener(s63);addListener(s64);addListener(s65);
            addListener(s66);addListener(s67);addListener(s68);addListener(s69);addListener(s70);
            addListener(s71);addListener(s72);addListener(s73);addListener(s74);addListener(s75);
            
        }catch(Exception e){
            System.out.println(e);
            JOptionPane.showMessageDialog(this,"Exception Occured");
            
        }
        
        
        
    }
    
    public void addListener(JButton b){
        b.addActionListener(new SeatButtonClickListener());
    }
    
    public void mw(JButton b){
        b.setBackground(Color.WHITE);
    }
    public void mw1(JButton b){
        b.setBackground(Color.DARK_GRAY);
    }
        
    
    public class SeatButtonClickListener implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            JButton clickedButton = (JButton) e.getSource();
            int seatNumber = Integer.parseInt(clickedButton.getText());

            if (availableSeats.contains(seatNumber)) {
                // Seat is available
                if (clickedButton.getBackground().equals(Color.WHITE)) {
                    // Change color to green
                    clickedButton.setBackground(Color.GREEN);
                    
                    selectedSeats.add((Integer) seatNumber);
                } else {
                    // Change color back to white
                    clickedButton.setBackground(Color.WHITE);
                    selectedSeats.remove((Integer) seatNumber);
                }
            } else {
                // Seat is not available
                JOptionPane.showMessageDialog(null, "Seat " + seatNumber + " is not available");
            }
        }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify t
     * regenerated by the Form Editor.
     */
    
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        s5 = new javax.swing.JButton();
        s7 = new javax.swing.JButton();
        s8 = new javax.swing.JButton();
        s6 = new javax.swing.JButton();
        s9 = new javax.swing.JButton();
        s10 = new javax.swing.JButton();
        s11 = new javax.swing.JButton();
        s12 = new javax.swing.JButton();
        s13 = new javax.swing.JButton();
        s14 = new javax.swing.JButton();
        s15 = new javax.swing.JButton();
        s16 = new javax.swing.JButton();
        s17 = new javax.swing.JButton();
        s18 = new javax.swing.JButton();
        s33 = new javax.swing.JButton();
        s19 = new javax.swing.JButton();
        s21 = new javax.swing.JButton();
        s22 = new javax.swing.JButton();
        s24 = new javax.swing.JButton();
        s23 = new javax.swing.JButton();
        s27 = new javax.swing.JButton();
        s3 = new javax.swing.JButton();
        s4 = new javax.swing.JButton();
        s25 = new javax.swing.JButton();
        s1 = new javax.swing.JButton();
        s2 = new javax.swing.JButton();
        s26 = new javax.swing.JButton();
        s28 = new javax.swing.JButton();
        s29 = new javax.swing.JButton();
        s30 = new javax.swing.JButton();
        s20 = new javax.swing.JButton();
        s32 = new javax.swing.JButton();
        s31 = new javax.swing.JButton();
        s36 = new javax.swing.JButton();
        s39 = new javax.swing.JButton();
        s45 = new javax.swing.JButton();
        s42 = new javax.swing.JButton();
        s48 = new javax.swing.JButton();
        s51 = new javax.swing.JButton();
        s54 = new javax.swing.JButton();
        s57 = new javax.swing.JButton();
        s60 = new javax.swing.JButton();
        s63 = new javax.swing.JButton();
        s66 = new javax.swing.JButton();
        s69 = new javax.swing.JButton();
        s72 = new javax.swing.JButton();
        s75 = new javax.swing.JButton();
        s35 = new javax.swing.JButton();
        s38 = new javax.swing.JButton();
        s41 = new javax.swing.JButton();
        s44 = new javax.swing.JButton();
        s47 = new javax.swing.JButton();
        s50 = new javax.swing.JButton();
        s53 = new javax.swing.JButton();
        s56 = new javax.swing.JButton();
        s59 = new javax.swing.JButton();
        s62 = new javax.swing.JButton();
        s65 = new javax.swing.JButton();
        s58 = new javax.swing.JButton();
        s55 = new javax.swing.JButton();
        s64 = new javax.swing.JButton();
        s61 = new javax.swing.JButton();
        s70 = new javax.swing.JButton();
        s67 = new javax.swing.JButton();
        s73 = new javax.swing.JButton();
        s74 = new javax.swing.JButton();
        s68 = new javax.swing.JButton();
        s71 = new javax.swing.JButton();
        s52 = new javax.swing.JButton();
        s34 = new javax.swing.JButton();
        s37 = new javax.swing.JButton();
        s40 = new javax.swing.JButton();
        s43 = new javax.swing.JButton();
        s46 = new javax.swing.JButton();
        s49 = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        s5.setIcon(new javax.swing.ImageIcon("/home/vasan12sp/Desktop/seat1.png")); // NOI18N
        s5.setText("05");
        getContentPane().add(s5, new org.netbeans.lib.awtextra.AbsoluteConstraints(27, 115, -1, -1));

        s7.setIcon(new javax.swing.ImageIcon("/home/vasan12sp/Desktop/seat1.png")); // NOI18N
        s7.setText("07");
        getContentPane().add(s7, new org.netbeans.lib.awtextra.AbsoluteConstraints(27, 162, -1, -1));

        s8.setIcon(new javax.swing.ImageIcon("/home/vasan12sp/Desktop/seat1.png")); // NOI18N
        s8.setText("08");
        getContentPane().add(s8, new org.netbeans.lib.awtextra.AbsoluteConstraints(131, 162, -1, -1));

        s6.setIcon(new javax.swing.ImageIcon("/home/vasan12sp/Desktop/seat1.png")); // NOI18N
        s6.setText("06");
        getContentPane().add(s6, new org.netbeans.lib.awtextra.AbsoluteConstraints(131, 115, -1, -1));

        s9.setIcon(new javax.swing.ImageIcon("/home/vasan12sp/Desktop/seat1.png")); // NOI18N
        s9.setText("09");
        getContentPane().add(s9, new org.netbeans.lib.awtextra.AbsoluteConstraints(27, 209, -1, -1));

        s10.setIcon(new javax.swing.ImageIcon("/home/vasan12sp/Desktop/seat1.png")); // NOI18N
        s10.setText("10");
        getContentPane().add(s10, new org.netbeans.lib.awtextra.AbsoluteConstraints(132, 209, -1, -1));

        s11.setIcon(new javax.swing.ImageIcon("/home/vasan12sp/Desktop/seat1.png")); // NOI18N
        s11.setText("11");
        getContentPane().add(s11, new org.netbeans.lib.awtextra.AbsoluteConstraints(27, 256, -1, -1));

        s12.setIcon(new javax.swing.ImageIcon("/home/vasan12sp/Desktop/seat1.png")); // NOI18N
        s12.setText("12");
        getContentPane().add(s12, new org.netbeans.lib.awtextra.AbsoluteConstraints(133, 256, -1, -1));

        s13.setIcon(new javax.swing.ImageIcon("/home/vasan12sp/Desktop/seat1.png")); // NOI18N
        s13.setText("13");
        getContentPane().add(s13, new org.netbeans.lib.awtextra.AbsoluteConstraints(27, 303, -1, -1));

        s14.setIcon(new javax.swing.ImageIcon("/home/vasan12sp/Desktop/seat1.png")); // NOI18N
        s14.setText("14");
        getContentPane().add(s14, new org.netbeans.lib.awtextra.AbsoluteConstraints(129, 303, -1, -1));

        s15.setIcon(new javax.swing.ImageIcon("/home/vasan12sp/Desktop/seat1.png")); // NOI18N
        s15.setText("15");
        getContentPane().add(s15, new org.netbeans.lib.awtextra.AbsoluteConstraints(27, 350, -1, -1));

        s16.setIcon(new javax.swing.ImageIcon("/home/vasan12sp/Desktop/seat1.png")); // NOI18N
        s16.setText("16");
        getContentPane().add(s16, new org.netbeans.lib.awtextra.AbsoluteConstraints(129, 350, -1, -1));

        s17.setIcon(new javax.swing.ImageIcon("/home/vasan12sp/Desktop/seat1.png")); // NOI18N
        s17.setText("17");
        getContentPane().add(s17, new org.netbeans.lib.awtextra.AbsoluteConstraints(27, 397, -1, -1));

        s18.setIcon(new javax.swing.ImageIcon("/home/vasan12sp/Desktop/seat1.png")); // NOI18N
        s18.setText("18");
        getContentPane().add(s18, new org.netbeans.lib.awtextra.AbsoluteConstraints(129, 397, -1, -1));

        s33.setIcon(new javax.swing.ImageIcon("/home/vasan12sp/Desktop/seat1.png")); // NOI18N
        s33.setText("33");
        getContentPane().add(s33, new org.netbeans.lib.awtextra.AbsoluteConstraints(273, 21, -1, -1));

        s19.setIcon(new javax.swing.ImageIcon("/home/vasan12sp/Desktop/seat1.png")); // NOI18N
        s19.setText("19");
        getContentPane().add(s19, new org.netbeans.lib.awtextra.AbsoluteConstraints(29, 444, -1, -1));

        s21.setIcon(new javax.swing.ImageIcon("/home/vasan12sp/Desktop/seat1.png")); // NOI18N
        s21.setText("21");
        getContentPane().add(s21, new org.netbeans.lib.awtextra.AbsoluteConstraints(27, 491, -1, -1));

        s22.setIcon(new javax.swing.ImageIcon("/home/vasan12sp/Desktop/seat1.png")); // NOI18N
        s22.setText("22");
        getContentPane().add(s22, new org.netbeans.lib.awtextra.AbsoluteConstraints(129, 491, -1, -1));

        s24.setIcon(new javax.swing.ImageIcon("/home/vasan12sp/Desktop/seat1.png")); // NOI18N
        s24.setText("24");
        getContentPane().add(s24, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 538, -1, -1));

        s23.setIcon(new javax.swing.ImageIcon("/home/vasan12sp/Desktop/seat1.png")); // NOI18N
        s23.setText("23");
        getContentPane().add(s23, new org.netbeans.lib.awtextra.AbsoluteConstraints(27, 538, -1, -1));

        s27.setIcon(new javax.swing.ImageIcon("/home/vasan12sp/Desktop/seat1.png")); // NOI18N
        s27.setText("27");
        getContentPane().add(s27, new org.netbeans.lib.awtextra.AbsoluteConstraints(27, 632, -1, -1));

        s3.setIcon(new javax.swing.ImageIcon("/home/vasan12sp/Desktop/seat1.png")); // NOI18N
        s3.setText("03");
        getContentPane().add(s3, new org.netbeans.lib.awtextra.AbsoluteConstraints(27, 68, -1, -1));

        s4.setIcon(new javax.swing.ImageIcon("/home/vasan12sp/Desktop/seat1.png")); // NOI18N
        s4.setText("04");
        getContentPane().add(s4, new org.netbeans.lib.awtextra.AbsoluteConstraints(131, 68, -1, -1));

        s25.setIcon(new javax.swing.ImageIcon("/home/vasan12sp/Desktop/seat1.png")); // NOI18N
        s25.setText("25");
        getContentPane().add(s25, new org.netbeans.lib.awtextra.AbsoluteConstraints(27, 585, -1, -1));

        s1.setIcon(new javax.swing.ImageIcon("/home/vasan12sp/Desktop/seat1.png")); // NOI18N
        s1.setText("01");
        getContentPane().add(s1, new org.netbeans.lib.awtextra.AbsoluteConstraints(27, 21, -1, -1));

        s2.setIcon(new javax.swing.ImageIcon("/home/vasan12sp/Desktop/seat1.png")); // NOI18N
        s2.setText("02");
        getContentPane().add(s2, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 21, -1, -1));

        s26.setIcon(new javax.swing.ImageIcon("/home/vasan12sp/Desktop/seat1.png")); // NOI18N
        s26.setText("26");
        getContentPane().add(s26, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 585, -1, -1));

        s28.setIcon(new javax.swing.ImageIcon("/home/vasan12sp/Desktop/seat1.png")); // NOI18N
        s28.setText("28");
        getContentPane().add(s28, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 632, -1, -1));

        s29.setIcon(new javax.swing.ImageIcon("/home/vasan12sp/Desktop/seat1.png")); // NOI18N
        s29.setText("29");
        getContentPane().add(s29, new org.netbeans.lib.awtextra.AbsoluteConstraints(27, 679, -1, -1));

        s30.setIcon(new javax.swing.ImageIcon("/home/vasan12sp/Desktop/seat1.png")); // NOI18N
        s30.setText("30");
        getContentPane().add(s30, new org.netbeans.lib.awtextra.AbsoluteConstraints(131, 679, -1, -1));

        s20.setIcon(new javax.swing.ImageIcon("/home/vasan12sp/Desktop/seat1.png")); // NOI18N
        s20.setText("20");
        getContentPane().add(s20, new org.netbeans.lib.awtextra.AbsoluteConstraints(126, 444, -1, -1));

        s32.setIcon(new javax.swing.ImageIcon("/home/vasan12sp/Desktop/seat1.png")); // NOI18N
        s32.setText("32");
        getContentPane().add(s32, new org.netbeans.lib.awtextra.AbsoluteConstraints(376, 21, -1, -1));

        s31.setIcon(new javax.swing.ImageIcon("/home/vasan12sp/Desktop/seat1.png")); // NOI18N
        s31.setText("31");
        getContentPane().add(s31, new org.netbeans.lib.awtextra.AbsoluteConstraints(479, 21, -1, -1));

        s36.setIcon(new javax.swing.ImageIcon("/home/vasan12sp/Desktop/seat1.png")); // NOI18N
        s36.setText("36");
        getContentPane().add(s36, new org.netbeans.lib.awtextra.AbsoluteConstraints(273, 68, -1, -1));

        s39.setIcon(new javax.swing.ImageIcon("/home/vasan12sp/Desktop/seat1.png")); // NOI18N
        s39.setText("39");
        getContentPane().add(s39, new org.netbeans.lib.awtextra.AbsoluteConstraints(273, 115, -1, -1));

        s45.setIcon(new javax.swing.ImageIcon("/home/vasan12sp/Desktop/seat1.png")); // NOI18N
        s45.setText("45");
        getContentPane().add(s45, new org.netbeans.lib.awtextra.AbsoluteConstraints(273, 209, -1, -1));

        s42.setIcon(new javax.swing.ImageIcon("/home/vasan12sp/Desktop/seat1.png")); // NOI18N
        s42.setText("42");
        getContentPane().add(s42, new org.netbeans.lib.awtextra.AbsoluteConstraints(273, 162, -1, -1));

        s48.setIcon(new javax.swing.ImageIcon("/home/vasan12sp/Desktop/seat1.png")); // NOI18N
        s48.setText("48");
        getContentPane().add(s48, new org.netbeans.lib.awtextra.AbsoluteConstraints(273, 256, -1, -1));

        s51.setIcon(new javax.swing.ImageIcon("/home/vasan12sp/Desktop/seat1.png")); // NOI18N
        s51.setText("51");
        getContentPane().add(s51, new org.netbeans.lib.awtextra.AbsoluteConstraints(273, 303, -1, -1));

        s54.setIcon(new javax.swing.ImageIcon("/home/vasan12sp/Desktop/seat1.png")); // NOI18N
        s54.setText("54");
        getContentPane().add(s54, new org.netbeans.lib.awtextra.AbsoluteConstraints(273, 350, -1, -1));

        s57.setIcon(new javax.swing.ImageIcon("/home/vasan12sp/Desktop/seat1.png")); // NOI18N
        s57.setText("57");
        getContentPane().add(s57, new org.netbeans.lib.awtextra.AbsoluteConstraints(273, 397, -1, -1));

        s60.setIcon(new javax.swing.ImageIcon("/home/vasan12sp/Desktop/seat1.png")); // NOI18N
        s60.setText("60");
        getContentPane().add(s60, new org.netbeans.lib.awtextra.AbsoluteConstraints(273, 444, -1, -1));

        s63.setIcon(new javax.swing.ImageIcon("/home/vasan12sp/Desktop/seat1.png")); // NOI18N
        s63.setText("63");
        getContentPane().add(s63, new org.netbeans.lib.awtextra.AbsoluteConstraints(273, 491, -1, -1));

        s66.setIcon(new javax.swing.ImageIcon("/home/vasan12sp/Desktop/seat1.png")); // NOI18N
        s66.setText("66");
        getContentPane().add(s66, new org.netbeans.lib.awtextra.AbsoluteConstraints(273, 538, -1, -1));

        s69.setIcon(new javax.swing.ImageIcon("/home/vasan12sp/Desktop/seat1.png")); // NOI18N
        s69.setText("69");
        getContentPane().add(s69, new org.netbeans.lib.awtextra.AbsoluteConstraints(273, 585, -1, -1));

        s72.setIcon(new javax.swing.ImageIcon("/home/vasan12sp/Desktop/seat1.png")); // NOI18N
        s72.setText("72");
        getContentPane().add(s72, new org.netbeans.lib.awtextra.AbsoluteConstraints(273, 632, -1, -1));

        s75.setIcon(new javax.swing.ImageIcon("/home/vasan12sp/Desktop/seat1.png")); // NOI18N
        s75.setText("75");
        getContentPane().add(s75, new org.netbeans.lib.awtextra.AbsoluteConstraints(273, 679, -1, -1));

        s35.setIcon(new javax.swing.ImageIcon("/home/vasan12sp/Desktop/seat1.png")); // NOI18N
        s35.setText("35");
        getContentPane().add(s35, new org.netbeans.lib.awtextra.AbsoluteConstraints(377, 68, -1, -1));

        s38.setIcon(new javax.swing.ImageIcon("/home/vasan12sp/Desktop/seat1.png")); // NOI18N
        s38.setText("38");
        getContentPane().add(s38, new org.netbeans.lib.awtextra.AbsoluteConstraints(377, 115, -1, -1));

        s41.setIcon(new javax.swing.ImageIcon("/home/vasan12sp/Desktop/seat1.png")); // NOI18N
        s41.setText("41");
        getContentPane().add(s41, new org.netbeans.lib.awtextra.AbsoluteConstraints(377, 162, -1, -1));

        s44.setIcon(new javax.swing.ImageIcon("/home/vasan12sp/Desktop/seat1.png")); // NOI18N
        s44.setText("44");
        getContentPane().add(s44, new org.netbeans.lib.awtextra.AbsoluteConstraints(377, 209, -1, -1));

        s47.setIcon(new javax.swing.ImageIcon("/home/vasan12sp/Desktop/seat1.png")); // NOI18N
        s47.setText("47");
        getContentPane().add(s47, new org.netbeans.lib.awtextra.AbsoluteConstraints(378, 256, -1, -1));

        s50.setIcon(new javax.swing.ImageIcon("/home/vasan12sp/Desktop/seat1.png")); // NOI18N
        s50.setText("50");
        getContentPane().add(s50, new org.netbeans.lib.awtextra.AbsoluteConstraints(375, 303, -1, -1));

        s53.setIcon(new javax.swing.ImageIcon("/home/vasan12sp/Desktop/seat1.png")); // NOI18N
        s53.setText("53");
        getContentPane().add(s53, new org.netbeans.lib.awtextra.AbsoluteConstraints(377, 350, -1, -1));

        s56.setIcon(new javax.swing.ImageIcon("/home/vasan12sp/Desktop/seat1.png")); // NOI18N
        s56.setText("56");
        getContentPane().add(s56, new org.netbeans.lib.awtextra.AbsoluteConstraints(376, 397, -1, -1));

        s59.setIcon(new javax.swing.ImageIcon("/home/vasan12sp/Desktop/seat1.png")); // NOI18N
        s59.setText("59");
        getContentPane().add(s59, new org.netbeans.lib.awtextra.AbsoluteConstraints(378, 444, -1, -1));

        s62.setIcon(new javax.swing.ImageIcon("/home/vasan12sp/Desktop/seat1.png")); // NOI18N
        s62.setText("62");
        getContentPane().add(s62, new org.netbeans.lib.awtextra.AbsoluteConstraints(377, 491, -1, -1));

        s65.setIcon(new javax.swing.ImageIcon("/home/vasan12sp/Desktop/seat1.png")); // NOI18N
        s65.setText("65");
        getContentPane().add(s65, new org.netbeans.lib.awtextra.AbsoluteConstraints(378, 538, -1, -1));

        s58.setIcon(new javax.swing.ImageIcon("/home/vasan12sp/Desktop/seat1.png")); // NOI18N
        s58.setText("58");
        getContentPane().add(s58, new org.netbeans.lib.awtextra.AbsoluteConstraints(482, 444, -1, -1));

        s55.setIcon(new javax.swing.ImageIcon("/home/vasan12sp/Desktop/seat1.png")); // NOI18N
        s55.setText("55");
        getContentPane().add(s55, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 397, -1, -1));

        s64.setIcon(new javax.swing.ImageIcon("/home/vasan12sp/Desktop/seat1.png")); // NOI18N
        s64.setText("64");
        getContentPane().add(s64, new org.netbeans.lib.awtextra.AbsoluteConstraints(482, 538, -1, -1));

        s61.setIcon(new javax.swing.ImageIcon("/home/vasan12sp/Desktop/seat1.png")); // NOI18N
        s61.setText("61");
        getContentPane().add(s61, new org.netbeans.lib.awtextra.AbsoluteConstraints(481, 491, -1, -1));

        s70.setIcon(new javax.swing.ImageIcon("/home/vasan12sp/Desktop/seat1.png")); // NOI18N
        s70.setText("70");
        getContentPane().add(s70, new org.netbeans.lib.awtextra.AbsoluteConstraints(478, 632, -1, -1));

        s67.setIcon(new javax.swing.ImageIcon("/home/vasan12sp/Desktop/seat1.png")); // NOI18N
        s67.setText("67");
        getContentPane().add(s67, new org.netbeans.lib.awtextra.AbsoluteConstraints(483, 585, -1, -1));

        s73.setIcon(new javax.swing.ImageIcon("/home/vasan12sp/Desktop/seat1.png")); // NOI18N
        s73.setText("73");
        getContentPane().add(s73, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 679, -1, -1));

        s74.setIcon(new javax.swing.ImageIcon("/home/vasan12sp/Desktop/seat1.png")); // NOI18N
        s74.setText("74");
        getContentPane().add(s74, new org.netbeans.lib.awtextra.AbsoluteConstraints(376, 679, -1, -1));

        s68.setIcon(new javax.swing.ImageIcon("/home/vasan12sp/Desktop/seat1.png")); // NOI18N
        s68.setText("68");
        getContentPane().add(s68, new org.netbeans.lib.awtextra.AbsoluteConstraints(378, 585, -1, -1));

        s71.setIcon(new javax.swing.ImageIcon("/home/vasan12sp/Desktop/seat1.png")); // NOI18N
        s71.setText("71");
        getContentPane().add(s71, new org.netbeans.lib.awtextra.AbsoluteConstraints(376, 632, -1, -1));

        s52.setIcon(new javax.swing.ImageIcon("/home/vasan12sp/Desktop/seat1.png")); // NOI18N
        s52.setText("52");
        getContentPane().add(s52, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 350, -1, -1));

        s34.setIcon(new javax.swing.ImageIcon("/home/vasan12sp/Desktop/seat1.png")); // NOI18N
        s34.setText("34");
        getContentPane().add(s34, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 68, -1, -1));

        s37.setIcon(new javax.swing.ImageIcon("/home/vasan12sp/Desktop/seat1.png")); // NOI18N
        s37.setText("37");
        getContentPane().add(s37, new org.netbeans.lib.awtextra.AbsoluteConstraints(481, 115, -1, -1));

        s40.setIcon(new javax.swing.ImageIcon("/home/vasan12sp/Desktop/seat1.png")); // NOI18N
        s40.setText("40");
        getContentPane().add(s40, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 162, -1, -1));

        s43.setIcon(new javax.swing.ImageIcon("/home/vasan12sp/Desktop/seat1.png")); // NOI18N
        s43.setText("43");
        getContentPane().add(s43, new org.netbeans.lib.awtextra.AbsoluteConstraints(482, 209, -1, -1));

        s46.setIcon(new javax.swing.ImageIcon("/home/vasan12sp/Desktop/seat1.png")); // NOI18N
        s46.setText("46");
        getContentPane().add(s46, new org.netbeans.lib.awtextra.AbsoluteConstraints(482, 256, -1, -1));

        s49.setIcon(new javax.swing.ImageIcon("/home/vasan12sp/Desktop/seat1.png")); // NOI18N
        s49.setText("49");
        getContentPane().add(s49, new org.netbeans.lib.awtextra.AbsoluteConstraints(479, 303, -1, -1));

        jButton1.setBackground(new java.awt.Color(0, 51, 51));
        jButton1.setFont(new java.awt.Font("Cantarell", 1, 24)); // NOI18N
        jButton1.setForeground(new java.awt.Color(102, 255, 255));
        jButton1.setText("CONTINUE");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(117, 738, -1, -1));

        jButton2.setBackground(new java.awt.Color(0, 51, 51));
        jButton2.setFont(new java.awt.Font("Cantarell", 1, 24)); // NOI18N
        jButton2.setForeground(new java.awt.Color(102, 255, 255));
        jButton2.setText("CANCEL");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(338, 738, -1, -1));

        jLabel1.setIcon(new javax.swing.ImageIcon("/home/vasan12sp/Desktop/solid6.jpg")); // NOI18N
        jLabel1.setText("jLabel1");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(-10, 0, 620, 800));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        System.exit(0);
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        int selected=selectedSeats.size();
        if(selected>max || selected<max){
            JOptionPane.showMessageDialog(this,"Select "+max+" seats");
        }else{
            //the frame to get the passenger details
            
            
            if(selectedSeats.size()==1){
                new addPassenger(selectedSeats,mobno,busid,date,true).setVisible(true);
            }else{
                new addPassenger(selectedSeats,mobno,busid,date,false).setVisible(true);
            }
            
                
            
            this.setVisible(false);
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(seatSelection.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(seatSelection.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(seatSelection.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(seatSelection.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                String a="",b="",c="";
                int n=0;
                new seatSelection(a,b,n,c).setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JButton s1;
    private javax.swing.JButton s10;
    private javax.swing.JButton s11;
    private javax.swing.JButton s12;
    private javax.swing.JButton s13;
    private javax.swing.JButton s14;
    private javax.swing.JButton s15;
    private javax.swing.JButton s16;
    private javax.swing.JButton s17;
    private javax.swing.JButton s18;
    private javax.swing.JButton s19;
    private javax.swing.JButton s2;
    private javax.swing.JButton s20;
    private javax.swing.JButton s21;
    private javax.swing.JButton s22;
    private javax.swing.JButton s23;
    private javax.swing.JButton s24;
    private javax.swing.JButton s25;
    private javax.swing.JButton s26;
    private javax.swing.JButton s27;
    private javax.swing.JButton s28;
    private javax.swing.JButton s29;
    private javax.swing.JButton s3;
    private javax.swing.JButton s30;
    private javax.swing.JButton s31;
    private javax.swing.JButton s32;
    private javax.swing.JButton s33;
    private javax.swing.JButton s34;
    private javax.swing.JButton s35;
    private javax.swing.JButton s36;
    private javax.swing.JButton s37;
    private javax.swing.JButton s38;
    private javax.swing.JButton s39;
    private javax.swing.JButton s4;
    private javax.swing.JButton s40;
    private javax.swing.JButton s41;
    private javax.swing.JButton s42;
    private javax.swing.JButton s43;
    private javax.swing.JButton s44;
    private javax.swing.JButton s45;
    private javax.swing.JButton s46;
    private javax.swing.JButton s47;
    private javax.swing.JButton s48;
    private javax.swing.JButton s49;
    private javax.swing.JButton s5;
    private javax.swing.JButton s50;
    private javax.swing.JButton s51;
    private javax.swing.JButton s52;
    private javax.swing.JButton s53;
    private javax.swing.JButton s54;
    private javax.swing.JButton s55;
    private javax.swing.JButton s56;
    private javax.swing.JButton s57;
    private javax.swing.JButton s58;
    private javax.swing.JButton s59;
    private javax.swing.JButton s6;
    private javax.swing.JButton s60;
    private javax.swing.JButton s61;
    private javax.swing.JButton s62;
    private javax.swing.JButton s63;
    private javax.swing.JButton s64;
    private javax.swing.JButton s65;
    private javax.swing.JButton s66;
    private javax.swing.JButton s67;
    private javax.swing.JButton s68;
    private javax.swing.JButton s69;
    private javax.swing.JButton s7;
    private javax.swing.JButton s70;
    private javax.swing.JButton s71;
    private javax.swing.JButton s72;
    private javax.swing.JButton s73;
    private javax.swing.JButton s74;
    private javax.swing.JButton s75;
    private javax.swing.JButton s8;
    private javax.swing.JButton s9;
    // End of variables declaration//GEN-END:variables
}
