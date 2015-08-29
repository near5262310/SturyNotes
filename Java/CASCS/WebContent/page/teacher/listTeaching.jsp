<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
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
    <div class='list-teaching'>
        <table>
            <tr>
                <td>Course Name</td>
                <td>Course Description</td>
                <td>Course Grade</td>
                <td>Room Number</td>
                <td>Room Capacity</td>
                <td>Time Week</td>
                <td>Time Timeperiod</td>
            </tr>
            <c:forEach items="${requestScope.teachingList }" var="teaching">
            <tr>
                <td>${teaching.course.name }</td>
                <td>${teaching.course.description }</td>
                <td>${teaching.course.grade }</td>
                <td>${teaching.roomTime.room.number }</td>
                <td>${teaching.roomTime.room.capacity }</td>
                <td>${teaching.roomTime.time.week }</td>
                <td>${teaching.roomTime.time.timeperiod }</td>
                <td ><a class='teaching-delete'>Delete</a><input type="hidden" value="${teaching.id }"></td>
             </tr>
            </c:forEach>
            
        </table>
    </div>
</div>
</body>
</html>