-- 코드를 입력하세요
select date_format(b.sales_date, "%Y") as year, date_format(b.sales_date,"%m") as month, gender, count(DISTINCT a.user_id) as users from user_info a
inner join online_sale b on a.user_id = b.user_id
where gender is not null
group by year, month, gender