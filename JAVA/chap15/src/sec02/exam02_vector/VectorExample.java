package sec02.exam02_vector;

import java.util.List;
import java.util.Vector;

public class VectorExample {

	public static void main(String[] args) {
		List<Board> list = new Vector<Board>();
				
		//주소(번지)추가
		list.add(new Board("제목1", "내용1", "글쓴이1")); // 인덱스0 
		list.add(new Board("제목2", "내용2", "글쓴이2")); // 인덱스1
		list.add(new Board("제목3", "내용3", "글쓴이3")); // 인덱스2
		list.add(new Board("제목4", "내용4", "글쓴이4")); // 인덱스3
		list.add(new Board("제목5", "내용5", "글쓴이5")); // 인덱스4
		
		list.remove(2);
		list.remove(3);
		
		//컬렉션의 데이타 보기
		for(int i=0; i<list.size(); i++) {
			Board board = list.get(i);
			System.out.println(board.subject + "\t" + board.content + "\t" + board.writer);
		}
		

	}

}
