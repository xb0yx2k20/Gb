# Задание 1
## Запрос 1: Суммы заказов, выполненных 1 января 2016 года
<pre>
SELECT SUM(amount) AS total_amount
FROM orders
WHERE order_date = '2016-01-01';
</pre>

## Запрос 2: Количество различных значений поля "city" в таблице заказчиков
<pre>
SELECT COUNT(DISTINCT city) AS distinct_city_count
FROM customers
WHERE city IS NOT NULL;
</pre>

## Запрос 3: Наименьшая сумма для каждого заказчика
<pre>
SELECT customer_id, MIN(amount) AS min_amount
FROM orders
GROUP BY customer_id;
</pre>

## Запрос 4: Заказчики, имена которых начинаются с буквы "Г"
<pre>
SELECT *
FROM customers
WHERE customer_name LIKE 'Г%';
</pre>

## Запрос 5: Высший рейтинг в каждом городе:
<pre>
SELECT city, MAX(rating) AS highest_rating
FROM customers
GROUP BY city;
</pre>

# Задание 2

## Отсортировать поле "сумма" в порядке убывания
<pre>
SELECT *
FROM orders
ORDER BY amount DESC;
</pre>

## Отсортировать поле "сумма" в порядке возрастания
<pre>
SELECT *
FROM orders
ORDER BY amount ASC;
</pre>

## Вывести 5 строк с наибольшей заработной платой (поле "Зарплата")
<pre>
SELECT *
FROM employees
ORDER BY Зарплата DESC
LIMIT 5;
</pre>

## Группировка сотрудников по специальности "рабочий", зарплата которых превышает 20000
<pre>
SELECT специальность, COUNT(*) AS количество_сотрудников
FROM employees
WHERE специальность = 'рабочий' AND Зарплата > 20000
GROUP BY специальность;
</pre>
