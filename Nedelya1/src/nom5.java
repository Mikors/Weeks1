public class nom5 {
    public static void main(String[] args) {
        String[] tests = {"hi", "it's me", "and look to you"};
        for (String s : tests) {
            System.out.println(toUp(s));
        }
    }

    static String toUp(String s){
        char[] arr = s.toCharArray();
        boolean inWord = false;
        for (int i = 0; i< arr.length; i++) {
            if (arr[i] >= 97 && arr[i] <= 122) {
                if (inWord) {
                    continue;
                }
                arr[i] -= 32;
                inWord = true;
            } else {
                inWord = false;
            }
        }
        return new String(arr);
    }
    public void nom5() {
    }
}