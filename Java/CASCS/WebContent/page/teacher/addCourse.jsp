<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<script type="text/javascript" src="/CASCS/page/js/lib/jquery-2.1.0.js"></script>
<script type="text/javascript" src="/CASCS/page/js/welcome.js"></script>
<title>Insert title here</title>
</head>
<body>
<div class="teacher-center">
    <div class="teacher-bread">
        <div id="add-course">
	        <form action="/CASCS/teacher/addCourse.action" id="form">
	            <table border='1'>
	                <tr><td>Course Name :</td><td><input type="text" name="name"></td></tr>
	                <tr><td>Description :</td><td><input type="text" name="description"></td></tr>
	                <tr><td>Grade :</td><td><input type="text" name="grade"></td></tr>
	                <tr><td>Term :</td><td><input type="text" name="term"></td></tr>
	                <tr><td>Credit :</td><td><input type="text" name="credit"></td></tr>
	                <tr><td><input type="button" value="ok" id="BtnaddCourse"></td><td><input type="reset" value='cancel'></td></tr>
	            </table>
	        </form>
        </div>
    </div>
</div>
</body>
</html>