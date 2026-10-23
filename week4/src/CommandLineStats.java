public class CommandLineStats {
    static void printArray(int[] a) {
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i] + (i < a.length - 1 ? " " : "\n"));
        }
    }

    static int sum(int[] a) {
        int s = 0;
        for (int x : a) s += x;
        return s;
    }

    public static void main(String[] args) {
        if (args.length == 0) {
            System.out.println("No arguments given");
            return;
        }
        System.out.println("Arguments: " + String.join(" ", args));

        int[] nums = new int[args.length];
        for (int i = 0; i < args.length; i++) {
            nums[i] = Integer.parseInt(args[i]);
        }

        printArray(nums);
        int s = sum(nums);
        System.out.println("Sum: " + s);
        System.out.println("Average: " + (double) s / nums.length);
    }
}