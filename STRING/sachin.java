class Sachin {
    public boolean isPalindrome(String s) {

        // 🔹 1. String clean karo (sirf letters & numbers)
        s = s.toLowerCase().replaceAll("[^a-z0-9]", "");

        // 🔹 2. Tumhara original logic
        for (int i = 0; i < s.length() / 2; i++) {
            int n = s.length();
            if (s.charAt(i) != s.charAt(n - 1 - i)) {
                return false; // 🔥 ye missing tha
            }
        }
        return true;
    }

    public static void main(String args[]) {
        String s = "A man, a plan, a canal: Panama";
        Sachin obj = new Sachin();
        System.out.println(obj.isPalindrome(s));
    }
}
