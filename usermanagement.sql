use demo;
create table user_details(
	user_id varchar(30) not null primary key,
    user_category varchar(20) not null,
    FirstName varchar(30) not null,
    Surname varchar(30) not null,
    Other_name varchar(30),
    DOB date ,
    Gender varchar(10) not null,
    marital_status varchar(30) ,
    Address varchar(50) not null,
    mobile_phone varchar(50) not null,
    email_address varchar(50),
    county_residence varchar(40) ,
    post_code varchar(30) ,
    primary key(user_id)
);

create table patient_details(
	details_id INT NOT NULL auto_increment,
	user_id varchar(30) not null,
    username varchar(30) not null,
    title varchar(10) not null,
    nhif_no varchar(30),
    next_of_kin varchar(30) not null,
    relationship varchar(30) not null,
    contacts_next_kin varchar(30) not null,
    emergency_contact varchar(50) not null,
    smoking boolean not null,
    first_lanaguage varchar(30) not null,
    occupation varchar(30),
    PRIMARY KEY (details_id),
    foreign key(user_id) references user_details (user_id)
);
create table doctor_details(
	details_id int not null auto_increment,
	user_id varchar(30) not null,
    username varchar(30) not null ,
    area_of_practice varchar(30) not null,
	account_activate boolean,
    medical_reg_no varchar(30),
    primary key(details_id),
    foreign key(user_id) references user_details(user_id)
);
create table admin_details(
	details_id int not null auto_increment,
	user_id varchar(30) not null,
	roles integer,
    occupation varchar(30),
    primary key(details_id),
    foreign key(user_id) references user_details(user_id)
);