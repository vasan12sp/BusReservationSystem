
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

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        s5.setIcon(new javax.swing.ImageIcon("/home/vasan12sp/Desktop/seat1.png")); // NOI18N
        s5.setText("05");

        s7.setIcon(new javax.swing.ImageIcon("/home/vasan12sp/Desktop/seat1.png")); // NOI18N
        s7.setText("07");

        s8.setIcon(new javax.swing.ImageIcon("/home/vasan12sp/Desktop/seat1.png")); // NOI18N
        s8.setText("08");

        s6.setIcon(new javax.swing.ImageIcon("/home/vasan12sp/Desktop/seat1.png")); // NOI18N
        s6.setText("06");

        s9.setIcon(new javax.swing.ImageIcon("/home/vasan12sp/Desktop/seat1.png")); // NOI18N
        s9.setText("09");

        s10.setIcon(new javax.swing.ImageIcon("/home/vasan12sp/Desktop/seat1.png")); // NOI18N
        s10.setText("10");

        s11.setIcon(new javax.swing.ImageIcon("/home/vasan12sp/Desktop/seat1.png")); // NOI18N
        s11.setText("11");

        s12.setIcon(new javax.swing.ImageIcon("/home/vasan12sp/Desktop/seat1.png")); // NOI18N
        s12.setText("12");

        s13.setIcon(new javax.swing.ImageIcon("/home/vasan12sp/Desktop/seat1.png")); // NOI18N
        s13.setText("13");

        s14.setIcon(new javax.swing.ImageIcon("/home/vasan12sp/Desktop/seat1.png")); // NOI18N
        s14.setText("14");

        s15.setIcon(new javax.swing.ImageIcon("/home/vasan12sp/Desktop/seat1.png")); // NOI18N
        s15.setText("15");

        s16.setIcon(new javax.swing.ImageIcon("/home/vasan12sp/Desktop/seat1.png")); // NOI18N
        s16.setText("16");

        s17.setIcon(new javax.swing.ImageIcon("/home/vasan12sp/Desktop/seat1.png")); // NOI18N
        s17.setText("17");

        s18.setIcon(new javax.swing.ImageIcon("/home/vasan12sp/Desktop/seat1.png")); // NOI18N
        s18.setText("18");

        s33.setIcon(new javax.swing.ImageIcon("/home/vasan12sp/Desktop/seat1.png")); // NOI18N
        s33.setText("33");

        s19.setIcon(new javax.swing.ImageIcon("/home/vasan12sp/Desktop/seat1.png")); // NOI18N
        s19.setText("19");

        s21.setIcon(new javax.swing.ImageIcon("/home/vasan12sp/Desktop/seat1.png")); // NOI18N
        s21.setText("21");

        s22.setIcon(new javax.swing.ImageIcon("/home/vasan12sp/Desktop/seat1.png")); // NOI18N
        s22.setText("22");

        s24.setIcon(new javax.swing.ImageIcon("/home/vasan12sp/Desktop/seat1.png")); // NOI18N
        s24.setText("24");

        s23.setIcon(new javax.swing.ImageIcon("/home/vasan12sp/Desktop/seat1.png")); // NOI18N
        s23.setText("23");

        s27.setIcon(new javax.swing.ImageIcon("/home/vasan12sp/Desktop/seat1.png")); // NOI18N
        s27.setText("27");

        s3.setIcon(new javax.swing.ImageIcon("/home/vasan12sp/Desktop/seat1.png")); // NOI18N
        s3.setText("03");

        s4.setIcon(new javax.swing.ImageIcon("/home/vasan12sp/Desktop/seat1.png")); // NOI18N
        s4.setText("04");

        s25.setIcon(new javax.swing.ImageIcon("/home/vasan12sp/Desktop/seat1.png")); // NOI18N
        s25.setText("25");

        s1.setIcon(new javax.swing.ImageIcon("/home/vasan12sp/Desktop/seat1.png")); // NOI18N
        s1.setText("01");

        s2.setIcon(new javax.swing.ImageIcon("/home/vasan12sp/Desktop/seat1.png")); // NOI18N
        s2.setText("02");

        s26.setIcon(new javax.swing.ImageIcon("/home/vasan12sp/Desktop/seat1.png")); // NOI18N
        s26.setText("26");

        s28.setIcon(new javax.swing.ImageIcon("/home/vasan12sp/Desktop/seat1.png")); // NOI18N
        s28.setText("28");

        s29.setIcon(new javax.swing.ImageIcon("/home/vasan12sp/Desktop/seat1.png")); // NOI18N
        s29.setText("29");

        s30.setIcon(new javax.swing.ImageIcon("/home/vasan12sp/Desktop/seat1.png")); // NOI18N
        s30.setText("30");

        s20.setIcon(new javax.swing.ImageIcon("/home/vasan12sp/Desktop/seat1.png")); // NOI18N
        s20.setText("20");

        s32.setIcon(new javax.swing.ImageIcon("/home/vasan12sp/Desktop/seat1.png")); // NOI18N
        s32.setText("32");

        s31.setIcon(new javax.swing.ImageIcon("/home/vasan12sp/Desktop/seat1.png")); // NOI18N
        s31.setText("31");

        s36.setIcon(new javax.swing.ImageIcon("/home/vasan12sp/Desktop/seat1.png")); // NOI18N
        s36.setText("36");

        s39.setIcon(new javax.swing.ImageIcon("/home/vasan12sp/Desktop/seat1.png")); // NOI18N
        s39.setText("39");

        s45.setIcon(new javax.swing.ImageIcon("/home/vasan12sp/Desktop/seat1.png")); // NOI18N
        s45.setText("45");

        s42.setIcon(new javax.swing.ImageIcon("/home/vasan12sp/Desktop/seat1.png")); // NOI18N
        s42.setText("42");

        s48.setIcon(new javax.swing.ImageIcon("/home/vasan12sp/Desktop/seat1.png")); // NOI18N
        s48.setText("48");

        s51.setIcon(new javax.swing.ImageIcon("/home/vasan12sp/Desktop/seat1.png")); // NOI18N
        s51.setText("51");

        s54.setIcon(new javax.swing.ImageIcon("/home/vasan12sp/Desktop/seat1.png")); // NOI18N
        s54.setText("54");

        s57.setIcon(new javax.swing.ImageIcon("/home/vasan12sp/Desktop/seat1.png")); // NOI18N
        s57.setText("57");

        s60.setIcon(new javax.swing.ImageIcon("/home/vasan12sp/Desktop/seat1.png")); // NOI18N
        s60.setText("60");

        s63.setIcon(new javax.swing.ImageIcon("/home/vasan12sp/Desktop/seat1.png")); // NOI18N
        s63.setText("63");

        s66.setIcon(new javax.swing.ImageIcon("/home/vasan12sp/Desktop/seat1.png")); // NOI18N
        s66.setText("66");

        s69.setIcon(new javax.swing.ImageIcon("/home/vasan12sp/Desktop/seat1.png")); // NOI18N
        s69.setText("69");

        s72.setIcon(new javax.swing.ImageIcon("/home/vasan12sp/Desktop/seat1.png")); // NOI18N
        s72.setText("72");

        s75.setIcon(new javax.swing.ImageIcon("/home/vasan12sp/Desktop/seat1.png")); // NOI18N
        s75.setText("75");

        s35.setIcon(new javax.swing.ImageIcon("/home/vasan12sp/Desktop/seat1.png")); // NOI18N
        s35.setText("35");

        s38.setIcon(new javax.swing.ImageIcon("/home/vasan12sp/Desktop/seat1.png")); // NOI18N
        s38.setText("38");

        s41.setIcon(new javax.swing.ImageIcon("/home/vasan12sp/Desktop/seat1.png")); // NOI18N
        s41.setText("41");

        s44.setIcon(new javax.swing.ImageIcon("/home/vasan12sp/Desktop/seat1.png")); // NOI18N
        s44.setText("44");

        s47.setIcon(new javax.swing.ImageIcon("/home/vasan12sp/Desktop/seat1.png")); // NOI18N
        s47.setText("47");

        s50.setIcon(new javax.swing.ImageIcon("/home/vasan12sp/Desktop/seat1.png")); // NOI18N
        s50.setText("50");

        s53.setIcon(new javax.swing.ImageIcon("/home/vasan12sp/Desktop/seat1.png")); // NOI18N
        s53.setText("53");

        s56.setIcon(new javax.swing.ImageIcon("/home/vasan12sp/Desktop/seat1.png")); // NOI18N
        s56.setText("56");

        s59.setIcon(new javax.swing.ImageIcon("/home/vasan12sp/Desktop/seat1.png")); // NOI18N
        s59.setText("59");

        s62.setIcon(new javax.swing.ImageIcon("/home/vasan12sp/Desktop/seat1.png")); // NOI18N
        s62.setText("62");

        s65.setIcon(new javax.swing.ImageIcon("/home/vasan12sp/Desktop/seat1.png")); // NOI18N
        s65.setText("65");

        s58.setIcon(new javax.swing.ImageIcon("/home/vasan12sp/Desktop/seat1.png")); // NOI18N
        s58.setText("58");

        s55.setIcon(new javax.swing.ImageIcon("/home/vasan12sp/Desktop/seat1.png")); // NOI18N
        s55.setText("55");

        s64.setIcon(new javax.swing.ImageIcon("/home/vasan12sp/Desktop/seat1.png")); // NOI18N
        s64.setText("64");

        s61.setIcon(new javax.swing.ImageIcon("/home/vasan12sp/Desktop/seat1.png")); // NOI18N
        s61.setText("61");

        s70.setIcon(new javax.swing.ImageIcon("/home/vasan12sp/Desktop/seat1.png")); // NOI18N
        s70.setText("70");

        s67.setIcon(new javax.swing.ImageIcon("/home/vasan12sp/Desktop/seat1.png")); // NOI18N
        s67.setText("67");

        s73.setIcon(new javax.swing.ImageIcon("/home/vasan12sp/Desktop/seat1.png")); // NOI18N
        s73.setText("73");

        s74.setIcon(new javax.swing.ImageIcon("/home/vasan12sp/Desktop/seat1.png")); // NOI18N
        s74.setText("74");

        s68.setIcon(new javax.swing.ImageIcon("/home/vasan12sp/Desktop/seat1.png")); // NOI18N
        s68.setText("68");

        s71.setIcon(new javax.swing.ImageIcon("/home/vasan12sp/Desktop/seat1.png")); // NOI18N
        s71.setText("71");

        s52.setIcon(new javax.swing.ImageIcon("/home/vasan12sp/Desktop/seat1.png")); // NOI18N
        s52.setText("52");

        s34.setIcon(new javax.swing.ImageIcon("/home/vasan12sp/Desktop/seat1.png")); // NOI18N
        s34.setText("34");

        s37.setIcon(new javax.swing.ImageIcon("/home/vasan12sp/Desktop/seat1.png")); // NOI18N
        s37.setText("37");

        s40.setIcon(new javax.swing.ImageIcon("/home/vasan12sp/Desktop/seat1.png")); // NOI18N
        s40.setText("40");

        s43.setIcon(new javax.swing.ImageIcon("/home/vasan12sp/Desktop/seat1.png")); // NOI18N
        s43.setText("43");

        s46.setIcon(new javax.swing.ImageIcon("/home/vasan12sp/Desktop/seat1.png")); // NOI18N
        s46.setText("46");

        s49.setIcon(new javax.swing.ImageIcon("/home/vasan12sp/Desktop/seat1.png")); // NOI18N
        s49.setText("49");

        jButton1.setFont(new java.awt.Font("Cantarell", 1, 24)); // NOI18N
        jButton1.setText("CONTINUE");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setFont(new java.awt.Font("Cantarell", 1, 24)); // NOI18N
        jButton2.setText("CANCEL");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(s1)
                        .addGap(18, 18, 18)
                        .addComponent(s2))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(s23)
                        .addGap(18, 18, 18)
                        .addComponent(s24))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(s3)
                        .addGap(18, 18, 18)
                        .addComponent(s4))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(s21)
                        .addGap(18, 18, 18)
                        .addComponent(s22))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(s17)
                            .addGap(18, 18, 18)
                            .addComponent(s18))
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(s15)
                            .addGap(18, 18, 18)
                            .addComponent(s16))
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(s13)
                            .addGap(18, 18, 18)
                            .addComponent(s14))
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(s7)
                            .addGap(18, 18, 18)
                            .addComponent(s8))
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(s5)
                            .addGap(18, 18, 18)
                            .addComponent(s6))
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                            .addComponent(s19)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(s20)
                            .addGap(6, 6, 6))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(s11)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(s12))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(s9)
                                .addGap(18, 18, 18)
                                .addComponent(s10))))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(s25)
                        .addGap(18, 18, 18)
                        .addComponent(s26))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(s27)
                        .addGap(18, 18, 18)
                        .addComponent(s28))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(s29)
                        .addGap(18, 18, 18)
                        .addComponent(s30)))
                .addGap(55, 55, 55)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(s72)
                                .addGap(18, 18, 18)
                                .addComponent(s71)
                                .addGap(18, 18, 18)
                                .addComponent(s70))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(s69)
                                .addGap(18, 18, 18)
                                .addComponent(s68)
                                .addGap(18, 18, 18)
                                .addComponent(s67))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(s36)
                                .addGap(18, 18, 18)
                                .addComponent(s35)
                                .addGap(18, 18, 18)
                                .addComponent(s34))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(s33)
                                .addGap(18, 18, 18)
                                .addComponent(s32)
                                .addGap(18, 18, 18)
                                .addComponent(s31))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(s39)
                                .addGap(18, 18, 18)
                                .addComponent(s38)
                                .addGap(18, 18, 18)
                                .addComponent(s37))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(s42)
                                .addGap(18, 18, 18)
                                .addComponent(s41)
                                .addGap(18, 18, 18)
                                .addComponent(s40))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(s45)
                                .addGap(18, 18, 18)
                                .addComponent(s44)
                                .addGap(18, 18, 18)
                                .addComponent(s43))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(s48)
                                .addGap(18, 18, 18)
                                .addComponent(s47)
                                .addGap(18, 18, 18)
                                .addComponent(s46))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(s51)
                                .addGap(18, 18, 18)
                                .addComponent(s50)
                                .addGap(18, 18, 18)
                                .addComponent(s49))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(s57)
                                .addGap(18, 18, 18)
                                .addComponent(s56)
                                .addGap(18, 18, 18)
                                .addComponent(s55))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(s60)
                                .addGap(18, 18, 18)
                                .addComponent(s59)
                                .addGap(18, 18, 18)
                                .addComponent(s58))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(s63)
                                .addGap(18, 18, 18)
                                .addComponent(s62)
                                .addGap(18, 18, 18)
                                .addComponent(s61))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(s66)
                                .addGap(18, 18, 18)
                                .addComponent(s65)
                                .addGap(18, 18, 18)
                                .addComponent(s64))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jButton2)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(s75)
                                        .addGap(18, 18, 18)
                                        .addComponent(s74)))
                                .addGap(18, 18, 18)
                                .addComponent(s73)))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(s54)
                        .addGap(18, 18, 18)
                        .addComponent(s53)
                        .addGap(18, 18, 18)
                        .addComponent(s52)
                        .addContainerGap(25, Short.MAX_VALUE))))
            .addGroup(layout.createSequentialGroup()
                .addGap(117, 117, 117)
                .addComponent(jButton1)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(s1)
                            .addComponent(s2)
                            .addComponent(s33)
                            .addComponent(s32)
                            .addComponent(s31))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(s3)
                                    .addComponent(s4))
                                .addComponent(s35, javax.swing.GroupLayout.Alignment.TRAILING))
                            .addComponent(s34)))
                    .addComponent(s36))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(s6)
                    .addComponent(s5)
                    .addComponent(s39)
                    .addComponent(s38)
                    .addComponent(s37))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(s7)
                            .addComponent(s8)
                            .addComponent(s42)
                            .addComponent(s41))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(s10)
                                    .addComponent(s9)
                                    .addComponent(s45)
                                    .addComponent(s44))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                .addComponent(s11)
                                                .addComponent(s12))
                                            .addComponent(s48)
                                            .addComponent(s47))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(layout.createSequentialGroup()
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                        .addComponent(s13)
                                                        .addComponent(s14))
                                                    .addComponent(s51)
                                                    .addComponent(s50))
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                    .addGroup(layout.createSequentialGroup()
                                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                                .addComponent(s16)
                                                                .addComponent(s15, javax.swing.GroupLayout.Alignment.TRAILING))
                                                            .addComponent(s54)
                                                            .addComponent(s53))
                                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                            .addGroup(layout.createSequentialGroup()
                                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                                    .addComponent(s17)
                                                                    .addComponent(s18)
                                                                    .addComponent(s57)
                                                                    .addComponent(s56))
                                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                                    .addGroup(layout.createSequentialGroup()
                                                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                                                .addComponent(s19)
                                                                                .addComponent(s20))
                                                                            .addComponent(s60)
                                                                            .addComponent(s59))
                                                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                                            .addGroup(layout.createSequentialGroup()
                                                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                                                                        .addComponent(s21)
                                                                                        .addComponent(s22))
                                                                                    .addComponent(s63)
                                                                                    .addComponent(s62))
                                                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                                                    .addGroup(layout.createSequentialGroup()
                                                                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                                                            .addComponent(s23)
                                                                                            .addComponent(s24)
                                                                                            .addComponent(s66)
                                                                                            .addComponent(s65))
                                                                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                                                            .addGroup(layout.createSequentialGroup()
                                                                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                                                                    .addComponent(s25)
                                                                                                    .addComponent(s26)
                                                                                                    .addComponent(s69)
                                                                                                    .addComponent(s68))
                                                                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                                                                    .addGroup(layout.createSequentialGroup()
                                                                                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                                                                            .addComponent(s27)
                                                                                                            .addComponent(s28)
                                                                                                            .addComponent(s72)
                                                                                                            .addComponent(s71))
                                                                                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                                                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                                                                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                                                                                                .addComponent(s29)
                                                                                                                .addComponent(s30))
                                                                                                            .addComponent(s75)
                                                                                                            .addComponent(s74)
                                                                                                            .addComponent(s73)))
                                                                                                    .addComponent(s70)))
                                                                                            .addComponent(s67)))
                                                                                    .addComponent(s64)))
                                                                            .addComponent(s61)))
                                                                    .addComponent(s58)))
                                                            .addComponent(s55)))
                                                    .addComponent(s52)))
                                            .addComponent(s49)))
                                    .addComponent(s46)))
                            .addComponent(s43)))
                    .addComponent(s40))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton1)
                    .addComponent(jButton2))
                .addContainerGap(15, Short.MAX_VALUE))
        );

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
