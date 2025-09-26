package com.jkk;

import com.jkk.crud.CRUDClass;

public class DBMain {
	public static void main(String[] args) {
		CRUDClass crud = new CRUDClass();

		// 1. 테이블 생성
		crud.createTable();

		// 2. 데이터 추가
		crud.insertUsers("1", "홍길동");
		crud.insertUsers("2", "일지매");

		// 3. 조회
		crud.selectUsers();

		// 4. 수정
		crud.updateUsers("2", "일지매_수정후");

		// 5. 삭제
		crud.deleteUsers("1");

		// 6. 다시 조회
		crud.selectUsers();
	}
}
