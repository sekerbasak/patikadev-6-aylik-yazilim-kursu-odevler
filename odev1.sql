--SELECT title,description from film;
--SELECT *from film where length>60 AND length<75
--SELECT *from film where rental_rate=0.99 AND replacement_cost=12.99 OR replacement_cost=28.9;
--select last_name from customer where first_name='Mary';
SELECT *from film where length<=50 AND rental_rate!=2.99 OR rental_rate!=4.99