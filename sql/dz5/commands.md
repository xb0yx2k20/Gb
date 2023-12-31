## Создайте представление, в которое попадут автомобили стоимостью до 25 000 долларов
<pre> 
CREATE VIEW Cars AS
SELECT *
FROM car_table
WHERE car_price <= 25000;
</pre>

## Изменить в существующем представлении порог для стоимости: пусть цена будет до 30 000 долларов (используя оператор ALTER VIEW)
<pre> 
ALTER VIEW Cars AS
SELECT *
FROM car_table
WHERE car_price <= 30000;
CREATE VIEW SkodaAudiCars AS
</pre>

## Создайте представление, в котором будут только автомобили марки “Шкода” и “Ауди” (аналогично)
<pre> 
CREATE VIEW SkodaAudiCars AS
SELECT *
FROM Cars
WHERE car_make IN ('Шкода', 'Ауди');
</pre>

## Вывести название и цену для всех анализов, которые продавались 5 февраля 2020 и всю следующую неделю.
<pre> 
SELECT an_name, an_price
FROM Analysis
WHERE ord_datetime >= '2020-02-05'
  AND ord_datetime <= '2020-02-12';
</pre>
