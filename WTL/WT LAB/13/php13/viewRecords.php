<?php

include_once 'conn.php';

$query="select * from student order by student_perc";

$result=  mysqli_query($conn, $query);
?>
<table><tr><th>Roll No</th><th>Name</th><th>Class</th><th>Department</th><th>Percentage</th></tr>
<?php
if(mysqli_num_rows($result)>0)
{
    while ($row=  mysqli_fetch_assoc($result))
    {
        echo "<tr><td>".$row["student_rollno"]."</td><td>".$row["student_name"]."</td><td>".$row["student_class"]."</td><td>".$row["student_dept"]."</td><td>".$row["student_perc"]."</td></tr>";
    }
}
echo '</table>';
