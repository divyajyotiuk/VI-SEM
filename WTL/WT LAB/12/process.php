<?php
include_once("conn.php");
if(isset($_POST["submit"]))
{
    $name=$_POST["studentName"];
    $roll=$_POST["studentRollNo"];
    $dept=$_POST["studentDept"];

    //reference https://www.tutorialspoint.com/mysqli/mysqli_insert_query.htm
    $sql="insert into student (student_rollno, student_name,student_dept) values ($roll,'$name','$dept')";

    $result=mysqli_query($conn,$sql);

    if($result)
    {
    	echo "Record of $roll inserted suceessfully";
    }
    else
    {
    	echo "Insertion of record failed.\nError: ".mysqli_error($conn);
    }
    
/*
 * If You are using XAMP then load project in htdocs directory of XAMP
 * If you are using PHP BUILT IN WEB BROWSER then (If you are getting MYsql Connection error then)
 * 1. Stop XAMP mysql and apache server
 * 2. $ sudo systemctl start mysql
 * 3. Check if mysql has been started $mysql -u root 
 * 4. Create database here and reexecute project
 * 5. 
 */
    /*   Table Structure

root@kali:~# mysql -u root
MariaDB [(none)]> create database tnp_db
    -> ;
Query OK, 1 row affected (0.05 sec)

MariaDB [(none)]> use tnp_db;
Database changed
MariaDB [tnp_db]> 
CREATE TABLE `student` (
  `student_rollno` int(11) NOT NULL,
  `student_name` varchar(60) NOT NULL,
  `student_dept` varchar(30) NOT NULL,
  `student_class` varchar(10) NOT NULL,
  `student_perc` float NOT NULL
);


INSERT INTO `student` (`student_rollno`, `student_name`, `student_dept`, `student_class`, `student_perc`) VALUES
(3434, 'Vaibhav', 'Computer', '', 0);
    */
}

