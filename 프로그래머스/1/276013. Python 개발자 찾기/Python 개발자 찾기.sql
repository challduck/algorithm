-- 코드를 작성해주세요
select ID, EMAIL, FIRST_NAME, LAST_NAME
from DEVELOPER_INFOS
WHERE DEVELOPER_INFOS.SKILL_1 = 'Python'
OR DEVELOPER_INFOS.SKILL_2 = 'Python'
OR DEVELOPER_INFOS.SKILL_3 = 'Python'
ORDER BY ID ASC;
