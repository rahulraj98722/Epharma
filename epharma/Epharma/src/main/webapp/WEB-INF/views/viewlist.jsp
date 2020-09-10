<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>

   <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>    
  
<html>
<head>
<meta charset="ISO-8859-1">
<title>View List</title>
<meta charset="utf-8">

  <meta name="viewport" content="width=device-width, initial-scale=1">

  <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css">

  <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.4.1/jquery.min.js"></script>

  <script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.7/umd/popper.min.js"></script>

  <script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.3.1/js/bootstrap.min.js"></script>
</head>
<body>
<nav role="navigation" class="navbar navbar-default" >

 <div class="">

   <a href="http://localhost:8080/cviewlist" class="navbar-brand">Expired MedicineList <img src="<c:url value="/resources/img/tru1.jpg"/>"width="120"height="50"></a>

   </div>
                <div class="navbar-collapse">
                    <ul class="nav navbar-nav navbar-LEFT">

                          <li><a href="/logout">Logout</a></li>

                      </ul>

                </div>

 

 </nav>
<div class="container">

  <h2>MedicineList</h2>

<table class="table table-striped"> 
<tr><th>medId</th><th>medName</th><th>medPrice</th><th>medicinePurpose</th><th>manfdate</th><th>expdate</th><th>stock</th><th>Edit</th></tr>  
   <c:forEach var="menulist" items="${list}">   
   <tr>  
   <td>${menulist.medId}</td>
   <td>${menulist.medName}</td>  
   <td>&#8377; ${menulist.medPrice}</td>  
   <td>${menulist.medicinePurpose}</td>  
   <td>${menulist.manfdate}</td>  
   <td>${menulist.expdate}</td>
   <td>${menulist.stock}</td>
   <td><a type="button" class="btn btn-primary" href="editlist/${menulist.medId}">Edit</a></td> 
     
         
   </tr>  
   </c:forEach>  
   </table>  
   </div>
   
</body>
</html>