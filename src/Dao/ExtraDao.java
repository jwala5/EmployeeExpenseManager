package Dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;

import utility.ConnectionManager;

public class ExtraDao {
	public void DispEmp(String Em_name){
		try {
		
		Connection con = ConnectionManager.getConnection();
		PreparedStatement st = con.prepareStatement("SELECT Em_id,Em_name,Em_mobile,Em_email,Em_dept FROM employee WHERE Em_name =?");
		st.setString(1, Em_name);
	
		ResultSet rs = st.executeQuery();

		while(rs.next())
		{
			System.out.println(rs.getString(1)+"\t\t"+rs.getString(2)+"\t\t"+rs.getString(3)+"\t\t"+rs.getString(4)+"\t\t"+rs.getString(5)+"\t\t");
		}
		con.close();		
		} catch (Exception e) {
			System.out.println(e);
		}
	}

	public void getAllAscEmployee(){
		try {
		Connection con = ConnectionManager.getConnection();
		Statement st = con.createStatement();
		ResultSet rs = st.executeQuery("SELECT * FROM employee order by Em_id ASC");
		while(rs.next())
		{
			System.out.println(rs.getString(1)+"\t\t"+rs.getString(2)+"\t\t"+rs.getString(3)+"\t\t"+rs.getString(4)+"\t\t"+rs.getString(5));
		}
		
		con.close();
		} catch (Exception e) {
			System.out.println(e);
		}
	}

	public void getAllDscEmployee(){
		try {
		Connection con = ConnectionManager.getConnection();
		Statement st = con.createStatement();
		ResultSet rs = st.executeQuery("SELECT * FROM employee order by Em_id DESC");
		while(rs.next())
		{
			System.out.println(rs.getString(1)+"\t\t"+rs.getString(2)+"\t\t"+rs.getString(3)+"\t\t"+rs.getString(4)+"\t\t"+rs.getString(5));
		}
		
		con.close();
		} catch (Exception e) {
			System.out.println(e);
		}
	}
	
	public void DispSal(String sid) 
	{
		try {
		
			Connection con = ConnectionManager.getConnection();
			PreparedStatement st = con.prepareStatement("SELECT * FROM salary WHERE sid=?");
			st.setString(1, sid);
			
			ResultSet rs = st.executeQuery();

			while(rs.next())
			{
				System.out.println(rs.getString(1)+"\t\t"+rs.getString(2)+"\t\t"+rs.getString(3)+"\t\t"+rs.getString(4)+"\t\t"+rs.getString(5)+"\t\t"+rs.getString(6));
			}
			con.close();		
			} catch (Exception e) {
				System.out.println(e);
			}
	}
	
	public void SortSal(String s1, String s2) 
	{
		try {
		
			Connection con = ConnectionManager.getConnection();
			PreparedStatement st = con.prepareStatement("SELECT * FROM salary WHERE TotSal between ? and ?"
														 +"Order by totsal ASC");
			st.setString(1,s1);
			st.setString(2,s2);
			
			ResultSet rs = st.executeQuery();

			while(rs.next())
			{
				System.out.println(rs.getString(1)+"\t\t"+rs.getString(2)+"\t\t"+rs.getString(3)+"\t\t"+rs.getString(4)+"\t\t"+rs.getString(5)+"\t\t"+rs.getString(6));
			}
			con.close();		
			} catch (Exception e) {
				System.out.println(e);
			}

	}
	
	
}
