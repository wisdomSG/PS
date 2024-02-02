-- 코드를 입력하세요
    SELECT DATE_FORMAT(sales_date, '%Y-%m-%d') as sales_date, product_id, user_id, sales_amount FROM ONLINE_SALE
    where Month(sales_date) = 3
UNION
    SELECT DATE_FORMAT(sales_date, '%Y-%m-%d') as sales_date, product_id, Null as user_id, sales_amount FROM OFFLINE_SALE
    where Month(sales_date) = 3
order by sales_date, product_id, user_id