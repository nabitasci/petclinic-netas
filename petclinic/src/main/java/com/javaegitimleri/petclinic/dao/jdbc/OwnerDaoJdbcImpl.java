package com.javaegitimleri.petclinic.dao.jdbc;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import com.javaegitimleri.petclinic.dao.OwnerDao;
import com.javaegitimleri.petclinic.model.Owner;
import com.javaegitimleri.petclinic.model.Rating;

@Repository
public class OwnerDaoJdbcImpl implements OwnerDao {

	@Autowired
	private JdbcTemplate jdbcTemplate;

	@Override
	public List<Owner> findAll() {
		String query = "select p.id, p.first_name, p.last_name, p.email, o.rating,p.version "
				+ "from t_owner o left join t_person p on o.id = p.id";
		RowMapper<Owner> rowMapper =  new RowMapper<Owner>() {

			@Override
			public Owner mapRow(ResultSet rs, int rowNum) throws SQLException {
				long id = rs.getLong("id");
				int version = rs.getInt("version");
				String fn = rs.getString("first_name");
				String ln = rs.getString("last_name");
				String email = rs.getString("email");
				Rating rt = Rating.values()[rs.getInt("rating")];
				Owner o = new Owner(fn, ln, email);
				o.setId(id);
				o.setVersion(version);
				o.setRating(rt);
				return o;
			}
		};
		
		return jdbcTemplate.query(query, rowMapper);
	}

	@Override
	public List<Owner> findByLastName(String lastName) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Owner> findByFirstNameAndLastName(String firstName, String lastName) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Owner findById(Long id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Owner findByEmail(String email) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Owner create(Owner owner) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Owner update(Owner owner) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void delete(Long id) {
		// TODO Auto-generated method stub

	}

}
