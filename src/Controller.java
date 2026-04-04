
public class Controller {
    Model m = new Model();
    View v = new View();

    void run(){

        v.menu();
                case 1 -> v.showlist(m);

                case 2 -> {
                    m.add(v.getString("내용 :"));
                    v.print("추가되었습니다");
                }

                case 3 -> {
                    v.showlist(m);
                    int i = v.getInt() - 1;
                    v.print("1. 내용수정 2. 상태변경");
                    if (v.getInt() == 1) {
                        m.upsdate(i, v.getString("새 내용 :"));
                    } else {
                        m.cstatus(i);
                        v.print("수정되었습니다");
                    }
                }
                case 4 -> {
                    v.showlist(m);
                    int i = v.getInt() - 1;
                    v.print(m.delete(i) + "항목이 삭제되었습니다");
                }

                case 5 -> {
                    v.print("종료합니다");
                    return;
                }

        }



}
