/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package millionare;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Game {

    private List<Player> questions;

    public Game() {

        questions = new ArrayList<>();

        setQuestions(QuestionGenerator.generate());
    }

    public List<Player> getQuestions() {
        return questions;
    }

    public void setQuestions(List<Player> questions) {
        this.questions = questions;
    }

    public Player getQuestionById(int id) {
        Player question = this.questions.get(id);
        System.out.println(question.getQuestionText());
        int counter = 1;
        for (String answer : question.getAnswers()) {
            System.out.println(counter + "." + answer);
            counter++;
        }
        
        return question;
    }

    public void end(Player player1, Player player2) {
    	
    	
    	
        System.out.println("Player 1 Won " + player1.getPoint() +" dollar");
        System.out.println("Player 2 Won " + player2.getPoint()+" dollar");
    	

    }
    
    public void run()
    {
     Player player1 = new Player();
        Player player2 = new Player();

        Scanner scan = new Scanner(System.in);
        boolean finish = false;
        boolean loop = false;
        int counter = 0;
        while (!finish) {
        	
            //First Question
            Player question = getQuestionById(counter);
            
            System.out.println("Player 1 Answer: ");
            int tmpPlayer1Answer = scan.nextInt();
            System.out.println("Player 2 Answer: ");
            int tmpPlayer2Answer = scan.nextInt();
          
            
            System.out.println("");
            System.out.println("");
            
            if (tmpPlayer1Answer == question.getCorrectAnswer()) {
                //System.out.println("Player 1 Won " + question.getPoint() + " dollar: ");
                player1.setPoint(player1.getPoint() + question.getPoint());

                if (tmpPlayer2Answer == question.getCorrectAnswer()) {
                    //System.out.println("Player 2 Won " + question.getPoint() + " dollar: ");
                    player2.setPoint(player2.getPoint() + question.getPoint());
                }

            }

            counter++;

            System.out.println("");
            System.out.println("");
           
            
            if (counter > 3) {
                finish = true;
            }

        }

       end(player1, player2);
    }

}
