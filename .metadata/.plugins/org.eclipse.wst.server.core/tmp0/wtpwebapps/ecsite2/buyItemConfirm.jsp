<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix = "s" uri = "/struts-tags" %>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<meta http-equiv="Content-Style-Type" content="text/css"/>
<meta http-equiv="Content-Script-Type" content="text/javascript"/>
<meta http-equiv="imagetoolbar" content="no"/>
<meta name="description" content=""/>
<meta name="keywords" content=""/>
<script src="http://ajax.googleapis.com/ajax/libs/jquery/1.9.1/jquery.min.js"></script>

<title>BuyItemConfirm画面</title>

<style type = "text/css">
/* ====== TAG LAYOUT ======= */
	body {
		margin:0;
		padding:0;
		line-height:1.6;
		letter-spacing:1px;
		font-family:Verdana, Helvetica, sans-serif;
		font-size:12px;
		color:#333;
		background:#fff;
	}
	.table1 {
		width:300px;
		border-collapse:collapse;
		text-align:center;
		margin:0 auto;
	}
	.table2 {
		text-align:center;
		margin:0 auto;
	}

/* ====== ID LAYOUT ======= */
	#top {
		width:780px;
		margin:30px auto;
		border:1px solid #333;
	}
	#header {
		width:100%;
		height:80px;
		background-color:black;
	}
	#main {
		width:100%;
		height:500px;
		text-align:center;
	}
	#footer {
		width:100%;
		height:80px;
		background-color:black;
		clear:both;
	}
</style>
<script type = "text/javascript">
	function submitAction(url) {
		$('form').attr('action', url);
		$('form').submit();
	}
</script>
</head>
<body>
	<div id = "header">
		<div id = "pr"></div>
	</div>
	<div id = "main">
		<div id = "top">
			<p>BuyItem</p>
		</div>
		<div>
			<s:form>
			<table border = "1" class = "table1">
				<tr>
					<th>商品名</th>
					<th>価格</th>
					<th>購入個数</th>
					<th>支払い方法</th>
				</tr>
				<s:iterator value = "#session.buyItemDTOList">
				<tr>
					<td><s:property value = "itemName"/></td>
					<td><s:property value = "itemPrice"/><span>円</span></td>
					<td><s:property value = "count"/></td>
					<td><s:property value = "pay"/></td>
				</tr>
				</s:iterator>
			</table>
			<br>
			<table class = "table2">
				<tr>
					<td><input type = "button" value = "戻る"
							onclick = "submitAction('HomeAction')"/>
					</td>
					<td><input type = "button" value = "完了"
							onclick = "submitAction('BuyItemCompleteAction')"/>
					</td>
				</tr>
			</table>
			</s:form>
		</div>
	</div>
	<div id = "footer">
		<div id = "pr"></div>
	</div>
</body>
</html>