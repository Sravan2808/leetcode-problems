# Write your MySQL query statement below

select e1.name name
from employee e1
where e1.id in (select managerId
from employee e2
group by managerId
having count(*)>=5
)


