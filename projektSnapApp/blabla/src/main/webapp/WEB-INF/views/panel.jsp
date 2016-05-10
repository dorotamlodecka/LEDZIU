<%--
  Created by IntelliJ IDEA.
  User: kafr
  Date: 22/02/2016
  Time: 11:52
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java"%>
<%@ taglib uri = "http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@page isELIgnored="false"%>
<%@ page session="false" %>
<html>
<head>
    <title>Title</title>
</head>

<body>
<div align="center">
    <h1>Add a new participant</h1>
    <table>
        <form:form action="saveparticipant" method="post" modelAttribute="participant">




            <tr>
                <td>Name:</td>
                <td><form:input path="name"/></td>
            </tr>

            <tr>
                <td>Surname:</td>
                <td><form:input path="surname"/></td>
            </tr>
            <tr>
                <td colspan="2" align="center">
                    <input type="submit" value="Save">
                </td>
            </tr>

        </form:form>
    </table>
</div>

</body>
</html>
