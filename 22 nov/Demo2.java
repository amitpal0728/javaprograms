// program showing the concept of strings

class Demo2{
    public static void main(String args[]){
        String name = new String("Hello user how are you ? ");
        char ch[] = name.toCharArray();
        System.out.println(ch);
        for(char c : ch){
            System.out.println(c);
        }

        String words[] = name.split(" ");
        for(String word : words){
            System.out.println(word);
        }

        String newStr = String.join("--","22","nov ember","2023");
            System.out.println(newStr);
    }
}

