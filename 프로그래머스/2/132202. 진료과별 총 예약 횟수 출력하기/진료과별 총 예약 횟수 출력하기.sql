-- 코드를 입력하세요
SELECT mcdp_cd as 진료과코드, count(*) FROM appointment
WHERE MONTH(apnt_ymd) = 5
GROUP BY mcdp_cd
ORDER BY count(*), mcdp_cd 