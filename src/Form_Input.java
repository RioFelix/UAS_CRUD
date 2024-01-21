/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
import javax.swing.JOptionPane;
import com.mysql.jdbc.*;
import java.sql.SQLException;
import javax.swing.table.DefaultTableModel;
import com.toedter.calendar.JDateChooser;
import java.text.SimpleDateFormat;
/**
 *
 * @author Icha
 */
public class Form_Input extends javax.swing.JFrame {
private JDateChooser chooser;
    /**
     * Creates new form Form_Input
     */
    public Form_Input() {
        initComponents();
        setTitle("APLIKASI INPUT STOK OBAT");
        this.setLocation(200, 100);
        Koneksi_db.openConnection();
        refreshobat();
        btn_edit.setEnabled(false);
    }
    
    private void simpanobat(){
    String sql="Insert into tb_dataobat values(?,?,?,?,?,?,?)";
    
    try{
        PreparedStatement st= (com.mysql.jdbc.PreparedStatement)
        Koneksi_db.conn.prepareStatement(sql);
        
        st.setString(1, txt_kode_obat.getText());
        st.setString(2, txt_nama_obat.getText());
        st.setString(3, txt_jenis_obat.getText());
        st.setString(4, txt_jumlah_stok.getText());
        st.setString(5, txt_harga_beli.getText());
        st.setString(6, txt_harga_jual.getText());
        String tanggal = new SimpleDateFormat("yyyy-MM-dd").format(jdate_exp.getDate());
        st.setString(7, tanggal);
        st.execute();
                JOptionPane.showMessageDialog(null, "Data Berhasil Disimpan");
        } 
    catch (SQLException e){
        JOptionPane.showMessageDialog(null, e);
        System.out.println(e);
    
        }
    
    }
    
    private void hapusobat(String KODE_OBAT){
        String sql="delete from tb_dataobat where Kode_Obat='"+KODE_OBAT+"'";
        Statement st;
        
        try{
            st= (com.mysql.jdbc.PreparedStatement)
            Koneksi_db.conn.prepareStatement(sql);
            st.execute(sql);
        
        } 
        catch (SQLException e){
            JOptionPane.showMessageDialog(null, e.getMessage());
                
         }
    }
    
    private void editobat(){
    String sql= 
            "update tb_dataobat set Kode_Obat=?,Nama_Obat=?,Jenis_Obat=?,Jumlah_Stok=?,Harga_Beli=?,Harga_Jual=?,Exp=? where Kode_Obat='"+txt_kode_obat.getText()+"'";
    
        try{
            PreparedStatement st= (com.mysql.jdbc.PreparedStatement)
            Koneksi_db.conn.prepareStatement(sql);
            st.setString(1, txt_kode_obat.getText());
            st.setString(2, txt_nama_obat.getText());
            st.setString(3, txt_jenis_obat.getText());
            st.setString(4, txt_jumlah_stok.getText());
            st.setString(5, txt_harga_beli.getText());
            st.setString(6, txt_harga_jual.getText());
            String tanggal = new SimpleDateFormat("yyyy-MM-dd").format(jdate_exp.getDate());
            st.setString(7, tanggal);
            st.execute();
                JOptionPane.showMessageDialog(null, "Data Berhasil Diedit");
       } 
       catch (SQLException e){
        JOptionPane.showMessageDialog(null, e);
    
       }
    }
    public void refreshobat(){
        Statement st;
        java.sql.ResultSet rs;
        try{
            st=(Statement) Koneksi_db.conn.createStatement();
            String sql="Select *from tb_dataobat order by Kode_Obat ASC";
            st.execute(sql);
            rs= st.getResultSet();
            String[]Header=
            {"Kode_Obat","Nama_Obat","Jenis_Obat","Jumlah_Stok","Harga_Beli","Harga_Jual","Exp"};
            
        int baris=0;
        rs.beforeFirst();
        while (rs.next()){
            baris = rs.getRow();
        }
            Object[][] dttbl=new Object[baris][7];
            rs.beforeFirst();
            int curbaris=0;
            while(rs.next()){
            dttbl[curbaris][0]=rs.getString("Kode_Obat");
            dttbl[curbaris][1]=rs.getString("Nama_Obat");
            dttbl[curbaris][2]=rs.getString("Jenis_Obat");
            dttbl[curbaris][3]=rs.getString("Jumlah_Stok");
            dttbl[curbaris][4]=rs.getString("Harga_Beli");
            dttbl[curbaris][5]=rs.getString("Harga_Jual");
            dttbl[curbaris][6]=rs.getString("Exp");
            curbaris++;
            }
            Table_data.setModel(new DefaultTableModel(dttbl,Header));
        }
            catch(java.sql.SQLException e){
            JOptionPane.showMessageDialog(null, e.getMessage());
            }
        
        }
    private void cleardata(){
        txt_kode_obat.setText("");
        txt_nama_obat.setText("");
        txt_jenis_obat.setText("");
        txt_jumlah_stok.setText("");
        txt_harga_jual.setText("");
        txt_harga_beli.setText("");
        txt_kode_obat.requestFocus();
        btn_edit.setEnabled(false);
        txt_kode_obat.setEnabled(true);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenu2 = new javax.swing.JMenu();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        txt_kode_obat = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        txt_nama_obat = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        txt_jenis_obat = new javax.swing.JTextField();
        txt_jumlah_stok = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        txt_harga_beli = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        txt_harga_jual = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        btn_reset = new javax.swing.JToggleButton();
        btn_simpan = new javax.swing.JToggleButton();
        btn_edit = new javax.swing.JToggleButton();
        btn_hapus = new javax.swing.JToggleButton();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        Table_data = new javax.swing.JTable();
        jdate_exp = new com.toedter.calendar.JDateChooser();
        jMenuBar2 = new javax.swing.JMenuBar();
        jMenu3 = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        jMenuItem2 = new javax.swing.JMenuItem();
        jMenuItem3 = new javax.swing.JMenuItem();
        jMenuItem4 = new javax.swing.JMenuItem();
        jMenuItem5 = new javax.swing.JMenuItem();
        jMenu4 = new javax.swing.JMenu();
        jMenuItem7 = new javax.swing.JMenuItem();
        jMenuItem8 = new javax.swing.JMenuItem();
        jMenuItem9 = new javax.swing.JMenuItem();
        jMenuItem10 = new javax.swing.JMenuItem();

        jMenu1.setText("File");
        jMenuBar1.add(jMenu1);

        jMenu2.setText("Edit");
        jMenuBar1.add(jMenu2);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(102, 102, 255));
        jPanel1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("APLIKASI  STOK OBAT");

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(51, 51, 51));
        jLabel2.setText("APOTEK HARKA FARMA");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel2)
                .addContainerGap(254, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jLabel2))
                .addContainerGap(23, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 720, 70));

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(51, 51, 51));
        jLabel3.setText("Data Obat");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 100, 120, -1));

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel4.setText("Kode Obat");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 130, -1, -1));

        txt_kode_obat.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        txt_kode_obat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_kode_obatActionPerformed(evt);
            }
        });
        getContentPane().add(txt_kode_obat, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 150, 310, -1));

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel5.setText("Nama Obat");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 190, -1, -1));

        txt_nama_obat.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        txt_nama_obat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_nama_obatActionPerformed(evt);
            }
        });
        getContentPane().add(txt_nama_obat, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 210, 310, -1));

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel6.setText("Jenis Obat");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 250, -1, -1));

        txt_jenis_obat.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        txt_jenis_obat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_jenis_obatActionPerformed(evt);
            }
        });
        getContentPane().add(txt_jenis_obat, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 270, 310, -1));

        txt_jumlah_stok.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        txt_jumlah_stok.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_jumlah_stokActionPerformed(evt);
            }
        });
        getContentPane().add(txt_jumlah_stok, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 330, 310, -1));

        jLabel7.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel7.setText("Jumlah Stok");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 310, -1, -1));

        txt_harga_beli.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        txt_harga_beli.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_harga_beliActionPerformed(evt);
            }
        });
        getContentPane().add(txt_harga_beli, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 150, 310, -1));

        jLabel8.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel8.setText("Harga Beli");
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 130, -1, -1));

        jLabel9.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel9.setText("Harga Jual");
        getContentPane().add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 190, -1, -1));

        txt_harga_jual.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        txt_harga_jual.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_harga_jualActionPerformed(evt);
            }
        });
        getContentPane().add(txt_harga_jual, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 210, 310, -1));

        jLabel10.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel10.setText("Tanggal Expired");
        getContentPane().add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 250, -1, -1));

        btn_reset.setText("Batal");
        btn_reset.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_resetActionPerformed(evt);
            }
        });
        getContentPane().add(btn_reset, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 330, 70, -1));

        btn_simpan.setText("Simpan");
        btn_simpan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_simpanActionPerformed(evt);
            }
        });
        getContentPane().add(btn_simpan, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 330, 70, -1));

        btn_edit.setText("Edit");
        btn_edit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_editActionPerformed(evt);
            }
        });
        getContentPane().add(btn_edit, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 330, 70, -1));

        btn_hapus.setText("Hapus");
        btn_hapus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_hapusActionPerformed(evt);
            }
        });
        getContentPane().add(btn_hapus, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 330, 70, -1));

        jPanel2.setBackground(new java.awt.Color(204, 204, 204));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Table_data.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null}
            },
            new String [] {
                "Kode Obat", "Nama Obat", "Jenis Obat", "Jumlah Stok", "Harga Beli", "Harga Jual", "Tanggal Expired"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, true, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(Table_data);

        jPanel2.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(29, 373, 651, 174));
        jPanel2.add(jdate_exp, new org.netbeans.lib.awtextra.AbsoluteConstraints(374, 276, 221, -1));

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 720, 570));

        jMenu3.setText("Menu Projek");
        jMenu3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenu3ActionPerformed(evt);
            }
        });

        jMenuItem1.setText("Menu");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        jMenu3.add(jMenuItem1);

        jMenuItem2.setText("Registrasi Obat Masuk");
        jMenuItem2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem2ActionPerformed(evt);
            }
        });
        jMenu3.add(jMenuItem2);

        jMenuItem3.setText("Registrasi Obat Keluar");
        jMenuItem3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem3ActionPerformed(evt);
            }
        });
        jMenu3.add(jMenuItem3);

        jMenuItem4.setText("Log Out");
        jMenuItem4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem4ActionPerformed(evt);
            }
        });
        jMenu3.add(jMenuItem4);

        jMenuItem5.setText("Keluar");
        jMenuItem5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem5ActionPerformed(evt);
            }
        });
        jMenu3.add(jMenuItem5);

        jMenuBar2.add(jMenu3);

        jMenu4.setText("Menu Tugas");

        jMenuItem7.setText("Konversi Suhu");
        jMenuItem7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem7ActionPerformed(evt);
            }
        });
        jMenu4.add(jMenuItem7);

        jMenuItem8.setText("Berat Badan Ideal");
        jMenuItem8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem8ActionPerformed(evt);
            }
        });
        jMenu4.add(jMenuItem8);

        jMenuItem9.setText("Kalkulator");
        jMenuItem9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem9ActionPerformed(evt);
            }
        });
        jMenu4.add(jMenuItem9);

        jMenuItem10.setText("Form Mahasiswa");
        jMenuItem10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem10ActionPerformed(evt);
            }
        });
        jMenu4.add(jMenuItem10);

        jMenuBar2.add(jMenu4);

        setJMenuBar(jMenuBar2);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txt_kode_obatActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_kode_obatActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_kode_obatActionPerformed

    private void txt_nama_obatActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_nama_obatActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_nama_obatActionPerformed

    private void txt_jenis_obatActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_jenis_obatActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_jenis_obatActionPerformed

    private void txt_jumlah_stokActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_jumlah_stokActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_jumlah_stokActionPerformed

    private void txt_harga_beliActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_harga_beliActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_harga_beliActionPerformed

    private void txt_harga_jualActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_harga_jualActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_harga_jualActionPerformed

    private void btn_resetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_resetActionPerformed
        // TODO add your handling code here:
        this.requestFocus();
        cleardata();
    }//GEN-LAST:event_btn_resetActionPerformed

    private void btn_simpanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_simpanActionPerformed
        // TODO add your handling code here:
        if(txt_kode_obat.getText().equals("")){
            JOptionPane.showMessageDialog(null, "Kode Obat Belum Diisi!");
            txt_kode_obat.requestFocus();
        } 
        else if(txt_nama_obat.getText().equals("")){
            JOptionPane.showMessageDialog(null, "Nama Obat Belum Diisi!");
            txt_nama_obat.requestFocus();
        } 
        else if (txt_jenis_obat.getText().equals("")){
            JOptionPane.showMessageDialog(null, "Jenis Obat Belum Diisi!");
            txt_jenis_obat.requestFocus();
        } 
        else if (txt_jumlah_stok.getText().equals("")){
            JOptionPane.showMessageDialog(null, "Jumlah Stok Obat Belum Diisi!");
            txt_jumlah_stok.requestFocus();
        } 
        else if (txt_harga_beli.getText().equals("")){
            JOptionPane.showMessageDialog(null, "Harga Beli Belum Diisi!");
            txt_harga_beli.requestFocus();
        } 
        else if (txt_harga_jual.getText().equals("")){
            JOptionPane.showMessageDialog(null, "Harga Jual Belum Diisi!");
            txt_harga_jual.requestFocus();
        } 
        else {
            refreshobat();
            simpanobat();
            refreshobat();
        }        
    }//GEN-LAST:event_btn_simpanActionPerformed

    private void btn_editActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_editActionPerformed
        // TODO add your handling code here:
        editobat();
        refreshobat();
    }//GEN-LAST:event_btn_editActionPerformed

    private void btn_hapusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_hapusActionPerformed
        // TODO add your handling code here:
        String strInput = JOptionPane.showInputDialog("Silahkan Masukkan Kode Obat :");
        hapusobat(strInput);
        if (strInput.isEmpty()==false){
            int jwb = JOptionPane.showConfirmDialog(null, "Apakah yakin menghapus data?","Konfirmasi", JOptionPane.YES_NO_OPTION);
            hapusobat(strInput);
        }
        JOptionPane.showMessageDialog(null, "Data Berhasil Dihapus");
        refreshobat();
        cleardata();
    }//GEN-LAST:event_btn_hapusActionPerformed

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
        // TODO add your handling code here:
        new From_Utama().show();
        this.dispose();
    }//GEN-LAST:event_jMenuItem1ActionPerformed

    private void jMenuItem2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem2ActionPerformed
        // TODO add your handling code here:
        new Form_Input().show();
        this.dispose();
    }//GEN-LAST:event_jMenuItem2ActionPerformed

    private void jMenu3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenu3ActionPerformed
        // TODO add your handling code here:
        
    }//GEN-LAST:event_jMenu3ActionPerformed

    private void jMenuItem7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem7ActionPerformed
        // TODO add your handling code here:
        new Konversi_Suhu().show();
        this.dispose();
    }//GEN-LAST:event_jMenuItem7ActionPerformed

    private void jMenuItem8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem8ActionPerformed
        // TODO add your handling code here:
        new Berat_Ideal().show();
        this.dispose();
    }//GEN-LAST:event_jMenuItem8ActionPerformed

    private void jMenuItem9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem9ActionPerformed
        // TODO add your handling code here:
        new Kalkulator().show();
        this.dispose();
    }//GEN-LAST:event_jMenuItem9ActionPerformed

    private void jMenuItem10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem10ActionPerformed
        // TODO add your handling code here:
        new Form_Mhs().show();
        this.dispose();
    }//GEN-LAST:event_jMenuItem10ActionPerformed

    private void jMenuItem3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem3ActionPerformed
        // TODO add your handling code here:
        new Form_Output().show();
        this.dispose();
    }//GEN-LAST:event_jMenuItem3ActionPerformed

    private void jMenuItem4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem4ActionPerformed
        // TODO add your handling code here:
        int jawab = javax.swing.JOptionPane.showConfirmDialog
        (null, "Anda Yakin Mau Log Out !!!.... ", "Konfirmasi",
                javax.swing.JOptionPane.YES_NO_OPTION);
        if (jawab == 0){
            new Form_Login().show();
            this.dispose();
        }
    }//GEN-LAST:event_jMenuItem4ActionPerformed

    private void jMenuItem5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem5ActionPerformed
        // TODO add your handling code here:
        int jawab = javax.swing.JOptionPane.showConfirmDialog(null, "Anda Yakin Ingin Keluar?....", "Konfirmasi", javax.swing.JOptionPane.YES_NO_OPTION);
        if (jawab == 0){
            this.dispose();
        }
    }//GEN-LAST:event_jMenuItem5ActionPerformed

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
            java.util.logging.Logger.getLogger(Form_Input.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Form_Input.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Form_Input.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Form_Input.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Form_Input().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable Table_data;
    private javax.swing.JToggleButton btn_edit;
    private javax.swing.JToggleButton btn_hapus;
    private javax.swing.JToggleButton btn_reset;
    private javax.swing.JToggleButton btn_simpan;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenu jMenu4;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuBar jMenuBar2;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem10;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JMenuItem jMenuItem3;
    private javax.swing.JMenuItem jMenuItem4;
    private javax.swing.JMenuItem jMenuItem5;
    private javax.swing.JMenuItem jMenuItem7;
    private javax.swing.JMenuItem jMenuItem8;
    private javax.swing.JMenuItem jMenuItem9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private com.toedter.calendar.JDateChooser jdate_exp;
    private javax.swing.JTextField txt_harga_beli;
    private javax.swing.JTextField txt_harga_jual;
    private javax.swing.JTextField txt_jenis_obat;
    private javax.swing.JTextField txt_jumlah_stok;
    private javax.swing.JTextField txt_kode_obat;
    private javax.swing.JTextField txt_nama_obat;
    // End of variables declaration//GEN-END:variables
}
