package kosta1;

import javax.inject.Inject;

import org.springframework.beans.factory.annotation.Autowired;

@org.springframework.stereotype.Service
public class WriteService implements Service {
	
	@Autowired
	private Dao dao;
	
	

	public WriteService() {
		
	}



	public WriteService(Dao dao) {
		
		this.dao = dao;
	}



	@Override
	public void insertBoard() {
		System.out.println("writeservice 입니다.");
	    dao.insertBoard();

	}

}
