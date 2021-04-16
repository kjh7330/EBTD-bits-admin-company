<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<script type="text/javascript">

</script>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<div id="adminheader"><jsp:include page="include/adminheader.jsp" />

</div>

<form action="addNewBus" name = "addnewbusform">
노선 번호 : <input id = "busNum" name = "busNum"/>
동, 읍, 면 선택 : <select>
				<option value = "청학동">
				<option value = "송도1동">
				<option value = "송도3동">
				</select>

</form>

<div id="adminfooter"><jsp:include page="include/adminfooter.jsp" />

</div>
</body>
</html>