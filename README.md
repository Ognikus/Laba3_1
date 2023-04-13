<h1>Обработка строк. Использование регулярных выражений в java-приложениях</h1>
<p><h2>Работа выполнена с помощью графического инструмента Java javaFX, с использованием SceneBuilder</h2></p>
<p><h3>Задание 1.</h3>	Написать регулярное выражение, определяющее является ли данная строка строкой "abcdefghijklmnopqrstuv18340" или нет.
<p>– пример правильных выражений: abcdefghijklmnopqrstuv18340.</p>
– пример неправильных выражений: abcdefghijklmnoasdfasdpqrstuv18340.</p>

<p><h3>Задание 2.</h3>	Написать регулярное выражение, определяющее является ли данная строка GUID с или без скобок. Где GUID это строчка, состоящая из 8, 4, 4, 4, 12 шестнадцатеричных цифр разделенных тире.
<p>– пример правильных выражений: e02fd0e4-00fd-090A-ca30-0d00a0038ba0.</p>
– пример неправильных выражений: e02fd0e400fd090Aca300d00a0038ba0.</p>

<p><h3>Задание 3.</h3>	Написать регулярное выражение, определяющее является ли заданная строка правильным MAC-адресом.
<p>– пример правильных выражений: aE:dC:cA:56:76:54.</p>
– пример неправильных выражений: 01:23:45:67:89:Az.</p>

<p><h3>Задание 4.</h3>Написать регулярное выражение, определяющее является ли данная строчка валидным URL адресом. В данной задаче правильным URL считаются адреса http и https, явное указание протокола также может отсутствовать. Учитываются только адреса, состоящие из символов, т.е. IP адреса в качестве URL не присутствуют при проверке. Допускаются поддомены, указание порта доступа через двоеточие, GET запросы с передачей параметров, доступ к подпапкам на домене, допускается наличие якоря через решетку. Однобуквенные домены считаются запрещенными. Запрещены спецсимволы, например «–» в начале и конце имени домена. Запрещен символ «_» и пробел в имени домена. При составлении регулярного выражения ориентируйтесь на список правильных и неправильных выражений заданных ниже.
<p>– пример правильных выражений: http://www.example.com, http://example.com.</p>
– пример неправильных выражений: Just Text, http://a.com.</p>

<p><h3>Задание 5.</h3>	Написать регулярное выражение, определяющее является ли данная строчка шестнадцатиричным идентификатором цвета в HTML. Где #FFFFFF для белого, #000000 для черного, #FF0000 для красного и т.д.
<p>– пример правильных выражений: #FFFFFF, #FF3421, #00ff00.<p>
– пример неправильных выражений: 232323, f#fddee, #fd2.</p>

<p><h3>Задание 6.</h3>	Написать регулярное выражение, определяющее является ли данная строчка датой в формате dd/mm/yyyy. Начиная с 1600 года до 9999 года.
<p>– пример правильных выражений: 29/02/2000, 30/04/2003, 01/01/2003.</p>
– пример неправильных выражений: 29/02/2001, 30-04-2003, 1/1/1899.</p>

<p><h3>Задание 7.</h3>	Написать регулярное выражение, определяющее является ли данная строчка валидным E-mail адресом согласно RFC под номером 2822.
<p>– пример правильных выражений: user@example.com, root@localhost</p>
– пример неправильных выражений: bug@@@com.ru, @val.ru, Just Text2.</p>

<p><h3>Задание 8.</h3>	Составить регулярное выражение, определяющее является ли заданная строка IP адресом, записанным в десятичном виде.
<p>– пример правильных выражений: 127.0.0.1, 255.255.255.0.</p>
– пример неправильных выражений: 1300.6.7.8, abc.def.gha.bcd.</p>

<p><h3>Задание 9.</h3>	Проверить, надежно ли составлен пароль. Пароль считается надежным, если он состоит из 8 или более символов. Где символом может быть английская буква, цифра и знак подчеркивания. Пароль должен содержать хотя бы одну заглавную букву, одну маленькую букву и одну цифру.
<p>– пример правильных выражений: C00l_Pass, SupperPas1.</p>
– пример неправильных выражений: Cool_pass, C00l.</p>

<p><h3>Задание 10.</h3>	Проверить является ли заданная строка шестизначным числом, записанным в десятичной системе счисления без нулей в старших разрядах.
<p>– пример правильных выражений: 123456, 234567.</p>
– пример неправильных выражений: 1234567, 12345.</p>

<p><h3>Задание 11.</h3>	Есть текст со списками цен. Извлечь из него цены в USD, RUR, EU.
<p>– пример правильных выражений: 23.78 USD.</p>
– пример неправильных выражений: 22 UDD, 0.002 USD.</p>

<p><h3>Задание 12.</h3>	Проверить существуют ли в тексте цифры, за которыми не стоит «+».
<p>– пример правильных выражений: (3 + 5) – 9 × 4.</p>
– пример неправильных выражений: 2 * 9 – 6 × 5.</p>

<p><h3>Задание 13.</h3>	Создать запрос для вывода только правильно написанных выражений со скобками (количество открытых и закрытых скобок должно быть одинаково).
<p>– пример правильных выражений: (3 + 5) – 9 × 4.</p>
– пример неправильных выражений: ((3 + 5) – 9 × 4.</p>
