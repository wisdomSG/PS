set @hour := -1; # 변수 hour 초기값 -1 설정
select (@hour := @hour + 1) as hour, # 변수 hour 1씩 증가 
    (select count(*) from animal_outs where hour(datetime) = @hour) as count # 변수와 datetime의 hour이 일치하면 count 해주는 서브쿼리
from animal_outs 
where @hour < 23; # 변수가 23이 되면 멈춤