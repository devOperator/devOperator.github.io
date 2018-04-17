/*

DROP TABLE project_employee;
DROP TABLE employee_department;
DROP TABLE department;
DROP TABLE project;
DROP TABLE employee;

*/

CREATE TABLE employee
(
    employee_number serial not null,
    jobtitle varchar(35) not null,
    last_name varchar(35) not null,
    first_name varchar(35) not null,
    gender varchar(10),
    birthday timestamp,
    hiredate timestamp not null,
    worksforadepartment boolean not null,

    constraint pk_employee_number PRIMARY KEY (employee_number),
    constraint chk_gender check (gender IN('male', 'female', 'other')),
    constraint chk_jobtitle check (jobtitle IN('VP', 'MD', 'ASSOC', 'SQUID'))
);

INSERT INTO employee (jobtitle, last_name, first_name, gender, birthday, hiredate, worksforadepartment) 
VALUES ('VP' ,'Janks', 'Jawn', 'male', '1950-12-12', '1997-1-4', true);

INSERT INTO employee (jobtitle, last_name, first_name, gender, birthday, hiredate, worksforadepartment) 
VALUES ('SQUID' ,'Jones', 'Alex', 'male', '1950-12-12', '1997-1-4', true);

INSERT INTO employee ( jobtitle, last_name, first_name, gender, birthday, hiredate, worksforadepartment) 
VALUES ('ASSOC' ,'Crowth', 'Janet', 'female', '1950-12-12', '1997-1-4', true);

INSERT INTO employee (jobtitle, last_name, first_name, gender, birthday, hiredate, worksforadepartment) 
VALUES ('VP' ,'Green', 'Fred', 'male', '1950-12-12', '1997-1-4', true);

INSERT INTO employee ( jobtitle, last_name, first_name, gender, birthday, hiredate, worksforadepartment) 
VALUES ('ASSOC' ,'Vince', 'Vaughn', 'male', null ,'1997-1-4', true);

INSERT INTO employee (jobtitle, last_name, first_name, gender, birthday, hiredate, worksforadepartment) 
VALUES ('ASSOC' ,'Sarow', 'Shaen', 'female', null, '1997-1-4', true);

INSERT INTO employee (jobtitle, last_name, first_name, gender, birthday, hiredate, worksforadepartment) 
VALUES ('MD' ,'Tintem', 'Charles', 'male', '1950-12-12', '1997-1-4', true);

INSERT INTO employee ( jobtitle, last_name, first_name, gender, birthday, hiredate, worksforadepartment) 
VALUES ('MD' ,'Porth', 'Charlie', 'female', '1950-12-12', '1997-1-4', false);


CREATE TABLE department
(
    department_number serial not null,
    name varchar(35) not null,

    constraint pk_department_number PRIMARY KEY (department_number)

);

INSERT INTO department (name)
VALUES ('Sales');

INSERT INTO department (name)
VALUES ('Marketing');

INSERT INTO department (name)
VALUES ('Technology');


CREATE TABLE project
(
    project_number serial not null,
    name varchar(35) not null,
    startdate timestamp not null,
    constraint pk_project_number PRIMARY KEY (project_number)
);

INSERT INTO project (name, startdate)
VALUES ('Tech Refresh Upgrade to v2.2', '2017-05-13');

INSERT INTO project (name, startdate)
VALUES ('Conversion to New Infrastructure', '2018-01-11');

INSERT INTO project (name, startdate)
VALUES ('Project Truffle Shuffle', '2017-03-20');

INSERT INTO project (name, startdate)
VALUES ('Building Security Enhanement', '2017-06-15');

CREATE TABLE employee_department
(   
        
    employee_number serial not null,
    department_number serial not null,
    
    PRIMARY KEY  (employee_number, department_number),    
    
    constraint fk_employee_number FOREIGN KEY (employee_number) REFERENCES employee(employee_number),
    constraint fk_department_number FOREIGN KEY (department_number) REFERENCES department(department_number)

    -- constraint chk_jobtitle check (jobtitle IN('VP', 'MD', 'ASSOC', 'SQUID'))
);

INSERT INTO employee_department(employee_number, department_number)
VALUES (1, 1);
INSERT INTO employee_department(employee_number, department_number)
VALUES (2, 1);
INSERT INTO employee_department(employee_number, department_number)
VALUES (3, 2);
INSERT INTO employee_department(employee_number, department_number)
VALUES (4, 2);
INSERT INTO employee_department(employee_number, department_number)
VALUES (5, 3);
INSERT INTO employee_department(employee_number, department_number)
VALUES (6, 3);
INSERT INTO employee_department(employee_number, department_number)
VALUES (7, 1);


CREATE TABLE project_employee
(
    project_number serial not null,
    employee_number serial not null,
    PRIMARY KEY  (employee_number, project_number),    
    
    constraint fk_employee_number FOREIGN KEY (employee_number) REFERENCES employee(employee_number),
    constraint fk_project_number FOREIGN KEY (employee_number) REFERENCES project
    (project_number)

);


INSERT INTO project_employee(project_number, employee_number)
VALUES (1,1);
INSERT INTO project_employee(project_number, employee_number)
VALUES (1,2);
INSERT INTO project_employee(project_number, employee_number)
VALUES (1,3);
INSERT INTO project_employee(project_number, employee_number)
VALUES (2,2);
INSERT INTO project_employee(project_number, employee_number)
VALUES (2,3);
INSERT INTO project_employee(project_number, employee_number)
VALUES (5,3);
INSERT INTO project_employee(project_number, employee_number)
VALUES (6,3);
INSERT INTO project_employee(project_number, employee_number)
VALUES (4,2);
INSERT INTO project_employee(project_number, employee_number)
VALUES (4,3);
--Note the order is actually going employee_no. , project_no 
--may be be based on primary key order instead.

