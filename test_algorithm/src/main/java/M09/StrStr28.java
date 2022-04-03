package M09;

//28. 实现 strStr()
public class StrStr28 {
    public int strStr(String haystack,String needle) {
        if (needle.equals("")) return 0;
        return KMP(haystack,needle);
    }

    public int KMP(String text,String pattern) {
        int n=text.length(),m=pattern.length();
        int[] next = new int[m];
        getnext(pattern,next);
        for (int i = 0,j=-1; i < text.length(); i++) {
            while (j!=-1 && pattern.charAt(j+1)!=text.charAt(i)) j=next[j];
            if (pattern.charAt(j+1)==text.charAt(i)) j+=1;
            if (j+1==pattern.length()) return i-j;
        }
        return -1;
    }

    private void getnext(String pattern,int[] next ){
        next[0]=-1;
        for (int i = 1,j=-1; i < pattern.length(); i++) {
            while (j!=-1 && pattern.charAt(j+1)!=pattern.charAt(i)) j=next[j];
            if (pattern.charAt(j+1)==pattern.charAt(i)) j+=1;
            next[i]=j;
        }
    }
}
