]<%@ page import="java.util.List" %>
<%@ page import="com.studentdata.Qns" %>

<html>
<head>
    <title>Online Exam</title>
    <link rel="stylesheet" href="style3.css">
</head>
<body>

<div class="container">

    <h2>Questions</h2>

    <form action="submitAnswers" method="post">
        <div id="timer">Time Left: 30:00</div>
        <%
            List<Qns> list = (List<Qns>) request.getAttribute("questions");
            int i = 1;

            for (Qns q : list) {
        %>

        <div class="question-box">

            <p class="question"><b>Q<%= i %>:</b> <%= q.getQn() %></p>

            <div class="option">
                <input type="radio" name="q<%= i %>" value="<%= q.getOp1() %>" >
                <span><%= q.getOp1() %></span>
            </div>

            <div class="option">
                <input type="radio" name="q<%= i %>" value="<%= q.getOp2() %>">
                <span><%= q.getOp2() %></span>
            </div>

            <div class="option">
                <input type="radio" name="q<%= i %>" value="<%= q.getOp3() %>">
                <span><%= q.getOp3() %></span>
            </div>

            <div class="option">
                <input type="radio" name="q<%= i %>" value="<%= q.getOp4() %>">
                <span><%= q.getOp4() %></span>
            </div>

        </div>

        <%
                i++;
            }
        %>

        <input type="submit" value="Submit Exam" class="submit-btn">

    </form>

</div>

</body>
<script>
    let totalTime = 30 * 60;

    function startTimer() {

        let timer = setInterval(function () {

            let minutes = Math.floor(totalTime / 60);
            let seconds = totalTime % 60;


            minutes = minutes < 10 ? "0" + minutes : minutes;
            seconds = seconds < 10 ? "0" + seconds : seconds;

            document.getElementById("timer").innerHTML =
                "Time Left: " + minutes + ":" + seconds;

            totalTime--;


            if (totalTime < 0) {
                clearInterval(timer);

                alert("Time is up! Submitting your test...");

                document.forms[0].submit(); // auto submit form
            }

        }, 1000);
    }

    window.onload = startTimer;
</script>
</html>