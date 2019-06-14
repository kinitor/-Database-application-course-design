create procedure add_customer_message--添加用户信息存储过程
    @Customer_id varchar(20) ,
	@Customer_vip bit,--是否会员
	@Customer_vip_money float,--会员卡金额
	@Customer_tel varchar(20) --顾客联系电话
as
insert into Customer(Customer_id,Customer_vip,Customer_vip_money,Customer_tel)
values (@Customer_id,@Customer_vip,@Customer_vip_money,@Customer_tel)


DROP TABLE BOOK

exec add_book_message 'BK10000', 31.00, 44.00, '概率论', '科学出版社', 5 
exec add_book_message 'BK10001', 37.00, 50.00, '算法导论', '北京出版社', 5 
exec add_book_message 'BK10002', 24.00, 37.00, '数据库开发与应用', '人民邮电出版社', 5 
exec add_book_message 'BK10003', 30.00, 43.00, 'java程序设计教程', '高等教育出版社', 5 
exec add_book_message 'BK10004', 49.00, 62.00, '数据库系统概论', '清华大学出版社', 5 
exec add_book_message 'BK10005', 24.00, 37.00, '算法与数据结构', '中国人民大学出版社', 5 
exec add_book_message 'BK10006', 38.00, 51.00, '离散数学', '科学出版社', 5 
exec add_book_message 'BK10007', 38.00, 51.00, '概率论', '北京出版社', 5 
exec add_book_message 'BK10008', 42.00, 55.00, '算法导论', '人民邮电出版社', 5 
exec add_book_message 'BK10009', 34.00, 47.00, '数据库开发与应用', '高等教育出版社', 5 
exec add_book_message 'BK10010', 25.00, 38.00, 'java程序设计教程', '清华大学出版社', 5 
exec add_book_message 'BK10011', 25.00, 38.00, '数据库系统概论', '中国人民大学出版社', 5 
exec add_book_message 'BK10012', 21.00, 34.00, '算法与数据结构', '科学出版社', 5 
exec add_book_message 'BK10013', 47.00, 60.00, '离散数学', '北京出版社', 5 
exec add_book_message 'BK10014', 21.00, 34.00, '概率论', '人民邮电出版社', 5 
exec add_book_message 'BK10015', 31.00, 44.00, '算法导论', '高等教育出版社', 5 
 

--------------------------------------------------------------------------------

create procedure add_customer_message--添加用户信息存储过程
    @Customer_id varchar(20) ,
	@Customer_vip bit,--是否会员
	@Customer_vip_money float,--会员卡金额
	@Customer_tel varchar(20) --顾客联系电话
as
insert into Customer(Customer_id,Customer_vip,Customer_vip_money,Customer_tel)
values (@Customer_id,@Customer_vip,@Customer_vip_money,@Customer_tel)

create procedure add_book_message
	@Book_id varchar(20), --图书号
	@Book_in_price float,--进价
	@Book_out_price float,--图书售价
	@Book_name varchar(20),--书名
	@Supplier_name varchar(20),--供应商名字
	@Book_stock int--库存
as
insert into Book(Book_id,Book_in_price,Book_out_price,Book_name,Supplier_name,Book_stock)
values (@Book_id, @Book_in_price, @Book_out_price, @Book_name, @Supplier_name, @Book_stock)





------------------------------------------------------------------------------------------------
drop proc add_supplier_message
go 
create procedure add_supplier_message
	@Supplier_id varchar(20),--供应商号
	@Supplier_name varchar(20),--供应商名字
	@Supplier_city varchar(20),--供应商城市
	@Supplier_tel varchar(20)--供应商电话
as
insert into supplier(Supplier_id, Supplier_name, Supplier_city, Supplier_tel)
values (@Supplier_id, @Supplier_name, @Supplier_city, @Supplier_tel)
exec add_supplier_message 'GY10001', '人民邮电出版社', '北京','18010411467'
exec add_supplier_message 'GY10002', '高等教育出版社', '上海','18013341500'
exec add_supplier_message 'GY10003', '清华大学出版社', '广州','18011691724'
exec add_supplier_message 'GY10004', '中国人民大学出版社', '北京','18014781358'
exec add_supplier_message 'GY10005', '科学出版社', '深圳','18019621464'
exec add_supplier_message 'GY10006', '北京出版社', '北京','18017051145'


select * from supplier
select * from book
