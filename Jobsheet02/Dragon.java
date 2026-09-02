package Jobsheet02;

public class Dragon {
    int y; //digunakan untuk pergerakan atas dan bawah
    int x; //digunakan untuk pergerakan kiri dan kanan
    int direction; // atribut ini untuk menyimpan arah naga

    public Dragon(int y, int x, int direction) {
        this.y = y;
        this.x = x;
        this.direction = direction;
    }

    // method untuk menggerakkan naga
    public void changeDirection(int newDirection) {  //digunakan untuk menerima arah baru yang diinginkan dan mengubah atribut direction naga sesuai dengan arah tersebut.
        if (newDirection >= 1 && newDirection <= 4) { //mengecek arah naga
            direction = newDirection; 
        } else {
            System.out.println("Arah tidak valid. Gunakan 1 (atas), 2 (kanan), 3 (bawah), atau 4 (kiri).");
        }

    }

    //method untuk mengubah posisi naga berdasarkan arah yang ditentukan
    public void move(int steps) { //digunakan untuk menggerakkan naga berdasarkan arah dan jumlah langkah.
        switch (direction) { //digunakan untuk menentukan tindakan berdasarkan nilai direction
            case 1: // atas
                y -= steps;
                break; 
            case 2: // kanan
                x += steps;
                break;
            case 3: // bawah
                y += steps;
                break;
            case 4: // kiri
                x -= steps;
                break;
            default:
                System.out.println("Arah tidak valid.");             
        }             
    }

    public void printStatus() {
        System.out.println("Posisi Naga: (" + x + ", " + y + ")"); //Ini menampilkan nilai x dan y.
        System.out.print("Arah Naga: " + direction);
    }
}