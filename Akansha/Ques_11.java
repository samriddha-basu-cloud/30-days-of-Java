class Eleventh {
    public static void main(String[] args) {
    int n = 10, fT = 0, sT = 1;
        System.out.println("Fibonacci Series till " + n + " terms:");
    
        for (int i = 1; i <= n; ++i) {
          System.out.print(fT + ", ");
          int nextTerm = fT + sT;
          fT = sT;
          sT = nextTerm;
        }
      }
}
