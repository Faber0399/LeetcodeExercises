class isSubsequence {
    public static boolean isSubsequence(String s, String t) {
        //s=s.toLowerCase();
        //t=t.toLowerCase();
        int valor=0;
        for (int i = 0; i < s.length(); i++) {
            valor = (t.indexOf(s.charAt(i),valor));
            if(valor==-1)break;
            valor++;
        }
        boolean variable;
        return variable=valor!=-1? true : false;
    }
    public static void main(String[] args) {
        String s = "axc";
        String t = "ahbgxc";
        

        System.out.println(isSubsequence(s,t));     
    }
}