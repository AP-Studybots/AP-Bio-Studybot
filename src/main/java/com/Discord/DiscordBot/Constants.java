package com.Discord.DiscordBot;

import com.Discord.DiscordBot.Z_Units.*;
import net.dv8tion.jda.api.EmbedBuilder;
import net.dv8tion.jda.api.entities.MessageEmbed;
import net.dv8tion.jda.api.events.message.MessageReceivedEvent;

import java.util.ArrayList;
import java.util.Arrays;

public class Constants {

    // Change these prefixes to the said AP prefix. Ex: for AP HAG, change prefix to !hag and slashPrefix to hag.
    public static String prefix = "!bio";
    public static String slashPrefix = "bio"; // Yea you have to put a / before this everytime

    public static int numUnits = 8; // The number of units the course has. Max of 25 units or else options crash

    public static int unitQuestionTimeoutInMinutes = 3; // (No Change) - Should be 3
    public static int unitQuestionIntervalCheckInSeconds = 30; // (No Change) - Should be 30

    public static int testTimeoutInMinutes = 30; // (No Change) - Should be 30
    public static int testIntervalCheckInMinutes = 5; // (No Change) - Should be 5

    public static int reportCooldown = 10 * 1000 * 60; // (No Change) - 10 minutes(or 600,000ms) for report cooldown

    public static int percentageFor3 = 42; // The percent you need to score a 3 or higher on the AP test

    public static String[] titles = {"Level 1 Sleeper", "Level 2 Learner", "Level 3 Casual", "Level 4 Honored", "Level 5 AP Deity"}; // (No Change) - Profile Titles

    public static int[] pointTitles = {0, 100, 250, 500, 1000}; // (No Change) - Points until next title

    public static int[] scorePercents = {77, 61, 42, 23}; // The percents to score a 5, 4, 3, and 2

    // (No Change) - Collegeboard logo
    public static String collegeBoardThumbnail = "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcQN2KG3StxIW0KW9EZP4pbSYbW-_1pJw9YtdR3HsZnyGTu1as-kFCJusA-qDROINnG9vJI&usqp=CAU";

    // Picture of the AP course(AP classroom picture)
    public static String APPicture = "https://img.youtube.com/vi/ZVyoFZRMxbg/maxresdefault.jpg\n";

    // To invite the bot to your server
    public static String botInviteLink = "https://discord.com/oauth2/authorize?client_id=1407653965176377424&permissions=2147503104&integration_type=0&scope=bot";

    // (No Change) - Integrated AI prompt
    public static String COMMAND_GUIDE_PROMPT =
            "You are the built-in help guide and study assistant for the " + slashPrefix.toUpperCase() + "-Studybot.\n" +
                    "\nYour two main roles are:\n" +
                    "1. Command Guide — Explain only the specific command(s) the user asks about: how they work, required/optional parameters, and give at least one example.\n" +
                    "2. Study Helper — Answer user questions related to AP " + prefix + " content.\n" +
                    "\nNotes:\n" +
                    "- Users may sometimes ask off-topic questions. You may answer politely, but don’t be mean. Only mention your dual purpose if they go off-topic.\n" +
                    "- Keep responses under 1000 characters.\n" +
                    "- Present information in a clear, concise format.\n" +
                    "- When commands have parameters, explain what they do and what happens if left blank.\n" +
                    "- Never use, repeat, or acknowledge offensive/derogatory language (including disguised/bypassed slurs). Always check responses for safety.\n" +
                    "\nCommand details:\n" +
                    "- " + prefix + "<number>: Sends a question from the specified AP" + Constants.slashPrefix.toUpperCase() + " unit (1–" + numUnits + "). Example: !" + prefix + "1 sends a Unit 1 question.\n" +
                    "- /" + slashPrefix + "-practice-question: Slash version of " + prefix + "<number>. Optional param: unit (1–" + numUnits + "). Blank → random unit.\n" +
                    "- /" + slashPrefix + "-test: Starts a quiz. Optional params: number of questions (must be 5, 10, 15, 20, or 50; default 10), unit (1–" + numUnits + "), blank → all units).\n" +
                    "- " + prefix + "-questionbank: Shows all questions.\n" +
                    "- " + prefix + "-info: Overview of the AP course.\n" +
                    "- " + prefix + "-resources: Study resources.\n" +
                    "- " + prefix + "-report <Your message>: Report a bug or issue with the bot. There is a " +
                    "- /" + slashPrefix + "-help: Lists all commands.\n" +
                    "- /" + slashPrefix + "-ask: Ask AI a question directly.\n" +
                    "- /" + slashPrefix + "-profile: Displays your profile. Optional param: @mention of another user to view their profile.\nHere is their response: ";

    // Change this with whatever AP course this bot is - no need to change botInviteLink, as its already changed
    public static MessageEmbed createResourcesEmbed() {
        EmbedBuilder embed = new EmbedBuilder()
                .setTitle("📚 AP " + Constants.slashPrefix.toUpperCase() + " Study Resources")
                .setDescription("Here are some valuable resources to help you succeed in AP Biology:")
                .setColor(0x27ae60) // green-ish for biology
                .setThumbnail(Constants.collegeBoardThumbnail)

                // Official College Board Resources
                .addField("🎓 Official College Board Resources",
                        "• [Course Overview](https://apstudents.collegeboard.org/courses/ap-biology)\n" +
                                "• [Course Description](https://apcentral.collegeboard.org/pdf/ap-biology-course-and-exam-description.pdf)\n" +
                                "• [Past Exam Questions](https://apcentral.collegeboard.org/courses/ap-biology/exam)\n" +
                                "• [AP Classroom](https://myap.collegeboard.org/) (Requires teacher login)", false)

                // Video Tutorials
                .addField("📺 Video Tutorials",
                        "• [College Board AP Biology Playlist](https://www.youtube.com/playlist?list=PLoGgviqq4845jZR0MgqV8OdX27HPbm0lr)\n" +
                                "• [Khan Academy AP Biology](https://www.khanacademy.org/science/ap-biology)\n" +
                                "• [Bozeman Science AP Biology](https://www.youtube.com/playlist?list=PLFCE4D99C4124A27A)", false)

                // Practice & Study Sites
                .addField("🧪 Practice & Study Sites",
                        "• [AP Biology Course Notes](https://www.course-notes.org/Biology)\n" +
                                "• [Albert.io AP Biology Practice](https://www.albert.io/ap-biology)\n" +
                                "• [Quizlet AP Biology Flashcards](https://quizlet.com/subject/ap-biology/)", false)

                // Additional Help
                .addField("🆘 Additional Help",
                        "• [CliffsNotes AP Biology Study Guide](https://www.cliffsnotes.com/study-guides/ap/biology)\n" +
                                "• [Crash Course Biology](https://www.youtube.com/playlist?list=PL3EED4C1D684D3ADF)\n" +
                                "• [Fiveable AP Biology](https://library.fiveable.me/ap-bio)", false)

                // Bot Invite
                .addField("🤖 Bot Invite",
                        "[Invite this bot to your server](" + Constants.botInviteLink + ")", false)

                .setFooter("Good luck with your studies! 🍀");

        return embed.build();
    }


    // (No Change) - The total number of questions in the units
    public static int sum;

    // Change this to whatever AP course info you want
    public static void SendAvailableQuestions(MessageReceivedEvent event) {

        EmbedBuilder embed = new EmbedBuilder();
        embed.setTitle("📚 Available AP Biology Practice Questions 📚");
        embed.setThumbnail(Constants.APPicture);
        embed.setColor(0x27ae60); // green-ish for biology

        embed.setDescription(String.format(
                "**Total Questions:** %d\n\nUse `!" + Constants.slashPrefix + "<number>`,  `/" + Constants.slashPrefix + "-practice-question`, or `/" +
                        Constants.slashPrefix + "-test` to start practicing!\n----------------------------------------------------", sum
        ));

        embed.addField("**Unit 1:** Chemistry of Life",
                String.format(
                        "🔹 **%d questions**\nFocuses on atoms, molecules, macromolecules, water properties, and chemical reactions.\n\u200B",
                        Unit1.numUnit1Questions),
                false);

        embed.addField("**Unit 2:** Cell Structure & Function",
                String.format(
                        "🔹 **%d questions**\nCovers cell organelles, membrane transport, cell communication, and cell energetics.\n\u200B",
                        Unit2.numUnit2Questions),
                false);

        embed.addField("**Unit 3:** Genetics & Heredity",
                String.format(
                        "🔹 **%d questions**\nIncludes Mendelian genetics, Punnett squares, DNA replication, transcription, and translation.\n\u200B",
                        Unit3.numUnit3Questions),
                false);

        embed.addField("**Unit 4:** Cell Communication & Cell Cycle",
                String.format(
                        "🔹 **%d questions**\nFocuses on cell signaling, cell cycle regulation, checkpoints, and cancer biology.\n\u200B",
                        Unit4.numUnit4Questions),
                false);

        embed.addField("**Unit 5:** Evolution",
                String.format(
                        "🔹 **%d questions**\nCovers natural selection, speciation, phylogenetics, and population genetics.\n\u200B",
                        Unit5.numUnit5Questions),
                false);

        embed.addField("**Unit 6:** Diversity of Life",
                String.format(
                        "🔹 **%d questions**\nIncludes prokaryotes, eukaryotes, protists, plants, fungi, and animal diversity.\n\u200B",
                        Unit6.numUnit6Questions),
                false);

        embed.addField("**Unit 7:** Ecology",
                String.format(
                        "🔹 **%d questions**\nFocuses on ecosystems, energy flow, biogeochemical cycles, and population dynamics.\n\u200B",
                        Unit7.numUnit7Questions),
                false);

        embed.addField("**Unit 8:** Physiology",
                String.format(
                        "🔹 **%d questions**\nCovers animal structure and function, homeostasis, plant systems, and feedback mechanisms.\n\n" +
                                "[Visit Our Website](https://customdiscordbots.org)\n" +
                                "Contact <@840216337119969301> for any questions",
                        Unit8.numUnit8Questions),
                false);

        embed.setFooter("All questions are student-created! Please report if you see any mistakes!");

        event.getChannel().sendMessageEmbeds(embed.build()).queue();
    }



    // (No Change) - Possible end of test messages
    public static final ArrayList<String> FIVE_SCORE_MESSAGES = new ArrayList<>(Arrays.asList("Great job! You're at the top of your game!", "Excellent work! Keep it up!", "Fantastic effort! You nailed it!", "Outstanding performance! Well done!", "You crushed it! Congratulations!", "Superb! You're truly excellent!", "Amazing job! You're a star!", "Bravo! That’s an impressive score!", "You did wonderfully! Keep shining!", "Exceptional! You're one of the best!", "Phenomenal work! Proud of you!", "Top-notch job! Keep soaring!", "Magnificent! You’re on fire!", "Splendid! You should be proud!", "Impressive! You worked hard and it shows!", "Remarkable! Keep pushing those limits!", "Wonderful! You aced it!", "Superb performance! Way to go!", "Terrific! You set the bar high!", "Brilliant! You deserve all the praise!"));
    public static final ArrayList<String> FOUR_SCORE_MESSAGES = new ArrayList<>(Arrays.asList("Good job! You're doing really well!", "Nice work! Keep it up!", "Solid effort! You're almost there!", "Well done! You're on the right track!", "Great progress! Keep pushing forward!", "You're doing a good job! Stay focused!", "Good going! A bit more and you’ll ace it!", "Nice job! Keep building on this!", "Well played! You're making steady progress!", "Good work! Keep practicing!", "You're doing well! Keep it consistent!", "Strong performance! Keep improving!", "You're getting there! Keep at it!", "Good effort! Keep striving!", "Nice results! You're showing great potential!", "Well done! Keep aiming higher!", "Good job! You're almost at the top!", "Solid work! Keep moving forward!", "You're doing a great job! Keep it steady!", "Good going! You're making progress!"));
    public static final ArrayList<String> THREE_SCORE_MESSAGES = new ArrayList<>(Arrays.asList("Good effort! Keep working and you'll improve!", "You're making progress! Stay motivated!", "Not bad! Keep practicing and you'll get better!", "Keep it up! Every bit of practice helps!", "You're on the right path! Don't give up!", "Nice try! Keep pushing yourself!", "Decent work! Keep aiming higher!", "You're getting there! Keep at it!", "Solid attempt! Keep learning!", "Keep improving! You're doing okay!", "Keep focused! Improvement takes time!", "You're doing fine! Stay consistent!", "Good start! Keep building your skills!", "You're making steady progress! Keep going!", "Keep practicing! You're on your way!", "You're doing alright! Keep pushing!", "Keep working hard! You can do this!", "Don't stop now! Practice makes perfect!", "You're on your way! Stay determined!", "Nice progress! Keep it up!"));
    public static final ArrayList<String> TWO_SCORE_MESSAGES = new ArrayList<>(Arrays.asList("Keep trying! Practice will help you improve!", "Don't be discouraged! Keep working hard!", "You can do better! Keep pushing forward!", "Stay motivated! Improvement is a journey!", "Keep practicing! You'll get there!", "Hang in there! Keep putting in effort!", "Keep at it! Every step counts!", "Don't give up! Keep learning!", "Focus and practice! You can improve!", "Keep going! Persistence pays off!", "Stay positive! Keep working on your skills!", "Keep striving! You're making progress!", "Don't lose hope! Keep practicing!", "Work hard! Improvement takes time!", "Keep focused! You'll get better!", "Stay determined! Keep trying!", "Keep moving forward! You can improve!", "Keep practicing! Believe in yourself!", "Stay patient! Progress is progress!", "Keep pushing! You're learning!"));
    public static final ArrayList<String> ONE_SCORE_MESSAGES = new ArrayList<>(Arrays.asList("Don't give up! You can improve!", "Keep trying! Every effort counts!", "Stay positive! Practice helps!", "Keep working! You’ll get better!", "Don’t lose hope! Keep going!", "Keep pushing! Improvement takes time!", "Stay determined! Keep practicing!", "Keep at it! Progress is progress!", "Believe in yourself! Keep trying!", "Keep focused! You’re learning!", "Keep moving forward! Don’t quit!", "Every step helps! Stay strong!", "Work hard! You’ll improve!", "Keep practicing! You can do it!", "Stay motivated! Keep pushing!", "Keep going! Don’t be discouraged!", "Stay patient! You’re making progress!", "Keep striving! You’re getting there!", "Stay positive! Keep at it!", "Don’t give up! You’ve got this!"));

    // Good luck with your studies!
}
