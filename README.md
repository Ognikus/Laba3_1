# Laba3_1
<p>Задание 1.	Написать регулярное выражение, определяющее является ли данная строка строкой "abcdefghijklmnopqrstuv18340" или нет.
– пример правильных выражений: abcdefghijklmnopqrstuv18340.
– пример неправильных выражений: abcdefghijklmnoasdfasdpqrstuv18340.</p>
Задание 2.	Написать регулярное выражение, определяющее является ли данная строка GUID с или без скобок. Где GUID это строчка, состоящая из 8, 4, 4, 4, 12 шестнадцатеричных цифр разделенных тире.
– пример правильных выражений: e02fd0e4-00fd-090A-ca30-0d00a0038ba0.
– пример неправильных выражений: e02fd0e400fd090Aca300d00a0038ba0.
Задание 3.	Написать регулярное выражение, определяющее является ли заданная строка правильным MAC-адресом.
– пример правильных выражений: aE:dC:cA:56:76:54.
– пример неправильных выражений: 01:23:45:67:89:Az.
Задание 4.	Написать регулярное выражение, определяющее является ли данная строчка валидным URL адресом. В данной задаче правильным URL считаются адреса http и https, явное указание протокола также может отсутствовать. Учитываются только адреса, состоящие из символов, т.е. IP адреса в качестве URL не присутствуют при проверке. Допускаются поддомены, указание порта доступа через двоеточие, GET запросы с передачей параметров, доступ к подпапкам на домене, допускается наличие якоря через решетку. Однобуквенные домены считаются запрещенными. Запрещены спецсимволы, например «–» в начале и конце имени домена. Запрещен символ «_» и пробел в имени домена. При составлении регулярного выражения ориентируйтесь на список правильных и неправильных выражений заданных ниже.
– пример правильных выражений: http://www.example.com, http://example.com.
– пример неправильных выражений: Just Text, http://a.com.
Задание 5.	Написать регулярное выражение, определяющее является ли данная строчка шестнадцатиричным идентификатором цвета в HTML. Где #FFFFFF для белого, #000000 для черного, #FF0000 для красного и т.д.
– пример правильных выражений: #FFFFFF, #FF3421, #00ff00.
– пример неправильных выражений: 232323, f#fddee, #fd2.
Задание 6.	Написать регулярное выражение, определяющее является ли данная строчка датой в формате dd/mm/yyyy. Начиная с 1600 года до 9999 года.
– пример правильных выражений: 29/02/2000, 30/04/2003, 01/01/2003.
– пример неправильных выражений: 29/02/2001, 30-04-2003, 1/1/1899.
Задание 7.	Написать регулярное выражение, определяющее является ли данная строчка валидным E-mail адресом согласно RFC под номером 2822.
– пример правильных выражений: user@example.com, root@localhost
– пример неправильных выражений: bug@@@com.ru, @val.ru, Just Text2.
Задание 8.	Составить регулярное выражение, определяющее является ли заданная строка IP адресом, записанным в десятичном виде.
– пример правильных выражений: 127.0.0.1, 255.255.255.0.
– пример неправильных выражений: 1300.6.7.8, abc.def.gha.bcd.
Задание 9.	Проверить, надежно ли составлен пароль. Пароль считается надежным, если он состоит из 8 или более символов. Где символом может быть английская буква, цифра и знак подчеркивания. Пароль должен содержать хотя бы одну заглавную букву, одну маленькую букву и одну цифру.
– пример правильных выражений: C00l_Pass, SupperPas1.
– пример неправильных выражений: Cool_pass, C00l.
Задание 10.	Проверить является ли заданная строка шестизначным числом, записанным в десятичной системе счисления без нулей в старших разрядах.
– пример правильных выражений: 123456, 234567.
– пример неправильных выражений: 1234567, 12345.
Задание 11.	Есть текст со списками цен. Извлечь из него цены в USD, RUR, EU.
– пример правильных выражений: 23.78 USD.
– пример неправильных выражений: 22 UDD, 0.002 USD.
Задание 12.	Проверить существуют ли в тексте цифры, за которыми не стоит «+».
– пример правильных выражений: (3 + 5) – 9 × 4.
– пример неправильных выражений: 2 * 9 – 6 × 5.
Задание 13.	Создать запрос для вывода только правильно написанных выражений со скобками (количество открытых и закрытых скобок должно быть одинаково).
– пример правильных выражений: (3 + 5) – 9 × 4.
– пример неправильных выражений: ((3 + 5) – 9 × 4.
