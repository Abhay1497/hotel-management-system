import java.util.*;
import java.sql.*;
import java.text.SimpleDateFormat;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.AbstractTableModel;

public class Availability extends javax.swing.JFrame {

    /** Creates new form Availability */
    int ageDays;
    
    Connection con;
    Statement stmt,smt1;
    ResultSet rs;
    java.util.Date dt1,dt2;
    public Object obj1,obj2,obj3,obj4,obj5,obj6;
    String diffday;
    
    public Availability() {
        initComponents();
        try
        {
         Class .forName("com.mysql.jdbc.Driver");
         con = DriverManager.getConnection("jdbc:mysql://localhost:3306/hotel?zeroDateTimeBehavior=convertToNull","root","");
         jDateChooser1.setDate(Calendar.getInstance().getTime());
        }
        catch(Exception e)
        {
         System.out.println(e.getMessage());
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jLabel9 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jButton4 = new javax.swing.JButton();
        jLabel10 = new javax.swing.JLabel();
        jTextField4 = new javax.swing.JTextField();
        jButton3 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jDateChooser1 = new com.toedter.calendar.JDateChooser();
        jDateChooser2 = new com.toedter.calendar.JDateChooser();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Availibilty Checking Form");
        setLocationByPlatform(true);
        setResizable(false);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent evt) {
                formWindowClosing(evt);
            }
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel4.setText("Departure Date");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 230, -1, 20));

        jTable1.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Room No.", "Room Type", "Bed Type", "Tariff Per Room"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jTable1.setSelectionMode(javax.swing.ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
        jTable1.getTableHeader().setReorderingAllowed(false);
        jTable1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable1MouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTable1);
        if (jTable1.getColumnModel().getColumnCount() > 0) {
            jTable1.getColumnModel().getColumn(0).setResizable(false);
            jTable1.getColumnModel().getColumn(0).setPreferredWidth(60);
            jTable1.getColumnModel().getColumn(1).setResizable(false);
            jTable1.getColumnModel().getColumn(1).setPreferredWidth(70);
            jTable1.getColumnModel().getColumn(2).setResizable(false);
            jTable1.getColumnModel().getColumn(2).setPreferredWidth(70);
            jTable1.getColumnModel().getColumn(3).setResizable(false);
            jTable1.getColumnModel().getColumn(3).setPreferredWidth(90);
        }

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 280, 560, 241));

        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel9.setText("List of Availabale Room");
        jPanel1.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 260, -1, -1));

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel3.setText("Arrival Date");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 230, -1, -1));

        jButton4.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jButton4.setText("Book Room");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 310, 110, -1));

        jLabel10.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel10.setText("Booking for");
        jPanel1.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 230, -1, -1));

        jTextField4.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jTextField4.setEnabled(false);
        jPanel1.add(jTextField4, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 230, 75, -1));

        jButton3.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jButton3.setText("Close");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 350, 110, -1));

        jButton2.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jButton2.setText("Check Room");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 270, 110, -1));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/hotel1320x742.jpg"))); // NOI18N
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 0, 320, -1));
        jPanel1.add(jDateChooser1, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 230, 130, -1));
        jPanel1.add(jDateChooser2, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 230, 130, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 40, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 532, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    static final long ONE_HOUR = 60 * 60 * 1000L;
    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
       this.dispose();
    }//GEN-LAST:event_jButton3ActionPerformed
    //CHECKS THE RROM AVAILIBILITY AFTER ENTERING DATES 
    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        final Object[] columnNames=new String[] {"Room No.","Room Type","Bed Type","Tariff Per Room"};
        SimpleDateFormat sdf= new SimpleDateFormat("yyyy-MM-dd"); 
        DefaultTableModel dtm=new DefaultTableModel(columnNames,0);
        dt1=jDateChooser1.getDate();
        dt2=jDateChooser2.getDate();
        String strdtver1=(String) sdf.format(jDateChooser1.getDate());
        String strdtver2=(String) sdf.format(jDateChooser2.getDate());
        long diff=((dt2.getTime()-dt1.getTime()+ONE_HOUR)/(ONE_HOUR*24));
        diffday=Long.toString(diff);
        jTextField4.setText(diffday+"  day(s)");
        String sql="SELECT room_no, room_type, room_bed, room_rate FROM roomdetail "
                + "where room_no NOT IN (SELECT room_no FROM bookingtable WHERE DATE(date_to) >= '" 
                + strdtver1 + "' AND DATE(date_fro) <= '" + strdtver2 + "');";
                
                
                /*"SELECT roomdetail.room_no, room_type, room_bed, room_rate "
                + "FROM roomdetail LEFT JOIN bookingtable "
                + "ON roomdetail.room_no=bookingtable.room_no AND DATE(date_fro) >= '" 
                + strdtver1 + "' AND DATE(date_to) <= '" + strdtver2 + "' WHERE bookingtable.room_no IS NULL;";*/
        try
        {
           smt1=con.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE,ResultSet.CONCUR_UPDATABLE);
           rs = smt1.executeQuery(sql);
           int i = 0;
           while(rs.next())
           {
                String var1=rs.getString(1);
                String var2=rs.getString(2);
                String var3=rs.getString(3);
                String var4=Integer.toString(rs.getInt(4));

                dtm.addRow(new Vector());
                dtm.setValueAt(var1, i, 0);
                dtm.setValueAt(var2, i, 1);
                dtm.setValueAt(var3, i, 2);
                dtm.setValueAt(var4, i, 3);
                i++;
           }
               jTable1.setModel(dtm);
               
               /*Object obj1 = GetData(jTable1, 2, 2);
               System.out.println("Cell value of 3 column and 3 row :" + obj1);
               Object obj2 = GetData(jTable1, 2, 1);
               System.out.println("Cell value of 2 column and 3 row :" + obj2);*/
        }
        catch(Exception ex)
        {
           System.out.println(ex.getMessage());
           ex.printStackTrace();
        }
    }//GEN-LAST:event_jButton2ActionPerformed

    public Object GetData(JTable jTable1, int row_index, int col_index){
		return jTable1.getModel().getValueAt(row_index, col_index);
	}
    //OPENS THE BOOKING FRAME FOR BOOKING CONFIRMATION    
    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        BookRoom br=new BookRoom(obj1,obj2,obj3,obj4,dt1,dt2,diffday);
        br.setVisible(true);
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jTable1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable1MouseClicked
        int rno=jTable1.getSelectedRow();
       
        obj1 = GetData(jTable1, rno, 0);
        obj2 = GetData(jTable1, rno, 1);
        obj3 = GetData(jTable1, rno, 2);
        obj4 = GetData(jTable1, rno, 3);
       
        obj5=dt1;
        obj6=dt2;
    }//GEN-LAST:event_jTable1MouseClicked

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        jPanel1.setOpaque(true);
        jLabel9.setOpaque(true);
        jTable1.setToolTipText("Select the Room want to reserve");
        jButton4.setToolTipText("Select the Room from the list and click this button for Room Booking");
    }//GEN-LAST:event_formWindowOpened

    private void formWindowClosing(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosing
       
    }//GEN-LAST:event_formWindowClosing

    /**
     * @param args the command line arguments
     
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {

            public void run() {
                new Availability().setVisible(true);
            }
        });
    }*/
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private com.toedter.calendar.JDateChooser jDateChooser1;
    private com.toedter.calendar.JDateChooser jDateChooser2;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    public javax.swing.JTable jTable1;
    private javax.swing.JTextField jTextField4;
    // End of variables declaration//GEN-END:variables
}
