select ii2.ITEM_ID, ii2.ITEM_NAME, ii2.RARITY
from ITEM_INFO as ii, ITEM_TREE as it, ITEM_INFO as ii2
where ii.ITEM_ID = it.PARENT_ITEM_ID 
and ii2.ITEM_ID = it.ITEM_ID
and ii.RARITY = 'RARE'
and it.PARENT_ITEM_ID is not null
order by ii2.ITEM_ID desc