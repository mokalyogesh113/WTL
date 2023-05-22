<?php
    $rno = $_POST["rnoField"];
    $name = $_POST["nameField"];

    $conn = mysqli_connect('localhost','root','');

    $if(!$conn){
        die(mysqli_connect_error());
    }

    echo "Connected Successfully";
    $sql1 = "insert into stud values($rno,'$name')";

    // mysqli_connect($conn,$sql1);
    // echo "Row is inserted";



?>
