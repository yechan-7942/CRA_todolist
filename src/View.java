//사용자에게 보이는거니까 어떤 값을 입력 받을지, 보여줄지
import java.util.Scanner;

public class View {


        Scanner s = new Scanner(System.in);

        public void menu() {
            System.out.println("====TODO LIST====");
            System.out.println("1.목록보기");
            System.out.println("2.생성");
            System.out.println("3.수정");
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
            int get =  s.nextInt();
            s.nextLine();
            return get;
        }

        String getString(String sc) {
            System.out.println(sc);
            return s.nextLine();
        }


        void print(String s){

            System.out.println(s);
        }







}
