<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

        <h1>Edit Student</h1>
       <form:form method="POST" action="/SimpleDetailsForm/editsave">
        <table >
        <tr>
        <td></td>
         <td><form:hidden  path="id" /></td>
         </tr>
         <tr>
          <td>Name : </td>
          <td><form:input path="name"  /></td>
         </tr>
         <tr>
          <td>Email :</td>
          <td><form:input path="email" /></td>
         </tr>
         <tr>
          <td>Gender. :</td>
          <td><form:input path="gender" /></td>
         </tr>
         <tr>
          <td>PhoneNo. :</td>
          <td><form:input path="phoneNum" /></td>
         </tr>
         <tr>
          <td>
   </table>

          </td>
          <td><input type="submit" value="Edit Save" /></td>
         </tr>
        </table>
       </form:form>