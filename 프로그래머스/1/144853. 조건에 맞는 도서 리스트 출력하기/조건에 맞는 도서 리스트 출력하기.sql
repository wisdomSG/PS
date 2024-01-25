-- 코드를 입력하세요
SELECT book_id, DATE_FORMAT(published_date, '%Y-%m-%d') from BOOK
WHERE category = "인문" and YEAR(published_date) = 2021
ORDER BY published_date asc;