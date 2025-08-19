package com.Discord.DiscordBot.Z_Units;

import static com.Discord.DiscordBot.Units.QuestionBank.unit5Questions;

public class Unit5 {

    public static int numUnit5Questions;

    public static void initializeUnit5Questions() {

        // unit4Questions.add(new Question(
        //                "What is printed?\n```java\nint[] nums = {1, 2, 3, 4};\nSystem.out.println(nums[2]);\n```",
        //                "1", "2", "3", "4",
        //                "C", 4, 3000, "easy"));

        numUnit5Questions = unit5Questions.size();
        System.out.printf("There are %d questions in unit 5%n", numUnit5Questions);

    }

}
