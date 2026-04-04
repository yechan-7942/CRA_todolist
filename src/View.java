
import java.util.Scanner;

public class View {


        Scanner s = new Scanner(System.in);

        public void menu() {
            System.out.println("====TODO LIST====");
            System.out.println("1.목록보기");
            System.out.println("2.생성");
            System.out.println("3.추가");
            System.out.println("4.삭제");
            System.out.println("5.종료");
            System.out.println("메뉴를 선택하세요: ");
        }

        void showlist(Model m) {
            System.out.println("[Todo List]");
            if(m.size ==0){
                System.out.println("할일이 없습니다");
                return;
            }
            for(int i = 0; i < m.size; i++){
                System.out.println((i+1) + " " + m.contents[i] + " " + m.statuses[i]);
            }
        }

        int getInt() {
            try{
                return Integer.parseInt(s.nextLine());
            }
            catch(Exception e){
                return -1;
            }
        }

        String getString(String sc) {
            System.out.println("추가할 할일 내용을 입력하세요:");
            return s.nextLine();
        }

        void print(String s){
            System.out.println(s);
        }







}
