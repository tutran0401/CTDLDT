public class bai7 {
    int[] ar = new int[100];
for(
    int i = 0; i<arr.size();i++)

    {
        ar[arr.get(i)] = ar[arr.get(i)] + 1;
    }
 return Arrays.stream(ar).

    boxed().

    collect(Collectors.toList());
}
