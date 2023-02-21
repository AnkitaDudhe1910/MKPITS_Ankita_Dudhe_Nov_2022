/* Show all the record for minimum age value from members table */



 /*query*/      select * from members where age = (select min(age) from members);