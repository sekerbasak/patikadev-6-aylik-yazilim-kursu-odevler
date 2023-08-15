(select first_name from actor) UNION (select First_name from customer) 
(select first_name from actor) INTERSECT (select First_name from customer)
(select first_name from actor) EXCEPT (select First_name from customer)

(select first_name from actor) UNION ALL information_schema(select First_name from customer) 
(select first_name from actor) INTERSECT ALL information_schema(select First_name from customer)
(select first_name from actor) EXCEPT ALL (select First_name from customer)