package finalProject;

public class Classes {

    String phrase = "";

    public Classes(String p){
        phrase = p;
    }

    public Classes(){
      
    }




    public String insert(String p, String word, int insertion ){
        String phrase1 = p.substring(0 , insertion );
        String phrase2 = p.substring( insertion );

        System.out.println(phrase1 + word + phrase2);

        return phrase1 + word + phrase2;
    }



    public String reverse(String p){
        String rev = "";
        for( int i = p.length()-1; i >=0 ; i-- ){
            rev = rev + p.charAt(i);
        }

    System.out.println(rev);

    return rev;

    }
    



    public void letterCounter( String p , String letter ){ 
        String temp = "";
        int count = 0;
        for( int i = 0; i <= p.length()-1; i++){

            temp = Character.toString(p.charAt(i));
            if ( temp.equals(letter) ){
                count ++;
            }
        }
        System.out.println("that number appears in your phrase " + count + " time(s)");
    }




    public String segment(String p , int start , int len ){
        String segments = p.substring(start , start + len );

        System.out.println(segments);
       
        return segments;
    }

}