--select country from country where country like 'A%a';
--select country from country where LENGTH(country) >= 6 AND country like'%n';
--SELECT * FROM film WHERE LOWER(title) LIKE '%t%'
AND LENGTH(title) >= 4;
SELECT * FROM filmWHERE title LIKE 'C%' 
AND LENGTH(title) > 90 
AND rental_rate = 2.99;
