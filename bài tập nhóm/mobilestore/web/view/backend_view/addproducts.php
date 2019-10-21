
<?php
$sony = "";
$apple = "";
$Htc = "";
$oppo = "";
$samsung = "";
if (isset($_POST["submit"]))
{
	if ($_POST["item"] == "") {
		echo "select item";
	} else {
		if ($_POST["item"] == "Oppo") {
			$oppo = 'selected'; // 3
		}
		if ($_POST["item"] == "Apple") {
			$apple = 'selected'; // 4
		}
		if ($_POST["item"] == "sony" || $_POST["item"] == "Sony") {
			$sony = 'selected'; // 5
		} 
		if ($_POST["item"] == "Htc") {
			$Htc = 'selected'; // 2
		}
		if ($_POST["item"] == "Samsung") {
			$samsung = 'selected'; // 1
		}
	}
}
?>

<div class="addproducts">
<form action="index.php?action=addproducts" method="post" enctype="multipart/form-data">
	<label>Item</label>
	<select name = "item">
		<option value="">--select--</option>
		<option value="Samsung" name="samsung" <?php echo $samsung ?> >Samsung</option>
		<option value="Oppo" name="oppo" <?php echo $oppo ?>>Oppo</option>
		<option value="Apple" name="apple" <?php echo $apple ?>>Apple</option>
		<option value="Sony" name="sony" <?php echo $sony ?>>Sony</option>
		<option value="Htc"  name="htc" <?php echo $Htc ?>>Htc</option>
	</select> 
	<br>
	<label>Code: </label>
	<input type="text" name="code">
	<br>
	<label>Name</label>
	<input type="text" name = "name">
	<br>
	<label>image</label>
	<input type="file" name="fileUpload"><br>
	<label>price</label>
	<input type="text" name="price"><br>
	<label>description</label>
	<input type="text" name="description"><br>
	<input name ="submit" value="ADD PRODUCT" type="submit">
</form>
</div>