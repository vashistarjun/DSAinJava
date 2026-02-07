# Write your MySQL query statement below
SELECT distinct p.product_id,
IFNULL(ROUND(SUM(p.price*u.units)/SUM(u.units),2),0) as average_price
from prices p 
 LEFT JOIN unitsSold u 
ON p.product_id=u.product_id
AND DATE(u.purchase_date)  BETWEEN DATE(p.start_date) AND DATE(p.end_date)
group by p.product_id;


-- SELECT p.product_id,
--        ROUND(SUM(p.price * u.units) / SUM(u.units), 2) AS average_price
-- FROM Prices p
-- JOIN UnitsSold u
--   ON p.product_id = u.product_id
--  AND u.purchase_date BETWEEN p.start_date AND p.end_date
-- GROUP BY p.product_id;
