/*  From the following table write a sql query to find orders taht are delivered by a salesperson with ID. 5001 Return ord_no,ord_date,purch_amt  */



/* query */        select ord_no, ord_date, purch_amt from orders where salesman_id = '5001';