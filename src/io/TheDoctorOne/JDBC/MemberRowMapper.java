package io.TheDoctorOne.JDBC;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

public class MemberRowMapper implements RowMapper<Member> {

    @Override
    public Member mapRow(ResultSet rs, int rowNumber) throws SQLException {
        Member member = new Member();
        member.setName(rs.getString("name"));
        member.setJob(rs.getString("job"));
        member.setAge(rs.getString("age"));
        return member;
    }

}