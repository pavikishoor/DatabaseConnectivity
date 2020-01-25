import java.sql.*;
class Dbdemo{

	public static void main(String[] args){
	try{
	Class.forName("oracle.jdbc.driver.OracleDriver");
	Connection con = DriverManager.getConnection("jdbc:oracle:thin:@172.16.38.200:1521:edu ","it17a22","it17a22");
	Statement stm = con.createStatement();
	ResultSet rs = stm.executeQuery("select * from emp");
	while(rs.next()){
	System.out.println(rs.getInt("eno")+rs.getString("ename"));
	}
con.close();
	}
	catch(Exception e){
	System.out.println("Exception :"+e);
	}
	}


}
