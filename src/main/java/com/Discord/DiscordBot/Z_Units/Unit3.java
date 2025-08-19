package com.Discord.DiscordBot.Z_Units;

import com.Discord.DiscordBot.Units.Question;

import static com.Discord.DiscordBot.Units.QuestionBank.unit3Questions;

public class Unit3 {

    public static int numUnit3Questions;

    public static void initializeUnit3Questions() {

        // unit4Questions.add(new Question(
        //                "What is printed?\n```java\nint[] nums = {1, 2, 3, 4};\nSystem.out.println(nums[2]);\n```",
        //                "1", "2", "3", "4",
        //                "C", 4, 3000, "easy"));

        numUnit3Questions = unit3Questions.size();
        System.out.printf("There are %d questions in unit 3%n", numUnit3Questions);
    }

}
