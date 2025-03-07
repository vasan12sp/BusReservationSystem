
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import limit.limitfolder.limitclass;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */

/**
 *
 * @author vasan12sp
 */
public class addPassenger extends javax.swing.JFrame {

    /**
     * Creates new form addPassenger
     */
    int seatNum;
    String mobno,busid,date;
    boolean last;
    ArrayList<Integer> selectedSeats=new ArrayList<>();
    public addPassenger(ArrayList<Integer> selectedSeats,String mobno,String busid,String date,boolean islast) {
        initComponents();
        this.selectedSeats=selectedSeats;
        nameTf.setDocument(new limitclass(20));
        idTf.setDocument(new limitclass(20));
        ageTf.setDocument(new limitclass(2));
        last=islast;
        seatNum=selectedSeats.get(0);
        selectedSeats.remove(0);
        
        jLabel6.setText("Seat Number: "+seatNum);
        this.mobno=mobno;
        this.busid=busid;
        this.date=date;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        nameTf = new javax.swing.JTextField();
        ageTf = new javax.swing.JTextField();
        idTf = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("DejaVu Serif Condensed", 1, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(51, 255, 255));
        jLabel1.setText("PASSENGER INFORMATION");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(112, 46, -1, -1));

        jLabel2.setFont(new java.awt.Font("Cantarell", 1, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(153, 255, 255));
        jLabel2.setText("NAME");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(152, 154, -1, -1));

        jLabel3.setFont(new java.awt.Font("Cantarell", 1, 24)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(153, 255, 255));
        jLabel3.setText("AGE");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(175, 232, -1, -1));

        jLabel4.setFont(new java.awt.Font("Cantarell", 1, 24)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(153, 255, 255));
        jLabel4.setText("ID NO");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(156, 322, -1, -1));

        nameTf.setBackground(new java.awt.Color(0, 51, 51));
        nameTf.setFont(new java.awt.Font("Cantarell", 0, 24)); // NOI18N
        nameTf.setForeground(new java.awt.Color(153, 255, 255));
        getContentPane().add(nameTf, new org.netbeans.lib.awtextra.AbsoluteConstraints(286, 154, 229, -1));

        ageTf.setBackground(new java.awt.Color(0, 51, 51));
        ageTf.setFont(new java.awt.Font("Cantarell", 0, 24)); // NOI18N
        ageTf.setForeground(new java.awt.Color(153, 255, 255));
        getContentPane().add(ageTf, new org.netbeans.lib.awtextra.AbsoluteConstraints(286, 232, 229, -1));

        idTf.setBackground(new java.awt.Color(0, 51, 51));
        idTf.setFont(new java.awt.Font("Cantarell", 0, 24)); // NOI18N
        idTf.setForeground(new java.awt.Color(153, 255, 255));
        getContentPane().add(idTf, new org.netbeans.lib.awtextra.AbsoluteConstraints(286, 319, 229, -1));

        jLabel5.setForeground(new java.awt.Color(153, 255, 255));
        jLabel5.setText("*VALID ID PROOF WILL BE CHECKED AT THE TIME OF TRAVELLING");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(188, 361, -1, -1));

        jButton1.setBackground(new java.awt.Color(0, 51, 51));
        jButton1.setFont(new java.awt.Font("Cantarell", 1, 24)); // NOI18N
        jButton1.setForeground(new java.awt.Color(204, 255, 255));
        jButton1.setText("ADD");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 410, -1, -1));

        jButton2.setBackground(new java.awt.Color(0, 51, 51));
        jButton2.setFont(new java.awt.Font("Cantarell", 1, 24)); // NOI18N
        jButton2.setForeground(new java.awt.Color(204, 255, 255));
        jButton2.setText("CANCEL");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 410, -1, -1));
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(645, 120, -1, -1));

        jLabel7.setIcon(new javax.swing.ImageIcon("/home/vasan12sp/Desktop/solid 1 new.jpg")); // NOI18N
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, -10, 730, 480));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        System.exit(0);
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        String name,id;
        int age;
        name=nameTf.getText().toUpperCase();
        id=idTf.getText();
        age=Integer.parseInt(ageTf.getText());
        
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con= DriverManager.getConnection("jdbc:mysql://localhost:3306/busbooking","root","");
            Statement st = con.createStatement();
            String q=String.format("update services set passenger='%s',age='%d',id='%s',mobileno='%s' where busid='%s' and date='%s' and seat='%d'",name,age,id,mobno,busid,date,seatNum);
                        
            st.executeUpdate(q);
            JOptionPane.showMessageDialog(this,"Added Successfully");
            if(last){
                
                this.setVisible(false);
                new myTickets(mobno).setVisible(true);
            }else{
                if(selectedSeats.size()==1){
                    last=true;
                }
                new addPassenger(selectedSeats,mobno,busid,date,last).setVisible(true);
                
            }
            this.setVisible(false);
            
            con.close();
        }catch(Exception e){
            System.out.println(e); 
            JOptionPane.showMessageDialog(this,"Exception Occured");
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
            java.util.logging.Logger.getLogger(addPassenger.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(addPassenger.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(addPassenger.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(addPassenger.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                ArrayList<Integer> seatNum=new ArrayList<>();
                String mobno="";
                String busid="";
                String date="";
                boolean last=false;
                new addPassenger(seatNum,mobno,busid,date,last).setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField ageTf;
    private javax.swing.JTextField idTf;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JTextField nameTf;
    // End of variables declaration//GEN-END:variables
}
