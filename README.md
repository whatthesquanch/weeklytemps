# weeklytemps
This pseudocode outlines the steps of the program, including inputting daily average temperatures, displaying them, and calculating the weekly average if "week" is entered.

// Initialize empty ArrayLists for daysOfWeek and dailyTemperatures
ArrayList<String> daysOfWeek
ArrayList<Double> dailyTemperatures

// Input daily average temperatures and days for each day of the week
for i from 0 to 6 do
Display "Enter day of the week (e.g., Monday): "
Read day
Add day to daysOfWeek

Display "Enter daily average temperature for " + day + ": "
Read temperature
Add temperature to dailyTemperatures

end for

// Display the temperatures for each day and weekly average if "week" is entered
Display "Enter 'week' to display weekly average: "
Read input

if input is equal to "week" then
Set weeklySum to 0

for i from 0 to 6 do
Display daysOfWeek[i] + ": " + dailyTemperatures[i] + "°C"
Add dailyTemperatures[i] to weeklySum
end for

Set weeklyAverage to weeklySum / 7
Display "Weekly Average Temperature: " + weeklyAverage + "°C"
else
Display "Invalid input. Exiting program."
end if

![image](https://github.com/whatthesquanch/weeklytemps/assets/146876837/00d4aa49-99eb-4de4-8d40-24aaef168745)
