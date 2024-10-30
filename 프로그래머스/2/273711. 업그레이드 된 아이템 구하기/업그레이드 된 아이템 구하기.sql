SELECT INFO.ITEM_ID
        ,ITEM_NAME
        ,RARITY
FROM ITEM_INFO INFO JOIN ITEM_TREE TREE
    ON INFO.ITEM_ID = TREE.ITEM_ID
WHERE PARENT_ITEM_ID IN (
                            SELECT ITEM_ID
                            FROM ITEM_INFO
                            WHERE RARITY = 'RARE'
                        )
ORDER BY 1 DESC;