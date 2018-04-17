CREATE SEQUENCE ourid START 100;

SELECT nextval('ourid');

CREATE TABLE seqtest (
        id serial not null,
        name varchar(35)
        );
        
select * FROM seqtest;

INSERT INTO seqtest (name) VALUES ('c');

CREATE TABLE ouridtest (
        id int not null,
        name varchar(35)
        );
        
select * from ouridtest;
        
INSERT INTO ouridtest (id, name) VALUES ((SELECT nextval('ourid')), 'testC');


DROP TABLE phone;
DROP TABLE address;
DROP TABLE contact;


CREATE TABLE contact
(
        contact_id serial not null,
        last_name varchar(100) not null,
        first_name varchar(100) not null,
        brthday timestamp,
        date_added timestamp,
        
        constraint pk_contactid primary key (contact_id)
);

CREATE TABLE address
(
        address_id serial not null,
        contact_id int not null,
        addressType varchar(100) not null,
        addressOtherDescription varchar(200),
        addressLine1 varchar(200) not null,
        addressLine2 varchar(200),
        city varchar(100) not null,
        state varchar(50) not null,
        postalCode varchar(10) not null,
        
        constraint pk_addressId primary key (address_id),
        constraint fk_addressContactId foreign key (contact_id) references contact(contact_id),
        constraint chk_addressType check (addressType IN ('Home', 'Work', 'Shipping', 'Billing', 'Other')),
        constraint chk_addressOtherDescription check ( 
                (addressType = 'Other' AND addressOtherDescription IS NOT NULL) OR  
                (addressType <> 'Other' AND addressOtherDescription IS NULL))
 
);

CREATE TABLE phone
(
        phone_id serial not null,
        contact_id int not null,
        phoneType varchar(100) not null,
        phoneOtherDescription varchar(200),
        phoneNumber varchar(10) not null,
        
        constraint pk_phoneId primary key (phone_id),
        constraint fk_phoneContactId foreign key (contact_id) references contact(contact_id),
        constraint chk_phoneType check (phoneType IN ('Home', 'Work', 'Mobile', 'Other')),
        constraint chk_phoneOtherDescription check (
                (phoneType = 'Other' AND phoneOtherDescription IS NOT NULL) OR
                (phoneType <> 'Other' AND phoneOtherDescription IS NULL))
);

CREATE TABLE email
(
        email_id serial not null,
        contact_id int not null,
        emailType varchar(100) not null,
        emailAddress varchar(255) not null,
        
        constraint pk_emailId primary key (email_id),
        constraint fk_emailContactId foreign key (contact_id) references contact(contact_id),
        constraint chk_emailType check (emailType IN ('Home', 'Work', 'Other')),
        constraint chk_emailAt check (emailAddress LIKE '%@%')        
);

INSERT INTO contact (last_name, first_name) VALUES ('test', 'contact');


SELECT * FROM contact

INSERT INTO email (contact_id, emailType, emailAddress) VALUES (1, 'Home', 'test@test.com');
INSERT INTO email (contact_id, emailType, emailAddress) VALUES (1, 'Work', 'ouremail@test.com');








