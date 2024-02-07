select ingredient_type, sum(total_order) from first_half a
inner join icecream_info b
on a.flavor = b.flavor
group by ingredient_type