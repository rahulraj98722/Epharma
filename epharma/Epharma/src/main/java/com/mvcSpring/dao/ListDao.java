package com.mvcSpring.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;

import com.mvcSpring.beans.Medicine;

public class ListDao {
	JdbcTemplate template;

	public void setTemplate(JdbcTemplate template) {
		this.template = template;
	}

	
	  public int save(Medicine l) { String
	  sql="insert into medicine(medName,medPrice,medicinePurpose,manfdate,expdate,stock) values('"
	  +l.getMedName()+"',"+l.getMedPrice()+",'"+l.getMedicinePurpose()+"','"+l.getManfdate()+
	  "','"+l.getExpdate()+"','"+l.getStock()+"' )"; return
	  template.update(sql);
	  
	  }
	  
	  public int update(Medicine l){ String
	  sql="update medicine set medName='"+l.getMedName()+"',medPrice="+l.getMedPrice()+",medicinePurpose='"
	  +l.getMedicinePurpose()+"',manfdate='"+l.getManfdate()+"',expdate='"+l.
	  getExpdate()+"',stock='"+l.getStock()+"' where medId="+l.getMedId()+
	  ""; return template.update(sql); }
	 
	 public Medicine getMedByname(String name){ String
	  sql="select * from medicine where name=?"; 
	 return template.queryForObject(sql,
	  new Object[]{name},new BeanPropertyRowMapper<Medicine>(Medicine.class)); }
	 
	 
	 
	  public Medicine getMedById(int medId){ String
	  sql="select * from medicine where medId=?"; return template.queryForObject(sql, new
	  Object[]{medId},new BeanPropertyRowMapper<Medicine>(Medicine.class)); }
	 
	public List<Medicine> getList() {
		return template.query("select * from medicine", new RowMapper<Medicine>() {
			public Medicine mapRow(ResultSet rs, int row) throws SQLException {
				Medicine e = new Medicine();
				e.setMedId(rs.getInt(1));
				e.setMedName(rs.getString(2));
				e.setMedPrice(rs.getInt(3));
				e.setMedicinePurpose(rs.getString(4));
				e.setManfdate(rs.getString(5));
				e.setExpdate(rs.getString(6));
				e.setStock(rs.getString(7));
				
				return e;

			}
		});
	}
	
	  public List<Medicine> getList1() { return template.
			  
	  query("select * from medicine where expdate >'10/09/2020'"
	  , new RowMapper<Medicine>() { public Medicine mapRow(ResultSet rs, int row)
	  throws SQLException { Medicine e = new Medicine(); e.setMedId(rs.getInt(1));
	  e.setMedName(rs.getString(2)); e.setMedPrice(rs.getInt(3));
	  e.setMedicinePurpose(rs.getString(4)); e.setManfdate(rs.getString(5));
	  e.setExpdate(rs.getString(6)); e.setStock(rs.getString(7)); return e;
	  
	  } }); }
	 
}
