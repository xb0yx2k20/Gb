## Информация 
Необходимо организовать систему учета для питомника, в котором живут
домашние и вьючные животные.

## Задание
1. Используя команду cat в терминале операционной системы Linux, создать
два файла Домашние животные (заполнив файл собаками, кошками,
хомяками) и Вьючные животными заполнив файл Лошадьми, верблюдами и
ослы), а затем объединить их. Просмотреть содержимое созданного файла.
Переименовать файл, дав ему новое имя (Друзья человека).

![Task 1](/Attestation2/source/1.png)

2. Создать директорию, переместить файл туда.

![Task 2](/Attestation2//source/2.png)

3. Подключить дополнительный репозиторий MySQL. Установить любой пакет
из этого репозитория.

![Task 3](/Attestation2//source/3.1.png)
![Task 3](/Attestation2//source/3.2.png)
![Task 3](/Attestation2//source/3.3.png)


4. Установить и удалить deb-пакет с помощью dpkg.

![Task 4](/Attestation2//source/4.png)

5. Выложить историю команд в терминале ubuntu
 * cat > "homeAnim"
 * cat > "VueAnim"
 * cat "homeAnim" "VueAnim" > "hmFriends"
 * mv hmFriends humanFriends
 * cat humanFriends
 * mkdir hmDir
 * mv humanFriends hmDir
 * sudo get https://dev.mysql.com/get/mysql-apt-config_0.8.23-1_all.deb
 * sudo dpkg -i mysql-apt-config_0.8.23-1_all.deb
 * sudo apt-get update
 * sudo apt-get install mysql-server
 * sudo wget https://download.docker.com/linux/ubuntu/dists/jammy/pool/stable/arm64/docker-ce-cli 20.10.13~3
-O~ubuntu-jammy arm64.deb
 * sudo dpkg -i docker-ce-cli_20.10.13~3-0~ubuntu-jammy_arm64.deb