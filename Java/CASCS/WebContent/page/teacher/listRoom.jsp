<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<script type="text/javascript" src="/CASCS/page/js/lib/jquery-2.1.0.js"></script>
<script type="text/javascript" src="/CASCS/page/js/welcome.js"></script>
<title>Insert title here</title>
</head>
<body>
<div class="teacher-center">
    <div class="teacher-bread">
    </div>
    <div id='teacher-rooms'>
    <a id="teacher-add-room">Add room</a>
        <table>
            <tr>
                <th>Number</th>
                <th>Description</th>
                <th>Capacity</th>
            </tr>
            <c:forEach items="${requestScope.roomList}" var="room">
                <tr>
                    <td>${room.number }</td>
                    <td>${room.description }</td>
                    <td>${room.capacity }</td>
                    <td><a id='teacher-delete-room'>Delete</a></td>
                </tr>
            </c:forEach>
        </table>
    </div>
    <div id="teacher-add-page">
        <form id='add-room-form'>
	        <table>
	            <tr>
	                <td>Number:</td>
	                <td><input type="text" name="number"> </td>
	            </tr>
	             <tr>
                    <td>Description:</td>
                    <td><input type="text" name="description"> </td>
                </tr>
                 <tr>
                    <td>Capacity:</td>
                    <td><input type="text" name="capacity"> </td>
                </tr>
                <tr>
                    <td><input type="button" value="ok" id="room-ok"> </td>
                    <td><input type="button" value="cancel" id="room-cancel"> </td>
                </tr>
	        </table>
        </form>
    </div>
</div>
</body>
</html>