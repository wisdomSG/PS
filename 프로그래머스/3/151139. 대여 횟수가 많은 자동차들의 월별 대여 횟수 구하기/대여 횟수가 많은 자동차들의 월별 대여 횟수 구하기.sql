-- 코드를 입력하세요
select month(start_date), car_id, count(*) as records from CAR_RENTAL_COMPANY_RENTAL_HISTORY
where start_date between '2022-08-01' and '2022-10-31'
and car_id in (select car_id from CAR_RENTAL_COMPANY_RENTAL_HISTORY
               where start_date between '2022-08-01' and '2022-10-31'
               group by car_id
               having count(car_id)>=5
              )
group by 1, 2
having records > 0
order by 1, 2 desc