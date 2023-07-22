<%@ taglib prefix="security" uri="http://www.springframework.org/security/tags" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Info for all employees</title>
</head>
<body>
<h1>Information for all employees</h1>
<p>
    <security:authorize access="hasRole('HR')">
    <input type="button" value="Salary" onclick="window.location.href='hr_info'">
    Only for HR stuff
    </security:authorize>
</p>
<p>
    <security:authorize access="hasRole('MANAGER')">
    <input type="button" value="Performance" onclick="window.location.href='manager_info'">
    Only for managers
    </security:authorize>
</p>
</body>
</html>
