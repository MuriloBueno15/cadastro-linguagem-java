import java.util.ArrayList;

    public class Main {
        public static void main(String[] args){
            ArrayList<String> linguagens = new ArrayList<>();
            linguagens.add("Java");
            linguagens.add("Python");
            linguagens.add("JavaScript");
            linguagens.add("C++");
            System.out.println("O total de linguagens é: " + linguagens.size());
            for (int i = 0; i< linguagens.size(); i++){
                System.out.println((i+1) + " - " + linguagens.get(i));
            }
    }

}
