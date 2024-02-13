-- 코드를 입력하세요
select history_id, car_id, date_format(start_date, "%Y-%m-%d"), date_format(end_date, "%Y-%m-%d"), if(datediff(end_date, start_date)>=29, "장기 대여", "단기 대여") as rent_type 
from CAR_RENTAL_COMPANY_RENTAL_HISTORY
where month(start_date) = 9
order by history_id desc