## Создайте функцию, которая принимает количество секунд и форматирует их в количество дней, часов, минут, секунд. Пример: 123456 ->'1 days 10 hours 17 minutes 36 seconds. Выведите только четные числа от 1 до 10. Пример: 2,4,6,8,10 Данная промежуточная аттестация оценивается по системе "зачет" / "не зачет" "Зачет" ставится, если слушатель успешно выполнил 1 или 2 задачи "Незачет" ставится, если слушатель успешно выполнил 0 задач Критерии оценивания: 1 - слушатель верно создал функцию, которая принимает кол-во сек и формат их в кол-во дней часов. 2 - слушатель выведили только четные числа от 1 до 10.

<pre>
CREATE TABLE seconds (
    amount INT
);
INSERT INTO seconds (amount)
VALUES
    (123456);
    
DELIMITER //

CREATE FUNCTION FormatSeconds(seconds INT)
RETURNS VARCHAR(255)
BEGIN
    DECLARE days INT;
    DECLARE hours INT;
    DECLARE minutes INT;
    DECLARE secs INT;
    DECLARE formatted VARCHAR(255);

    SET days = seconds DIV 86400;
    SET seconds = seconds % 86400;
    SET hours = seconds DIV 3600;
    SET seconds = seconds % 3600;
    SET minutes = seconds DIV 60;
    SET secs = seconds % 60;

    SET formatted = CONCAT(days, ' days ', hours, ' hours ', minutes, ' minutes ', secs, ' seconds ');

    RETURN formatted;
END //

DELIMITER ;
SELECT FormatSeconds(amount) FROM seconds;
SELECT num FROM (
    SELECT 1 AS num
    UNION SELECT 2
    UNION SELECT 3
    UNION SELECT 4
    UNION SELECT 5
    UNION SELECT 6
    UNION SELECT 7
    UNION SELECT 8
    UNION SELECT 9
    UNION SELECT 10
) AS numbers
WHERE num % 2 = 0;
</pre>