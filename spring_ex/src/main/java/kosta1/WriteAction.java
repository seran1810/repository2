package kosta1;

import javax.inject.Inject;

import org.springframework.beans.factory.annotation.Autowired;

public class WriteAction implements Action {
@Autowired
	
	private Service service;
    
    
	

	public WriteAction() {
		
	}


	public WriteAction(Service service) {
		
		this.service = service;
	}


	@Override
	public void writeAction1() {
		System.out.println("Write Action 입니다.");
        service.insertBoard();

	}

}
