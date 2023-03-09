
create table if not exists customers(id bigserial, name varchar(255));
insert into customers (name) values ('first'), ('second'), ('third');


create table if not exists products(id bigserial, title varchar(255), price integer);
insert into products (title, price) VALUES ('product1', 10), ('product2', 20), ('product3', 30);


create table if not exists product_buyers(product_id bigint, customer_id bigint, foreign key (product_id) references products (id), foreign key (customer_id) references customers(id));
insert into product_buyers (product_id, customer_id) values (1, 2),(1, 3),(2, 1),(2, 3),(3, 1);

