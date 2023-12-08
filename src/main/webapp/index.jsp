<%@ page import="java.time.LocalDate" %>
<%@ page import="java.time.temporal.ChronoUnit" %>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
    <title>JSP - Hello World</title>
</head>
<body>
<h1><%= "Welkom op het inschrijvingsformulier voor het nieuwjaarsfeestje!" %>
</h1>
<%
    LocalDate currentDate = LocalDate.now();

    LocalDate newYearsDay = LocalDate.of(currentDate.getYear() + 1, 1, 1);

    long daysUntilNewYear = ChronoUnit.DAYS.between(currentDate, newYearsDay);

%>
<h2>Er zijn nog <%=daysUntilNewYear%> dagen tot het nieuwjaarsfeestje!</h2>

<br/>
<a href="party-servlet">Link naar het inschrijvingsformulier voor het nieuwjaarsfeestje</a>
</body>
</html>