<%@ page import="java.text.DecimalFormat" %>

<html>
<head>
    <title>Exam Result</title>
    <link rel="stylesheet" href="style4.css">
</head>
<body>

<div class="container">

    <h1>Exam Result</h1>

    <%
        int score = (int) request.getAttribute("score");
        int total = (int) request.getAttribute("total");

        double percentage = ((double) score / total) * 100;
        DecimalFormat df = new DecimalFormat("0.00");

        String performance;

        if (percentage >= 80) {
            performance = "Excellent ";
        } else if (percentage >= 60) {
            performance = "Good ";
        } else if (percentage >= 40) {
            performance = "Average ";
        } else {
            performance = "Needs Improvement ";
        }
    %>

    <div class="result-box">
        <p><b>Score:</b> <%= score %> / <%= total %></p>
        <p><b>Percentage:</b> <%= df.format(percentage) %>%</p>
        <p><b>Performance:</b> <span class="performance"><%= performance %></span></p>
    </div>

    <div class="progress-bar">
        <div class="progress" style="width:<%= percentage %>%"></div>
    </div>
    <div class="buttons">
        <a href="index2.jsp">Retake Exam</a>
        <a href="index.jsp">Logout</a>
    </div>

</div>

</body>
</html>