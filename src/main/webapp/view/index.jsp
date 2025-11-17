<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html>
<html>
<head>
    <title>Calculator</title>
</head>
<body>
    <h1>Calculator</h1>

    <form action="addAlien" method="post">
        <label>Enter Id:</label>
        <input type="text" name="aid" required>
        <br><br>

        <label>Enter name:</label>
        <input type="text" name="aname" required>
        <br><br>

        <button type="submit">Submit</button>
    </form>
</body>
</html>