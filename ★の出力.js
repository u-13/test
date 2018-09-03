document.write("問１");
document.write("<br>");
for(var star=1;star<=5;star++){
	document.write("★");
}

document.write("<p>");

document.write("問２");
document.write("<br>");
for(var star1=1;star1<=2;star1++){
	for(var star2=1;star2<=3;star2++){
		document.write("★");
	}
	document.write("<br>");
}

document.write("<p>");

document.write("問３");
document.write("<br>");
for(var star1=1;star1<=2;star1++){
	for(var star2=1;star2<=5;star2++){
		document.write("☆");
	}
	document.write("<br>");
}

document.write("<p>");

document.write("問４");
document.write("<br>");
for(var star1=1;star1<=4;star1++){
	for(var star2=1;star2<=5;star2++){
		document.write("★");
	}
	document.write("<br>");
}

document.write("<p>");

document.write("問５");
document.write("<br>");
for(var star1=1;star1<=4;star1++){
	for(var star2=1;star2<=3;star2++){
		document.write("★");
	}
	document.write("<br>");
}

document.write("<p>");

document.write("問６");
document.write("<br>");
for(var star1=1;star1<=3;star1++){
	for(var star2=1;star2<=3;star2++){
		if(star2%2==0){
			document.write("☆");
		}else{
			document.write("★");
		}
	}
	document.write("<br>");
}

document.write("<p>");

document.write("問７");
document.write("<br>");
for(var star1=1;star1<=4;star1++){
	for(star2=1;star2<=5;star2++){
		if(star2%2==0){
			document.write("☆");
		}else{
			document.write("★");
		}
	}
	document.write("<br>");
}

document.write("<p>");

document.write("問８");
document.write("<br>");
for(var star1=1;star1<=5;star1++){
	for(star2=1;star2<=star1;star2++){
		document.write("★");
	}
	document.write("<br>");
}