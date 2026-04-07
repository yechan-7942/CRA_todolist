
public class Controller {
    Model m = new Model();
    View v = new View();

    void run() {
        while (true) {
            v.menu();
            int choice = v.getInt();

            if (choice == 1) {
                v.showlist(m);
            }
            else if (choice == 2) {
                m.add(v.getString("내용 :"));
                v.print("추가되었습니다");
            }

            else if (choice == 3) {
                v.showlist(m);
                int i = v.getInt() - 1;
                v.print("1. 내용수정 2. 상태변경");
                if (v.getInt() == 1) {
                    m.update(i, v.getString1("새 내용 :"));
                } else {
                    m.status(i);
                    v.print("수정되었습니다");
                }
            }

            else if (choice == 4) {
                v.showlist(m);
                int i = v.getInt() -1;
                v.print(m.delete(i) + "항목이 삭제되었습니다");
            }

            else if (choice == 5) {
                v.print("종료합니다");
                return;
            }

        }


    }
}
