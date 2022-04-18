//Driver program for class VoteRecorder
import java.util.Scanner;

public class VoteRecorderDemo {

    public static void main(String[] args)
    {
        VoteRecorder recorder = new VoteRecorder();
        System.out.println("The candidates are:");
        System.out.println(VoteRecorder.nameCandidatePresident1);
        System.out.println(VoteRecorder.nameCandidatePresident2);
        System.out.println(VoteRecorder.nameCandidateVicePresident1);
        System.out.println(VoteRecorder.nameCandidateVicePresident2);

        System.out.println("Enter number of voters: ");
        Scanner keyboard = new Scanner(System.in);
        int numberOfVoters = keyboard.nextInt();

        for(int i = 0; i < numberOfVoters; i++)
        {
            recorder.getAndConfirmVotes();
        }

        recorder.displayResults();

    }
}
