# Write your MySQL query statement below
select p.product_id product_id ,  ifnull(round(sum(p.price*us.units)/sum(us.units),2),0) average_price 
from prices p
left join unitssold us
on p.product_id = us.product_id and us.purchase_date between start_date and end_date
group by p.product_id