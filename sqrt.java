public class sqrt {
    public long solution(long n) {
        Double sqrt = Math.sqrt(n);
        if(sqrt == sqrt.intValue())
            return (long) Math.pow(Math.sqrt(n)+1,2);
        else
            return -1;
    }
}
