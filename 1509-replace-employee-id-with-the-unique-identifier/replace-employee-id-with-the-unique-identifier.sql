# Write your MySQL query statement below

select eu.unique_id unique_id,e.name name
from Employees e
Left join EmployeeUNI eu
on e.id=eu.id;
