\echo вывод всей таблицы роботов 
SELECT *
  FROM jaegers;
	
\echo вывод только не уничтоженных роботов 
SELECT * 
  FROM jaegers
 WHERE status = 'Exist';
   
\echo отображение роботов серии Mark-1 и Mark-4
SELECT *
  FROM jaegers 
 WHERE mark
    IN ('Mark-1', 'Mark-4');
   
\echo отображение всех роботов, кроме серии Mark-1 и Mark-4
SELECT *
  FROM jaegers 
 WHERE mark NOT IN ('Mark-1', 'Mark-4')
 ORDER BY mark DESC;

\echo отображение информации о самом старом роботе 
SELECT * 
  FROM jaegers 
 WHERE launch = (SELECT MIN(launch) 
                   FROM jaegers);
   
\echo отображение роботов, которые уничтожили больше всех kaiju
SELECT * 
  FROM jaegers 
 WHERE kaiju_kill >= (SELECT MAX(kaiju_kill)
                       FROM jaegers)
 ORDER BY kaiju_kill DESC;
   
\echo отображение среднего веса и округление до трех знаков после запятой
SELECT 
 ROUND(AVG(weight), 3) 
  FROM jaegers;

\echo увеличение на единицу  убитых kaiju у не уничтоженных роботов
UPDATE jaegers 
   SET kaiju_kill = kaiju_kill + 1
 WHERE status = 'Exist';
 
SELECT *
  FROM jaegers;
   
\echo удаление уничтоженных роботов 
DELETE 
  FROM jaegers 
 WHERE status = 'Destroyed';

SELECT * 
  FROM jaegers;

 
 