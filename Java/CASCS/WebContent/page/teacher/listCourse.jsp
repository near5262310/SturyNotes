<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<script type="text/javascript" src="/CASCS/page/js/lib/jquery-2.1.0.js"></script>
<script type="text/javascript" src="/CASCS/page/js/welcome.js"></script>
<title>Insert title here</title>
</head>
<body>
<div class="teacher-center">
    
    <div class="teacher-bread">
        <strong>Welcome</strong>&gt;&gt;<strong>Course List</strong>
    </div>
        <div id="teacher-list-course">
            <table border=1>
                <c:forEach items="${requestScope.courseList }" var="course">
                    <tr><td>Course Name:</td><td>${course.name } </td>
                    <td>Description:</td><td>${course.description } </td>
                    <td>Grade:</td><td>${course.grade } </td>
                    <td>Term:</td><td>${course.term } </td>
                    <td>Credit:</td><td>${course.credit } </td>
                    <td><a class="delete-course">Delete</a><input type="hidden" name="courseId" value="${course.id }"/></td>
                    <td>
                    <select name="roomAndTimeIds" class='teacher-choose-room'>
                     <c:forEach items="${requestScope.rtList }" var="rt">
                        <option value="${rt.timeId },${rt.roomId},${rt.roomCapicity}">${rt.roomNumber } ${rt.roomDescription } ${rt.week } ${rt.timeperiod }</option>
                    </c:forEach>
                    </select>
                    </td>
                    <td>
                    <a  class="teacher-choose-course">Choose</a>
                    <input type="hidden" name="courseId" value="${course.id }"/>
                    </td>
                    </tr>
                </c:forEach>
            </table>
        </div>

</div>
</body>
</html>