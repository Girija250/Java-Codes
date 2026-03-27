class numbers {
    int num[] = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20};
}

class prime extends numbers {
    int p_num[] = new int[num.length];
    int pos = 0;

    void prime_num() {
        for (int i = 0; i < num.length; i++) {
            if (num[i] <= 1) {
                continue;
            }

            int count = 0;
            for (int j = 2; j < num[i]; j++) {
                if (num[i] % j == 0) {
                    count++;
                }
            }

            if (count == 0) {
                p_num[pos] = num[i];
                pos++;
            }
        }
    }

    void display() {
        System.out.println("Prime numbers are:");
        for (int i = 0; i < pos; i++) {
            System.out.print(p_num[i] + " ");
        }
        System.out.println();
    }
}

class composite extends numbers {
    int c_num[] = new int[num.length];
    int pos = 0;

    void composite_num() {
        for (int i = 0; i < num.length; i++) {
            if (num[i] <= 1) {
                continue;
            }

            int count = 0;
            for (int j = 2; j < num[i]; j++) {
                if (num[i] % j == 0) {
                    count++;
                }
            }

            if (count != 0) {
                c_num[pos] = num[i];
                pos++;
            }
        }
    }

    void display() {
        System.out.println("Composite numbers are:");
        for (int i = 0; i < pos; i++) {
            System.out.print(c_num[i] + " ");
        }
        System.out.println();
    }
}

public class Hierarchical {
    public static void main(String[] args) {
        prime p = new prime();
        p.prime_num();
        p.display();

        composite c = new composite();
        c.composite_num();
        c.display();
    }
}