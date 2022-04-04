import java.sql.Array;

public class AsoAraApI {
    public static void main(String[] args) {
      //  float f = 20d + 20.02f;
       // long n = 10 + 2L;
        //long n = 10 + 2L;


       /* List<Integer> numbers = new ArrayList<>();
        numbers.add(42);
        numbers.add(63);
        numbers.add(13);
        numbers.add(10);
        double sum = numbers.stream().mapToDouble(i -> Double.parseDouble(i).sum() ;
      //  System.out.println(sum);
      //  OptionalDouble min = numbers.stream().mapToDouble(i -> Double.parseDouble(i)).min();
        if (min.isPresent()){
            System.out.println(min.getAsDouble());
        }else{
            System.out.println("No value");
        }

        Stream<Integer>  stream = numbers.stream();

        int [] numbersArray = new int []{42, 63, 13, 10};
        IntStream stream1 = Arrays.stream(numbersArray);*/











        /*List<String> words = new ArrayList<>();
        words.add("cats");
        words.add("dog");
        words.add("budnonethewiser");
        words.add("orange");
        words.add("apple");
        Collections.sort(words, (o1,o2) -> Integer.compare(o1.length(), o2.length()));
        System.out.println(String.join(" ", words));

        List<String> filtered = new ArrayList<>();
        for (String word:
            words ) {
            if (word.endsWith("e")){
                filtered.add(word);
            }
        }

        //Stream<String> stream = ;
        List<String> efiltered  = words.stream()
                .filter(w -> w.endsWith("e"))
                .filter(w -> w.length() <= 5)
                .map(String::toUpperCase)
                .sorted((a, b) -> a.compareTo(b))
                .sorted((a, b) -> Integer.compare(a.length(), b.length()) )
                .collect(Collectors.toList());

        String[] filltredArray = filtered.toArray(new String[filtered.size()  ]);*/
    //    char[] array = new char[0];
      //  char[] array = new char[10000000000000];
        long[] array;
        array = new long[3];
        Array[] array2 = new Array[0];
        char[] array1 = { 'a', 'b', 'c', 'd' };
        char[] characters;
        char a = 'a';
        //zed
        char z = 'z';
        char e = 'e';
        char d = 'd';

        characters = new char[]{a, z, e, d};
        //char[] arrayy = new char[-1];

        System.out.println(createCube().toString());
    }
    public static int[][][] createCube() {
        // write your code here
        final int[] array1={0,1,2};
        final int[] array2={3,4,5};
        final int[] array3={6,7,8};

        new int[2][3][4];

         return threeDimArray;
    }
//reases by n * column num [j = 0, 1, 2].
//Set the elements arr[i][j][k] = k + (n * j)
    }