## Задание 1: Вывести на экран сколько машин каждого цвета для машин марок BMW и LADA
<pre> 
SELECT brand, color, COUNT(*) as count
FROM cars
WHERE brand IN ('BMW', 'LADA')
GROUP BY brand, color;
</pre>

## Задание 2: Вывести на экран марку авто и количество AUTO не этой марки
<pre> 
SELECT a.brand, COUNT(b.brand) as count
FROM cars a
CROSS JOIN cars b
WHERE a.brand <> b.brand
GROUP BY a.brand;
</pre>

## Задание 3: Даны 2 таблицы, созданные следующим образом: create table test_a (id number, data varchar2(1)); create table test_b (id number); insert into test_a(id, data) values (10, 'A'), (20, 'A'), (30, 'F'), (40, 'D'), (50, 'C'); insert into test_b(id) values (10), (30), (50); Напишите запрос, который вернет строки из таблицы test_a, id которых нет в таблице test_b, НЕ используя ключевого слова NOT.
<pre> 
SELECT a.*
FROM test_a a
LEFT JOIN test_b b ON a.id = b.id
WHERE b.id IS NULL;
</pre>
