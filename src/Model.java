
public class Model {
    String [] contents = new String[100];
    String [] statuses = new String[100];
    int size = 0;

    void add(String content) {
        contents[size] = content;
        statuses[size++] = "미완료";
    }


    void update(int i , String content) {

        contents[i] = content;
    }

    //미완료이면 완료로 바꾸기, 완료면 미완료로 바꾸기
    void status(int i) {
        if(statuses[i].equals("미완료")) {
            statuses[i] = "완료";
        }
        else{
            statuses[i] = "미완료";
        }
        }

    String delete(int i) {
        String deleted = contents[i];
        for (int j = i; j < size -1; j++) {
            contents[j] = contents[j +1];
            statuses[j] = statuses[j +1];
        }
        size--;
        return deleted;
    }


}
