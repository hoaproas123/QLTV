CREATE DATABASE QuanLyThuVien;
GO
USE QuanLyThuVien;
GO
/****** Object:  Table [dbo].[SACH]    Script Date: 27/12/2022 9:34:54 PM ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[SACH](
	[Masach] [varchar](10) NOT NULL,
	[Image] [nvarchar](500) NULL,
	[Tensach] [nvarchar](200) NULL,
	[Tacgia] [nvarchar](100) NULL,
	[NXB] [nvarchar](50) NULL,
	[NamXB] [int] NULL,
	[Sotrang] [int] NULL,
	[Soluong] [int] NULL,
	[Noidung] [nvarchar](max) NULL,
	[Giasach] [float] NULL,
	[Giathue] [float] NULL,
 CONSTRAINT [S_Masach_PK] PRIMARY KEY CLUSTERED 
(
	[Masach] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON, OPTIMIZE_FOR_SEQUENTIAL_KEY = OFF) ON [PRIMARY]
) ON [PRIMARY]
GO



/****** Object:  Table [dbo].[SACHKHO]    Script Date: 27/12/2022 9:34:54 PM ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[SACHKHO](
	[Masach] [varchar](10) NOT NULL,
	[Soluong] [int] NULL,
	[Vitri] [varchar](4) NULL,
 CONSTRAINT [SK_Masach_PK] PRIMARY KEY CLUSTERED 
(
	[Masach] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON, OPTIMIZE_FOR_SEQUENTIAL_KEY = OFF) ON [PRIMARY]
) ON [PRIMARY]
GO
ALTER TABLE [dbo].[SACHKHO]  WITH CHECK ADD  CONSTRAINT [SK_Masach] FOREIGN KEY([Masach])
REFERENCES [dbo].[SACH] ([Masach])
GO
ALTER TABLE [dbo].[SACHKHO] CHECK CONSTRAINT [SK_Masach]
GO




/****** Object:  Table [dbo].[SACHTRUNGBAY]    Script Date: 27/12/2022 9:34:54 PM ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[SACHTRUNGBAY](
	[Masach] [varchar](10) NOT NULL,
	[Soluong] [int] NULL,
	[Vitri] [varchar](4) NULL,
 CONSTRAINT [STB_Masach_PK] PRIMARY KEY CLUSTERED 
(
	[Masach] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON, OPTIMIZE_FOR_SEQUENTIAL_KEY = OFF) ON [PRIMARY]
) ON [PRIMARY]
GO
ALTER TABLE [dbo].[SACHTRUNGBAY]  WITH CHECK ADD  CONSTRAINT [STB_Masach] FOREIGN KEY([Masach])
REFERENCES [dbo].[SACH] ([Masach])
GO
ALTER TABLE [dbo].[SACHTRUNGBAY] CHECK CONSTRAINT [STB_Masach]
GO




/****** Object:  Table [dbo].[TAIKHOAN]    Script Date: 27/12/2022 9:34:54 PM ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[TAIKHOAN](
	[Username] [varchar](50) NOT NULL,
	[encryptPass] [varchar](100) NULL,
	[Role] [nvarchar](20) NOT NULL,
 CONSTRAINT [TK_Taikhoan_PK] PRIMARY KEY CLUSTERED 
(
	[Username] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON, OPTIMIZE_FOR_SEQUENTIAL_KEY = OFF) ON [PRIMARY]
) ON [PRIMARY]
GO




/****** Object:  Table [dbo].[NHANVIEN]    Script Date: 27/12/2022 9:34:54 PM ******/
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
GO





/****** Object:  Table [dbo].[KHACHHANG]    Script Date: 27/12/2022 9:34:54 PM ******/
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
) ON [PRIMARY]



/****** Object:  Table [dbo].[HOADONMUON]    Script Date: 27/12/2022 9:34:54 PM ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[HOADONMUON](
	[Id] [int] NOT NULL ,
	[SDT] [varchar](11)NOT NULL,
	[Masach] [varchar](10)NOT NULL,
	[Soluong] [int] NULL,
	[Giathue] [float] NULL,
	[Tienthanhtoan] [float] NULL,
	[Ngaymuon] [date] NULL,
	[Ngayhen] [date] NULL,
	[Trangthaihoadon] [bit]  NULL,
 CONSTRAINT [HDM_Id_Masach_PK] PRIMARY KEY CLUSTERED 
(
	[Id],[Masach] ASC
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
GO

/****** Object:  Table [dbo].[HOADONTRA]    Script Date: 27/12/2022 9:34:54 PM ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[HOADONTRA](
	[Id] [int] NOT NULL ,
	[Masach] [varchar](10) NOT NULL,
	[Nhanvien_Id] [varchar](15)NULL,
	[Sotienconlai] [float]NULL,
	[Soluong] [int]NULL,
	[Ngaytra] [date] NOT NULL,
	[Trangthaihoanthanh] [bit] NULL,
	[Trangthaithanhtoan] [bit] NULL,
 CONSTRAINT [HDT_Id_PK] PRIMARY KEY CLUSTERED 
(
	[Id],[Masach],[Ngaytra] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON, OPTIMIZE_FOR_SEQUENTIAL_KEY = OFF) ON [PRIMARY]
) ON [PRIMARY]
GO
ALTER TABLE [dbo].[HOADONTRA]  WITH CHECK ADD  CONSTRAINT [HDT_HoadonmuonId] FOREIGN KEY([Id],[Masach])
REFERENCES [dbo].[HOADONMUON] ([Id],[Masach]) 
GO
ALTER TABLE [dbo].[HOADONTRA] CHECK CONSTRAINT [HDT_HoadonmuonId]
GO
ALTER TABLE [dbo].[HOADONTRA]  WITH CHECK ADD  CONSTRAINT [HDT_NhanvienId] FOREIGN KEY([Nhanvien_Id])
REFERENCES [dbo].[NHANVIEN] ( [Id])
GO
ALTER TABLE [dbo].[HOADONTRA] CHECK CONSTRAINT [HDT_NhanvienId]
GO



/*************************SÁCH*************************************/

/****Show list sách trưng bày dùng cho role Khách Hàng******/
select s.*,stb.Vitri
from SACH s, SACHTRUNGBAY stb
where s.Masach=stb.Masach and stb.Soluong!=0

/****Show list sách kho dùng cho role Nhân Viên, Quản Lý******/
select *
from SACH s, SACHKHO sk
where s.Masach=sk.Masach

/****Show list sách trưng bày dùng cho role Nhân Viên, Quản Lý******/
select *
from SACH s, SACHTRUNGBAY stb
where s.Masach=stb.Masach

/****Show list toàn bộ sách dùng cho role Nhân Viên, Quản Lý******/
select *
from SACHTRUNGBAY
where Masach='MS00766'

select s.Masach,s.Soluong,sk.Soluong,stb.Soluong
from SACH s , SACHKHO sk, SACHTRUNGBAY stb
where s.Masach=sk.Masach and sk.Masach=stb.Masach and s.Soluong <> sk.Soluong

/****Tìm kiếm sách******/
select *
from SACH 
where Noidung like N'%%'
order by NamXB ASC

/****Thêm sách******/
INSERT [dbo].[SACH] ([Masach],[Image], [Tensach], [Tacgia],[NXB], [NamXB], [Sotrang], [Soluong], [Noidung],[Giasach],[Giathue]) VALUES (N'Masach','Image', N'Tensach', N'Tacgia',N'NXB',2023, 100, 239, N'Noidung',230000,2000)
GO

/****Trigger Thêm sách : đồng thời thêm sách trong kho******/
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
GO

/****Trigger Cập nhật sách: đồng thời cập nhật sách trong kho,******/
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
	SELECT @SoLuongSachDuocMuon=ISNULL(SUM(Soluong),0) FROM HOADONMUON where Masach=@MaSach
	SELECT @SoLuongSachDuocTra=ISNULL(SUM(t.Soluong),0)  FROM HOADONMUON m left join HOADONTRA t on m.Id=t.Id and m.Masach=t.Masach where m.Masach=@MaSach
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
GO

/****Trigger Xóa sách :xóa sách trong kho và xóa sách trưng bày,******/
 CREATE TRIGGER TG_XoaSACH ON SACH
INSTEAD OF DELETE
AS
BEGIN
    SET NOCOUNT ON;

    -- Kiểm tra biến table để đảm bảo không chạy vào vòng lặp vô hạn
    IF NOT EXISTS (
        SELECT 1
        FROM inserted
        WHERE EXISTS (
            SELECT 1
            FROM deleted
        )
    )
    BEGIN
        -- Đặt biến đánh dấu recursion
        DECLARE @Recursive BIT = 1;

        -- Thực hiện các hành động trong trigger
		DECLARE @MaSach varchar(10);

		 -- Lấy thông tin từ bảng Inserted (chứa dữ liệu mới được thêm)
		SELECT @MaSach = Masach FROM deleted
	    DELETE SACHTRUNGBAY where Masach=@MaSach
		DELETE  SACHKHO where Masach=@MaSach
	    DELETE SACH where Masach=@MaSach
        -- Hủy đánh dấu recursion
        SET @Recursive = 0;
    END
END;
    

GO
/****Xóa  sách******/
delete SACH where Masach='MS45214'

/****Thêm sách trưng bày******/
INSERT [dbo].[SACHTRUNGBAY]([Masach],[Soluong],[Vitri]) VALUES(N'MS00001',3,'A03')

/****Cập nhật sách  trưng bày******/

Update SACHTRUNGBAY
set Soluong=8
where Masach='MS00001'

Update HOADONMUON
set Soluong=2
where Masach='MS00001'
delete HOADONMUON where Masach='MS00001'
Update SACHKHO
set Soluong=12
where Masach='MS00001'

/****Xóa Sách******/
delete SACHTRUNGBAY
where Masach='MS00002'

/*************************SÁCH KHO*************************************/

/****Trigger Cập nhật sách kho: đồng thời cập nhật sách ,******/
GO
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
	SELECT @SoLuongSachDuocMuon=ISNULL(SUM(Soluong),0) FROM HOADONMUON where Masach=@MaSach
	SELECT @SoLuongSachDuocTra=ISNULL(SUM(t.Soluong),0)  FROM HOADONMUON m left join HOADONTRA t on m.Id=t.Id and m.Masach=t.Masach where m.Masach=@MaSach
	-- Kiểm tra nếu mã sách có trong hóa đơn mượn
    IF  (((@SoLuongSachTrungBay+@SoLuongKhoMoi+(@SoLuongSachDuocMuon-@SoLuongSachDuocTra)))<>@TongSoLuongSach)
    BEGIN
        -- Cập nhật giá trị số lượng trong bảng Kho
       UPDATE SACH
       SET Soluong = Soluong + (@SoLuongKhoMoi-@SoLuongKhoCu)
       WHERE Masach = @MaSach;
    END
END;
GO

/****Trigger Xóa sách kho : cập nhạt số lượng về 0,không thực hiện hành động xóa,******/
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
GO


/*************************SÁCH TRƯNG BÀY*************************************/
GO
/****Trigger Thêm sách trưng bày: giảm số lượng trong kho,tạo giá trị mới trong bảng sách trưng bày******/
 CREATE TRIGGER TG_ThemSachTrungBay ON SACHTRUNGBAY
AFTER INSERT
AS
BEGIN
    SET NOCOUNT ON;

    DECLARE @MaSach varchar(10), @SoLuongTrungBay INT,@SoLuongSachDuocTra INT,@SoLuongSachKho INT,@TongSoLuongSach INT,@SoLuongSachDuocMuon INT;
	 -- Lấy thông tin từ bảng Inserted (chứa dữ liệu mới được thêm)
    SELECT @MaSach = Masach, @SoLuongTrungBay = Soluong FROM inserted
	SELECT @TongSoLuongSach=Soluong FROM SACH WHERE Masach=@MaSach
	SELECT @SoLuongSachKho=Soluong FROM SACHKHO WHERE Masach=@MaSach
	SELECT @SoLuongSachDuocMuon=ISNULL(SUM(Soluong),0) FROM HOADONMUON where Masach=@MaSach
	SELECT @SoLuongSachDuocTra=ISNULL(SUM(t.Soluong),0)  FROM HOADONMUON m left join HOADONTRA t on m.Id=t.Id and m.Masach=t.Masach where m.Masach=@MaSach
	-- Kiểm tra nếu mã sách có trong hóa đơn mượn
    IF  (((@SoLuongTrungBay+@SoLuongSachKho+(@SoLuongSachDuocMuon-@SoLuongSachDuocTra)))<>@TongSoLuongSach)
    BEGIN
        -- Nếu không tồn tại
	 -- Cập nhật giá trị số lượng trong bảng Kho
       UPDATE SACHKHO
       SET Soluong = Soluong - @SoLuongTrungBay
       WHERE Masach = @MaSach;
	END
END
GO

/****Trigger Cập nhật sách trưng bày: tăng số lượng kho nếu không tồn tại hóa đơn mượn nào có mã sách đó,******/
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
	SELECT @SoLuongSachDuocMuon=ISNULL(SUM(Soluong),0) FROM HOADONMUON where Masach=@MaSach
	SELECT @SoLuongSachDuocTra=ISNULL(SUM(t.Soluong),0)  FROM HOADONMUON m left join HOADONTRA t on m.Id=t.Id and m.Masach=t.Masach where m.Masach=@MaSach
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
GO


/****Trigger Xóa sách trưng bày: tăng số lượng kho số lượng trong kho,******/
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
GO

/**************************HÓA ĐƠN MƯỢN************************************/

/****Thêm hóa đơn mượn******/
INSERT [dbo].[HOADONMUON] ([SDT],[Masach], [Soluong] ,[Giathue],[Tienthanhtoan], [Ngaymuon], [Ngayhen], [Trangthaihoadon]) VALUES ('0707622862', N'MS00001', 3,2000,36000, CAST(GETDATE() AS DATE) , CAST(GETDATE() AS DATE), 1)
GO
INSERT [dbo].[HOADONMUON] ([Id],[SDT],[Masach], [Soluong] ,[Giathue],[Tienthanhtoan], [Ngaymuon], [Ngayhen], [Trangthaihoadon]) VALUES (42,'0707622862', N'MS00059', 2,3000,360000, CAST(N'2023-12-01' AS DATE) , CAST(GETDATE() AS DATE), 1)


/****Trigger thêm Hóa đơn mượn: giảm số lượng sách trưng bày******/
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
GO
/****Trigger cập nhật Hóa đơn mượn: thay đổi số lượng sách trưng bày******/
 CREATE TRIGGER TG_CapNhatHoaDonMuon ON HOADONMUON
AFTER UPDATE
AS
BEGIN
    SET NOCOUNT ON;
	 DECLARE @MaSach varchar(10), @Id INT,@SoLuongMuonMoi INT,@SoLuongMuonCu INT,@SoLuongSachDuocTra INT,@SoLuongSachKho INT,@TongSoLuongSach INT,@SoLuongSachTrungBay INT;
	 -- Lấy thông tin từ bảng Inserted (chứa dữ liệu mới được thêm)
    SELECT @MaSach = Masach, @SoLuongMuonMoi = Soluong,@Id=Id FROM inserted
	SELECT @SoLuongMuonCu=Soluong FROM deleted
	SELECT @TongSoLuongSach=Soluong FROM SACH WHERE Masach=@MaSach
	SELECT @SoLuongSachKho=Soluong FROM SACHKHO WHERE Masach=@MaSach
	SELECT @SoLuongSachTrungBay=SoLuong  FROM SACHTRUNGBAY WHERE Masach=@MaSach
	SELECT @SoLuongSachDuocTra=ISNULL(SUM(Soluong), 0)  FROM HOADONTRA WHERE Masach=@MaSach and id=@Id
	-- Kiểm tra nếu mã sách có trong hóa đơn mượn
    IF  (((@SoLuongSachTrungBay+@SoLuongSachKho+(@SoLuongMuonMoi-@SoLuongSachDuocTra)))<>@TongSoLuongSach)
    BEGIN
        -- Nếu không tồn tại
        -- Cập nhật giá trị số lượng trong bảng Kho
       UPDATE SACHTRUNGBAY
       SET Soluong = Soluong - (@SoLuongMuonMoi-@SoLuongMuonCu)
       WHERE Masach = @MaSach;
    END
END
GO
/****Trigger Xóa Hóa đơn mượn: tăng số lượng sách trưng bày******/
 CREATE TRIGGER TG_XoaHoaDonMuon ON HOADONMUON
AFTER DELETE
AS
BEGIN
    SET NOCOUNT ON;

    DECLARE @MaSach varchar(10), @SoLuongMuon INT;

    -- Lấy thông tin từ bảng Inserted (chứa dữ liệu mới được thêm)
    SELECT @MaSach = Masach, @SoLuongMuon = Soluong FROM deleted
	if(EXISTS( select * from SACHTRUNGBAY where Masach=@MaSach))
	BEGIN
			-- Cập nhật giá trị số lượng trong bảng Kho
		   UPDATE SACHTRUNGBAY
		   SET Soluong = Soluong + @SoLuongMuon
		   WHERE Masach = @MaSach;
	END
	ELSE
	BEGIN
			INSERT [dbo].[SACHTRUNGBAY]([Masach],[Soluong]) VALUES(@MaSach,@SoLuongMuon)
	END
END
GO
/****Danh sách hóa đơn mượn******/
select *
from HOADONMUON 


/****Xóa hóa đơn mượn******/
delete HOADONMUON where Masach='MS00001'


update HOADONMUON
set Soluong=5
where Masach='MS00766'
/**************************HÓA ĐƠN TRẢ************************************/

/****Thêm hóa đơn trả******/
INSERT [dbo].[HOADONTRA] ([Id],[Nhanvien_Id], [Sotienconlai] ,[Ngaytra],[Trangthaithanhtoan]) VALUES (6,'225928208', 34000, CAST(GETDATE() AS DATE) ,  0)
GO

/****Trigger thêm Hóa đơn mượn: tăng số lượng sách trưng bày******/
 CREATE TRIGGER TG_ThemHoaDonTra ON HOADONTRA
AFTER INSERT
AS
BEGIN
    SET NOCOUNT ON;

    DECLARE @MaSach varchar(10), @SoLuongTra INT;

    -- Lấy thông tin từ bảng Inserted (chứa dữ liệu mới được thêm)
    SELECT @MaSach = Masach, @SoLuongTra = Soluong FROM inserted
	if(EXISTS( select * from SACHTRUNGBAY where Masach=@MaSach))
	BEGIN
		 -- Cập nhật giá trị số lượng trong bảng Kho
		   UPDATE SACHTRUNGBAY
		   SET Soluong = Soluong + @SoLuongTra
		   WHERE Masach = @MaSach;
	END
	else
	BEGIN
			INSERT [dbo].[SACHTRUNGBAY]([Masach],[Soluong]) VALUES(@MaSach,@SoLuongTra)
	END
	 
END

GO
/****Trigger cập nhật Hóa đơn trả: thay đổi số lượng sách trưng bày******/
 CREATE TRIGGER TG_CapNhatHoaDonTra ON HOADONTRA
AFTER UPDATE
AS
BEGIN
    SET NOCOUNT ON;
	 DECLARE @MaSach varchar(10), @Id INT, @SoLuongTraMoi INT,@SoLuongTraCu INT,@SoLuongSachDuocMuon INT,@SoLuongSachKho INT,@TongSoLuongSach INT,@SoLuongSachTrungBay INT;
	 -- Lấy thông tin từ bảng Inserted (chứa dữ liệu mới được thêm)
    SELECT @MaSach = Masach, @SoLuongTraMoi = Soluong,@Id=Id FROM inserted
	SELECT @SoLuongTraCu=Soluong FROM deleted
	SELECT @TongSoLuongSach=Soluong FROM SACH WHERE Masach=@MaSach
	SELECT @SoLuongSachKho=Soluong FROM SACHKHO WHERE Masach=@MaSach
	SELECT @SoLuongSachTrungBay=SoLuong  FROM SACHTRUNGBAY WHERE Masach=@MaSach
	SELECT @SoLuongSachDuocMuon=ISNULL(SUM(m.Soluong), 0) FROM HOADONMUON m left join HOADONTRA t on m.Id=t.Id and m.Masach=t.Masach where m.Masach=@MaSach and m.Id=@Id
	-- Kiểm tra nếu mã sách có trong hóa đơn mượn
    IF  (((@SoLuongSachTrungBay+@SoLuongSachKho+(@SoLuongSachDuocMuon-@SoLuongTraMoi)))<>@TongSoLuongSach)
    BEGIN
        -- Nếu không tồn tại
        -- Cập nhật giá trị số lượng trong bảng Kho
       UPDATE SACHTRUNGBAY
       SET Soluong = Soluong + (@SoLuongTraMoi-@SoLuongTraCu)
       WHERE Masach = @MaSach;
    END
END
GO
/****Trigger Xóa Hóa đơn trả: giảm số lượng sách trưng bày******/
 CREATE TRIGGER TG_XoaHoaDonTra ON HOADONTRA
AFTER DELETE
AS
BEGIN
    SET NOCOUNT ON;

    DECLARE @MaSach varchar(10), @SoLuongTra INT,@Id INT;
	SELECT @MaSach = Masach,@SoLuongTra=Soluong FROM deleted
	 -- Cập nhật giá trị số lượng trong bảng Kho
       UPDATE SACHTRUNGBAY
       SET Soluong = Soluong - @SoLuongTra
       WHERE Masach = @MaSach;
END
GO
/****Danh sách hóa đơn trả******/
select *
from HOADONTRA

/****Danh sách hóa đơn đã hoàn thành******/
select *
from HOADONMUON m, HOADONTRA t
where  t.Id=m.Id
/****Danh sách hóa đơn chờ xử lý******/
select *
from HOADONMUON m, HOADONTRA t
where  t.Id=m.Id and Trangthaithanhtoan=0
/****Danh sách hóa đơn chưa trả******/
select *
from HOADONMUON m
where  NOT EXISTS(select *
									from HOADONTRA  t
									where m.Id=t.id) and Masach='MS00001'
/****Cập nhật hóa đơn trả******/
Update HOADONMUON
set Masach='MS05461'
/****Xóa hóa đơn mượn******/
delete HOADONTRA

/****Thêm sách trưng bày******/
/****Thêm sách trưng bày******/
/****Thêm sách trưng bày******/
/****Thêm sách trưng bày******/
/****Thêm sách trưng bày******/
/****Thêm sách trưng bày******/
/****Thêm sách trưng bày******/
/****Thêm sách trưng bày******/





/**************************TÀI KHOẢN************************************/
/****Thêm tài khoản******/
INSERT [dbo].[TAIKHOAN] ([Username],[encryptPass], [Role] ) VALUES ('hoaproas123','ádsdádssađ', N'Quản Lý')

/**************************NHÂN VIÊN************************************/
/****Thêm nhân viên******/
INSERT [dbo].[NHANVIEN] ([Id], [Hoten],[Sdt] ,[Gioitinh],[Diachi],[Tuoi],[Quequan]) VALUES ('225928205',N'Hồ Ngọc Hòa', '0707622863' ,  1,N'66D, đường Dương Quảng Hàm, phường 5, quận Gò Vấp',23,N'Khánh Hòa')

/****Danh Sách Khách Hàng******/
Select *
From NHANVIEN
/**************************KHACH HÀNG************************************/
/****Thêm Khách Hàng******/
INSERT [dbo].[KHACHHANG] ([SDT],[Hoten], [Tuoi] ) VALUES ('0707622862',N'Hồ Thiên Bảo',22)

/****Danh Sách Khách Hàng******/
Select *
From KHACHHANG


Delete KHACHHANG


/****************CHỨC NĂNG THỐNG KÊ**************************/
select count(*) as h
from HOADONMUON m 
where not EXISTS(select *
                     from HOADONTRA t
                     where m.Id=t.Id)

select count(*)
from HOADONMUON m,HOADONTRA t
where m.Id=t.Id and t.Trangthaithanhtoan=0

select count(*)
from HOADONMUON m,HOADONTRA t
where m.Id=t.Id and t.Trangthaithanhtoan=1

select TOP 10 *
from SACH s
where EXISTS (select *
                 from HOADONMUON m
                where s.Masach=m. Masach)

select *
from HOADONMUON

select TOP 20 Tensach,sk.Soluong
from SACHKHO sk, SACH s
where sk.Masach=s.Masach
order by sk.Soluong DESC

select SUM(m.Tienthanhtoan),SUM(t.Sotienconlai),t.Ngaytra
from HOADONMUON m, HOADONTRA t
where m.Id=t.Id and t.Trangthaithanhtoan=1
group by t.Ngaytra
order by t.Ngaytra ASC