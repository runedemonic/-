import java.util.*;

public class voyage {
    public String solution(int n) {
        String answer = "";
        List<Integer> list = new ArrayList<>();
        int sum = 0;

        while(n != 0) {
            list.add(n % 10);
            sum += n % 10;
            n /= 10;
        }
        String[] temp = new String[list.size()];
        for (int i = 0; i <list.size() ; i++) {
            temp[i]=(list.get(i)+"+");
            if (i==(list.size()-1)){
                temp[i]=(list.get(i)+"="+sum);
            }

        }
        answer = String.join("",temp);

        return answer;
    }

    public static void main(String[] args) {
        voyage method = new voyage();
        System.out.println(method.solution(718253));
    }
}