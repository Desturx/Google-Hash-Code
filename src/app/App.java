package app;

import java.util.ArrayList;

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("============");
        System.out.println("TEST DE LECTURA");
        System.out.println("============");

        ReadFile r = new ReadFile("test.txt", "[,]");

        ArrayList<String[]> test = r.read();

        for(int i = 0; i < test.size(); i++) {
            for(int j = 0; j < test.get(i).length; j++) {
    
                System.out.print(test.get(i)[j]);
                
                if(j != test.get(i).length -1) {
                    System.out.print("--");
                }

            }
            System.out.println();
        }


    }
}