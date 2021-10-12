-- SELECT
-- Use a SELECT statement to return a literal string
SELECT 'Josh';

-- Use a SELECT statement to add two numbers together (and label the result "sum")
SELECT 5 + 6 * 4 / 2;


-- SELECT ... FROM
-- Write queries to retrieve...
SELECT 8
FROM city;
-- The names from all the records in the state table
SELECT *
FROM state;

-- The names and populations of all cities
SELECT city_name, population
FROM city;

-- All columns from the park table



-- SELECT __ FROM __ WHERE
-- Write queries to retrieve...

-- The names of cities in California (CA)
SELECT city_name, state_abbreviation
FROM city
WHERE state_abbreviation = 'CA'
;

-- The names and state abbreviations of cities NOT in California
-- not equal is != or <>
SELECT city_name, state_abbreviation
FROM city
WHERE state_abbreviation != 'CA'
;

-- The names and areas of cities smaller than 25 square kilometers 
SELECT city_name, area
FROM city;
WHERE area < 25
;

-- The names from all records in the state table that have no assigned census region
-- null means the abscence of data aka idk
SELECT state_name
FROM state
WHERE census_region IS NULL;

-- The names and census regions from all records in the state table that have an assigned census region
Select state_name
FROM state
WHERE censuc_region IS NOT NULL;


-- WHERE with AND/OR
-- Write queries to retrieve...

-- The names, areas, and populations of cities smaller than 25 sq. km. with more than 100,000 people
SELECT city_name, area, population
FROM city
WHERE area < 25 AND population > 10000;

-- The names and census regions of all states (and territories and districts) not in the Midwest region (including those that don't have any census region)
SELECT state_name, census_region
FROM state
WHERE census_region != 'midwest' OR census_region IS NULL;

-- The names, areas, and populations of cities in California (CA) or Florida (FL)
SELECT city_name, area population
FROM city
WHERE state_abbreviation = 'CA' or 'FL';

-- The names, areas, and populations of cities in New England -- Connecticut (CT), Maine (ME), Massachusetts (MA), New Hampshire (NH), Rhode Island (RI) and Vermont (VT)
SELECT city_name, area, population
FROM city
WHERE state-abbreviation IN ('CT' 'ME' 'MA' 'NH' 'RI' 'VT'); -- IN is equal to a constant = for multiple  OR statments


-- SELECT statements involving math
-- Write a query to retrieve the names and areas of all parks in square METERS
-- (the values in the database are stored in square kilometers)
-- Label the second column "area_in_meters"
SELECT park_name, area * 1000 AS area_in_meters -- AS cahnges the name of the respone only in the test field. not the acutal table
FROM park;


-- All values vs. distinct values
-- Write a query to retrieve the names of all cities and notice repeats (like Springfield and Columbus)
SELECT city_name, state_abbreviation
FROM city;

SELECT DISTINCT city_name
FROM city;

-- Do it again, but without the repeats (note the difference in row count)



-- LIKE
-- Write queries to retrieve...

-- The names of all cities that begin with the letter "A"
SELECT city_name
FROM city
WHERE city_name LIKE 'A%'-- % is the wildcard, like * and is case sensitive, ILIKE is insensitive, %a% will look for anything with the letter a in it. does not work for integers

-- The names of all cities that end with "Falls"
SELECT city_name
FROM city
WHERE city_name ILIKE '%falls'

-- The names of all cities that contain a space
SELECT city_name
FROM city
WHERE city_name ILIKE '% %'


-- BETWEEN
-- Write a query to retrieve the names and areas of parks of at least 100 sq. kilometers but no more than 200 sq. kilometers
SELECT park_naem, area
FROM park
WHERE area BETWEEN 99 AND 201; -- BETWEEN is inclusive


-- DATES
-- Write a query to retrieve the names and dates established of parks established before 1900
SELECT *
FROM park
WHERE date_established < '1900-01-01'-- < = before , > = after
