package com.Discord.DiscordBot.Z_Units;

import com.Discord.DiscordBot.Units.Question;

import static com.Discord.DiscordBot.Units.QuestionBank.unit2Questions;

public class Unit2 {

    public static int numUnit2Questions;

    public static void initializeUnit2Questions() {

// unit4Questions.add(new Question(
        //                "What is printed?\n```java\nint[] nums = {1, 2, 3, 4};\nSystem.out.println(nums[2]);\n```",
        //                "1", "2", "3", "4",
        //                "C", 4, 3000, "easy"));

        numUnit2Questions = unit2Questions.size();
        System.out.printf("There are %d questions in unit 2%n", numUnit2Questions);
    }



}
