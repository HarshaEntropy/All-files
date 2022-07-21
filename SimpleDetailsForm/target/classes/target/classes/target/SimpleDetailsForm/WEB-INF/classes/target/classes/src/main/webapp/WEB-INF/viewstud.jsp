  <%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
   <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<h1>Student List</h1>
<table border="2" width="70%" cellpadding="2">
<tr><th>Id</th><th>Name</th><th>Email</th><th>Gender</th><th>Phone NO.</th><th>Edit</th><th>Delete</th></tr>
   <c:forEach var="stud" items="${list}">
   <tr>
   <td>${stud.id}</td>
   <td>${stud.name}</td>
   <td>${stud.email}</td>
   <td>${stud.gender}</td>
   <td>${stud.phoneNum}</td>

   <td><a href="/SimpleDetailsForm/editstud/${stud.id}">Edit</a></td>
   <td><a href="/SimpleDetailsForm/deletestud/${stud.id}">Delete</a></td>
   </tr>
   </c:forEach>
   </table>
   <br/>
     <a href="/SimpleDetailsForm/viewstud/1">1</a>
      <a href="/SimpleDetailsForm/viewstud/2">2</a>
      <a href="/SimpleDetailsForm/viewstud/3">3</a>
   <br/>
   <a href="/SimpleDetailsForm/studform">Add New Student</a>