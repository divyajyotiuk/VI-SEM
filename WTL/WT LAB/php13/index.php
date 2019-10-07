<!DOCTYPE html>
<!--
To change this license header, choose License Headers in Project Properties.
To change this template file, choose Tools | Templates
and open the template in the editor.
-->
<html>
    <head>
        <meta charset="UTF-8">
        <title>PHP LOGIN ||VNKDJ5</title>
         <style>
            .form1
{
	display: block;
	width:50%;
	border: 1px;
	padding: 8px;
	margin: 5px;
	border: 2px solid gray;
    border-radius: 5px;
    background: url('mountain.jpg');
}
td{
    padding: 8px;
}
.btn1
{
height: 40px;
width: 80%;
text-align: center;
margin: 5px;
padding: 8px;
font-weight: bold;
background-color: #4CAF50;
color: white;

}
h1
{
	color: #4CAF50;
}
            </style>
    </head>
    
    <body>
       <center>
        <form  method="POST" class="form1" action="process.php">
	<center><h1>Add Student Information</h1></center>
        <table width="100%"><tr>
                <td><label for="studentName">Student Name</label></td>
			<td><input type="text" name="studentName" id="studentName" placeholder="Enter Name" required></td>
		</tr>
		<tr> 
			<td><label for="studentRollNo">Roll No</label></td>
			<td><input type="number" name="studentRollNo" id="studentRollNo" placeholder="Enter Roll No" min="1000" max="9999"  required></td>
		</tr>
		<tr> 
			<td><label for="studentDept">Department</label></td>
			<td><input type="text" name="studentDept" id="studentDept" placeholder="Enter Dept"  required></td>
		</tr>
		
		<tr>
		<td colspan="2" align="center"><input class="btn1" type="submit" value="Submit" name="submit" ></td>
		</tr>
        </table>
	</form>
    </center>
    </body>
</html>
