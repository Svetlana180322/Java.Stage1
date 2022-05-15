/**
  * JКласс Object. Homework - 1
  *
  *@author Svetlana Budzinskaia
  *@version 15.05.2022
  */
  
public class LessonJavaCoreHomework {
    public static void main(String[] args) {
        Team T1 = new Team("Winners", new String[]{"First", "Second", "Third", "Fourth"});
        Challenge[] Challenges = new Challenge[2];
        Challenges[0] = new Challenge("First");
        Challenges[1] = new Challenge("Second");
        Course C1 = new Course("Hard course", Challenges);
        C1.ChallengeIt(T1);
        T1.TellAll();
        T1.TellSuccess();
        }
}
class Team {
    private String Name;
    public String SuccessHistory;
    public String AllHistory;
    public String[] Participants;
    public Team(String Name, String[] Participants){
        this.Name = Name;
        this.Participants = Participants;
        }
    public void TellSuccess() {
        System.out.println(this.SuccessHistory);
    }
    public void TellAll() {
        System.out.println(this.AllHistory);
    }
}
class Course {
    private String Name;
    private Challenge[] Courses;
    public Course(String Name, Challenge[] Courses) {
        this.Name = Name;
        this.Courses = Courses;
    }
    public void ChallengeIt(Team Team){
        int TeamSize = Team.Participants.length;
        int CoursesQuantity = this.Courses.length;
        for (int x = 0; x < TeamSize; x++) {
            for (int y = 0; y < CoursesQuantity; y++) {
                if (Team.Participants[x] == this.Courses[y].Name) {
                    Team.SuccessHistory = Team.SuccessHistory + " particiant " + Team.Participants[x] + " won Challenge " + this.Courses[y];
                }
                Team.AllHistory = Team.AllHistory + " particiant " + Team.Participants[x] + " tried Challenge " + this.Courses[y];
            }
        }
    }
}
class Challenge {
    public String Name;
    public Challenge(String Name) {
        this.Name = Name;
    }
}