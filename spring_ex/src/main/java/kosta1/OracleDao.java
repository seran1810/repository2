package kosta1;




import org.springframework.stereotype.Repository;

@Repository
public class OracleDao implements Dao {

	@Override
	public void insertBoard() {
		System.out.println("Oracle Dao 입니다.");
		
	}

}
