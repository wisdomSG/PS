-- 코드를 입력하세요
select floor(price/10000)*10000 as price_group, count(*) from product
group by price_group
order by price_group