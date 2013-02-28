package springapp.dao;

import javax.sql.DataSource;

import org.springframework.dao.DataAccessException;
import org.springframework.dao.support.DaoSupport;
import org.springframework.jdbc.support.rowset.SqlRowSet;

public class CustomerDaoImpl extends BaseDao implements CustomerDao {
	
    private DataSource dataSource;


	public String getCustomerName() throws DataAccessException{
		String name ="general";
		
		String sql = "select Name from Customer where Id=2";
		SqlRowSet rss = this.getJdbcTemplate().queryForRowSet(sql);
		while(rss.next()){
			name = rss.getString("Name");
			break;
		}
		
		
		return name;

	}


}
