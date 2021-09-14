/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Experimenting.Calculations;

import javax.swing.JOptionPane;
import java.util.concurrent.TimeUnit;
/**
 *
 * @author jjaac
 */
public class TimeToHours
{
    public static void main(String[] args)
    {
        long seconds = Long.parseLong(JOptionPane.showInputDialog("Enter seconds"));
        long hours = TimeUnit.SECONDS.toHours(seconds);
        long minutes = TimeUnit.SECONDS.toMinutes(seconds) - TimeUnit.HOURS.toMinutes(hours);
        seconds -= (TimeUnit.HOURS.toSeconds(hours) + TimeUnit.MINUTES.toSeconds(minutes));
        System.out.println("Hours: "+ hours +", Minutes: "+ minutes +", Seconds: "+ seconds);
    }
}
