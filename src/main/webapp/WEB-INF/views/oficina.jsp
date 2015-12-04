<%-- 
    Document   : oficina
    Created on : 3/12/2015, 01:34:06 PM
    Author     : Eduardo
--%>
<!DOCTYPE html>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://www.springframework.org/tags" prefix="spring" %>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<%@ page session="false" %>
<html>
<head>
    <title>Oficinas Page</title>
    <style type="text/css">
        .tg  {border-collapse:collapse;border-spacing:0;border-color:#ccc;}
        .tg td{font-family:Arial, sans-serif;font-size:14px;padding:10px 5px;border-style:solid;border-width:1px;overflow:hidden;word-break:normal;border-color:#ccc;color:#333;background-color:#fff;}
        .tg th{font-family:Arial, sans-serif;font-size:14px;font-weight:normal;padding:10px 5px;border-style:solid;border-width:1px;overflow:hidden;word-break:normal;border-color:#ccc;color:#333;background-color:#f0f0f0;}
        .tg .tg-4eph{background-color:#f9f9f9}
    </style>
</head>
<body>
<h1>
    Add a Oficina
</h1>
 
<c:url var="addAction" value="/oficina/add" ></c:url>
 
<form:form action="${addAction}" commandName="oficina">
<table>
    <c:if test="${!empty oficina.nombre_contacto}">
    <tr>
        <td>
            <form:label path="id">
                <spring:message text="ID"/>
            </form:label>
        </td>
        <td>
            <form:input path="id" readonly="true" size="8"  disabled="true" />
            <form:hidden path="id" />
        </td> 
    </tr>
    </c:if>
    <tr>
        <td>
            <form:label path="name">
                <spring:message text="Name"/>
            </form:label>
        </td>
        <td>
            <form:input path="name" />
        </td> 
    </tr>
    <tr>
        <td>
            <form:label path="country">
                <spring:message text="Country"/>
            </form:label>
        </td>
        <td>
            <form:input path="country" />
        </td>
    </tr>
    <tr>
        <td colspan="2">
            <c:if test="${!empty oficina.nombre_contacto}">
                <input type="submit"
                    value="<spring:message text="Edit Oficina"/>" />
            </c:if>
            <c:if test="${empty oficina.nombre_contacto}">
                <input type="submit"
                    value="<spring:message text="Add Oficina"/>" />
            </c:if>
        </td>
    </tr>
</table>  
</form:form>
<br>
<h3>Oficinas List</h3>
<c:if test="${!empty listOficinas}">
    <table class="tg">
    <tr>
        <th width="80">Person ID</th>
        <th width="120">Person Name</th>
        <th width="120">Person Country</th>
        <th width="60">Edit</th>
        <th width="60">Delete</th>
    </tr>
    <c:forEach items="${listOficinas}" var="person">
        <tr>
            <td>${oficina.id}</td>
            <td>${oficina.nombre_contacto}</td>
            <td>${oficina.correo_oficina}</td>
            <td><a href="<c:url value='/edit/${oficina.id}' />" >Edit</a></td>
            <td><a href="<c:url value='/remove/${oficina.id}' />" >Delete</a></td>
        </tr>
    </c:forEach>
    </table>
</c:if>
</body>
</html>