--SELECT city, country from city inner join country ON country.country_id = city.country_id
--select first_name, last_name from customer inner join payment ON payment.customer_id = customer.customer_id
select first_name, last_name from customer inner join rental ON rental.customer_id = customer.customer_id 