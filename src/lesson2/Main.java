package Lesson2;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Tshirt tshirt1 = new Tshirt(ClothesSize.XXS, "red", 5000, Sex.men);
        Tshirt tshirt2 = new Tshirt(ClothesSize.M, "green", 15000, Sex.women);
        Dress dress1 = new Dress(ClothesSize.L, "red", 50000, Sex.women);
        Dress dress2 = new Dress(ClothesSize.XXS, "yellow", 12000, Sex.women);
        Trousers trousers1 = new Trousers(ClothesSize.XXS, "white", 7500, Sex.men);
        Trousers trousers2 = new Trousers(ClothesSize.L, "green", 9500, Sex.women);
        Tie tie1 = new Tie(ClothesSize.S, "black", 1200, Sex.men);
        Tie tie2 = new Tie(ClothesSize.XS, "wite", 200, Sex.men);
        Tie tie3 = new Tie(ClothesSize.M, "wite", 100, Sex.men);

        Clothes[] clothes = new Clothes[9];
        clothes[0] = tie1;
        clothes[1] = tie2;
        clothes[2] = tie3;
        clothes[3] = dress1;
        clothes[4] = dress2;
        clothes[5] = trousers1;
        clothes[6] = trousers2;
        clothes[7] = tshirt1;
        clothes[8] = tshirt2;

        Atelier atelier = new Atelier(clothes);

        System.out.println(Arrays.toString(atelier.womenChoice()));
        System.out.println(Arrays.toString(atelier.menChoice()));


    }
}
