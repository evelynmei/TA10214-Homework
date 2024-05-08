package hw4;

import java.util.Arrays;

//班上有8位同學,他們進行了6次考試結果如下:
//請算出每位同學考最高分的次數
public class Scores2DArray {
    public static void main(String[] args) {
        int[][] scores = {
                {10, 35, 40, 100, 90, 85, 75, 70},
                {37, 75, 77, 89, 64, 75, 70, 95},
                {100, 70, 79, 90, 75, 70, 79, 90},
                {77, 95, 70, 89, 60, 75, 85, 89},
                {98, 70, 89, 90, 75, 90, 89, 90},
                {90, 80, 100, 75, 50, 20, 99, 75}
        };
        int[] countTopScores = {0, 0, 0, 0, 0, 0, 0, 0}; //每人幾次最高分
        for (int i = 0; i < scores.length; i++) {
            int topScore = 0;
            int [] scoresCopy = Arrays.copyOf(scores[i], scores[i].length);
            Arrays.sort(scoresCopy);
            topScore = scoresCopy[scoresCopy.length - 1];
            for (int j = 0; j < scores[i].length; j++) {
                if(scores[i][j] == topScore){
                    countTopScores[j] += 1;
                }
            }
        }
        for (int i = 0; i < countTopScores.length; i++) {
            System.out.printf("%d號同學%d次最高分\n", i + 1, countTopScores[i]);
        }
    }
}