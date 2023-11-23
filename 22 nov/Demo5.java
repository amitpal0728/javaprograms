// program showing the concept of strings
class Demo5{
    public static void main(String args[]){
        String str = "Hello User How are you ? ";
        char ch[] = str.toCharArray();
        for(int i=0;i<str.length()/2;i++){
            char c = ch[i];
            ch[i] = ch[str.length()-1-i];
            ch[str.length()-1-i] = c;
        }       
        System.out.println(ch);
    }
}