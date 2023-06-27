package com.dao;


import java.sql.Connection;

import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import com.bo.AddPeopleBo;

import com.bo.TurfThingBo;



public class turfAddDao {

public static Connection getConnection() {
		
		Connection con=null;
		
		try
		{
			
			Class.forName("com.mysql.cj.jdbc.Driver");
			
			String url="jdbc:mysql://localhost:3306/turfbooking";
			
			String username="root";
			
			String pass="Root";
			
			con=DriverManager.getConnection(url,username,pass);
			
			
			
		}
		
		catch(Exception e)
		{
			System.out.println(e);
		}
		
		return con;

		}
public static boolean adminValidate(String email,String password)
{
	boolean status=false;
	
	
	try
	{
		
		
		Connection con=turfAddDao.getConnection();
		
		String sql="select * from  signup where email=? and adminpassword=?";
		
		PreparedStatement ps=con.prepareStatement(sql);
		
		ps.setString(1, email);
		ps.setString(2, password);
		
		ResultSet rs=ps.executeQuery();
		
		status=rs.next();
		
		
	}
	
	catch(Exception e)
	{
		System.out.println(e);
	}
	return status;


}
public static int addPeople( AddPeopleBo sb) {
	
	int status=0;
	
	
	try 
	{
		
		
		
		Connection con=turfAddDao.getConnection();
		
		String sql="Insert into admin1 (fullName,email,location,Pricelist,Visits,phone,Services,idType,idNumber) values(?,?,?,?,?,?,?,?,?) ";
		
		PreparedStatement ps=con.prepareStatement(sql);
		
		ps.setString(1, sb.getFullName());
		ps.setString(2, sb.getEmail());
		ps.setString(3, sb.getLocation());
		ps.setString(4, sb.getPriceList());
		ps.setString(5, sb.getVisits());
		ps.setString(6, sb.getPhone());
		ps.setString(7, sb.getServices());
		ps.setString(8, sb.getIdType());
		ps.setString(9, sb.getIdNumber());
		
		status=ps.executeUpdate();
	}
	catch(Exception e) 
	{
		System.out.println(e);
		
	}
	
	return status;
}
public static List getPeopleData()
{
	
	List <AddPeopleBo>list=new ArrayList<>();
	try
	{
		Connection con=turfAddDao.getConnection();
		String sql="select * from addpeople";
		PreparedStatement ps=con.prepareStatement(sql);
		ResultSet rs=ps.executeQuery();
		
		while(rs.next())
		{
			AddPeopleBo sb=new AddPeopleBo();
			
			sb.setId(rs.getInt(1));
			sb.setFullName(rs.getString(2));
			sb.setEmail(rs.getString(3));
			sb.setLocation(rs.getString(4));
			sb.setPriceList(rs.getString(5));
			sb.setVisits(rs.getString(6));
			sb.setPhone(rs.getString(7));
			sb.setServices(rs.getString(8));
			sb.setIdType(rs.getString(9));
			sb.setIdNumber(rs.getString(10));
			
			list.add(sb);
			
			
			
		}
	}
	catch(Exception e)
	{
		System.out.println(e);
		
	}
	
	
	return list;
	
	
}
public static AddPeopleBo getInfoById(int id)
{
	AddPeopleBo sb=new AddPeopleBo();
	
	try {
		
		Connection con=turfAddDao.getConnection();
		String sql="select * from addpeople where id=?";
		
		PreparedStatement ps=con.prepareStatement(sql);
		ps.setInt(1, id);
		
		ResultSet rs=ps.executeQuery();
		
		if(rs.next())
		{
			sb=new AddPeopleBo();
			
			
			sb.setId(rs.getInt(1));
			sb.setFullName(rs.getString(2));
			sb.setEmail(rs.getString(3));
			sb.setLocation(rs.getString(4));
			sb.setPriceList(rs.getString(5));
			sb.setVisits(rs.getString(6));
			sb.setPhone(rs.getString(7));
			sb.setServices(rs.getString(8));
			sb.setIdType(rs.getString(9));
			sb.setIdNumber(rs.getString(10));
			
			
		}
		
	}catch(Exception e)
	{
		System.out.println(e);
	}
	
	return sb;
	
}
public static int updatePeople(AddPeopleBo sb)
{
	int status=0;
	try {
		
		Connection con=turfAddDao.getConnection();
		
		String sql="update  addpeople set  fullName =? , email =? , location=? ,  Pricelist=?,Visits=?, phone=? , ,idType =? ,idNumber =? where id=?";
		
		
		PreparedStatement ps=con.prepareStatement(sql);
		ps.setString(1, sb.getFullName());
		ps.setString(2, sb.getEmail());
		ps.setString(3, sb.getLocation());
		ps.setString(4, sb.getPriceList());
		ps.setString(5, sb.getVisits());
		ps.setString(6, sb.getPhone());
		ps.setString(7, sb.getServices());
		ps.setString(9, sb.getIdType());
		ps.setString(10, sb.getIdNumber());
		
		
		status=ps.executeUpdate();
		
		
		
		
	} catch (Exception e) {
		// TODO: handle exception
		System.out.println(e);
	}
	
	
	return status;
	
	
	
}public static int deletePeopleData(int id)
{
	
	int status=0;
	
	try {
		Connection con=turfAddDao.getConnection();
		String sql="delete from addpeople where id=?";
		PreparedStatement ps=con.prepareStatement(sql);
		ps.setInt(1, id);
		status=ps.executeUpdate();
		
	} catch (Exception e) {
		System.out.println(e);
	}
	
	return status;
	
}


public static int addthing(TurfThingBo bb) {
	
	int status=0;
	
	
	try 
	{
		
		
		
		Connection con=turfAddDao.getConnection();
		
		String sql="Insert into addthing (coustmerName,truf_id,booking_date,Start_time, end_time) values(?,?,?,?,?)" ;
		
		PreparedStatement ps=con.prepareStatement(sql);
		
		ps.setString(1, bb.getCoustmerName());
		ps.setString(2, bb.getTruf_id());
		ps.setString(3, bb.getBooking_date());
		ps.setString(4, bb.getStart_time());

		ps.setString(5, bb.getEnd_time());

		
		status=ps.executeUpdate();
	}
	
	catch(Exception e) 
	{
		System.out.println(e);
		
	}
	
	return status;
	
	
}

public static List getThingData()
{

List <TurfThingBo>list=new ArrayList<>();


try
{
	
	Connection con=turfAddDao.getConnection();
	String sql="select * from addthing";
	PreparedStatement ps=con.prepareStatement(sql);
	ResultSet rs=ps.executeQuery();
	
	while(rs.next())
		
	{
		
		TurfThingBo bb=new TurfThingBo();
		
		
		bb.setCoustmerName(rs.getString(1));
		bb.setTruf_id(rs.getString(2));
		bb.setBooking_date(rs.getString(3));
		bb.setStart_time(rs.getString(4));
		bb.setEnd_time(rs.getString(5));
		
		list.add(bb);
		
		
		
	}
}
catch(Exception e)
{
	System.out.println(e);
	
}





return list;


}

public static TurfThingBo getInfoByIdThing(int id)
{
TurfThingBo bb=new TurfThingBo();

try {
	
	Connection con=turfAddDao.getConnection();
	String sql="select * from addthing where id=?";
	
	PreparedStatement ps=con.prepareStatement(sql);
	ps.setInt(1, id);
	
	ResultSet rs=ps.executeQuery();
	
	if(rs.next())
	{
		bb=new TurfThingBo();
		
		bb.setCoustmerName(rs.getString(1));
		bb.setTruf_id(rs.getString(2));
       bb.setBooking_date(rs.getString(3));
		bb.setStart_time(rs.getString(4));
		bb.setEnd_time(rs.getString(5));

		
		
		
	}
	
}catch(Exception e)
{
	System.out.println(e);
}

return bb;

}

public static int deleteThingData(int id)
{

int status=0;

try {
	Connection con=turfAddDao.getConnection();
	String sql="delete from addthing where id=?";
	PreparedStatement ps=con.prepareStatement(sql);
	ps.setInt(1, id);
	status=ps.executeUpdate();
	
} catch (Exception e) {
	System.out.println(e);
}

return status;

}

public static int updateThing(TurfThingBo bb)
{
int status=0;
try {
	
	Connection con=turfAddDao.getConnection();
	
	String sql="update  addthing set  coustmerName =? , ctruf_id=?,  booking_date=?,  start_time=?, end_time=? ,where id=?";
	
	
	PreparedStatement ps=con.prepareStatement(sql);
	ps.setInt(1,bb.getId());
	ps.setString(2,bb.getCoustmerName());
	ps.setString(3,bb.getTruf_id());
	ps.setString(4, bb.getBooking_date());
	ps.setString(5, bb.getStart_time());
	ps.setString(6, bb.getEnd_time());
	
	
	status=ps.executeUpdate();
	
	
	
	
} catch (Exception e) {
	// TODO: handle exception
	System.out.println(e);
}


return status;



}	
}







