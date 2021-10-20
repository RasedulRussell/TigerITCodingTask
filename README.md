# This is a conding Task given By TigerIT
I use mySql Database
Entity Name contact. Contains 4 field.
Entity generation Query

```
create table Contact(
    FullName     varchar(1000)  null,
    PhoneNumber  varchar(15)    null,
    Address      varchar(10000) null,
    SerialNumber int auto_increment,
    constraint Contact_SerialNumber_uindex
        unique (SerialNumber)
);

alter table Contact
    add primary key (SerialNumber);
```

# Functionality

After runing the project you will enable to call 
http://localhost:8080 endpoint and if you call you can see a HTML view table contains all the contacts. 
Bottom of the table you can see add new contact option and if you click then http://localhost:8080/contact end point will call and you will given a 
HTML form contains three textbox. After filling up the form hitting the submit buttone the given contact data 
will add to DB and http://localhost:8080/contact
endpoint will called and show all the saved contact information.

Swager-ui : http://localhost:8080/swagger-ui.html
