Scanner scanner = new Scanner(System.in);
int n = scanner.nextInt();
int m = scanner.nextInt();
a = new int[n][m];

for (int step = 0; step < n * m; step++) {
    int i = step / m;
    int j = step % m;
    
    a[i][j] = i * j;
}