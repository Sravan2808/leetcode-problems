# Write your MySQL query statement below
select p.product_name product_name,s.year year,s.price price
from Sales s
join Product p
on s.product_id = p.product_id;