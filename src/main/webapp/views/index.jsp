<html>
<head>
    <title>Index</title>
</head>
<body>
Hello World!
<%--<% out.print(2 * 5); %>--%>

<form action="/add">
    Enter number 1 : <input type="text" name="num1"><br>
    Enter number 2 : <input type="text" name="num2"><br>
    <input type="submit">
</form>

<hr>

<form action="/addAlien" method="post">
    Enter your id : <input type="text" name="id"><br>
    Enter your name : <input type="text" name="name"><br>
    <input type="submit">
</form>

<hr>

<form action="/getAlien" method="get">
    Enter your id : <input type="text" name="id"><br>
    <input type="submit">
</form>

<hr>

<form action="/getAlienByName" method="get">
    Enter your Name : <input type="text" name="name"><br>
    <input type="submit">
</form>
</body>
</html>