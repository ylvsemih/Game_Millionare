/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package millionare;

import java.util.ArrayList;
import java.util.List;


public class QuestionGenerator {

    public static List<Player> generate() {
        List<Player> questionList = new ArrayList<>();

        String question1Text = "Water Boils on Which Degree";
        String question2Text = "What is the exact shape of world ";
        String question3Text = "Who is the conquerer of Istanbul )";
        String question4Text = "What is the biggest river in Latvia  ";

        //question block
        Player question1 = new Player();
        question1.setQuestionText(question1Text);

        ArrayList<String> answer1List = new ArrayList<>();
        answer1List.add("100");
        answer1List.add("90");
        answer1List.add("75");
        answer1List.add("60");

        question1.setAnswers(answer1List);

        question1.setPoint(100);
        question1.setCorrectAnswer(1);

        questionList.add(question1);

        //question block
        Player question2 = new Player();
        question2.setQuestionText(question2Text);

        ArrayList<String> answer2List = new ArrayList<>();
        answer2List.add("Ellipse");
        answer2List.add("Egg");
        answer2List.add("Circle");
        answer2List.add("Flat");

        question2.setAnswers(answer2List);

        question2.setPoint(150);
        question2.setCorrectAnswer(2);

        questionList.add(question2);

        //question block
        Player question3 = new Player();
        question3.setQuestionText(question3Text);

        ArrayList<String> answer3List = new ArrayList<>();
        answer3List.add("Abdülhamid");
        answer3List.add("Kanuni");
        answer3List.add("Fatih");
        answer3List.add("Osman");

        question3.setAnswers(answer3List);

        question3.setPoint(200);
        question3.setCorrectAnswer(3);

        questionList.add(question3);

        //question block
        Player question4 = new Player();
        question4.setQuestionText(question4Text);

        ArrayList<String> answer4List = new ArrayList<>();
        answer4List.add("Gauja");
        answer4List.add("Lielupe");
        answer4List.add("Misa");
        answer4List.add("Daugava");

        question4.setAnswers(answer4List);

        question4.setPoint(200);
        question4.setCorrectAnswer(4);

        questionList.add(question4);

        return questionList;

    }
}
