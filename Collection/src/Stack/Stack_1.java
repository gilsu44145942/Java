package Stack;

import java.util.Stack;

// 스택 (Stack) 클래스
// 후입선출 LIFO (=Last In Frist Out)
// 카드의 덱(deck)이 먼저 놓여진 카드가 나중에 선택되는 것과 동일
// 나중에 저장된 일이 먼저 실행되는 방식
// 주로 수행작업의 히스토리 저장(브라우저의 페이지)또는 재귀함수 처리등에 사용됨
public class Stack_1 {
    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();

        // #1.push 입력
        stack.push(2);
        stack.push(5);
        stack.push(3);
        stack.push(7);

        // #2.peak 읽기
        System.out.println(stack.peek()); //7

        // #3.search 탐색 및 확인 (대기번호 확인) (후입선출이기 때문에 끝에서 부터 출력)
        System.out.println(stack.search(7)); //1
        System.out.println(stack.search(3)); //2
        System.out.println(stack.search(5)); //3
        System.out.println(stack.search(2)); //4
        System.out.println(stack.search(1)); //-1(없는 경우 -1를 출력)

        // #4. pop (꺼내고 삭제)
        System.out.println(stack.pop()); //7
        System.out.println(stack.pop()); //3
        System.out.println(stack.pop()); //5
        System.out.println(stack.pop()); //2
        // System.out.println(stack.pop()); //오류 (삭제할 객체가 없음)

        System.out.println(stack.size()); //0

        // #5. boolean empty (비었는지 확인 참(true) 또는 거짓(false))
        System.out.println(stack.empty()); //true (비었다는 의미)


    }
}
