import java.util.ArrayList;
public class StepTracker
{
 private int minsteps, totalsteps;
 private int totaldays, activedays;
 public StepTracker(int goal){
  minsteps = goal;
  totalsteps = 0;
  totaldays = 0;
  activedays = 0;
 }

 public void addDailySteps(int steps){
  totalsteps += steps;
  totaldays++;
  if(steps >= minsteps){
   activedays++;
  }
 }
   public int activeDays(){
  return activedays;
 }
 public double averageSteps(){
 if(totaldays == 0){
 return 0.0;
}
else{
 return (double)totalsteps/totaldays;
}
 }
}

