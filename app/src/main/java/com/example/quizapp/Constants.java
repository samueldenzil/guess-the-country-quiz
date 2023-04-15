package com.example.quizapp;

import java.util.ArrayList;
import java.util.List;

public class Constants {

    private static final String USER_NAME = "user_name";
    private static final String TOTAL_QUESTIONS = "total_questions";
    private static final String CORRECT_ANSWER = "correct_answer";

    public static List<Question> getQuestionsList() {
        List<Question> questionList = new ArrayList<>();
        // 1
        questionList.add(new Question(
                1,
                "What country does this flag belong to?",
                R.drawable.ic_flag_of_argentina,
                new String[]{"Argentina", "Australia", "Armenia", "Austria"},
                0)
        );

        // 2
        questionList.add(new Question(
                2,
                "What country does this flag belong to?",
                R.drawable.ic_flag_of_australia,
                new String[]{"Angola", "Austria", "Australia", "Armenia"},
                2)
        );

        // 3
        questionList.add(new Question(
                3,
                "What country does this flag belong to?",
                R.drawable.ic_flag_of_brazil,
                new String[]{"Belarus", "Belize", "Brunei", "Brazil"},
                3)
        );

        // 4
        questionList.add(new Question(
                4,
                "What country does this flag belong to?",
                R.drawable.ic_flag_of_belgium,
                new String[]{"Bahamas", "Belgium", "Barbados", "Belize"},
                1)
        );

        // 5
        questionList.add(new Question(
                5,
                "What country does this flag belong to?",
                R.drawable.ic_flag_of_fiji,
                new String[]{"Gabon", "France", "Fiji", "Finland"},
                2)
        );

        // 6
        questionList.add(new Question(
                6,
                "What country does this flag belong to?",
                R.drawable.ic_flag_of_germany,
                new String[]{"Germany", "Georgia", "Greece", "none of these"},
                0)
        );

        // 7
        questionList.add(new Question(
                7,
                "What country does this flag belong to?",
                R.drawable.ic_flag_of_denmark,
                new String[]{"Dominica", "Egypt", "Denmark", "Ethiopia"},
                2)
        );

        // 8
        questionList.add(new Question(
                8,
                "What country does this flag belong to?",
                R.drawable.ic_flag_of_india,
                new String[]{"Ireland", "Iran", "Hungary", "India"},
                3)
        );

        // 9
        questionList.add(new Question(
                9,
                "What country does this flag belong to?",
                R.drawable.ic_flag_of_new_zealand,
                new String[]{"Australia", "New Zealand", "Tuvalu", "United States of America"},
                1)
        );

        // 10
        questionList.add(new Question(
                10,
                "What country does this flag belong to?",
                R.drawable.ic_flag_of_kuwait,
                new String[]{"Kuwait", "Jordan", "Sudan", "Palestine"},
                0)
        );

        return questionList;
    }

    public static String getUserName() {
        return USER_NAME;
    }

    public static String getTotalQuestions() {
        return TOTAL_QUESTIONS;
    }

    public static String getCorrectAnswer() {
        return CORRECT_ANSWER;
    }
}
