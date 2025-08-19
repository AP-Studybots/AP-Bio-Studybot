package com.Discord.DiscordBot.Z_Units;

import com.Discord.DiscordBot.Units.Question;

import static com.Discord.DiscordBot.Units.QuestionBank.unit4Questions;

public class Unit4 {

    public static int numUnit4Questions;

    public static void initializeUnit4Questions() {

        // unit4Questions.add(new Question(
        //                "What is printed?\n```java\nint[] nums = {1, 2, 3, 4};\nSystem.out.println(nums[2]);\n```",
        //                "1", "2", "3", "4",
        //                "C", 4, 3000, "easy"));

        numUnit4Questions = unit4Questions.size();
        System.out.printf("There are %d questions in unit 4%n", numUnit4Questions);

    }

}
