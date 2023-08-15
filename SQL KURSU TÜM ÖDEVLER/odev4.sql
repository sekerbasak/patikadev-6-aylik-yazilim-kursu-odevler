--select DISTINCT replacement_cost from film;
--select DISTINCT COUNT(replacement_cost) from film
--select COUNT(*) title from film  where title like 'T%' AND rating='G';
--SELECT count(*) country from country where length(country)=5;
select count(*) city from city WHERE city ILIKE '%r';