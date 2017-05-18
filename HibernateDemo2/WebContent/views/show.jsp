<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="ch"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>DB Info</title>
</head>
<body>
  <%-- <ch:forEach var="v" items="${table}">   --%>
	 AppName=${rowdata.getApp_Name()}<br />
	 ParamName=${rowdata.getParam_Name()}<br />
	 ParamValue=${rowdata.getParam_Value()}<br />
	 Active YN=${rowdata.getActive_YN()}<br />
	 CreatedBy=${rowdata.getCreated_By()}<br />
	 CreatedDate=${rowdata.getCreated_Date()}<br />
	 UpdatedBy=${rowdata.getUpdated_By()}<br />
	 Updated_Date=${rowdata.getUpdated_Date()}<br /><br/>
			
	 <%--  </ch:forEach> --%>   

</body>
</html>