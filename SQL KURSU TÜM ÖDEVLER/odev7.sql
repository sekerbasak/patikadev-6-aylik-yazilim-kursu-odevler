select rating from film group by rating;
select replacement_cost from film group by replacement_cost having count(*)>50;
SELECT store_id, COUNT(*) as customer_count
FROM customer
GROUP BY store_id;
SELECT count(city),country_id from city GROUP by country_id;
