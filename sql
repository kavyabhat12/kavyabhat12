create table branch
(usn varchar(10) primary key,
branch varchar(30) not null
);


alter table branch
add foreign key (usn) references student (usn); 



create table branch(bid int(5) primary key,
                    bname varchar(20) not null,
                    hod varchar(20) not null);
                    
create table stud (usn varchar(10) primary key,
                   sname varchar(20) not null,
                   address varchar(30) not null,
                FOREIGN KEY (bid) REFERENCES branch(bid),
                   sem int(2) not null);
                  
                  
                  
                  
                  
                   CREATE TABLE Orders (
    OrderID int NOT NULL,
    OrderNumber int NOT NULL,
    PersonID int,
    PRIMARY KEY (OrderID),
    FOREIGN KEY (PersonID) REFERENCES Persons(PersonID)
); 
