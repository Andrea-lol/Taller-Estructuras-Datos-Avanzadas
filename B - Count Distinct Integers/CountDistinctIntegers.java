/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package analisisdealgoritmos;

import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author Pocketcraft
 */
public class CountDistinctIntegers {

        public static void main(String[] args) {

            Scanner scanner = new Scanner(System.in);
            int input = Integer.parseInt(scanner.nextLine());
            String[] nums = scanner.nextLine().split(" ");

            
            int k = removeDuplicates(nums, input);
            
            
            System.out.print(k+"\n");
        }

        public static int removeDuplicates(String[] nums, int a) {
            if (nums.length == 0) {
                return 0;
            }
            int k = 0;
            Arrays.sort(nums);
            for (int i = 0; i < nums.length; i++) {
                if (Integer.parseInt(nums[i]) != Integer.parseInt(nums[k])) {
                    k++;
                    nums[k] = nums[i];
                }
            }
            return k + 1;
        }
    
}
