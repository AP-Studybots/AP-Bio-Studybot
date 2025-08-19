package com.Discord.DiscordBot.Z_Units;

import static com.Discord.DiscordBot.Units.QuestionBank.unit6Questions;

public class Unit6 {

    public static int numUnit6Questions;

    public static void initializeUnit6Questions() {

        // unit4Questions.add(new Question(
        //                "What is printed?\n```java\nint[] nums = {1, 2, 3, 4};\nSystem.out.println(nums[2]);\n```",
        //                "1", "2", "3", "4",
        //                "C", 4, 3000, "easy"));

        numUnit6Questions = unit6Questions.size();
        System.out.printf("There are %d questions in unit 6%n", numUnit6Questions);

    }

}
