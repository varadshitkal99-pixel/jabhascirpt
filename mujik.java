import javax.sound.sampled.*;
import java.io.File;
import java.io.IOException;
import java.util.Scanner;
import javax.sound.sampled.UnsupportedAudioFileException;
import javax.sound.sampled.LineUnavailableException;

public class mujik {
    public static void main(String[] args) {
        String path = "Lady - Hear Me Tonight_spotdown.org.wav";
        File file = new File(path);

        try (Scanner scanner = new Scanner(System.in);
                AudioInputStream audioInputStream = AudioSystem.getAudioInputStream(file)) {

            Clip clip = AudioSystem.getClip();
            clip.open(audioInputStream);
            String response = "";
            while(!response.equals("Q")){

                System.out.println("P = play");
                System.out.println("S = Pause");
                System.out.println("R = Reset");
                System.out.println("Q = Quit");

                response = scanner.next().toUpperCase();

               switch (response){
                   case "P" -> clip.start();
                   case "S" -> clip.stop();
                   case "R" -> clip.setMicrosecondPosition(0);
                   case "Q" -> clip.close();
                   default -> System.out.println("Invalid choice");
               }


            }



        } catch (IOException e) {
            System.out.println("something went wrong");

        }catch ( LineUnavailableException e ){
            System.out.println("unable to access");
        }catch (UnsupportedAudioFileException e){
            System.out.println("file format not supported");
        }finally {
            System.out.println("End!");
        }

    }
}
