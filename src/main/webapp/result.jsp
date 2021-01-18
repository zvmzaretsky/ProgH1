<%@ page import="com.example.ProgH1.QuizServlet" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<% int[] answers = QuizServlet.getAnswers(); %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<h1>My answers</h1>
<table>
    <tr>
        <td>table</td>
        <td>yes</td>
        <td>no</td>
    </tr>
    <tr>
        <th>Q1</th>
        <td><%= answers[1] %></td>
        <td><%= answers[0] %></td>
    </tr>
    <tr>
        <th>Q2</th>
        <td><%= answers[3] %></td>
        <td><%= answers[2] %></td>
    </tr>
</table>
<h1>All answers</h1>
<table>
    <tr>
        <td>table</td>
        <td>yes</td>
        <td>no</td>
    </tr>
    <tr>
        <th>Q1</th>
        <td><%= answers[5] %></td>
        <td><%= answers[4] %></td>
    </tr>
    <tr>
        <th>Q2</th>
        <td><%= answers[7] %></td>
        <td><%= answers[6] %></td>
    </tr>
</table>
</body>
</html>
