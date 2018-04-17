-- Write queries to return the following:
-- The following changes are applied to the "pagila" database.**

-- 1. Add actors, Hampton Avenue, and Lisa Byway to the actor table.

INSERT INTO actor
(actor_id, first_name, last_name)
VALUES
((SELECT MAX(actor_id) FROM actor) + 1, 'HAMPTON', 'AVENUE')

INSERT INTO actor
(actor_id, first_name, last_name)
VALUES
((SELECT MAX(actor_id) FROM actor) + 1, 'LISA', 'BYWAY');


-- 2. Add "Euclidean PI", "The epic story of Euclid as a pizza delivery boy in 
-- ancient Greece", to the film table. The movie was released in 2008 in English. 
-- Since its an epic, the run length is 3hrs and 18mins. There are no special 
-- features, the film speaks for itself, and doesn't need any gimmicks.	

INSERT INTO film
(film_id, title, description, release_year, language_id, length)
VALUES
((SELECT MAX(film_id) FROM film) + 1, 'Euclidean PI', 'The epic story of Euclid as a pizza delivery boy in ancient Greece', 2008, 1, 198);

-- 3. Hampton Avenue plays Euclid, while Lisa Byway plays his slightly 
-- overprotective mother, in the film, "Euclidean PI". Add them to the film.

INSERT INTO film_actor
(actor_id, film_id)
VALUES  
(201, 1001)

INSERT INTO film_actor
(actor_id, film_id)
VALUES  
(202, 1001);

-- 4. Add Mathmagical to the category table.

INSERT INTO category
(category_id, name)
VALUES
(17, 'Mathmagical');

-- 5. Assign the Mathmagical category to the following films, "Euclidean PI", 
-- "EGG IGBY", "KARATE MOON", "RANDOM GO", and "YOUNG LANGUAGE"

INSERT INTO film_category
(film_id, category_id)
VALUES
(1001, 17)

UPDATE film_category
SET category_id = 17
FROM film 
WHERE film_category.film_id = film.film_id AND film.title = 'EGG IGBY'

UPDATE film_category
SET category_id = 17
FROM film 
WHERE film_category.film_id = film.film_id AND film.title = 'KARATE MOON'

UPDATE film_category
SET category_id = 17
FROM film 
WHERE film_category.film_id = film.film_id AND film.title = 'RANDOM GO'

UPDATE film_category
SET category_id = 17
FROM film 
WHERE film_category.film_id = film.film_id AND film.title = 'YOUNG LANGUAGE';


-- 6. Mathmagical films always have a "G" rating, adjust all Mathmagical films 
-- accordingly.
-- (5 rows affected)

UPDATE film
SET rating = 'G' --NOTE must leave out the table name of column in the SET line
FROM film_category
WHERE film.film_id = film_category.film_id and film_category.category_id = 17;

-- 7. Add a copy of "Euclidean PI" to all the stores.

INSERT INTO inventory
(inventory_id, film_id, store_id)
VALUES
((SELECT MAX(inventory_id) FROM inventory) + 1, 1001, 1)

INSERT INTO inventory
(inventory_id, film_id, store_id)
VALUES
((SELECT MAX(inventory_id) FROM inventory) + 1, 1001, 2);


-- 8. The Feds have stepped in and have impounded all copies of the pirated film, 
-- "Euclidean PI". The film has been seized from all stores, and needs to be 
-- deleted from the film table. Delete "Euclidean PI" from the film table. 
-- (Did it succeed? Why?)

DELETE FROM film WHERE title = 'Euclidean PI';

/*
No, does not succeed, film_id = 1001 still being referenced in another table.

[Code: , SQL State: 23503]  ERROR: update or delete on table "film" 
violates foreign key constraint "film_actor_film_id_fkey" on table "film_actor"
Detail: Key (film_id)=(1001) is still referenced from table "film_actor".


*/

-- 9. Delete Mathmagical from the category table. 
-- (Did it succeed? Why?)

DELETE FROM category WHERE category_id = 17;

--No did not succeed, still referenced from the film_category table


-- 10. Delete all links to Mathmagical in the film_category tale. 
-- (Did it succeed? Why?)

DELETE FROM film_category WHERE category_id = 17

--It succeeded, film_category has two Foreign Keys 
--that toegther identify a unique entry, since 
--these keys are foreign to film_category
--any deletions from this table are inconsequential
--to the table. While for category
--as category_id is a primary key in that table
--if other tables reference it, trying to delete
--that PK within category table would
--cause an issue as now, there would be orphaned
--references that cannot refer to the parent table
--where this row use to exist.

-- 11. Retry deleting Mathmagical from the category table, followed by retrying
-- to delete "Euclidean PI". 
-- (Did either deletes succeed? Why?)

DELETE FROM category WHERE category_id = 17
DELETE FROM film WHERE title = 'Euclidean PI';

--The deletion from category succeeded, this value was only
--referenced from the film_category table
--and that row was delete from that table
--so deleting from category table was
--now allowed as it would not create
--any orphaned references / referential integrity
--was maintained

--The deletion for Euclidean PI did not succeed as the PK
--film_id is still being referenced in the film_actor table     



-- 12. Check database metadata to determine all constraints of the film id, and 
-- describe any remaining adjustments needed before the film "Euclidean PI" can 
-- be removed from the film table.

--FIlm id is primary key identifying 'Euclid PI' as unique
--this key has references in film_actor and film_category as Foreign Keys
--it is also referenced in inventory, the movie's Film_id would
--need to be deleted in each of these tables before
--being able to be removed from the film table.
