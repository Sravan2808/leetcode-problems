# Write your MySQL query statement below

select max(num) num
from(
select num
from Mynumbers
group by num
having count(num)<2 
) num