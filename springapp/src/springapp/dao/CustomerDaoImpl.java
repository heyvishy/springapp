package springapp.dao;

import javax.sql.DataSource;

import org.springframework.dao.DataAccessException;
import org.springframework.jdbc.support.rowset.SqlRowSet;

public class CustomerDaoImpl extends BaseDao implements CustomerDao {
	
    private DataSource dataSource;


	public String getCustomerName() throws DataAccessException{
		String name ="general";
		
		String sql = "select LastName from Persons where P_Id=2";
		SqlRowSet rss = this.getJdbcTemplate().queryForRowSet(sql);
		while(rss.next()){
			name = rss.getString(1);
			break;
		}
		
		
		return name;

	}


}
