<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" import="java.util.*"  import="java.io.*" info="Written by sahil"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<%
 List<Integer> list = Arrays.asList(21,22,23,4444,32,44);
FileOutputStream fos = new FileOutputStream("D:/Images/msg.txt");
ObjectOutputStream oos = new ObjectOutputStream(fos);
oos.writeObject(list);

FileInputStream fis = new FileInputStream("D:/Images/msg.txt");
ObjectInputStream ois = new ObjectInputStream(fis);
List<Integer> newList = (List)ois.readObject();
for(Integer i: newList)
	out.println(i);

getServletInfo();
%>


</body>
</html>