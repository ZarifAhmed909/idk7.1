import java.util.ArrayList;

public class Main{
    public static void main(String[] args){
        ArrayList<Integer> storage = new ArrayList<>() {{
            add(64);
            add(128);
            add(256);
            add(512);
        }};

        ArrayList<String>motherboard = new ArrayList<>() {{
            add("intel");
            add("asus");
            add("AMD");
            add("NVIDIA");
        }};

        ArrayList<Double> ram = new ArrayList<>() {{
            add(4.0);
            add(8.0);
            add(16.0);
            add(32.0);
        }};

        ArrayList<Boolean>bought = new ArrayList<>(){{
            add(false);
        }};

        ArrayList<gpu>gpus = new ArrayList<>() {{
            add(new gpu(motherboard.get(0),1000));
            add(new gpu(motherboard.get(1),2080));
            add(new gpu(motherboard.get(2),7000));
            add(new gpu(motherboard.get(3),3060));
        }};

        System.out.println("Hello! Welcome to my gaming PC shop. What would you like to buy?");
        while (bought.size()<17){

        }








    }
}
