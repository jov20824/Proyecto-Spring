insert into cliente(nombre,telefono) values ('Sergio',684232323);
insert into cliente(nombre,telefono) values ('Jorge',684232324);
insert into cliente(nombre,telefono) values ('Luis',684232325);
insert into cliente(nombre,telefono) values ('Pablo',684232326);


insert into pedido(hora_realizado,hora_reserva,FK_CLIENTE) values ('oven','forge',2);
insert into pedido(hora_realizado,hora_reserva,FK_CLIENTE) values ('Hola','guay',3);
insert into pedido(hora_realizado,hora_reserva,FK_CLIENTE) values ('Mieres','La Felguera',4);
insert into pedido(hora_realizado,hora_reserva,FK_CLIENTE) values ('Marcos','Xuanxe',1);


insert into plato(nombre,descripcion,precio,foto) values 
('Cocido mierense','Muy rico',6.99,'a');
insert into plato(nombre,descripcion,precio,foto) values 
('Cocido Felguerino','Muy rico',2.50,'a');
insert into plato(nombre,descripcion,precio,foto) values 
('Cocido Karatraba','Muy rico',9.95,'a');
insert into plato(nombre,descripcion,precio,foto) values 
('Cocido SanCloyano','Muy rico',5.00,'a');
insert into plato(nombre,descripcion,precio,foto) values 
('Filete Seresco','Muy rico',5.00,'a');
insert into plato(nombre,descripcion,precio,foto) values 
('Anchoas del piles','Muy rico',5.00,'a');
insert into plato(nombre,descripcion,precio,foto) values 
('Rata al Avilés','Muy rico',5.00,'a');

insert into contiene(pedido_id,plato_id,cantidad) values (1,1,3);
insert into contiene(pedido_id,plato_id,cantidad) values (1,2,1);
insert into contiene(pedido_id,plato_id,cantidad) values (1,3,2);
insert into contiene(pedido_id,plato_id,cantidad) values (3,4,1);
insert into contiene(pedido_id,plato_id,cantidad) values (2,2,2);
insert into contiene(pedido_id,plato_id,cantidad) values (4,1,3);
insert into contiene(pedido_id,plato_id,cantidad) values (4,2,1);