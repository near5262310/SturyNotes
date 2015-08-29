<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<center>
<h1>${requestScope.errorMessage }</h1>
${sessionScope.currentUser}
    <form action="/CASCS/login.action">
        <table>
            <tr>
                <td>username:</td>
                <td><input name="username" type="text"></td>
            </tr>
            <tr>
                <td>password:</td>
                <td><input name="password" type="text"></td>
            </tr>
            <tr>
                <td>
                    <select name="type">
                        <option value="student">Student</option>
                        <option value="teacher">Teacher</option>
                    </select>
                </td>
            </tr>
            <tr>
                <td><input type="submit"/> </td>
                <td><input type="reset"/></td>
            </tr>
        </table>
    </form>
</center>
</body>
</html>