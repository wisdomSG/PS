-- 코드를 입력하세요
select a.author_id, b.author_name, a.category, sum(c.sales * a.price) as total_sales from book a
inner join author b on a.author_id = b.author_id
inner join book_sales c on a.book_id = c.book_id
where c.sales_date like '2022-01-%'
group by a.author_id, a.category
order by a.author_id, a.category desc