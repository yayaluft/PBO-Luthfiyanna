package Praktikum02;

public class Dragon {
    int x;
    int y;
    int direction;

    public Dragon() {
        x = 0;
        y = 0;
        direction = 1;
    }

    public void changeDirection(int newDirection) {
        if (newDirection >= 1 && newDirection <= 4) {
            direction = newDirection;
        }
    }

    public void move(int steps) {
        switch (direction) {
            case 1:
                y += steps;
                break;
            case 2:
                x += steps;
                break;
            case 3:
                y -= steps;
                break;
            case 4:
                x -= steps;
                break;
        }
    }

    public void printStatus() {
        String arah;
        switch (direction) {
            case 1:
                arah = "Atas";
                break;
            case 2:
                arah = "Kanan";
                break;
            case 3:
                arah = "Bawah";
                break;
            case 4:
                arah = "Kiri";
                break;
            default:
                arah = "Tidak Valid";
        }
        System.out.println("Posisi: (" + x + ", " + y + ")");
        System.out.println("Direction: " + direction + " (" + arah + ")");
        System.out.println("-----------");
    }
}