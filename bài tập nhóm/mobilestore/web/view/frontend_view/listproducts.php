		<div class='content-grids' style="width:100%;">
		    	<h4>NEW PRODUCTS</h4>
		    	<div class='section group'>
<?php
while ($row = $result->fetch_assoc())
{
	$code = $row['code'];
	$image = $row['image'];
	$price = $row['price'];
	$id = $row['id'];
	$name = $row['name'];
	$description = $row['description'];
echo "
	<div class='grid_1_of_4 images_1_of_4 products-info' style='margin-left:80px;'>
	<img src='$image' style='height: 293px;'>
	<a href='single.html'>$code</a>
	<h3>$price</h3>
	<ul>
		<li><a  class='cart' href='index.php?action=single&id=$id&name=$name&code=$code&image=$image&price=$price'> </a></li>
		<li><a  class='i' href='single.html'> </a></li>
		<li><a  class='Compar' href='single.html'> </a></li>
		<li><a  class='Wishlist' href='single.html'> </a></li>
	</ul>
</div>";
}
// $page = 1;
// $limit = 6;

// $num_pages = ceil($num_row/$limit);

// $start_page = ($page-1)*$limit;
?>
	</div>
</div>
<div style="margin-left: 390px;">
	<button>1</button>
	<button>2</button>
	<button>3</button>
</div>
