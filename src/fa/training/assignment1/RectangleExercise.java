/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fa.training.assignment1;

/**
 *
 * @author admin
 */
public class RectangleExercise {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] strings) {

        final double width = 5.5;
        final double height = 8.5;

        double area = width * height;
        double perimeter = 2 * (width + height);

        System.out.printf("Area is %.1f * %.1f = %.2f \n", width, height, area);
        System.out.printf("Perimeter is 2*(%.1f + %.1f) = %.2f \n", width, height, perimeter);

    }
}
