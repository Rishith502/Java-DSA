public class DataTypes {
    public static void main(String[] args) {
        int a =5;
        int b =6;             // 4 bytes = 32 bits (-2,147,483,648 to 2,147,483,647)
        char c = 'A';         // 2 bytes = 16 bits (0 to 65,535 (Unicode))
        String str = "Rishith";
        System.out.println(str);
        byte i = 125;         // 1 byte = 8 bits (-128 to 127)
        short j = 27582;      // 2 bytes = 16 bits (-32,768 to 32,767)
        long d = 9845435;     // 8 bytes = 64 bits (-9,223,372,036,854,775,808 to 9,223,372,036,854,775,807)
        float e = 55;         // 4 bytes = 32 bits (~±3.4 × 10³⁸) , Precision: ~6–7 digits
        double f = 542.090;   // 8 bytes = 64 bits (~±1.7 × 10³⁰⁸), Precision: ~15–16 digits
        boolean g = true;
        char h = 'R';
        System.out.println(h);
    }
}
