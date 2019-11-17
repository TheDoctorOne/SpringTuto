package io.TheDoctorOne.JDBC;

import java.util.List;

import org.springframework.jdbc.core.JdbcTemplate;

public interface DatabaseAccess<E> {

    /**
     * @param template for setting the template
     */
    public void setJDBCTemplate(JdbcTemplate template);

    /**
     * Creates the table
     */
    public void createTableIfNotExists();

    /**
     * @param elements is the elements will be inserted
     */
    public void insert(String... elements) throws IndexOutOfBoundsException;

    /**
     * @param id to get the row according that id
     */
    public E get(String id);

    /**
     * @param id for the row deletion
     */
    public void delete(String id);

    /**
     * Get the rows
     */
    public List<E> list();

    /**
     * @param id is the id of the row that will be updated
     * @param elements is the elements which will be updated
     * @throws IndexOutOfBoundsException
     */
    public void update(String id, String... elements) throws IndexOutOfBoundsException;
}