DROP TABLE IF EXISTS purchase;
DROP TABLE IF EXISTS painting;
DROP TABLE IF EXISTS artist;
DROP TABLE IF EXISTS customer;


CREATE TABLE customer (
  customer_id serial,
  first_name varchar(50)NOT NULL,
  last_name varchar(50)NOT NULL,
  address varchar(100)NOT NULL,
  phone int NULL,
  CONSTRAINT pk_customer PRIMARY KEY (customer_id)
);


CREATE TABLE artist (
  artist_id serial PRIMARY KEY,
  artist_name varchar(250)NOT NULL
);



CREATE TABLE painting (
  painting_id serial,
  title varchar(250)NOT NULL,
  artist_id int NOT NULL,
  
  CONSTRAINT pk_painting PRIMARY KEY (painting_id),
  CONSTRAINT fk_painting_artist FOREIGN KEY (artist_id) REFERENCES artist (artist_id)     --which/ which column it ties to 
);

CREATE TABLE purchase (
  purchase_id serial PRIMARY KEY,
  price money NOT NULL, -- money is a type of variable
  purchase_date timestamp NOT NULL,
  customer_id int NOT NULL,
  painting_id int NOT NULL,
  
  CONSTRAINT fk_purchase_customer FOREIGN KEY (customer_id) REFERENCES customer (customer_id),
  CONSTRAINT fk_purchase_painting FOREIGN KEY (painting_id) REFERENCES painting (painting_id)
  );
  