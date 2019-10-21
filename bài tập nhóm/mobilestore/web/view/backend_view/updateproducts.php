
<?php

$sony = $apple = $Htc = $oppo = $samsung = "";
if (isset($_POST["submit"])) {
    if ($_POST["item"] == "") {
        echo "select item";
    } else {
        if ($_POST["item"] == "Oppo") {
            $oppo = 'selected';
        }
        if ($_POST["item"] == "Apple") {
            $apple = 'selected';
        }
        if ($_POST["item"] == "Sonny") {
            $sony = 'selected';
        }
        if ($_POST["item"] == "Htc") {
            $Htc = 'selected';
        }
        if ($_POST["item"] == "Samsung") {
            $samsung = 'selected';
        }
    }
}

?>

<div class="addproducts">
<form action="index.php?action=updateproduct" method="post" enctype="multipart/form-data">
    <label>ID:</label>
    <input type="text" name = "getid" value = "<?php echo $_GET['getid'] ?>" readonly>
	<br>
    <label>Code: </label>
    <input type="text" name = "code" value = "<?php echo $_GET['code'] ?>" readonly>
    <br>
    <label>Name:</label>
    <input type="text" name = "name" value = "<?php echo $_GET['name'] ?>">
    <br>
	<label>image</label>
	<input type="file" name="fileUpload" id="fileUpload"><br>
	<label>price</label>
	<input type="text" name="price" value = '<?php echo $_GET['price'] ?>'><br>
	<label>description</label>
	<input type="text" name="description" value="<?php echo $_GET['description']?>"><br>
    <input type="text" name = 'image' value='<?php echo $_GET['image'] ?>' id="image">
    <img src="<?php echo $_GET['image'] ?>">
	<input name ="submit" value="UPDATE PRODUCT" type="submit">
    <!-- link: <input type='text' name="saveurl" value="<?php// echo $_GET['image'] ?>"> -->
    
</form>
</div>
<script> 
    $('#fileUpload').click(function(){
        $("#image").val() = "";
    })
</script>