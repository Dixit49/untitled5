<%--
  Created by IntelliJ IDEA.
  User: dixit
  Date: 22-03-2026
  Time: 10:56
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html>
<html>
<head>
  <title>Exam Instructions</title>
  <link rel="stylesheet" href="style2.css">
</head>
<body>

<div class="container">
  <div class="card">
    <h1>Online Examination Instructions</h1>

    <ul>
      <li>Total Questions: 20</li>
      <li>Time: 30 minutes</li>
      <li>No negative marking</li>
      <li>Do not refresh the page during exam</li>
      <li>Each question has only one correct answer</li>
    </ul>

    <!-- FORM ADDED -->
    <form action="questions" method="get">
      <button type="submit">Start Exam</button>
    </form>
  </div>
</div>

</body>
</html>