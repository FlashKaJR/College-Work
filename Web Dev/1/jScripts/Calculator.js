$ = function(id){
	return document.getElementById(id);
};
ResetTextfields = function(){
	$("length").value="";
	$("width").value="";
	$("height").value="";
	$("radius").value="";
	$("resultText").value="";
	$("resultPara").innerHTML ="Your results will appear here.";
};


field = function(id){
	if(id==1){
		$("radius").disabled=false;
		$("width").disabled=true;
		$("length").disabled=true;
		$("height").disabled=false;
		$("imgs").src = "images/cylinder.jpg";
	}
	if(id==2){
		$("radius").disabled=true;
		$("width").disabled=false;
		$("length").disabled=false;
		$("height").disabled=false;
		$("imgs").src = "images/cuboid.png";
	}
	if(id==3){
		$("radius").disabled=false;
		$("width").disabled=true;
		$("length").disabled=true;
		$("height").disabled=true;
		$("imgs").src = "images/sphere.png";
	}
	ResetTextfields();
};

areaCylinder = function(){
	let r = parseFloat($("radius").value);
	let h = parseFloat($("height").value);

	if(isNaN(h) || isNaN(r))
		alert("You must enter numerical values for the radius and height.");
	else{
		let vol = (2*Math.PI*r*h+2*Math.PI*Math.pow(r, 2)).toFixed(2);
		$("resultPara").innerHTML = "The area of this cylinder is "+vol+"cm<sup>3<sup>";
		$("resultText").value=vol;
	}
};

areaCuboid = function(){
	let l = parseFloat($("length").value);
	let w = parseFloat($("width").value);
	let h = parseFloat($("height").value);

	if(isNaN(l) ||isNaN(w) ||isNaN(h))
		alert("You must enter numerical values for the length, width and height.");
	else{
		let vol = (2*l*w+2*l*h+2*w*h).toFixed(2);
		$("resultPara").innerHTML = "The area of this cuboid is "+vol+"cm<sup>3<sup>";
		$("resultText").value=vol;
	}
};

areaSphere = function(){
	let r = parseFloat($("radius").value);

	if(isNaN(r))
		alert("You must enter numerical values for the radius.");
	else{
		let vol = (Math.PI*4*Math.pow(r, 2)).toFixed(2);
		$("resultPara").innerHTML = "The area of this cuboid is "+vol+"cm<sup>3<sup>";
		$("resultText").value=vol;
	}
};

volumeCylinder = function(){
	let r = parseFloat($("radius").value);
	let h = parseFloat($("height").value);

	if(isNaN(r)||isNaN(h))
		alert("You must enter numerical values for the radius and height.");
	else{
		let vol = (Math.PI*Math.pow(r,2)*h).toFixed(2);
		$("resultPara").innerHTML = "The volume of this cylinder is "+vol+"cm<sup>3<sup>";
		$("resultText").value=vol;
	}
};


volumeCuboid = function(){
	let l = parseFloat($("length").value);
	let w = parseFloat($("width").value);
	let h = parseFloat($("height").value);

	if(isNaN(l)||isNaN(w)||isNaN(h))
		alert("You must enter numerical values for the width, legth and height.");
	else{
		let vol = (w * l * h).toFixed(2);
		$("resultPara").innerHTML = "The volume of this cuboid is "+vol+"cm<sup>3<sup>";
		$("resultText").value=vol;
	}
};


volumeSphere = function(){
	let r = parseFloat($("radius").value);

	if(isNaN(r))
		alert("You must enter numerical values for the radius.");
	else{
		let vol = (Math.PI*(4/3)*Math.pow(r, 3)).toFixed(2);
		$("resultPara").innerHTML = "The volume of this sphere is "+vol+"cm<sup>3<sup>";
		$("resultText").value=vol;
	}
};
calculate = function(){
	if($("cylinder").checked==true)
		if($("selbox").value=="a1")
			areaCylinder();
		else
			volumeCylinder();
	if($("cuboid").checked==true)
		if($("selbox").value=="a1")
			areaCuboid();
		else
			volumeCuboid();
	if($("sphere").checked==true)
		if($("selbox").value=="a1")
			areaSphere();
		else
			volumeSphere();
};

window.onload = function(){
	$("calculate").onclick = function(){calculate();}
	$("reset").onclick = function(){ResetTextfields();}
};
