

public class Model {
    String [] contents = new String[100];
    String [] statuses = new String[100];
    int size = 0;

    void add(String content) {
        contents[size] = content;
        statuses[size++] = "미완료";
    }

    void upsdate(int i ,String content) {
        contents[i] = content;
    }

    void cstatus(int i) {
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
