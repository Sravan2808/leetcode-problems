# Write your MySQL query statement below
select contest_id ,round(100*(count(distinct user_id )/(select count(*) from users)),2)percentage
from register
group by contest_id
order by percentage desc,contest_id