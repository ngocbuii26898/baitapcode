<?php
class loginmodel // model login
{
    function getlogin($usersname, $password)
    {
        include "database/connect.php";
        $sql = "SELECT * FROM login WHERE name = '$usersname' AND password = '$password'";
        $check = mysqli_query($connect, $sql); //mysqli_num_rows(mysqli_query($connect, $sql));
        return $check;
    }
}
?>