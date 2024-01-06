/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DB;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author Admin
 */
public class InitDB {
    public static final String serverName="MSI\\HOA";
    public static final String databaseName="QuanLyThuVien";
    public static final String username="sa";
    public static final String password="123";
    String url="jdbc:sqlserver://"+InitDB.serverName+":1433;databaseName="+InitDB.databaseName+";user="+InitDB.username+";password="+InitDB.password;
    Connection conn;
    public InitDB() {
        try{
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            conn=DriverManager.getConnection(url);
            if(databaseExists(conn, databaseName)==false)
            {
                createDatabase(conn);
                createTable_SACH(conn);
                createTable_SACHKHO(conn);
                createTable_SACHTRUNGBAY(conn);
                createTable_TAIKHOAN(conn);
                createTable_NHANVIEN(conn);
                createTable_KHACHHANG(conn);
                createTable_HOADONMUON(conn);
                createTable_HOADONTRA(conn);
                createTrigger_themSACH(conn);
                createTrigger_capnhatSACH(conn);
                createTrigger_capnhatSACHKHO(conn);
                createTrigger_xoaSACHKHO(conn);
                createTrigger_themSACHTRUNGBAY(conn);
                createTrigger_capnhatSACHTRUNGBAY(conn);
                createTrigger_xoaSACHTRUNGBAY(conn);
                createTrigger_themHOADONMUON(conn);
                createTrigger_xoaHOADONMUON(conn);
                createTrigger_themHOADONTRA(conn);
                createTrigger_xoaHOADONTRA(conn);
                System.out.println("Thư viện đã được tạo thành công");

            }
            else   System.out.println("Thư viện đã tồn tại");


       }catch (ClassNotFoundException ex){
            Logger.getLogger(DbQuery.class.getName()).log(Level.SEVERE,null,ex);
        }catch (SQLException ex)
        {
            JOptionPane.showMessageDialog(null, "Không thể kết nối, kiểm tra lại địa chỉ URL","Thông báo",0);
        }
    }
    private static boolean databaseExists(Connection connection, String databaseName) throws SQLException {
        try (Statement statement = connection.createStatement()) {
            String checkDatabaseSQL = "SELECT 1 FROM sys.databases WHERE name = '" + databaseName + "'";
            try (ResultSet resultSet = statement.executeQuery(checkDatabaseSQL)) {
                return resultSet.next();
            }
        }
    }
    private static void createDatabase(Connection connection) throws SQLException {
        try (Statement statement = connection.createStatement()) {
            String createDatabaseSQL = "CREATE DATABASE QuanLyThuVien";
            statement.executeUpdate(createDatabaseSQL);
        }
    }
    private static void createTable_SACH(Connection connection) throws SQLException {
        try (Statement statement = connection.createStatement()) {
            String createTableSQL = """
                                    SET ANSI_NULLS ON
                                    GO
                                    SET QUOTED_IDENTIFIER ON
                                    GO
                                    CREATE TABLE [dbo].[SACH](
                                    \t[Masach] [varchar](10) NOT NULL,
                                    \t[Image] [nvarchar](500) NULL,
                                    \t[Tensach] [nvarchar](200) NULL,
                                    \t[Tacgia] [nvarchar](100) NULL,
                                    \t[NXB] [nvarchar](50) NULL,
                                    \t[NamXB] [int] NULL,
                                    \t[Sotrang] [int] NULL,
                                    \t[Soluong] [int] NULL,
                                    \t[Noidung] [nvarchar](max) NULL,
                                    \t[Giasach] [float] NULL,
                                    \t[Giathue] [float] NULL,
                                     CONSTRAINT [S_Masach_PK] PRIMARY KEY CLUSTERED 
                                    (
                                    \t[Masach] ASC
                                    )WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON, OPTIMIZE_FOR_SEQUENTIAL_KEY = OFF) ON [PRIMARY]
                                    ) ON [PRIMARY]
                                    GO""";
            statement.executeUpdate(createTableSQL);
        }
    }
    private static void createTable_SACHKHO(Connection connection) throws SQLException {
        try (Statement statement = connection.createStatement()) {
            String createTableSQL = """
                                    SET ANSI_NULLS ON
                                    GO
                                    SET QUOTED_IDENTIFIER ON
                                    GO
                                    CREATE TABLE [dbo].[SACHKHO](
                                    \t[Masach] [varchar](10) NOT NULL,
                                    \t[Soluong] [int] NULL,
                                    \t[Vitri] [varchar](4) NULL,
                                     CONSTRAINT [SK_Masach_PK] PRIMARY KEY CLUSTERED 
                                    (
                                    \t[Masach] ASC
                                    )WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON, OPTIMIZE_FOR_SEQUENTIAL_KEY = OFF) ON [PRIMARY]
                                    ) ON [PRIMARY]
                                    GO
                                    ALTER TABLE [dbo].[SACHKHO]  WITH CHECK ADD  CONSTRAINT [SK_Masach] FOREIGN KEY([Masach])
                                    REFERENCES [dbo].[SACH] ([Masach])
                                    GO
                                    ALTER TABLE [dbo].[SACHKHO] CHECK CONSTRAINT [SK_Masach]
                                    GO""";
            statement.executeUpdate(createTableSQL);
        }
    }
    private static void createTable_SACHTRUNGBAY(Connection connection) throws SQLException {
        try (Statement statement = connection.createStatement()) {
            String createTableSQL = """
                                    SET ANSI_NULLS ON
                                    GO
                                    SET QUOTED_IDENTIFIER ON
                                    GO
                                    CREATE TABLE [dbo].[SACHTRUNGBAY](
                                    \t[Masach] [varchar](10) NOT NULL,
                                    \t[Soluong] [int] NULL,
                                    \t[Vitri] [varchar](4) NULL,
                                     CONSTRAINT [STB_Masach_PK] PRIMARY KEY CLUSTERED 
                                    (
                                    \t[Masach] ASC
                                    )WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON, OPTIMIZE_FOR_SEQUENTIAL_KEY = OFF) ON [PRIMARY]
                                    ) ON [PRIMARY]
                                    GO
                                    ALTER TABLE [dbo].[SACHTRUNGBAY]  WITH CHECK ADD  CONSTRAINT [STB_Masach] FOREIGN KEY([Masach])
                                    REFERENCES [dbo].[SACH] ([Masach])
                                    GO
                                    ALTER TABLE [dbo].[SACHTRUNGBAY] CHECK CONSTRAINT [STB_Masach]
                                    GO""";
            statement.executeUpdate(createTableSQL);
        }
    }
    private static void createTable_TAIKHOAN(Connection connection) throws SQLException {
        try (Statement statement = connection.createStatement()) {
            String createTableSQL = """
                                    SET ANSI_NULLS ON
                                    GO
                                    SET QUOTED_IDENTIFIER ON
                                    GO
                                    CREATE TABLE [dbo].[TAIKHOAN](
                                    \t[Username] [varchar](50) NOT NULL,
                                    \t[encryptPass] [varchar](100) NULL,
                                    \t[Role] [nvarchar](20) NOT NULL,
                                     CONSTRAINT [TK_Taikhoan_PK] PRIMARY KEY CLUSTERED 
                                    (
                                    \t[Username] ASC
                                    )WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON, OPTIMIZE_FOR_SEQUENTIAL_KEY = OFF) ON [PRIMARY]
                                    ) ON [PRIMARY]
                                    GO""";
            statement.executeUpdate(createTableSQL);
        }
    }
    private static void createTable_NHANVIEN(Connection connection) throws SQLException {
        try (Statement statement = connection.createStatement()) {
            String createTableSQL = """
                                    SET ANSI_NULLS ON
                                    GO
                                    SET QUOTED_IDENTIFIER ON
                                    GO
                                    CREATE TABLE [dbo].[NHANVIEN](
                                    	[Id] [varchar](15) NOT NULL,
                                    	[Username] [varchar](50) NULL,
                                    	[Hoten] [nvarchar](50) NULL,
                                    	[Sdt] [varchar](11) NULL,
                                    	[Gioitinh] [int] NULL,
                                    	[Diachi] [nvarchar](100) NULL,
                                    	[Tuoi] [int] NULL,
                                    	[Quequan] [nvarchar](200) NULL,
                                     CONSTRAINT [NV_Id_PK] PRIMARY KEY CLUSTERED 
                                    (
                                    	[Id] ASC
                                    )WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON, OPTIMIZE_FOR_SEQUENTIAL_KEY = OFF) ON [PRIMARY]
                                    ) ON [PRIMARY]
                                    GO
                                    ALTER TABLE [dbo].[NHANVIEN]  WITH CHECK ADD  CONSTRAINT [NV_Username] FOREIGN KEY([Username])
                                    REFERENCES [dbo].[TAIKHOAN] ([Username])
                                    GO
                                    ALTER TABLE [dbo].[NHANVIEN] CHECK CONSTRAINT [NV_Username]
                                    GO""";
            statement.executeUpdate(createTableSQL);
        }
    }
    private static void createTable_KHACHHANG(Connection connection) throws SQLException {
        try (Statement statement = connection.createStatement()) {
            String createTableSQL = """
                                    SET ANSI_NULLS ON
                                    GO
                                    SET QUOTED_IDENTIFIER ON
                                    GO
                                    CREATE TABLE [dbo].[KHACHHANG](
                                    	[SDT] [varchar](11) NOT NULL,
                                    	[Hoten] [nvarchar](50) NULL,
                                    	[Tuoi] [int] NULL,
                                     CONSTRAINT [KH_SDT_PK] PRIMARY KEY CLUSTERED 
                                    (
                                    	[SDT] ASC
                                    )WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON, OPTIMIZE_FOR_SEQUENTIAL_KEY = OFF) ON [PRIMARY]
                                    ) ON [PRIMARY]""";
            statement.executeUpdate(createTableSQL);
        }
    }
    private static void createTable_HOADONMUON(Connection connection) throws SQLException {
        try (Statement statement = connection.createStatement()) {
            String createTableSQL = """
                                    SET ANSI_NULLS ON
                                    GO
                                    SET QUOTED_IDENTIFIER ON
                                    GO
                                    CREATE TABLE [dbo].[HOADONMUON](
                                    	[Id] [int] NOT NULL IDENTITY(1,1),
                                    	[SDT] [varchar](11)NOT NULL,
                                    	[Masach] [varchar](10)NOT NULL,
                                    	[Soluong] [int] NULL,
                                    	[Giathue] [float] NULL,
                                    	[Tienthanhtoan] [float] NULL,
                                    	[Ngaymuon] [date] NULL,
                                    	[Ngayhen] [date] NULL,
                                    	[Trangthaihoadon] [bit]  NULL,
                                     CONSTRAINT [HDM_Id_PK] PRIMARY KEY CLUSTERED 
                                    (
                                    	[Id] ASC
                                    )WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON, OPTIMIZE_FOR_SEQUENTIAL_KEY = OFF) ON [PRIMARY]
                                    ) ON [PRIMARY]
                                    GO
                                    ALTER TABLE [dbo].[HOADONMUON]  WITH CHECK ADD  CONSTRAINT [HDM_KhachhangId] FOREIGN KEY([SDT])
                                    REFERENCES [dbo].[KHACHHANG] ([SDT]) 
                                    GO
                                    ALTER TABLE [dbo].[HOADONMUON] CHECK CONSTRAINT [HDM_KhachhangId]
                                    GO
                                    ALTER TABLE [dbo].[HOADONMUON]  WITH CHECK ADD  CONSTRAINT [HDM_Masach] FOREIGN KEY([Masach])
                                    REFERENCES [dbo].[SACH] ( [Masach])
                                    GO
                                    ALTER TABLE [dbo].[HOADONMUON] CHECK CONSTRAINT [HDM_Masach]
                                    GO""";
            statement.executeUpdate(createTableSQL);
        }
    }
    private static void createTable_HOADONTRA(Connection connection) throws SQLException {
        try (Statement statement = connection.createStatement()) {
            String createTableSQL = """
                                    SET ANSI_NULLS ON
                                    GO
                                    SET QUOTED_IDENTIFIER ON
                                    GO
                                    CREATE TABLE [dbo].[HOADONTRA](
                                    	[Id] [int] NOT NULL ,
                                    	[Nhanvien_Id] [varchar](15)NULL,
                                    	[Sotienconlai] [float]NULL,
                                    	[Ngaytra] [date] NULL,
                                    	[Trangthaithanhtoan] [bit] NULL,
                                     CONSTRAINT [HDT_Id_PK] PRIMARY KEY CLUSTERED 
                                    (
                                    	[Id] ASC
                                    )WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON, OPTIMIZE_FOR_SEQUENTIAL_KEY = OFF) ON [PRIMARY]
                                    ) ON [PRIMARY]
                                    GO
                                    ALTER TABLE [dbo].[HOADONTRA]  WITH CHECK ADD  CONSTRAINT [HDT_HoadonmuonId] FOREIGN KEY([Id])
                                    REFERENCES [dbo].[HOADONMUON] ([Id]) 
                                    GO
                                    ALTER TABLE [dbo].[HOADONTRA] CHECK CONSTRAINT [HDT_HoadonmuonId]
                                    GO
                                    ALTER TABLE [dbo].[HOADONTRA]  WITH CHECK ADD  CONSTRAINT [HDT_NhanvienId] FOREIGN KEY([Nhanvien_Id])
                                    REFERENCES [dbo].[NHANVIEN] ( [Id])
                                    GO
                                    ALTER TABLE [dbo].[HOADONTRA] CHECK CONSTRAINT [HDT_NhanvienId]
                                    GO""";
            statement.executeUpdate(createTableSQL);
        }
    }
    private static void createTrigger_themSACH(Connection connection) throws SQLException {
        try (Statement statement = connection.createStatement()) {
            String createTriggerSQL = """
                                    CREATE TRIGGER TG_ThemSach ON SACH
                                    AFTER INSERT
                                    AS
                                    BEGIN
                                        SET NOCOUNT ON;
                                    
                                        DECLARE @MaSach varchar(10), @SoLuongKho INT;
                                    
                                        -- Lấy thông tin từ bảng Inserted (chứa dữ liệu mới được thêm)
                                        SELECT @MaSach = Masach, @SoLuongKho = Soluong FROM inserted
                                    	 -- Cập nhật giá trị số lượng trong bảng Kho
                                           INSERT [dbo].[SACHKHO]([Masach],[Soluong]) VALUES(@MaSach,@SoLuongKho)
                                    END
                                    GO""";
            statement.executeUpdate(createTriggerSQL);
        }
    }
    private static void createTrigger_capnhatSACH(Connection connection) throws SQLException {
        try (Statement statement = connection.createStatement()) {
            String createTriggerSQL = """
                                    CREATE TRIGGER TG_CapNhatSach ON SACH
                                    AFTER UPDATE
                                    AS
                                    BEGIN
                                        SET NOCOUNT ON;
                                    	DECLARE @MaSach varchar(10), @SoLuongSachMoi INT,@SoLuongSachCu INT
                                    	,@SoLuongSachDuocTra INT,@SoLuongSachTrungBay INT
                                    	,@SoLuongSachDuocMuon INT,@SoLuongKho INT;
                                    	 -- Lấy thông tin từ bảng Inserted (chứa dữ liệu mới được thêm)
                                        SELECT @MaSach = Masach, @SoLuongSachMoi = Soluong FROM inserted
                                    	SELECT @SoLuongSachCu=Soluong FROM deleted
                                    	SELECT @SoLuongKho=Soluong FROM SACHKHO WHERE Masach=@MaSach
                                    
                                    	SELECT @SoLuongSachTrungBay=ISNULL(Soluong,0) FROM SACHTRUNGBAY WHERE Masach=@MaSach
                                    	SELECT @SoLuongSachDuocMuon=ISNULL(SUM(SoLuong), 0)  FROM HOADONMUON WHERE Masach=@MaSach
                                    	SELECT @SoLuongSachDuocTra=ISNULL(SUM(m.Soluong), 0)  FROM HOADONTRA t,HOADONMUON m WHERE m.Id=t.Id and m.Masach=@MaSach
                                    	-- Kiểm tra nếu mã sách có trong hóa đơn mượn
                                        IF  (((@SoLuongSachTrungBay+@SoLuongKho+(@SoLuongSachDuocMuon-@SoLuongSachDuocTra)))<>@SoLuongSachMoi)
                                        BEGIN
                                            -- Nếu không tồn tại
                                            -- Cập nhật giá trị số lượng trong bảng Kho
                                           UPDATE SACHKHO
                                           SET Soluong = Soluong + (@SoLuongSachMoi-@SoLuongSachCu)
                                           WHERE Masach = @MaSach;
                                        END
                                    END;
                                    GO""";
            statement.executeUpdate(createTriggerSQL);
        }
    }
    private static void createTrigger_capnhatSACHKHO(Connection connection) throws SQLException {
        try (Statement statement = connection.createStatement()) {
            String createTriggerSQL = """
                                    CREATE TRIGGER TG_CapNhatSachKho ON SACHKHO
                                    AFTER UPDATE
                                    AS
                                    BEGIN
                                        SET NOCOUNT ON;
                                    
                                        DECLARE @MaSach varchar(10), @SoLuongKhoMoi INT,@SoLuongKhoCu INT,@SoLuongSachDuocTra INT,@SoLuongSachTrungBay INT,@TongSoLuongSach INT,@SoLuongSachDuocMuon INT;
                                    	 -- Lấy thông tin từ bảng Inserted (chứa dữ liệu mới được thêm)
                                        SELECT @MaSach = Masach, @SoLuongKhoMoi = Soluong FROM inserted
                                    	SELECT @SoLuongKhoCu=Soluong FROM deleted
                                    	SELECT @TongSoLuongSach=Soluong FROM SACH WHERE Masach=@MaSach
                                    	SELECT @SoLuongSachTrungBay=ISNULL(Soluong,0) FROM SACHTRUNGBAY WHERE Masach=@MaSach
                                    	SELECT @SoLuongSachDuocMuon=ISNULL(SUM(SoLuong), 0)  FROM HOADONMUON WHERE Masach=@MaSach
                                    	SELECT @SoLuongSachDuocTra=ISNULL(SUM(m.Soluong), 0)  FROM HOADONTRA t,HOADONMUON m WHERE m.Id=t.Id and m.Masach=@MaSach
                                    	-- Kiểm tra nếu mã sách có trong hóa đơn mượn
                                        IF  (((@SoLuongSachTrungBay+@SoLuongKhoMoi+(@SoLuongSachDuocMuon-@SoLuongSachDuocTra)))<>@TongSoLuongSach)
                                        BEGIN
                                            -- Cập nhật giá trị số lượng trong bảng Kho
                                           UPDATE SACH
                                           SET Soluong = Soluong + (@SoLuongKhoMoi-@SoLuongKhoCu)
                                           WHERE Masach = @MaSach;
                                        END
                                    END;
                                    GO""";
            statement.executeUpdate(createTriggerSQL);
        }
    }
    private static void createTrigger_xoaSACHKHO(Connection connection) throws SQLException {
        try (Statement statement = connection.createStatement()) {
            String createTriggerSQL = """
                                    CREATE TRIGGER TG_XoaSachKho ON SACHKHO
                                    AFTER DELETE
                                    AS
                                    BEGIN
                                        SET NOCOUNT ON;
                                    
                                    		DECLARE @MaSach varchar(10),@TongSoLuongSach INT;
                                    		SELECT @MaSach = Masach FROM deleted
                                    		DELETE SACHTRUNGBAY WHERE Masach=@MaSach
                                    		DELETE SACH WHERE Masach=@MaSach
                                    
                                    END;
                                    GO""";
            statement.executeUpdate(createTriggerSQL);
        }
    }
    private static void createTrigger_themSACHTRUNGBAY(Connection connection) throws SQLException {
        try (Statement statement = connection.createStatement()) {
            String createTriggerSQL = """
                                    CREATE TRIGGER TG_XoaSachKho ON SACHKHO
                                    AFTER DELETE
                                    AS
                                    BEGIN
                                        SET NOCOUNT ON;
                                    
                                    		DECLARE @MaSach varchar(10),@TongSoLuongSach INT;
                                    		SELECT @MaSach = Masach FROM deleted
                                    		DELETE SACHTRUNGBAY WHERE Masach=@MaSach
                                    		DELETE SACH WHERE Masach=@MaSach
                                    
                                    END;
                                    GO""";
            statement.executeUpdate(createTriggerSQL);
        }
    }
    private static void createTrigger_capnhatSACHTRUNGBAY(Connection connection) throws SQLException {
        try (Statement statement = connection.createStatement()) {
            String createTriggerSQL = """
                                    CREATE TRIGGER TG_CapNhatSachTrungBay ON SACHTRUNGBAY
                                    AFTER UPDATE
                                    AS
                                    BEGIN
                                        SET NOCOUNT ON;
                                    
                                        DECLARE @MaSach varchar(10), @SoLuongTrungBayMoi INT,@SoLuongTrungBayCu INT,@SoLuongSachDuocTra INT,@SoLuongSachKho INT,@TongSoLuongSach INT,@SoLuongSachDuocMuon INT;
                                    	 -- Lấy thông tin từ bảng Inserted (chứa dữ liệu mới được thêm)
                                        SELECT @MaSach = Masach, @SoLuongTrungBayMoi = Soluong FROM inserted
                                    	SELECT @SoLuongTrungBayCu=Soluong FROM deleted
                                    	SELECT @TongSoLuongSach=Soluong FROM SACH WHERE Masach=@MaSach
                                    	SELECT @SoLuongSachKho=Soluong FROM SACHKHO WHERE Masach=@MaSach
                                    	SELECT @SoLuongSachDuocMuon=ISNULL(SUM(SoLuong), 0)  FROM HOADONMUON WHERE Masach=@MaSach
                                    	SELECT @SoLuongSachDuocTra=ISNULL(SUM(m.Soluong), 0)  FROM HOADONTRA t,HOADONMUON m WHERE m.Id=t.Id and m.Masach=@MaSach
                                    	-- Kiểm tra nếu mã sách có trong hóa đơn mượn
                                        IF  (((@SoLuongTrungBayMoi+@SoLuongSachKho+(@SoLuongSachDuocMuon-@SoLuongSachDuocTra)))<>@TongSoLuongSach)
                                        BEGIN
                                            -- Nếu không tồn tại
                                            -- Cập nhật giá trị số lượng trong bảng Kho
                                           UPDATE SACHKHO
                                           SET Soluong = Soluong - (@SoLuongTrungBayMoi-@SoLuongTrungBayCu)
                                           WHERE Masach = @MaSach;
                                        END
                                    
                                    END;
                                    GO""";
            statement.executeUpdate(createTriggerSQL);
        }
    }
    private static void createTrigger_xoaSACHTRUNGBAY(Connection connection) throws SQLException {
        try (Statement statement = connection.createStatement()) {
            String createTriggerSQL = """
                                    CREATE TRIGGER TG_XoaSachTrungBay ON SACHTRUNGBAY
                                    FOR DELETE
                                    AS
                                    BEGIN
                                        SET NOCOUNT ON;
                                    
                                        DECLARE @MaSach varchar(10), @SoLuongTrungBay INT;
                                    
                                        -- Lấy thông tin từ bảng Inserted (chứa dữ liệu mới được thêm)
                                        SELECT @MaSach = Masach, @SoLuongTrungBay = Soluong FROM deleted
                                    	 -- Cập nhật giá trị số lượng trong bảng Kho
                                           UPDATE SACHKHO
                                           SET Soluong = Soluong + @SoLuongTrungBay
                                           WHERE Masach = @MaSach;
                                    END;
                                    GO""";
            statement.executeUpdate(createTriggerSQL);
        }
    }
    private static void createTrigger_themHOADONMUON(Connection connection) throws SQLException {
        try (Statement statement = connection.createStatement()) {
            String createTriggerSQL = """
                                    CREATE TRIGGER TG_ThemHoaDonMuon ON HOADONMUON
                                    AFTER INSERT
                                    AS
                                    BEGIN
                                        SET NOCOUNT ON;
                                    
                                        DECLARE @MaSach varchar(10), @SoLuongMuon INT;
                                    
                                        -- Lấy thông tin từ bảng Inserted (chứa dữ liệu mới được thêm)
                                        SELECT @MaSach = Masach, @SoLuongMuon = Soluong FROM inserted
                                    	 -- Cập nhật giá trị số lượng trong bảng Kho
                                           UPDATE SACHTRUNGBAY
                                           SET Soluong = Soluong - @SoLuongMuon
                                           WHERE Masach = @MaSach;
                                    END
                                    GO""";
            statement.executeUpdate(createTriggerSQL);
        }
    }
    private static void createTrigger_xoaHOADONMUON(Connection connection) throws SQLException {
        try (Statement statement = connection.createStatement()) {
            String createTriggerSQL = """
                                    CREATE TRIGGER TG_XoaHoaDonMuon ON HOADONMUON
                                    AFTER DELETE
                                    AS
                                    BEGIN
                                        SET NOCOUNT ON;
                                    
                                        DECLARE @MaSach varchar(10), @SoLuongMuon INT;
                                    
                                        -- Lấy thông tin từ bảng Inserted (chứa dữ liệu mới được thêm)
                                        SELECT @MaSach = Masach, @SoLuongMuon = Soluong FROM deleted
                                    	 -- Cập nhật giá trị số lượng trong bảng Kho
                                           UPDATE SACHTRUNGBAY
                                           SET Soluong = Soluong + @SoLuongMuon
                                           WHERE Masach = @MaSach;
                                    END
                                    GO""";
            statement.executeUpdate(createTriggerSQL);
        }
    }
    private static void createTrigger_themHOADONTRA(Connection connection) throws SQLException {
        try (Statement statement = connection.createStatement()) {
            String createTriggerSQL = """
                                    CREATE TRIGGER TG_ThemHoaDonTra ON HOADONTRA
                                    AFTER INSERT
                                    AS
                                    BEGIN
                                        SET NOCOUNT ON;
                                    
                                        DECLARE @MaSach varchar(10), @SoLuongTra INT;
                                    
                                        -- Lấy thông tin từ bảng Inserted (chứa dữ liệu mới được thêm)
                                        SELECT @MaSach = m.Masach, @SoLuongTra = m.Soluong FROM inserted i,HOADONMUON m where i.Id=m.Id
                                    	 -- Cập nhật giá trị số lượng trong bảng Kho
                                           UPDATE SACHTRUNGBAY
                                           SET Soluong = Soluong + @SoLuongTra
                                           WHERE Masach = @MaSach;
                                    END
                                    GO""";
            statement.executeUpdate(createTriggerSQL);
        }
    }
    private static void createTrigger_xoaHOADONTRA(Connection connection) throws SQLException {
        try (Statement statement = connection.createStatement()) {
            String createTriggerSQL = """
                                    CREATE TRIGGER TG_XoaHoaDonTra ON HOADONTRA
                                    AFTER DELETE
                                    AS
                                    BEGIN
                                        SET NOCOUNT ON;
                                    
                                        DECLARE @MaSach varchar(10), @SoLuongTra INT,@Id INT;
                                    	SELECT @MaSach = m.Masach,@SoLuongTra=m.Soluong FROM HOADONMUON m,deleted t
                                    	WHERE m.Id=t.Id
                                    	 -- Cập nhật giá trị số lượng trong bảng Kho
                                           UPDATE SACHTRUNGBAY
                                           SET Soluong = Soluong - @SoLuongTra
                                           WHERE Masach = @MaSach;
                                    END
                                    GO""";
            statement.executeUpdate(createTriggerSQL);
        }
    }
}
