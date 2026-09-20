# Write your MySQL query statement below
select query_name,
round(sum(rating*1.0/position)/count(*),2) quality,
round(count(
    case 
        when rating<3 then 1
    end
)*100.0/count(*),2) poor_query_percentage
from Queries
group by query_name