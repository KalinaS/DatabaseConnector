CREATE TABLE File (
fileID int not null auto_increment,
name varchar(255) not null,
directory varchar(255) not null,
extension varchar(255) not null,
addingDate date not null,
lastScan date,
parentID int null,
primary key(fileID),
foreign key (parentID) references File (fileID)
)

CREATE UNIQUE INDEX Path ON File (directory, name);