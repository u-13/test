document.write("問１");
document.write("<br>");
function menseki(hankei){
	return hankei*hankei*3.14;
}
document.write("半径5cmの円の面積は");
document.write(menseki(5)+"cm2"+'<br>');
document.write("半径7cmの円の面積は");
document.write(menseki(7)+"cm2"+'<br>');
document.write("半径10cmの円の面積は");
document.write(menseki(10)+"cm2"+'<br>');

document.write("<p>");

document.write("問２");
document.write("<br>");
function park(adult,child){
	return adult*500+child*200;
}
document.write("Aグループの合計金額は");
document.write(park(2,4)+"円です。"+"<br>");
document.write("Bグループの合計金額は");
document.write(park(1,5)+"円です。"+"<br>");
document.write("Cグループの合計金額は");
document.write(park(3,7)+"円です。"+"<br>");