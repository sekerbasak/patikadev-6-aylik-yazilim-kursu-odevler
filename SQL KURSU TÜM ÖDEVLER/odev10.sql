--select city, country from city left join country ON country.country_id = city.country_id
--select first_name, last_name from customer right join payment ON payment.customer_id = customer.customer_id;
select first_name, last_name from customer  full join rental on rental.customer_id = customer.customer_id