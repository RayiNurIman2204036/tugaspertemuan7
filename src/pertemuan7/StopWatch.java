/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pertemuan7;

import java.time.Duration;
import java.time.LocalTime;

public class StopWatch {
    private LocalTime startTime;
    private LocalTime endTime;
    
    public LocalTime getstartTime(){
        return startTime;
    }
    
    public LocalTime getendTime(){
        return endTime;
    }
    
    public StopWatch(){
        this.startTime= LocalTime.now();
    }
    
    public void stop(){
        this.endTime = LocalTime.now();
    }
    
    public long getElapsedTime(){
        Duration durasi = Duration.between(this.startTime , this.endTime);
        long milidetik = durasi.toMillis();
        return milidetik;
    }
}
