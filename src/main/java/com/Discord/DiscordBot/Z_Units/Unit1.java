package com.Discord.DiscordBot.Z_Units;

import com.Discord.DiscordBot.Units.Question;

import java.util.ArrayList;

import static com.Discord.DiscordBot.Units.QuestionBank.unit1Questions;

public class Unit1 {

    public static int numUnit1Questions;

    // Replace unit4Questions with unit1Questions.add
    public static void initializeUnit1Questions() {
        // unit4Questions.add(new Question(
        //                "What is printed?\n```java\nint[] nums = {1, 2, 3, 4};\nSystem.out.println(nums[2]);\n```",
        //                "1", "2", "3", "4",
        //                "C", 4, 3000, "easy"));

        numUnit1Questions = unit1Questions.size();
        System.out.println(String.format("There are %d questions in unit 1", numUnit1Questions));
    }

}