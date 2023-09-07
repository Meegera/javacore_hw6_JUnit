package org.example_junit;

import java.io.IOException;
import java.util.Arrays;

public class Main {

    public static void main(String[] args) throws IOException {
        int[][] teams = {
                {45, 31, 24, 22, 20, 17, 14, 13, 12, 10},
                {31, 18, 15, 12, 10, 8, 6, 4, 2, 1},
                {51, 30, 10, 9, 8, 7, 6, 5, 2, 1}
        };

        int[] nationalTeam = mergeAll(teams);
        System.out.println(Arrays.toString(nationalTeam)); // [51, 45, 31, 31, 30, 24, 22, 20, 18, 17]
    }

    /**
     * Метод для слияния всех команд в одну национальную
     */
    public static int[] mergeAll(int[][] teams) {
        if (teams.length == 0) {
            throw new IllegalArgumentException("The teams array is empty");
        }

        int[] result = teams[0];
        for (int i = 0; i < teams.length - 1; i++) {
            result = merge(result, teams[i + 1]);
        }
        return result;
    }

    /**
     * Метод для слияния двух команд в одну
     */
    public static int[] merge(int[] teamA, int[] teamB) {
        int[] result = new int[10];
        int iA = 0;
        int iB = 0;

        for (int i = 0; i < 10; i++) {
            if (teamA[iA] >= teamB[iB]) {
                result[i] = teamA[iA];
                iA++;
            } else {
                result[i] = teamB[iB];
                iB++;
            }
        }

        return result;
    }
}