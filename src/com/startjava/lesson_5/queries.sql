psql\echo вывод всей таблицы роботов 
SELECT *
	FROM jaegers;
	
\echo вывод только не уничтоженных роботов 
SELECT * 
	FROM jaegers
   WHERE status = 'Exist';
   
\echo отображение роботов серии Mark-1 и Mark-4
SELECT *
	FROM jaegers 
   WHERE mark = 'Mark-1' OR mark = 'Mark-4';
   
\echo отображение всех роботов, кроме серии Mark-1 и Mark-4
SELECT *
	FROM jaegers 
   WHERE NOT mark = 'Mark-1' AND mark = 'Mark-4';

\echo отображение таблицы по убыванию mark
SELECT *
	FROM jaegers 
   ORDER BY mark DESC;

\echo отображение информации о самом старом роботе 
SELECT * 
	FROM jaegers 
   WHERE launch = (SELECT MIN(launch) FROM jaegers);
   
 \echo отображение роботов, которые уничтожили больше всех kaiju, отсортировав по убыванию
 SELECT * 
	FROM jaegers 
   ORDER BY kaijukill >= '10';
   
\echo отображение среднего веса и округление до трех знаков после запятой
SELECT 
	ROUND(AVG(weight), 3) 
   FROM jaegers;

\echo увеличение на единицу количества уничтоженных роботов
UPDATE jaegers 
	SET kaijukill = kaijukill + 1
   WHERE status = 'Exist';
   
\echo вывод роботов
SELECT * 
	FROM jaegers;

\echo удаление уничтоженных роботов 
DELETE 
	FROM jaegers 
   WHERE status = 'Destroyed';

\echo вывод роботов
SELECT * 
	FROM jaegers;

 
 