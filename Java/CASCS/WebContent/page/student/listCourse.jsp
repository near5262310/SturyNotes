<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<script type="text/javascript" src="/CASCS/page/js/lib/jquery-2.1.0.js"></script>
<script type="text/javascript" src="/CASCS/page/js/welcome.js"></script>
<title>Insert title here</title>
</head>
<body>
    <div class="student-center">
        <div class="student-bread">
            
        </div>
        <div>
            CourseMaxNumber: ${sessionScope.currentUser.courseMaxNumber } 
            CourseActualNumber: ${sessionScope.currentUser.courseActualNumber }
        </div>
        <div class="list-course">
            <table border="1">
                <tr>
                    <td>Course Name:</td>
                    <td>Description:</td>
                    <td>Grade:</td>
                    <td>Term:</td>
                    <td>Credit:</td>
                    <td>Option:</td>
                </tr>
                <c:forEach items="${requestScope.courseList }" var="course">
                    <tr>
                    <td>${course.name } </td>
                    <td>${course.description } </td>
                    <td>${course.grade } </td>
                    <td>${course.term } </td>
                    <td>${course.credit } </td>
                    <td><strong class='student-choose-choose-btn'>Choose</strong><input type="hidden" value="${course.id }"> </td>
                    </tr>
                </c:forEach>
            </table>
        </div>
    </div>
</body>
</html>