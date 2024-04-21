import java.util.ArrayList;
public class StepTracker
{
 private int minsteps, totalsteps;
 private int totaldays, activedays;
 public StepTracker(int steps){
  minsteps = steps;
  totalsteps = 0;
  totaldays = 0;
  activedays = 0;
 }
  public int activeDays(){
  return activedays;
 }
 public void addDailySteps(int dailystep){
  totalsteps += dailystep;
  totaldays++;
  if(dailystep >= minSteps){
   activedays++;
  }
 }
 public double averageSteps(){
 if(totaldays == 0){
 return 0.0;
}
else{
 return (double)totalSteps/totalDays;
}
 }
}
