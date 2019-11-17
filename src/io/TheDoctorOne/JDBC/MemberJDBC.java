package io.TheDoctorOne.JDBC;

import java.util.List;

import org.springframework.dao.DataAccessException;
import org.springframework.jdbc.core.JdbcTemplate;

public class MemberJDBC implements DatabaseAccess<Member> {
    private JdbcTemplate jdbc;

    @Override
    public void setJDBCTemplate(JdbcTemplate template) {
        jdbc = template;
    }

    @Override
    public void createTableIfNotExists() {
        String SQL = "CREATE TABLE Member IF NOT EXISTS(" +
            "id INT NOT NULL AUTO_INCREMENT, " +
            "name VARCHAR(32) NOT NULL, " +
            "age INT NOT NULL" + 
            "job VARCHAR(32) NOT NULL " + 
            "PRIMARY KEY (id) " +
            ");";
        try{
            jdbc.execute(SQL);
            System.out.println("Table Created.");
        } catch (DataAccessException e) {
            System.out.println("Table Exists.");
        }
    }

    
    @Override
    /**
    * @param elements are name, age, job in order
    */
    public void insert(String... elements) throws IndexOutOfBoundsException {
        String name = elements[0];
        String age = elements[1];
        String job = elements[2];
        String SQL = "INSERT IN TO Member(name, age, job) VALUES (?, ?, ?)";
        jdbc.update(SQL, name, age, job);
        System.out.println("New entry added. Name = " + name);
    }

    @Override
    public Member get(String id) {
        String SQL = "SELECT * FROM Member WHERE id = ?";
        return jdbc.queryForObject(SQL, new Object[]{id}, new MemberRowMapper());
    }

    @Override
    public void delete(String id) {
        String SQL = "DELETE FROM Member WHERE id = ?";
        jdbc.update(SQL);
        System.out.println("Deleted. id = " + id);
    }

    @Override
    public List<Member> list() {
        String SQL = "SELECT * FROM Member";
        return jdbc.query(SQL, new MemberRowMapper());
    }

    @Override
    /**
    * @param id is for member id
    * @param elements is for the name, age, job in order
    */
    public void update(String id, String... elements) throws IndexOutOfBoundsException {
        String name = elements[0];
        String age = elements[1];
        String job = elements[2];
        String SQL = "UPDATE Member SET name = ?, age = ?, job = ? WHERE id = ?";
        jdbc.update(SQL, name, age, job);
        System.out.println("Updated. id = " + id);
    }

}