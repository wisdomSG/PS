-- 코드를 입력하세요
SELECT bo.title, bo.board_id, re.reply_id, re.writer_id, re.contents, date_format(re.created_date, "%Y-%m-%d") AS CREATED_DATE  FROM USED_GOODS_BOARD bo
inner join used_goods_reply re
on bo.board_id = re.board_id
where EXTRACT(YEAR_MONTH FROM bo.created_date) = 202210
order by re.created_date,
    bo.title