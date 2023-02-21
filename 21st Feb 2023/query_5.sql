/*  From the following  table write a sql query to identify the unique mobno return mobno.*/


/*query 1*/       select Phone_no from members where Phone_no like '%20';


/*query 2*/        select distinct Phone_no from members;