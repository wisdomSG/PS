select b.user_id, b.nickname, sum(a.price) from USED_GOODS_BOARD a
join USED_GOODS_USER b
on b.user_id = a.writer_id
where status = "DONE"
group by a.writer_id having sum(a.price)>=700000
order by sum(a.price)