/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms    @Override
    public void paintBorder(Component c, Graphics g, int x, int y, int width, int height) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public Insets getBorderInsets(Component c) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public boolean isBorderOpaque() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
/JFrame.java to edit this template
 */
package UI;


import java.awt.Image;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;
import DB.DbQuery;
import java.awt.BorderLayout;
import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartPanel;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.plot.CategoryPlot;
import org.jfree.chart.plot.PiePlot;
import org.jfree.chart.plot.PlotOrientation;
import org.jfree.chart.plot.XYPlot;
import org.jfree.data.category.DefaultCategoryDataset;
import org.jfree.data.general.DefaultPieDataset;
import org.jfree.data.xy.XYSeries;
import org.jfree.data.xy.XYSeriesCollection;


/**
 *
 * @author Admin
 */
public class QuanLyDoanhThu extends javax.swing.JFrame{

    /**
     * Creates new form DangNhap
     */
    private final ImageIcon img_Back;
    private final String role=DangNhap.Role;
    private final DbQuery dbqr=new DbQuery();
    private ResultSet rs;
    private String show_Option="doanhthu";
    private final String username=DangNhap.Username;
    private static final Logger logger = Setting.SettingUI.logger;
    public QuanLyDoanhThu() {
        img_Back=new ImageIcon(new ImageIcon(getClass().getResource("/Image/backicon.png")).getImage().getScaledInstance(45, 25, Image.SCALE_SMOOTH));
        setRole(role);
        initComponents();
        defaultSetting();
        load_Table();
        jLabel1.setVisible(false);
        jComboBox_month.setVisible(false);
        jLabel2.setVisible(false);
        jComboBox_year.setVisible(false);
        btn_DoanhThu.setBackground(Setting.SettingUI.btn_colorChange);            
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel_ChucNang_main = new javax.swing.JPanel();
        jSeparator1 = new javax.swing.JSeparator();
        jSeparator2 = new javax.swing.JSeparator();
        jLabel_mainTittle = new javax.swing.JLabel();
        btn_back = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        btn_UaThich = Setting.SettingUI.createRoundedButton(0.5,0.5,20);
        btn_DoanhThu = Setting.SettingUI.createRoundedButton(0.5,0.5,20);
        btn_SachTra = Setting.SettingUI.createRoundedButton(0.5,0.5,20);
        jLabel1 = new javax.swing.JLabel();
        jComboBox_month = new javax.swing.JComboBox<>();
        jComboBox_year = new javax.swing.JComboBox<>();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setLocation(new java.awt.Point(600, 300));
        setLocationByPlatform(true);
        setMaximumSize(new java.awt.Dimension(1063, 623));
        setMinimumSize(new java.awt.Dimension(1063, 623));
        setUndecorated(true);
        setPreferredSize(new java.awt.Dimension(1063, 623));
        setResizable(false);

        jPanel_ChucNang_main.setBackground(Setting.SettingUI.UI_colorDefault);
        jPanel_ChucNang_main.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        jPanel_ChucNang_main.setToolTipText("");
        jPanel_ChucNang_main.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        jSeparator1.setBackground(new java.awt.Color(0, 0, 0));
        jSeparator1.setForeground(new java.awt.Color(0, 0, 0));
        jSeparator1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jSeparator2.setBackground(new java.awt.Color(0, 0, 0));
        jSeparator2.setForeground(new java.awt.Color(0, 0, 0));
        jSeparator2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jLabel_mainTittle.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        jLabel_mainTittle.setText("Quản Lý Doanh Thu");

        btn_back.setBackground(new java.awt.Color(250, 215, 172));
        btn_back.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        btn_back.setIcon(img_Back);
        btn_back.setBorderPainted(false);
        btn_back.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_backActionPerformed(evt);
            }
        });

        jPanel1.setBackground(Setting.SettingUI.btn_colorDefault);
        jPanel1.setLayout(new java.awt.BorderLayout());

        btn_UaThich.setBackground(new java.awt.Color(250, 215, 172));
        btn_UaThich.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        btn_UaThich.setText("Ưa Thích");
        btn_UaThich.setBorderPainted(false);
        btn_UaThich.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_UaThichActionPerformed(evt);
            }
        });

        btn_DoanhThu.setBackground(new java.awt.Color(250, 215, 172));
        btn_DoanhThu.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        btn_DoanhThu.setText("Doanh Thu");
        btn_DoanhThu.setBorderPainted(false);
        btn_DoanhThu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_DoanhThuActionPerformed(evt);
            }
        });

        btn_SachTra.setBackground(new java.awt.Color(250, 215, 172));
        btn_SachTra.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        btn_SachTra.setText("Sách Trả");
        btn_SachTra.setBorderPainted(false);
        btn_SachTra.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_SachTraActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Tháng");

        jComboBox_month.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jComboBox_month.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12" }));
        jComboBox_month.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox_monthActionPerformed(evt);
            }
        });

        jComboBox_year.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jComboBox_year.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox_yearActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Năm");

        javax.swing.GroupLayout jPanel_ChucNang_mainLayout = new javax.swing.GroupLayout(jPanel_ChucNang_main);
        jPanel_ChucNang_main.setLayout(jPanel_ChucNang_mainLayout);
        jPanel_ChucNang_mainLayout.setHorizontalGroup(
            jPanel_ChucNang_mainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel_ChucNang_mainLayout.createSequentialGroup()
                .addGroup(jPanel_ChucNang_mainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel_ChucNang_mainLayout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(btn_back, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(312, 312, 312)
                        .addComponent(jLabel_mainTittle))
                    .addGroup(jPanel_ChucNang_mainLayout.createSequentialGroup()
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 891, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(jPanel_ChucNang_mainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(btn_DoanhThu, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btn_UaThich, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 130, Short.MAX_VALUE)
                            .addComponent(btn_SachTra, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 130, Short.MAX_VALUE)
                            .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jComboBox_month, javax.swing.GroupLayout.Alignment.LEADING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jComboBox_year, javax.swing.GroupLayout.Alignment.LEADING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addContainerGap(22, Short.MAX_VALUE))
            .addGroup(jPanel_ChucNang_mainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel_ChucNang_mainLayout.createSequentialGroup()
                    .addGap(892, 892, 892)
                    .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(169, Short.MAX_VALUE)))
            .addGroup(jPanel_ChucNang_mainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(jSeparator2, javax.swing.GroupLayout.DEFAULT_SIZE, 1061, Short.MAX_VALUE))
        );
        jPanel_ChucNang_mainLayout.setVerticalGroup(
            jPanel_ChucNang_mainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel_ChucNang_mainLayout.createSequentialGroup()
                .addGroup(jPanel_ChucNang_mainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel_ChucNang_mainLayout.createSequentialGroup()
                        .addGap(23, 23, 23)
                        .addComponent(btn_back, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel_ChucNang_mainLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel_mainTittle)))
                .addGroup(jPanel_ChucNang_mainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel_ChucNang_mainLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 17, Short.MAX_VALUE)
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 545, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel_ChucNang_mainLayout.createSequentialGroup()
                        .addGap(35, 35, 35)
                        .addComponent(btn_UaThich)
                        .addGap(25, 25, 25)
                        .addComponent(btn_DoanhThu)
                        .addGap(25, 25, 25)
                        .addComponent(btn_SachTra)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jComboBox_month, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(29, 29, 29)
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jComboBox_year, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))))
            .addGroup(jPanel_ChucNang_mainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel_ChucNang_mainLayout.createSequentialGroup()
                    .addGap(0, 75, Short.MAX_VALUE)
                    .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 544, javax.swing.GroupLayout.PREFERRED_SIZE)))
            .addGroup(jPanel_ChucNang_mainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel_ChucNang_mainLayout.createSequentialGroup()
                    .addContainerGap(75, Short.MAX_VALUE)
                    .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(542, 542, 542)))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel_ChucNang_main, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel_ChucNang_main, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        getAccessibleContext().setAccessibleDescription("");

        setSize(new java.awt.Dimension(1063, 621));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

/**
 * Phương thức này thực hiện việc tải dữ liệu từ cơ sở dữ liệu và hiển thị nó trong bảng.
 * Dữ liệu được lấy dựa trên các thông tin nhập từ các thành phần giao diện như combobox và textbox.
 * 
 * @throws SQLException Nếu có lỗi xảy ra trong quá trình truy vấn cơ sở dữ liệu.
 */
    private void load_Table()
    {
        if (show_Option.equals("doanhthu")) {
            showLineChart();
        }
        if (show_Option.equals("uathich")) {
            showBarChart();
        }
        if (show_Option.equals("sachtra")) {
            showPieChart();
        }
    }  
    private void showPieChart() 
    {
        ResultSet hoadonchuatra=dbqr.ExcuQuery_GetRow("count(*) as count", "HOADONMUON m", """
                                                                                           not EXISTS(select *
                                                                                           from HOADONTRA t
                                                                                           where m.Id=t.Id and m.Masach=t.Masach)""");
        ResultSet hoadonchuathanhtoan=dbqr.ExcuQuery_GetRow("count(*) as count", "HOADONMUON m,HOADONTRA t", "m.Id=t.Id and m.Masach=t.Masach and t.Trangthaithanhtoan=0");
        ResultSet hoadonhoanthanh=dbqr.ExcuQuery_GetRow("count(*) as count", "HOADONMUON m,HOADONTRA t", "m.Id=t.Id and m.Masach=t.Masach and t.Trangthaithanhtoan=1"); 
        DefaultPieDataset dataset=new DefaultPieDataset();
        try {
            hoadonchuatra.next();
            hoadonchuathanhtoan.next();
            hoadonhoanthanh.next();
            dataset.setValue("Hóa Đơn Chưa Trả", hoadonchuatra.getInt(1));
            dataset.setValue("Hóa Đơn Chưa Thanh Toán", hoadonchuathanhtoan.getInt(1));
            dataset.setValue("Hóa Đơn Hoàn Thành", hoadonhoanthanh.getInt(1));
        } catch (SQLException ex) {
            Logger.getLogger(QuanLyDoanhThu.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        JFreeChart pieChart=ChartFactory.createPieChart(
                "Sơ đồ trạng thái Hóa Đơn Mượn",
                dataset,
                true,
                true,
                false
        );
        PiePlot piePlot=(PiePlot) pieChart.getPlot();
        piePlot.setBackgroundPaint(Setting.SettingUI.btn_colorDefault);
        ChartPanel chartPanel=new ChartPanel(pieChart);
        jPanel1.removeAll();
        jPanel1.add(chartPanel,BorderLayout.CENTER);
        jPanel1.revalidate();
        jPanel1.repaint();
        chartPanel.validate();
    }
    private void showBarChart() 
    {
        ResultSet top20=dbqr.ExcuQuery_GetRow("TOP 20 Tensach,Sum(m.Soluong) as sl", 
                                                "HOADONMUON m, SACH s", """
                                                                        m.Masach=s.Masach
                                                                        group by Tensach
                                                                        order by sl DESC""");
        DefaultCategoryDataset dataset = new DefaultCategoryDataset();
        try {
            while(top20.next()){
                dataset.addValue(top20.getInt(2), "", top20.getString(1));
            }
        } catch (SQLException ex) {
            Logger.getLogger(QuanLyDoanhThu.class.getName()).log(Level.SEVERE, null, ex);
        }

        JFreeChart barChart=ChartFactory.createBarChart(
                "Top 20 sách ưa thích nhất",
                "Sách Ưa Thích",
                "Cuốn Sách được mượn",
                dataset,
                PlotOrientation.VERTICAL,
                false,
                true,
                false);
        CategoryPlot barPlot=(CategoryPlot)barChart.getPlot();
        barPlot.setBackgroundPaint(Setting.SettingUI.btn_colorDefault);
        ChartPanel chartPanel = new ChartPanel(barChart);
        jPanel1.removeAll();
        jPanel1.add(chartPanel,BorderLayout.CENTER);
        jPanel1.revalidate();
        jPanel1.repaint();
        chartPanel.validate();
    }
    private void showWaveChart() 
    {
        ResultSet doanhthungay=dbqr.ExcuQuery_GetRow("SUM(m.Tienthanhtoan),SUM(t.Sotienconlai),t.Ngaytra",
                                                    "HOADONMUON m, HOADONTRA t", """
                                                                                 m.Id=t.Id and m.Masach=t.Masach and t.Trangthaithanhtoan=1
                                                                                 group by t.Ngaytra
                                                                                 order by t.Ngaytra ASC""");
        // Tạo XYSeries để lưu trữ dữ liệu
        XYSeries series = new XYSeries("Doanh Thu");
        try {
            
            int selectMonth=Integer.parseInt(jComboBox_month.getSelectedItem().toString());
            int selectYear=Integer.parseInt(jComboBox_year.getSelectedItem().toString());
            while(doanhthungay.next())
            {
                java.util.Date ngaytra=doanhthungay.getDate(3);
                // Tạo một đối tượng Calendar và thiết lập nó bằng giá trị của currentDate
                java.util.Calendar calendar = java.util.Calendar.getInstance();
                calendar.setTime(ngaytra);
                float doanhthu=doanhthungay.getFloat(1)-doanhthungay.getFloat(2);
                // Lấy giá trị ngày
                int day = calendar.get(java.util.Calendar.DAY_OF_MONTH);
                int month = calendar.get(java.util.Calendar.MONTH)+1;
                int year = calendar.get(java.util.Calendar.YEAR);
                if(year==selectYear&&month==selectMonth)
                {
                    for(int i=1;i<=31;i++)
                    {
                        if(i==day){
                            series.add(i,doanhthu);
                            System.out.println(i+""+ngaytra+" "+doanhthu);
                            if(doanhthungay.next())
                            {
                                ngaytra=doanhthungay.getDate(3);
                                calendar.setTime(ngaytra);
                                doanhthu=doanhthungay.getFloat(1)-doanhthungay.getFloat(2);
                                day = calendar.get(java.util.Calendar.DAY_OF_MONTH);
                            }
                        }
                        else{
                             series.add(i,0);  
                        }
                    }
                }
                else{
                    series.add(0,0);
                    for(int i=1;i<=31;i++)
                    {
                        series.add(i,0);
                    }
                    ngaytra=doanhthungay.getDate(3);
                    calendar.setTime(ngaytra);
                    day = calendar.get(java.util.Calendar.DAY_OF_MONTH);
                    month = calendar.get(java.util.Calendar.MONTH)+1;
                    year = calendar.get(java.util.Calendar.YEAR);
                }
            }
            
        } catch (SQLException ex) {
            Logger.getLogger(QuanLyDoanhThu.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        // Tạo XYSeriesCollection và thêm XYSeries vào đó
        XYSeriesCollection dataset = new XYSeriesCollection();
        dataset.addSeries(series);
        
        // Tạo biểu đồ dạng đường (line chart)
        JFreeChart waveChart = ChartFactory.createXYLineChart(
                "Biểu đồ doanh thu", // Tiêu đề biểu đồ
                "Ngày",           // Nhãn trục x
                "Doanh Thu",      // Nhãn trục y
                dataset           // Dữ liệu
        );
        ChartPanel chartPanel = new ChartPanel(waveChart);
        XYPlot wavePlot=(XYPlot)waveChart.getPlot();
        wavePlot.setBackgroundPaint(Setting.SettingUI.btn_colorDefault);
        jPanel1.removeAll();
        jPanel1.add(chartPanel,BorderLayout.CENTER);
        jPanel1.revalidate();
        jPanel1.repaint();
        chartPanel.validate();
    }
    private void showLineChart() 
    {
        ResultSet doanhthungay=dbqr.ExcuQuery_GetRow("SUM(m.Tienthanhtoan),SUM(t.Sotienconlai),t.Ngaytra",
                                                    "HOADONMUON m, HOADONTRA t", """
                                                                                 m.Id=t.Id and m.Masach=t.Masach and t.Trangthaithanhtoan=1
                                                                                 group by t.Ngaytra
                                                                                 order by t.Ngaytra ASC""");
        DefaultCategoryDataset dataset = new DefaultCategoryDataset();
        int selectMonth=Integer.parseInt(jComboBox_month.getSelectedItem().toString());
        int selectYear=Integer.parseInt(jComboBox_year.getSelectedItem().toString());
        for(int i=1;i<=31;i++)
        {
            dataset.addValue(0, "Doanh thu", String.valueOf(i));
        }
        try {
            while(doanhthungay.next())
            {
                java.util.Date ngaytra=doanhthungay.getDate(3);
                // Tạo một đối tượng Calendar và thiết lập nó bằng giá trị của currentDate
                java.util.Calendar calendar = java.util.Calendar.getInstance();
                calendar.setTime(ngaytra);
                float doanhthu=doanhthungay.getFloat(1)-doanhthungay.getFloat(2);
                // Lấy giá trị ngày
                int day = calendar.get(java.util.Calendar.DAY_OF_MONTH);
                int month = calendar.get(java.util.Calendar.MONTH)+1;
                int year = calendar.get(java.util.Calendar.YEAR);
                if(year==selectYear&&month==selectMonth)
                {
                    for(int i=1;i<=31;i++)
                    {
                        if(i==day){
                            dataset.addValue(doanhthu, "Doanh thu", String.valueOf(i));
                            if(doanhthungay.next())
                            {
                                ngaytra=doanhthungay.getDate(3);
                                calendar.setTime(ngaytra);
                                doanhthu=doanhthungay.getFloat(1)-doanhthungay.getFloat(2);
                                day = calendar.get(java.util.Calendar.DAY_OF_MONTH);
                            }
                        }
                        else{
                            dataset.addValue(0, "Doanh thu", String.valueOf(i));
                        }
                    }
                }
            }
            
        } catch (SQLException ex) {
            Logger.getLogger(QuanLyDoanhThu.class.getName()).log(Level.SEVERE, null, ex);
        }
        // Tạo biểu đồ dạng đường (line chart)
        JFreeChart lineChart = ChartFactory.createLineChart(
                "Biểu đồ Doanh thu tháng "+selectMonth+" năm "+selectYear,
                "Ngày",
                "Doanh thu",
                dataset,
                PlotOrientation.VERTICAL,
                false,
                true,
                false
        );
        CategoryPlot linePlot=(CategoryPlot)lineChart.getPlot();
        linePlot.setBackgroundPaint(Setting.SettingUI.btn_colorDefault);
        ChartPanel chartPanel = new ChartPanel(lineChart);
        jPanel1.removeAll();
        jPanel1.add(chartPanel,BorderLayout.CENTER);
        jPanel1.revalidate();
        jPanel1.repaint();
        chartPanel.validate();
    }
    private void defaultSetting(){
        java.util.Date currentDate=new java.util.Date();
        // Tạo một đối tượng Calendar và thiết lập nó bằng giá trị của currentDate
        java.util.Calendar calendar = java.util.Calendar.getInstance();
        calendar.setTime(currentDate);
        // Lấy giá trị ngày
        int month = calendar.get(java.util.Calendar.MONTH);
        int year = calendar.get(java.util.Calendar.YEAR);
        for(int i=year-3;i<=year;i++)
            jComboBox_year.addItem(String.valueOf(i));
        jComboBox_month.setSelectedIndex(month);
        jComboBox_year.setSelectedIndex(3);
    }
    private java.awt.Color getRandomColor() {
        return new java.awt.Color((int) (Math.random() * 256), (int) (Math.random() * 256), (int) (Math.random() * 256));
    }
    private void btn_backActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_backActionPerformed
        // TODO add your handling code here:
        this.dispose();
        new ChucNang().setVisible(true);
        logger.log(Level.INFO, " Ng\u01b0\u1eddi d\u00f9ng {0} tr\u1edf v\u1ec1 m\u00e0n h\u00ecnh ch\u1ecdn ch\u1ee9c n\u0103ng\n", username);
    }//GEN-LAST:event_btn_backActionPerformed

    private void btn_UaThichActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_UaThichActionPerformed
        // TODO add your handling code here:
        btn_UaThich.setBackground(Setting.SettingUI.btn_colorChange);
        close_Dialog();
        show_Option="uathich";
        load_Table();
    }//GEN-LAST:event_btn_UaThichActionPerformed

    private void btn_DoanhThuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_DoanhThuActionPerformed
        // TODO add your handling code here:
        btn_DoanhThu.setBackground(Setting.SettingUI.btn_colorChange);
        close_Dialog();
        show_Option="doanhthu";
        jLabel1.setVisible(true);
        jComboBox_month.setVisible(true);
        jLabel2.setVisible(true);
        jComboBox_year.setVisible(true);
        load_Table();
    }//GEN-LAST:event_btn_DoanhThuActionPerformed

    private void btn_SachTraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_SachTraActionPerformed
        // TODO add your handling code here:
        btn_SachTra.setBackground(Setting.SettingUI.btn_colorChange);
        close_Dialog();
        show_Option="sachtra";
        load_Table();
    }//GEN-LAST:event_btn_SachTraActionPerformed

    private void jComboBox_yearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox_yearActionPerformed
        // TODO add your handling code here:
        load_Table();
    }//GEN-LAST:event_jComboBox_yearActionPerformed

    private void jComboBox_monthActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox_monthActionPerformed
        // TODO add your handling code here:
        load_Table();
    }//GEN-LAST:event_jComboBox_monthActionPerformed

    
    
   
   
   /**
    * Thiết lập quyền truy cập và hiển thị các thành phần giao diện dựa trên vai trò người dùng.
    * 
    * @param Role Vai trò của người dùng ("Nhân Viên", "Quản Lý", hoặc "Khách Hàng").
    */
   private void setRole(String Role) {
        switch (Role) {
            case "Nhân Viên" -> {
            }
            case "Quản Lý" -> {
            }
            case "Khách Hàng" -> {

            }
            default -> {
            }
        }
        // Cài đặt cho vai trò Nhân Viên (có thể thêm các cài đặt khác nếu cần)
        // Cài đặt cho vai trò Quản Lý (có thể thêm các cài đặt khác nếu cần)
           }
   
   private void close_Dialog() {
       if (show_Option.equals("doanhthu")) {
           btn_DoanhThu.setBackground(Setting.SettingUI.btn_colorDefault);
           jLabel1.setVisible(false);
           jComboBox_month.setVisible(false);
           jLabel2.setVisible(false);
           jComboBox_year.setVisible(false);
       }
       if (show_Option.equals("uathich")) {
           btn_UaThich.setBackground(Setting.SettingUI.btn_colorDefault);
       }
       if (show_Option.equals("sachtra")) {
           btn_SachTra.setBackground(Setting.SettingUI.btn_colorDefault);
       }

   }

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
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(QuanLyDoanhThu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            new QuanLyDoanhThu().setVisible(true);
        });
    }

    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_DoanhThu;
    private javax.swing.JButton btn_SachTra;
    private javax.swing.JButton btn_UaThich;
    private javax.swing.JButton btn_back;
    private javax.swing.JComboBox<String> jComboBox_month;
    private javax.swing.JComboBox<String> jComboBox_year;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel_mainTittle;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel_ChucNang_main;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    // End of variables declaration//GEN-END:variables

}
