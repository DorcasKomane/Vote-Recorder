//Class to record votes

import java.util.Scanner;

public class VoteRecorder {

    //instance variables
    private int myVoteForPresident;     //0 = no choice, 1 = first candidate, 2 = second candidate
    private int myVoteForVicePresident; //0 = no choice, 1 = first candidate, 2 = second candidate

    //static variables
    public static String nameCandidatePresident1;
    public static String nameCandidatePresident2;
    public static String nameCandidateVicePresident1;
    public static String nameCandidateVicePresident2;
    public static int votesCandidatePresident1 = 0;
    public static int votesCandidatePresident2 = 0;
    public static int votesCandidateVicePresident1 = 0;
    public static int votesCandidateVicePresident2 = 0;

    //constructors
    public VoteRecorder()
    {
        nameCandidatePresident1 = "Annie";
        nameCandidatePresident2 = "Bob";
        nameCandidateVicePresident1 = "John";
        nameCandidateVicePresident2 = "Susan";
    }

    public void setCandidatePresident(String name1, String name2)
    {
        nameCandidatePresident1 = name1;
        nameCandidatePresident2 = name2;
    }

    public void setCandidateVicePresident(String name1, String name2)
    {
        nameCandidateVicePresident1 = name1;
        nameCandidateVicePresident2 = name2;
    }

    public static void resetVotes()
    {
        votesCandidatePresident1 = 0;
        votesCandidatePresident2 = 0;
        votesCandidateVicePresident1 = 0;
        votesCandidateVicePresident2 = 0;
    }


    public static void getCurrentVotePresident()
    {
        System.out.println("Total number of votes for " + nameCandidatePresident1 + " : " + votesCandidatePresident1);
        System.out.println("Total number of votes for " + nameCandidateVicePresident2 + " : " + votesCandidatePresident2);
    }

    public static void getCurrentVoteVicePresident()
    {
        System.out.println("Total number of votes for president: " + nameCandidateVicePresident1 + " : "  + votesCandidateVicePresident1);
        System.out.println("Total number of votes for " + nameCandidateVicePresident2 + " : "  + votesCandidateVicePresident2);
    }

    public void getAndConfirmVotes()
    {
        System.out.println("Enter your vote for Presidential candidate: ");
        System.out.println("0 = no choice, 1 = first candidate, 2 = second candidate");
        Scanner keyboard = new Scanner(System.in);
        myVoteForPresident = keyboard.nextInt();
        System.out.println("Enter your vote for Vice Presidential candidate: ");
        System.out.println("0 = no choice, 1 = first candidate, 2 = second candidate");
        myVoteForVicePresident = keyboard.nextInt();
        getVotes(myVoteForPresident, myVoteForVicePresident);
        confirmVotes();
        setMyVoteForPresident(myVoteForPresident);
        setMyVoteForVicePresident(myVoteForVicePresident);
    }

    public void displayResults()
    {
        getCurrentVotePresident();
        getCurrentVoteVicePresident();
    }

    public void getVotes(int myVoteForPresident, int myVoteForVicePresident)
    {
        System.out.println("Your vote for President: " + myVoteForPresident);
        System.out.println("Your vote for Vice President: " + myVoteForVicePresident);
    }

    private boolean confirmVotes()
    {
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Are you happy with your vote?");
        String response = keyboard.nextLine();

        if (response.equalsIgnoreCase("yes"))
            return true;
        else
            return false;
    }

    public void setMyVoteForPresident(int myVoteForPresident)
    {
        if (myVoteForPresident == 1)
            VoteRecorder.votesCandidatePresident1++;
        else if (myVoteForPresident == 2)
            VoteRecorder.votesCandidatePresident2++;
    }

    public void setMyVoteForVicePresident(int myVoteForVicePresident)
    {
        if (myVoteForVicePresident == 1)
            VoteRecorder.votesCandidateVicePresident1++;
        else if (myVoteForVicePresident == 2)
            VoteRecorder.votesCandidateVicePresident2++;
    }
    
}