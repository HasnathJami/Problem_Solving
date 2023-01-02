import java.util.HashMap;
import java.util.Scanner;

public class AntonAndPolyhedrons {
    public static HashMap<String, Integer> initPolyhedronTypes() {
        HashMap<String, Integer> hm = new HashMap<>();
        hm.put("Tetrahedron", 4);
        hm.put("Cube", 6);
        hm.put("Octahedron", 8);
        hm.put("Dodecahedron", 12);
        hm.put("Icosahedron", 20);

        return hm;
    }

    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        HashMap<String, Integer> hm = initPolyhedronTypes();
        int t = inp.nextInt();
        int sum = 0;
        while (t-- > 0) {
            String s = inp.next();
            if (hm.containsKey(s)) {
                sum += hm.get(s);
            }
        }
        System.out.println(sum);
    }
}
