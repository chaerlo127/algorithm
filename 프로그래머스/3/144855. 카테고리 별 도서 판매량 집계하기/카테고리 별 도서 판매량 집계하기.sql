select b.CATEGORY, sum(bs.SALES) as TOTAL_SALES
from BOOK as b, BOOK_SALES as bs
where b.BOOK_ID = bs.BOOK_ID
and bs.SALES_DATE between '2022-01-01' and '2022-01-31'
group by b.CATEGORY
order by b.CATEGORY