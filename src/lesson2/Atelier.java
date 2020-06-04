package lesson2;

import java.util.Arrays;

public class Atelier {
    private Clothes[] clothes;

    public Atelier(Clothes[] clothes) {
        this.clothes = clothes;
    }

    public Clothes[] getClothes() {
        return clothes;
    }

    public void setClothes(Clothes[] clothes) {
        this.clothes = clothes;
    }

    @Override
    public String toString() {
        return "Atelier{" +
                "clothes=" + Arrays.toString(clothes) +
                '}';
    }

    public Clothes[] womenChoice() {
        System.out.println("womenChoice:");
        Clothes[] dressWomen = new Clothes[clothes.length];
        int j = 0;
        for (Clothes clothe : clothes) {
            if (clothe instanceof ClothesWomen) {
                if (clothe.getSex().equals(Sex.women)) {
                    dressWomen[j] = clothe;
                    System.out.println(dressWomen[j]);
                    j++;
                }
            }
        }
        return dressWomen;
    }

    public Clothes[] menChoice() {
        System.out.println("menChoice: ");
        Clothes[] dressMen = new Clothes[clothes.length];
        int i = 0;
        for (Clothes clothe : clothes) {
            if (clothe instanceof ClothesMen) {
                if (clothe.getSex().equals(Sex.men)) {
                    dressMen[i] = clothe;
                    System.out.println(dressMen[i]);

                    i++;

                }
            }
        }
        return dressMen;
    }

}



