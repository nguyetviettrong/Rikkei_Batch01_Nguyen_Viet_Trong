/*2*/
select * from sanphamdochoi where  SoLuong>20 and DonGia<1000000;
select * from sanphamdungcu where  SoLuong>20 and DonGia<1000000;
select * from sanphamsach where  SoLuong>20 and DonGia<1000000;

/*3*/

select * from khachhang where (YEAR(CURDATE()) - YEAR(ngaysinh)) - (RIGHT(CURDATE(), 5) < RIGHT(ngaysinh, 5)) > 16 AND (YEAR(CURDATE()) - YEAR(ngaysinh)) - (RIGHT(CURDATE(), 5) < RIGHT(ngaysinh, 5))<30;

/*4*/

select * from donhang where year(NgayMuaHang)='2020';

/*5*/ 
select * from donhang where quarter('2020/11/12');
select * from donhang d, khachhang where QUARTER(d.NgayMuaHang)=4;
	

