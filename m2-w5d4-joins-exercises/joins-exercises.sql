-- The following queries utilize the "dvdstore" database.

-- 1. All of the films that Nick Stallone has appeared in
-- (30 rows)

    SELECT title FROM film
    JOIN film_actor ON film.film_id = film_actor.film_id
    WHERE film_actor.actor_id IN (SELECT actor_id FROM actor WHERE first_name = 'NICK' AND last_name = 'STALLONE');

-- 2. All of the films that Rita Reynolds has appeared in
-- (20 rows)

    SELECT title FROM film
    JOIN film_actor ON film.film_id = film_actor.film_id
    WHERE film_actor.actor_id IN (SELECT actor_id FROM actor WHERE first_name = 'RITA' AND last_name = 'REYNOLDS');

-- 3. All of the films that Judy Dean or River Dean have appeared in
-- (46 rows)

    SELECT title FROM film
    JOIN film_actor ON film.film_id = film_actor.film_id
    WHERE film_actor.actor_id IN (SELECT actor_id FROM actor WHERE (first_name = 'RIVER' AND last_name = 'DEAN') OR (first_name = 'JUDY' AND last_name = 'DEAN'));

-- 4. All of the the ‘Documentary’ films
-- (68 rows)

    SELECT title FROM film
    JOIN film_category ON film_category.film_id = film.film_id
    WHERE category_id = (SELECT category_id FROM category WHERE name = 'Documentary');

-- 5. All of the ‘Comedy’ films
-- (58 rows)

    SELECT title FROM film
    JOIN film_category ON film_category.film_id = film.film_id
    WHERE category_id = (SELECT category_id FROM category WHERE name = 'Comedy');

-- 6. All of the ‘Children’ films that are rated ‘G’
-- (10 rows)

    SELECT title FROM film
    JOIN film_category ON film_category.film_id = film.film_id
    WHERE rating = 'G' AND category_id = (SELECT category_id FROM category WHERE name = 'Children');

-- 7. All of the ‘Family’ films that are rated ‘G’ and are less than 2 hours in length
-- (3 rows)

    SELECT title FROM film
    JOIN film_category ON film_category.film_id = film.film_id
    WHERE length < 120 AND rating = 'G' AND category_id = (SELECT category_id FROM category WHERE name = 'Family');

-- 8. All of the films featuring actor Matthew Leigh that are rated ‘G’
-- (9 rows)

    SELECT title FROM film
    JOIN film_actor ON film.film_id = film_actor.film_id
    WHERE rating = 'G' AND film_actor.actor_id = (SELECT actor_id FROM actor WHERE (first_name = 'MATTHEW' AND last_name = 'LEIGH'));


-- 9. All of the ‘Sci-Fi’ films released in 2006
-- (61 rows)

    SELECT title FROM film
    JOIN film_category ON film_category.film_id = film.film_id
    WHERE release_year = 2006 AND category_id = (SELECT category_id FROM category WHERE name = 'Sci-Fi');


-- 10. All of the ‘Action’ films starring Nick Stallone
-- (2 rows)

    SELECT title FROM film
    JOIN film_actor ON film.film_id = film_actor.film_id
    JOIN film_category ON film_category.film_id = film.film_id
    WHERE category_id = (SELECT category_id FROM category WHERE name = 'Action') 
    AND film_actor.actor_id = (SELECT actor_id FROM actor WHERE (first_name = 'NICK' AND last_name = 'STALLONE'));

-- 11. The address of all stores, including street address, city, district, and country
-- (2 rows)

    SELECT address, city, district, country FROM address
    JOIN store ON store.address_id = address.address_id
    JOIN city ON city.city_id = address.city_id
    JOIN country ON city.country_id = country.country_id;
    
-- 12. A list of all stores by ID, the store’s street address, and the name of the store’s manager
-- (2 rows)

    SELECT store.store_id, address, first_name, last_name
    FROM store
    JOIN staff ON store.manager_staff_id = staff.staff_id
    JOIN address ON address.address_id = store.address_id;


-- 13. The first and last name of the top ten customers ranked by number of rentals 
-- (#1 should be “ELEANOR HUNT” with 46 rentals, #10 should have 39 rentals)

    SELECT first_name, last_name, count(payment_id)
    FROM payment
    JOIN customer ON payment.customer_id = customer.customer_id
    GROUP BY first_name, last_name
    ORDER BY count(payment_id) DESC
    LIMIT 10

-- 14. The first and last name of the top ten customers ranked by dollars spent 
-- (#1 should be “KARL SEAL” with 221.55 spent, #10 should be “ANA BRADLEY” with 174.66 spent)

     SELECT first_name, last_name, SUM(amount)
    FROM payment
    JOIN customer ON payment.customer_id = customer.customer_id
    GROUP BY first_name, last_name
    ORDER BY SUM(amount) DESC
    LIMIT 10
    

-- 15. The store ID, street address, total number of rentals, total amount of sales (i.e. payments), and average sale of each store 
-- (Store 1 has 7928 total rentals and Store 2 has 8121 total rentals)

    SELECT store.store_id, address, count (rental.rental_id), sum(payment.amount)
    FROM rental
    JOIN payment ON rental.customer_id = payment.customer_id
    JOIN customer ON customer.customer_id = rental.customer_id
    JOIN store ON customer.store_id = store.store_id
    JOIN address ON store.address_id = address.address_id
    GROUP BY store.store_id, address
    ORDER BY count(rental.rental_id);
--7297
--8747

--rental.rental_id is a PK so that value should be unique for each row of the rental table?
--withount the DISTINCT keyword count goes to ~202k and ~242k

-- 16. The top ten film titles by number of rentals
-- (#1 should be “BUCKET BROTHERHOOD” with 34 rentals and #10 should have 31 rentals)

     SELECT film.title, count(rental.rental_id)
    FROM film
    JOIN inventory ON inventory.film_id = film.film_id
    JOIN rental ON inventory.inventory_id = rental.inventory_id
    GROUP BY film.title
    ORDER BY count(rental.rental_id) DESC
    LIMIT 10

    --Note rental_id is a PK, so there will not duplicates within the rental table
    -- No need to specify DISTINCT keyword

-- 17. The top five film categories by number of rentals 
-- (#1 should be “Sports” with 1179 rentals and #5 should be “Family” with 1096 rentals)
select category.name, count(rental.rental_id) as rental_count
FROM film
JOIN inventory ON film.film_id = inventory.film_id
JOIN rental ON inventory.inventory_id = rental.inventory_id
JOIN film_category ON film.film_id = film_category.film_id
JOIN category ON film_category.category_id = category.category_id
GROUP BY category.name
ORDER BY rental_count DESC
LIMIT 5

/* PROVIDED 

SELECT category.name, count(rental.rental_id) AS rental_count
FROM film
JOIN  inventory ON film.film_id = inventory.film_id
JOIN rental ON inventory.inventory_id = rental.inventory_id
JOIN film_category ON film.film_id = film_category.film_id
JOIN category ON film_category.category_id = category.category_id
GROUP BY category.name
ORDER BY count(rental.rental_id) DESC
LIMIT 5*/


SELECT category.name, count (DISTINCT rental.rental_id)
FROM category
JOIN film_category ON film_category.category_id = category.category_id
JOIN film ON film.film_id = film_category.film_id
JOIN inventory ON inventory.film_id = film.film_id
JOIN rental ON inventory.inventory_id = rental.inventory_id
GROUP BY category.name
ORDER BY count (DISTINCT rental.rental_id) DESC
LIMIT 5

--Notice the table specified after JOIN is only mentioned once

-- 18. The top five Action film titles by number of rentals 
-- (#1 should have 30 rentals and #5 should have 28 rentals)

    SELECT film.title, count (DISTINCT rental.rental_id)
    FROM category
    JOIN film_category ON film_category.category_id = category.category_id
    JOIN film ON film.film_id = film_category.film_id
    JOIN inventory ON inventory.film_id = film.film_id
    JOIN rental ON inventory.inventory_id = rental.inventory_id
    WHERE category.name = 'Action'
    GROUP BY film.title
    ORDER BY count (DISTINCT rental.rental_id) DESC
    LIMIT 5
    


-- 19. The top 10 actors ranked by number of rentals of films starring that actor 
-- (#1 should be “GINA DEGENERES” with 753 rentals and #10 should be “SEAN GUINESS” with 599 rentals)

    SELECT first_name, last_name, count( DISTINCT rental.rental_id)
    FROM actor
    JOIN film_actor ON film_actor.actor_id = actor.actor_id
    JOIN film ON film.film_id = film_actor.film_id
    JOIN inventory ON inventory.film_id = film.film_id
    JOIN rental ON inventory.inventory_id = rental.inventory_id
    GROUP BY first_name, last_name
    ORDER BY count( DISTINCT rental.rental_id) DESC
    LIMIT 10

    --#1 SUSAN DAVIS 825, #10 SANDRA KILMER 604

    

-- 20. The top 5 “Comedy” actors ranked by number of rentals of films in the “Comedy” category starring that actor 
-- (#1 should have 87 rentals and #5 should have 72 rentals)


    SELECT first_name, last_name, count( DISTINCT rental.rental_id)
    FROM actor
    JOIN film_actor ON film_actor.actor_id = actor.actor_id
    JOIN film ON film.film_id = film_actor.film_id
    JOIN inventory ON inventory.film_id = film.film_id
    JOIN rental ON inventory.inventory_id = rental.inventory_id
    JOIN film_category ON film_category.film_id = film.film_id
    JOIN category ON category.category_id = film_category.category_id
    WHERE category.name = 'Comedy'
    GROUP BY first_name, last_name
    ORDER BY count( DISTINCT rental.rental_id) DESC
    LIMIT 5