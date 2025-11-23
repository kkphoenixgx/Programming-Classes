tags: [[SQL/admBancoDeDados/index|index]]

use bdadmin;

create table if not exists SuplierProducts(
	supplierId INT not null,
    productId INT not null,
    primary key (supplierId, productId)
) ENGINE=INNODB AUTO_INCREMENT=1; 


--------------------------------------

Procedure:

CREATE DEFINER=`root`@`localhost` PROCEDURE `insertSupplierProduct`(
	in inSupplierId int,
    in inProductId int
)
BEGIN
	declare exit handler for sqlexception select 'SQLException encountered';
    
    insert into SupplierProducts(supplierId, productId) values(
		inSupplierId, inProductId
    );
    
	select count(*) from SupplierProducts where supplierId = inSupplierId;
    
END


Call:

call InsertSupplierProduct(1, 1);
call InsertSupplierProduct(1, 2);
call InsertSupplierProduct(1, 3);

call InsertSupplierProduct(1, 3);


-----------------------------------------

use bdadmin;

drop table if exists SupplierProducts;

create table SupplierProducts(
	supplierId INT not null,
    productId INT not null,
    primary key (supplierId, productId)
) ENGINE=INNODB AUTO_INCREMENT=1; 

Select * from SupplierProducts;

insert into SupplierProducts(supplierId, productId)  values(1, 1);
insert into SupplierProducts(supplierId, productId)  values (1, 2);
insert into SupplierProducts(supplierId, productId)  values(1, 3);

-- rollback;
commit;

Select * from SupplierProducts;