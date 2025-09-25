package task;

import java.util.Scanner;

/**
 * ClassName:Score
 * Package:task
 * Description:It's the end of the semester and you got your grades from three classes: Geometry, Algebra, and Physics.
 * Create a program that:
 * Reads the grades of these 3 classes (Grades range from 0 - 10)
 * Calculate the average of your grades
 * Example: Geometry = 6, Algebra = 7, Physics = 8
 * Output: average_score = 7
 *
 * @Author:带刀侍卫
 * @Create:2025/9/18-2:59
 * @Version:1.0
 */
public class Score {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        try {
            int geometry = readScore(scanner, "Geometry");
            int algebra = readScore(scanner, "Algebra");
            int physics = readScore(scanner, "Physics");

            int average = (geometry + algebra + physics) / 3;
            System.out.println("average_score: " + average);
        } catch (Exception e) {
            System.out.println(e);
        } finally {
            scanner.close();
        }
    }

    /**
     * 读取 0-10 的分数，输错就反复提示
     */
    private static int readScore(Scanner sc, String subject) {
        while (true) {
            System.out.print("Please enter " + subject + " score (0-10): ");
            if (sc.hasNextInt()) {
                int score = sc.nextInt();
                if (score >= 0 && score <= 10) {
                    return score;
                }
            } else {
                sc.next();
            }
            System.out.println("Invalid! Please re-enter (0-10).");
        }

    }
}
