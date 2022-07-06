import java.util.*;
public class samenumber {
    public int[] solution(int []arr) {
        int[] answer = {};
        int[] temp = new int[arr.length];
        temp[0] = arr[0];
        int cnt=1;
        for(int i= 0; i<arr.length-1;i++) {
            if(arr[i]!=arr[i+1])
            {
                temp[cnt]=arr[i];
                cnt++;
                continue;
            }

        }
        answer = new int[temp.length];
        for(int i =0; i<temp.length-1;i++) {
            answer[i] = temp[i];
        }
        return answer;
    }
}