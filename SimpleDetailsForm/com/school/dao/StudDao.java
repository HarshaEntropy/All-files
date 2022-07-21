package com.school.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import com.school.beans.Student;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
public class StudDao {
    JdbcTemplate template;

    public void setTemplate(JdbcTemplate template) {
        this.template = template;
    }
    public int save(Student p){
        String sql="insert into `School`.`StudentDetails`(`Name`, `Email`, `Gender`, `PhoneNum`) values('"+p.getName()+"','"+p.getEmail()+"','"+p.getGender()+"','"+p.getPhoneNum()+"')";
        return template.update(sql);
    }
    public int update(Student p){
        String sql="update `School`.`StudentDetails` set `Name`='"+p.getName()+"', `Email`='"+p.getEmail()+"',`Gender`='"+p.getGender()+"', `PhoneNum`='"+p.getPhoneNum()+"' where (`id`='"+p.getId()+"')";
        return template.update(sql);
    }
    public void delete(int id){
        String sql="delete from `School`.`StudentDetails` where id='"+id+"'";
        template.update(sql);
    }
    public Student getStudById(int id){
        String sql="select * from `School`.`StudentDetails` where id=?";
        return template.queryForObject(sql, new Object[]{id},new BeanPropertyRowMapper<Student>(Student.class));
    }
    public List<Student> getStudents(int pageid,int total){
        return template.query("select * from `School`.`StudentDetails` limit "+(pageid-1)+","+total,new RowMapper<Student>(){
            public Student mapRow(ResultSet rs, int row) throws SQLException {
                Student e=new Student();
                e.setId(rs.getInt(1));
                e.setName(rs.getString(2));
                e.setEmail(rs.getString(3));
                e.setGender(rs.getString(4));
                e.setPhoneNum(rs.getString(5));
                return e;
            }
        });
    }
}
