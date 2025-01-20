package ramalan.cuaca;

import com.formdev.flatlaf.FlatLightLaf;
import com.formdev.flatlaf.IntelliJTheme;
import java.text.DecimalFormat;
import java.util.Random;
import javax.swing.ImageIcon;
import javax.swing.UIManager;
import hitungan.hitlembap;
import hitungan.hitsuhu;
import hitungan.Rule;
import hitungan.hitangin;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.JLabel;


public class body extends javax.swing.JFrame {
    

    Random random = new Random ();
    double angka,number;
    double Nsuhu,Nkelembapan,NkecepatanA;
    
    int dragx,dragy;
    public body() {
        initComponents();
        setLocationRelativeTo(null);
        showDayDateTime();
        suhu.add(suhu1);
        suhu.add(suhu2);
        suhu.add(suhu3);
        kelembapan.add(lembab1);
        kelembapan.add(lembab2);
        kelembapan.add(lembab3);
        angin.add(angin1);
        angin.add(angin2);
        angin.add(angin3);
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        suhu = new javax.swing.ButtonGroup();
        kelembapan = new javax.swing.ButtonGroup();
        angin = new javax.swing.ButtonGroup();
        jTextField1 = new javax.swing.JTextField();
        gradientPanelCustom1 = new custom.GradientPanelCustom();
        gradientPanelCustom2 = new custom.GradientPanelCustom();
        jButton1 = new javax.swing.JButton();
        gradientPanelCustom3 = new custom.GradientPanelCustom();
        jLabel3 = new javax.swing.JLabel();
        suhu1 = new javax.swing.JRadioButton();
        suhu2 = new javax.swing.JRadioButton();
        suhu3 = new javax.swing.JRadioButton();
        gradientPanelCustom4 = new custom.GradientPanelCustom();
        lembab3 = new javax.swing.JRadioButton();
        lembab2 = new javax.swing.JRadioButton();
        jLabel4 = new javax.swing.JLabel();
        lembab1 = new javax.swing.JRadioButton();
        gradientPanelCustom5 = new custom.GradientPanelCustom();
        gradientPanelCustom6 = new custom.GradientPanelCustom();
        jLabel10 = new javax.swing.JLabel();
        celcius = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        lembab = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        knot = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        ket = new javax.swing.JTextField();
        kanvas = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        lb_tanggal = new javax.swing.JLabel();
        gradientPanelCustom7 = new custom.GradientPanelCustom();
        angin3 = new javax.swing.JRadioButton();
        angin1 = new javax.swing.JRadioButton();
        angin2 = new javax.swing.JRadioButton();
        jLabel6 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();

        jTextField1.setText("jTextField1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        gradientPanelCustom1.setEndColor(new java.awt.Color(113, 127, 246));

        gradientPanelCustom2.setEndColor(new java.awt.Color(72, 72, 230));
        gradientPanelCustom2.setStartColor(new java.awt.Color(102, 129, 242));

        jButton1.setBackground(new java.awt.Color(72, 72, 230));
        jButton1.setFont(new java.awt.Font("Microsoft YaHei UI", 1, 14)); // NOI18N
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setText("CEK CUACA");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout gradientPanelCustom2Layout = new javax.swing.GroupLayout(gradientPanelCustom2);
        gradientPanelCustom2.setLayout(gradientPanelCustom2Layout);
        gradientPanelCustom2Layout.setHorizontalGroup(
            gradientPanelCustom2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(gradientPanelCustom2Layout.createSequentialGroup()
                .addGap(105, 105, 105)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        gradientPanelCustom2Layout.setVerticalGroup(
            gradientPanelCustom2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, gradientPanelCustom2Layout.createSequentialGroup()
                .addContainerGap(12, Short.MAX_VALUE)
                .addComponent(jButton1)
                .addContainerGap())
        );

        jLabel3.setFont(new java.awt.Font("Microsoft YaHei UI", 1, 10)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(72, 72, 230));
        jLabel3.setText("SUHU");

        suhu.add(suhu1);
        suhu1.setFont(new java.awt.Font("Microsoft YaHei UI", 0, 10)); // NOI18N
        suhu1.setForeground(new java.awt.Color(82, 88, 234));
        suhu1.setText("Dingin");

        suhu.add(suhu2);
        suhu2.setFont(new java.awt.Font("Microsoft YaHei UI", 0, 10)); // NOI18N
        suhu2.setForeground(new java.awt.Color(82, 88, 234));
        suhu2.setText("Sedang");
        suhu2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                suhu2ActionPerformed(evt);
            }
        });

        suhu.add(suhu3);
        suhu3.setFont(new java.awt.Font("Microsoft YaHei UI", 0, 10)); // NOI18N
        suhu3.setForeground(new java.awt.Color(82, 88, 234));
        suhu3.setText("Panas");

        javax.swing.GroupLayout gradientPanelCustom3Layout = new javax.swing.GroupLayout(gradientPanelCustom3);
        gradientPanelCustom3.setLayout(gradientPanelCustom3Layout);
        gradientPanelCustom3Layout.setHorizontalGroup(
            gradientPanelCustom3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(gradientPanelCustom3Layout.createSequentialGroup()
                .addGroup(gradientPanelCustom3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(gradientPanelCustom3Layout.createSequentialGroup()
                        .addGap(16, 16, 16)
                        .addGroup(gradientPanelCustom3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(suhu3, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(suhu2, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(suhu1, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(gradientPanelCustom3Layout.createSequentialGroup()
                        .addGap(32, 32, 32)
                        .addComponent(jLabel3)))
                .addContainerGap(17, Short.MAX_VALUE))
        );
        gradientPanelCustom3Layout.setVerticalGroup(
            gradientPanelCustom3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, gradientPanelCustom3Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel3)
                .addGap(18, 18, 18)
                .addComponent(suhu1)
                .addGap(18, 18, 18)
                .addComponent(suhu2)
                .addGap(18, 18, 18)
                .addComponent(suhu3)
                .addGap(20, 20, 20))
        );

        kelembapan.add(lembab3);
        lembab3.setFont(new java.awt.Font("Microsoft YaHei UI", 0, 10)); // NOI18N
        lembab3.setForeground(new java.awt.Color(82, 88, 234));
        lembab3.setText("Kering");

        kelembapan.add(lembab2);
        lembab2.setFont(new java.awt.Font("Microsoft YaHei UI", 0, 10)); // NOI18N
        lembab2.setForeground(new java.awt.Color(82, 88, 234));
        lembab2.setText("Sedang");

        jLabel4.setFont(new java.awt.Font("Microsoft YaHei UI", 1, 10)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(72, 72, 230));
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("KELEMBAPAN");
        jLabel4.setAlignmentY(0.0F);

        kelembapan.add(lembab1);
        lembab1.setFont(new java.awt.Font("Microsoft YaHei UI", 0, 10)); // NOI18N
        lembab1.setForeground(new java.awt.Color(82, 88, 234));
        lembab1.setText("Lembab");
        lembab1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                lembab1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout gradientPanelCustom4Layout = new javax.swing.GroupLayout(gradientPanelCustom4);
        gradientPanelCustom4.setLayout(gradientPanelCustom4Layout);
        gradientPanelCustom4Layout.setHorizontalGroup(
            gradientPanelCustom4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(gradientPanelCustom4Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(gradientPanelCustom4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lembab2)
                    .addComponent(lembab1)
                    .addComponent(lembab3))
                .addGap(19, 19, 19))
            .addGroup(gradientPanelCustom4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, 80, Short.MAX_VALUE)
                .addContainerGap())
        );
        gradientPanelCustom4Layout.setVerticalGroup(
            gradientPanelCustom4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, gradientPanelCustom4Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel4)
                .addGap(18, 18, 18)
                .addComponent(lembab1)
                .addGap(18, 18, 18)
                .addComponent(lembab2)
                .addGap(18, 18, 18)
                .addComponent(lembab3)
                .addGap(20, 20, 20))
        );

        gradientPanelCustom6.setEndColor(new java.awt.Color(235, 233, 254));
        gradientPanelCustom6.setStartColor(new java.awt.Color(235, 233, 254));

        jLabel10.setBackground(new java.awt.Color(153, 160, 248));
        jLabel10.setFont(new java.awt.Font("Microsoft YaHei UI", 0, 10)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ramalan/cuaca/thermometer-solid-24.png"))); // NOI18N

        celcius.setBackground(new java.awt.Color(232, 229, 254));
        celcius.setFont(new java.awt.Font("Microsoft YaHei UI", 0, 10)); // NOI18N
        celcius.setForeground(new java.awt.Color(82, 88, 234));
        celcius.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        jLabel1.setBackground(new java.awt.Color(255, 255, 255));
        jLabel1.setFont(new java.awt.Font("Microsoft YaHei UI", 0, 10)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(82, 88, 234));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Celcius °");

        jLabel8.setBackground(new java.awt.Color(255, 255, 255));
        jLabel8.setFont(new java.awt.Font("Microsoft YaHei UI", 0, 10)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(82, 88, 234));
        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel8.setText("Humidity");

        lembab.setBackground(new java.awt.Color(232, 229, 254));
        lembab.setFont(new java.awt.Font("Microsoft YaHei UI", 0, 10)); // NOI18N
        lembab.setForeground(new java.awt.Color(82, 88, 234));
        lembab.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        lembab.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                lembabActionPerformed(evt);
            }
        });

        jLabel11.setFont(new java.awt.Font("Microsoft YaHei UI", 0, 10)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(255, 255, 255));
        jLabel11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ramalan/cuaca/droplet-regular-24.png"))); // NOI18N

        jLabel9.setBackground(new java.awt.Color(255, 255, 255));
        jLabel9.setFont(new java.awt.Font("Microsoft YaHei UI", 0, 10)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(82, 88, 234));
        jLabel9.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel9.setText("Windspeed");

        knot.setBackground(new java.awt.Color(232, 229, 254));
        knot.setFont(new java.awt.Font("Microsoft YaHei UI", 0, 10)); // NOI18N
        knot.setForeground(new java.awt.Color(82, 88, 234));
        knot.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        jLabel12.setFont(new java.awt.Font("Microsoft YaHei UI", 0, 10)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(255, 255, 255));
        jLabel12.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ramalan/cuaca/wind-regular-24.png"))); // NOI18N

        javax.swing.GroupLayout gradientPanelCustom6Layout = new javax.swing.GroupLayout(gradientPanelCustom6);
        gradientPanelCustom6.setLayout(gradientPanelCustom6Layout);
        gradientPanelCustom6Layout.setHorizontalGroup(
            gradientPanelCustom6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(gradientPanelCustom6Layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addGroup(gradientPanelCustom6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(gradientPanelCustom6Layout.createSequentialGroup()
                        .addGap(14, 14, 14)
                        .addComponent(jLabel10))
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(celcius, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 33, Short.MAX_VALUE)
                .addGroup(gradientPanelCustom6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, gradientPanelCustom6Layout.createSequentialGroup()
                        .addComponent(jLabel11)
                        .addGap(64, 64, 64)
                        .addComponent(jLabel12)
                        .addGap(12, 12, 12))
                    .addGroup(gradientPanelCustom6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(knot, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(gradientPanelCustom6Layout.createSequentialGroup()
                            .addComponent(lembab, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(88, 88, 88)))
                    .addGroup(gradientPanelCustom6Layout.createSequentialGroup()
                        .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(20, 20, 20))
        );
        gradientPanelCustom6Layout.setVerticalGroup(
            gradientPanelCustom6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, gradientPanelCustom6Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(gradientPanelCustom6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel10)
                    .addComponent(jLabel11)
                    .addComponent(jLabel12))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(gradientPanelCustom6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(gradientPanelCustom6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(lembab, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(celcius, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(knot, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(gradientPanelCustom6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel9)
                    .addGroup(gradientPanelCustom6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel8)
                        .addComponent(jLabel1)))
                .addContainerGap())
        );

        ket.setEditable(false);
        ket.setBackground(new java.awt.Color(240, 237, 255));
        ket.setFont(new java.awt.Font("Microsoft YaHei UI", 1, 14)); // NOI18N
        ket.setForeground(new java.awt.Color(72, 72, 230));
        ket.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        ket.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ketActionPerformed(evt);
            }
        });

        kanvas.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ramalan/cuaca/close.png"))); // NOI18N
        jLabel2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel2MouseClicked(evt);
            }
        });

        lb_tanggal.setFont(new java.awt.Font("Microsoft YaHei", 1, 10)); // NOI18N
        lb_tanggal.setForeground(new java.awt.Color(72, 72, 230));

        javax.swing.GroupLayout gradientPanelCustom5Layout = new javax.swing.GroupLayout(gradientPanelCustom5);
        gradientPanelCustom5.setLayout(gradientPanelCustom5Layout);
        gradientPanelCustom5Layout.setHorizontalGroup(
            gradientPanelCustom5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(gradientPanelCustom5Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(gradientPanelCustom5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, gradientPanelCustom5Layout.createSequentialGroup()
                        .addComponent(lb_tanggal, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(130, 130, 130)
                        .addComponent(jLabel2)
                        .addContainerGap())
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, gradientPanelCustom5Layout.createSequentialGroup()
                        .addComponent(ket, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(114, 114, 114))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, gradientPanelCustom5Layout.createSequentialGroup()
                        .addGroup(gradientPanelCustom5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(gradientPanelCustom6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(kanvas, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(42, 42, 42))))
        );
        gradientPanelCustom5Layout.setVerticalGroup(
            gradientPanelCustom5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, gradientPanelCustom5Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(gradientPanelCustom5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(gradientPanelCustom5Layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addGap(0, 6, Short.MAX_VALUE))
                    .addComponent(lb_tanggal, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addComponent(kanvas, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(ket, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(gradientPanelCustom6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(17, 17, 17))
        );

        angin.add(angin3);
        angin3.setFont(new java.awt.Font("Microsoft YaHei UI", 0, 10)); // NOI18N
        angin3.setForeground(new java.awt.Color(82, 88, 234));
        angin3.setText("Kencang");

        angin.add(angin1);
        angin1.setFont(new java.awt.Font("Microsoft YaHei UI", 0, 10)); // NOI18N
        angin1.setForeground(new java.awt.Color(82, 88, 234));
        angin1.setText("Pelan");
        angin1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                angin1ActionPerformed(evt);
            }
        });

        angin.add(angin2);
        angin2.setFont(new java.awt.Font("Microsoft YaHei UI", 0, 10)); // NOI18N
        angin2.setForeground(new java.awt.Color(82, 88, 234));
        angin2.setText("Sedang");
        angin2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                angin2ActionPerformed(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Microsoft YaHei", 1, 10)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(72, 72, 230));
        jLabel6.setText("ANGIN");

        jLabel5.setFont(new java.awt.Font("Microsoft YaHei", 1, 10)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(72, 72, 230));
        jLabel5.setText("KECEPATAN");

        javax.swing.GroupLayout gradientPanelCustom7Layout = new javax.swing.GroupLayout(gradientPanelCustom7);
        gradientPanelCustom7.setLayout(gradientPanelCustom7Layout);
        gradientPanelCustom7Layout.setHorizontalGroup(
            gradientPanelCustom7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(gradientPanelCustom7Layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addGroup(gradientPanelCustom7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(angin3)
                    .addComponent(angin1, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(angin2, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, gradientPanelCustom7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(gradientPanelCustom7Layout.createSequentialGroup()
                            .addGap(10, 10, 10)
                            .addComponent(jLabel6))
                        .addComponent(jLabel5, javax.swing.GroupLayout.Alignment.TRAILING)))
                .addContainerGap(19, Short.MAX_VALUE))
        );
        gradientPanelCustom7Layout.setVerticalGroup(
            gradientPanelCustom7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(gradientPanelCustom7Layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel6)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(angin1)
                .addGap(18, 18, 18)
                .addComponent(angin2)
                .addGap(18, 18, 18)
                .addComponent(angin3)
                .addContainerGap(19, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout gradientPanelCustom1Layout = new javax.swing.GroupLayout(gradientPanelCustom1);
        gradientPanelCustom1.setLayout(gradientPanelCustom1Layout);
        gradientPanelCustom1Layout.setHorizontalGroup(
            gradientPanelCustom1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(gradientPanelCustom1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(gradientPanelCustom3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(gradientPanelCustom4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(gradientPanelCustom7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addComponent(gradientPanelCustom5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(gradientPanelCustom2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        gradientPanelCustom1Layout.setVerticalGroup(
            gradientPanelCustom1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, gradientPanelCustom1Layout.createSequentialGroup()
                .addComponent(gradientPanelCustom5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 36, Short.MAX_VALUE)
                .addGroup(gradientPanelCustom1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(gradientPanelCustom3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(gradientPanelCustom4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(gradientPanelCustom7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(gradientPanelCustom2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(gradientPanelCustom1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(gradientPanelCustom1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void lembab1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_lembab1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_lembab1ActionPerformed

    private void suhu2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_suhu2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_suhu2ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        kondisicuaca();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void angin1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_angin1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_angin1ActionPerformed

    private void ketActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ketActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ketActionPerformed

    private void lembabActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_lembabActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_lembabActionPerformed

    private void angin2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_angin2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_angin2ActionPerformed

    private void jLabel2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel2MouseClicked
        dispose();        // TODO add your handling code here:
    }//GEN-LAST:event_jLabel2MouseClicked
    
    private void showDayDateTime() {
        Date now = new Date();
        SimpleDateFormat dateFormat = new SimpleDateFormat("HH:mm dd-MM-yyyy");
        String dateTime = dateFormat.format(now);
        lb_tanggal.setText(dateTime);
    }
    
    public void hujanderas() {
            ImageIcon image = new ImageIcon (getClass().getResource("hujan deras.png"));
            kanvas.setIcon(image); ket.setText("Hujan Deras");
            
            //suhu dingin
            celcius.setText(""+Nsuhu);
            hitsuhu.setSuhu(Nsuhu);
            
            //kelembapan lembab
            lembab.setText(""+Nkelembapan);
            hitlembap.setLembab(Nkelembapan);
            
            NkecepatanA=Math.round(Rule.bobot());
            knot.setText(""+NkecepatanA);               
    }
    public void hujanbiasa() {
            ImageIcon image = new ImageIcon (getClass().getResource("hujan biasa.png"));
            kanvas.setIcon(image); ket.setText("Hujan Biasa");
            
            //suhu dingin/sedang
            celcius.setText(""+Nsuhu);
            hitsuhu.setSuhu(Nsuhu);
            
            //kelembapan sedang
            lembab.setText(""+Nkelembapan);
            hitlembap.setLembab(Nkelembapan);
            
            NkecepatanA=Math.round(Rule.bobot());
            knot.setText(""+NkecepatanA);
    }
    public void berawan() {
            ImageIcon image = new ImageIcon (getClass().getResource("mendung.png"));
            kanvas.setIcon(image); ket.setText("Berawan");
            
            //suhu dingin/sedang
            celcius.setText(""+Nsuhu);
            hitsuhu.setSuhu(Nsuhu);
            
            //kelembapan sedang
            lembab.setText(""+Nkelembapan);
            hitlembap.setLembab(Nkelembapan);
            
            NkecepatanA=Math.round(Rule.bobot());
            knot.setText(""+NkecepatanA);
    }
    public void cerah() {
            ImageIcon image = new ImageIcon (getClass().getResource("cerah biasa.png"));
            kanvas.setIcon(image); ket.setText("Cerah");
            
            //suhu sedang/tinggi
            celcius.setText(""+Nsuhu);
            hitsuhu.setSuhu(Nsuhu);
            
            //kelembapan sedang/kering
            lembab.setText(""+Nkelembapan);
            hitlembap.setLembab(Nkelembapan);
            
            NkecepatanA=Math.round(Rule.bobot());
            knot.setText(""+NkecepatanA);
    }
    public void terik() {
            ImageIcon image = new ImageIcon (getClass().getResource("cerah terik.png"));
            kanvas.setIcon(image); ket.setText("Terik");
            
            //suhu panas
            Nsuhu = random.nextInt(11)+30;
            celcius.setText(""+Nsuhu);
            hitsuhu.setSuhu(Nsuhu);
            
            //kelembapan kering
            Nkelembapan = random.nextInt(41);
            lembab.setText(""+Nkelembapan);
            hitlembap.setLembab(Nkelembapan);
            
            NkecepatanA=Math.round(Rule.bobot());
            knot.setText(""+NkecepatanA);
    }    
    
    public void kondisicuaca(){
        
      // DINGIN KERING PELAN/SEDANG/KENCANG
      if (suhu1.isSelected()&& lembab3.isSelected() && angin1.isSelected() ||
          suhu1.isSelected()&& lembab3.isSelected() && angin2.isSelected() ||
          suhu1.isSelected()&& lembab3.isSelected() && angin3.isSelected()){
          Nsuhu = random.nextInt(16);
          Nkelembapan = random.nextInt(31);
          berawan();
      }
      // DINGIN SEDANG PELAN/SEDANG/KENCANG
      if (suhu1.isSelected()&& lembab2.isSelected() && angin1.isSelected() ||
          suhu1.isSelected()&& lembab2.isSelected() && angin2.isSelected() ||
          suhu1.isSelected()&& lembab2.isSelected() && angin3.isSelected()){
          Nsuhu = random.nextInt(16);
          Nkelembapan = random.nextInt(21)+30;
          berawan();
      }
     // DINGIN LEMBAB PELAN/SEDANG
      if (suhu1.isSelected()&& lembab1.isSelected() && angin1.isSelected() ||
          suhu1.isSelected()&& lembab1.isSelected() && angin2.isSelected() ){
          Nsuhu = random.nextInt(16);
          Nkelembapan = random.nextInt(21)+60;
          hujanbiasa();
      }
      // DINGIN LEMBAB KENCANG
      if (suhu1.isSelected()&& lembab1.isSelected() && angin3.isSelected()){
          Nsuhu = random.nextInt(16);
          Nkelembapan = random.nextInt(31)+70;
          hujanderas();
      }    
      
      // SEDANG KERING PELAN/SEDANG/KENCANG
      if (suhu2.isSelected()&& lembab3.isSelected() && angin1.isSelected() ||
          suhu2.isSelected()&& lembab3.isSelected() && angin2.isSelected() ){
          Nsuhu = random.nextInt(5)+20;
          Nkelembapan = random.nextInt(31);
          cerah();
      }
      // SEDANG SEDANG PELAN/SEDANG/KENCANG
      if (suhu2.isSelected()&& lembab3.isSelected() && angin3.isSelected() ||
          suhu2.isSelected()&& lembab2.isSelected() && angin1.isSelected() ||
          suhu2.isSelected()&& lembab2.isSelected() && angin2.isSelected() ||
          suhu2.isSelected()&& lembab2.isSelected() && angin3.isSelected() ||
          suhu2.isSelected()&& lembab1.isSelected() && angin1.isSelected() ){
          
          Nsuhu = random.nextInt(7)+20;
          Nkelembapan = random.nextInt(21)+50;
          berawan();
      }
      // SEDANG LEMBAB PELAN/SEDANG/KENCANG
      if (suhu2.isSelected()&& lembab1.isSelected() && angin2.isSelected() ||
          suhu2.isSelected()&& lembab1.isSelected() && angin3.isSelected()){
          Nsuhu = random.nextInt(6)+20;
          Nkelembapan = random.nextInt(31)+70;
          hujanbiasa();
      }
      
      
      // PANAS KERING PELAN/SEDANG/KENCANG
      if (suhu3.isSelected()&& lembab3.isSelected() && angin1.isSelected() ||
          suhu3.isSelected()&& lembab3.isSelected() && angin2.isSelected() ||
          suhu3.isSelected()&& lembab3.isSelected() && angin3.isSelected()){
          Nsuhu = random.nextInt(10)+30;
          Nkelembapan = random.nextInt(31);
          terik();
      }
      // PANAS SEDANG PELAN/SEDANG/KENCANG
      if (suhu3.isSelected()&& lembab2.isSelected() && angin1.isSelected() ||
          suhu3.isSelected()&& lembab2.isSelected() && angin2.isSelected() ||
          suhu3.isSelected()&& lembab2.isSelected() && angin3.isSelected()){
          Nsuhu = random.nextInt(7)+30;
          Nkelembapan = random.nextInt(21)+30;
          cerah();
      }
      // PANAS LEMBAB PELAN/SEDANG/KENCANG
      if (suhu3.isSelected()&& lembab1.isSelected() && angin1.isSelected() ||
          suhu3.isSelected()&& lembab1.isSelected() && angin2.isSelected() ){
          Nsuhu = random.nextInt(7)+30;
          Nkelembapan = random.nextInt(21)+60;
          cerah();
      }
      if(suhu3.isSelected()&& lembab1.isSelected() && angin3.isSelected()){
          Nsuhu = random.nextInt(5)+30;
          Nkelembapan = random.nextInt(31)+70;
          hujanbiasa();
      }
    }
    
    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        IntelliJTheme.setup(body.class.getResourceAsStream("/template.theme.json"));
        UIManager.put( "Button.arc", 999 );
        UIManager.put( "Component.arc", 999 );
        UIManager.put( "ProgressBar.arc", 999 );
        UIManager.put( "TextComponent.arc", 999 );
        UIManager.put( "Panel.arc", 999 );
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new body().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup angin;
    private javax.swing.JRadioButton angin1;
    private javax.swing.JRadioButton angin2;
    private javax.swing.JRadioButton angin3;
    private javax.swing.JTextField celcius;
    private custom.GradientPanelCustom gradientPanelCustom1;
    private custom.GradientPanelCustom gradientPanelCustom2;
    private custom.GradientPanelCustom gradientPanelCustom3;
    private custom.GradientPanelCustom gradientPanelCustom4;
    private custom.GradientPanelCustom gradientPanelCustom5;
    private custom.GradientPanelCustom gradientPanelCustom6;
    private custom.GradientPanelCustom gradientPanelCustom7;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JLabel kanvas;
    private javax.swing.ButtonGroup kelembapan;
    private javax.swing.JTextField ket;
    private javax.swing.JTextField knot;
    private javax.swing.JLabel lb_tanggal;
    private javax.swing.JTextField lembab;
    private javax.swing.JRadioButton lembab1;
    private javax.swing.JRadioButton lembab2;
    private javax.swing.JRadioButton lembab3;
    private javax.swing.ButtonGroup suhu;
    private javax.swing.JRadioButton suhu1;
    private javax.swing.JRadioButton suhu2;
    private javax.swing.JRadioButton suhu3;
    // End of variables declaration//GEN-END:variables
}
