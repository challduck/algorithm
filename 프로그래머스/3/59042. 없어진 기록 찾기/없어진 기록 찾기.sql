-- 코드를 입력하세요

SELECT O.ANIMAL_ID, O.NAME
FROM ANIMAL_OUTS O
WHERE O.ANIMAL_ID 
NOT IN (SELECT I.ANIMAL_ID FROM ANIMAL_INS I)
ORDER BY O.ANIMAL_ID;

# SELECT O.ANIMAL_ID, O.NAME
# FROM ANIMAL_OUTS O
# LEFT JOIN ANIMAL_INS I
# ON O.ANIMAL_ID = I.ANIMAL_ID
# WHERE I.NAME IS NULL
# ORDER BY O.ANIMAL_ID;