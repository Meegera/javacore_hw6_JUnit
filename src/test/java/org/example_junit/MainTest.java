package org.example_junit;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MainTest {

    @Test
    void mergeAll(){
        int[][] teams = {{45, 5, 4, 4, 3, 3, 2, 2, 1, -1},
                {32, 12, 9, 8, 6, 6, 0, 0, 0, 0},
                {1, 1, 1, 1, 1, 0, 0, 0, 0, 0}};

        int[] result = Main.mergeAll(teams);
        Assertions.assertArrayEquals(result, new int[]{45, 32, 12, 9, 8, 6, 6, 5, 4, 4});

    }

    @Test
    void mergeAll_throwsException() {
        int[][] teams = {};
        assertThrows(IllegalArgumentException.class, () -> {
            Main.mergeAll(teams);
        });
    }

    @Test
    void merge() {
        int[] team1 = {31, 18, 15, 12, 10, 8, 6, 4, 2, 1};
        int[] team2 = {51, 30, 10, 9, 8, 7, 6, 5, 2, 1};

        int[] result = Main.merge(team1, team2);
        Assertions.assertArrayEquals(result, new int[]{51, 31, 30, 18, 15, 12, 10, 10, 9, 8});
    }
}