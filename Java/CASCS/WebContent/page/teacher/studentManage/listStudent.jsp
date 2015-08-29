<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<%@taglib prefix="c"  uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<script type="text/javascript" src="/CASCS/page/js/welcome.js"></script>
<title>Insert title here</title>
</head>
<body>
<div class="teacher-center">
    <div class="teacher-bread">
        <strong>Welcome</strong>&gt;&gt;<strong>Course List</strong>
    </div>
    <div><strong id="teacher-add-student"> Add Student</strong></div>
    <div id="teacher-list-student">
        <table>
            <tr>
                <td>Number</td>
                <td>UserName</td>
                <td>Gender</td>
                <td>ClassName</td>
                <td>Type</td>
                <td>Department</td>
                <td>Major</td>
                <td>CourseMaxNum</td>
                <td>CourseActualNum</td>
                <td>Birthday</td>
                <td>InTime</td>
                <td>Grade</td>
            </tr>

            <c:forEach items="${requestScope.studentList }" var="student">
            <tr>
                <td>${student.number }</td>
                <td>${student.username }</td>
                <td>${student.sex }</td>
                <td>${student.className }</td>
                <td>${student.type }</td>
                <td>${student.department }</td>
                <td>${student.major }</td>
                <td>${student.courseMaxNumber }</td>
                <td>${student.courseActualNumber }</td>
                <td>${student.birthday }</td>
                <td>${student.inTime }</td>
                <td>${student.grade }</td>
            </tr>
            </c:forEach>
        </table>
    </div>
    <div id="teacher-add-student-page">
        <form id="teacher-form-student">
          <table>
            <tr>
                <td>Number</td>
                <td><input type="text" name="number"></td>
            </tr>
            <tr>
                <td>UserName</td>
                <td><input type="text" name="username"></td>
            </tr>
            <tr>
                <td>Password</td>
                <td><input type="text" name="password"></td>
            </tr>
            <tr>
                <td>Gender</td>
                <td><input type="text" name="sex"></td>
            </tr>
            <tr>
                <td>ClassName:</td>
                <td><input type="text" name="className"></td>
            </tr>
            <tr>
                <td>Type:</td>
                <td><input type="text" name="type"></td>
            </tr>
            <tr>
                <td>Department</td>
                <td><input type="text" name="department"></td>
            </tr>
            <tr>
                <td>Major:</td>
                <td><input type="text" name="major"></td>
            </tr>
            <tr>
                <td>Grade:</td>
                <td><input type="text" name="grade"></td>
            </tr>
            <tr>
                <td><input type="button" id="teacher-form-add-student" value="ok"></td>
                <td><input type="button" id="teacher-cancel-student" value="cancel"></td>
            </tr>
          </table>
        </form>
    </div>
</div>
</body>
</html>