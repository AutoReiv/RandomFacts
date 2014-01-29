package com.auopak.randomfacts;

import java.util.ArrayList;

import android.os.Bundle;
import android.app.Activity;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		
		Button buttonGenerate = (Button)findViewById(R.id.button1);
	    final TextView textGenerateNumber = (TextView)findViewById(R.id.textView1);
	    
	    final ArrayList<String> facts=new ArrayList<String>();
	    facts.add("Between 1942 and 1944, Academy Awards were made of plaster.");
	    facts.add("John Madden is an accomplished ballroom dancer.");
	    facts.add("One out of three employees who received a promotion use a coffee mug with the company logo on it.");
	    facts.add("About a third of all Americans flush the toilet while they're still sitting on it.");
	    facts.add("According to Genesis 1:20-22 the chicken came before the egg.");
	    facts.add("Soldiers from every country salute with their right hand.");
	    facts.add("The microwave oven was invented by mistake when an engineer testing a magnetron tube noticed that the radiation from it melted the chocolate bar he had in his pocket.");
	    facts.add("Moisture, not air, causes super glue to dry.");
	    facts.add("Only 14% of Americans say they've skinny dipped with the opposite sex.");
	    facts.add("\"60 Minutes\" on CBS is the only TV show to not have a theme song or music.");
	    facts.add("Half of all Americans live within 50 miles of their birthplace.");
	    facts.add("Most boat owners name their boats. The most popular boat name requested is Obsession.");
	    facts.add("100% of all lottery winners gain weight.");
	    facts.add("An average American will spend an average of 6 months during his lifetime waiting at red lights.");
	    facts.add("The Olympic flag's colors are always red, black, blue, green and yellow rings on a field of white. This is because at least one of those colors appears on the flag of every nation on the planet.");
	    facts.add("Cats can hear ultrasound.");
	    facts.add("In a recent survey, Americans revealed that banana was their favorite smell.");
	    facts.add("In all three Godfather films, when you see oranges, there is a death (or a very close call) coming up soon.");
	    facts.add("If you were to spell out numbers, you would you have to go until 1,000 until you would find the letter \"A\".");
	    facts.add("23% of employees say they have had sex in the office.");
	    facts.add("Bullet proof vests, fire escapes, windshield wipers and laser printers were all invented by women.");
	    facts.add("Married men change their underwear twice as often as single men.");
	    facts.add("There are more collect calls on Father's Day than any other day of the year.");
	    facts.add("Mel Blanc (voice of Bugs Bunny) was allergic to carrots.");
	    facts.add("40% of all people who come to a party in your home snoop in your medicine cabinet.");
	    facts.add("3.9% of all women surveyed say they never wear underwear.");
	    facts.add("Superman is featured on every episode of \"Seinfeld\", either by name or pictures on Jerry's refrigerator.");
	    facts.add("85% of the men who cheat on their wives die while having sex.");
	    facts.add("Every day more money is printed for Monopoly than for the US Treasury.");
	    facts.add("American Airlines saved $40,000 in 1987 by eliminating one olive from each salad served first class.");
	    facts.add("Percentage of Africa that is wilderness: 28");
	    facts.add("Percentage of North America that is wilderness: 38");
	    facts.add("Percentage of American men who say they would marry the same woman if they had it to do all over again: 80");
	    facts.add("Percentage of American women who say they would marry the same man: 50");
	    facts.add("Percentage of men who say they are happier after their divorce or separation: 58");
	    facts.add("Percentage of women who say they are happier: 85");
	    facts.add("Average life span of a major league baseball: 7 pitches");
	    facts.add("Percentage of bird species that are monogamous: 90");
	    facts.add("Percentage of mammal species that are monogamous: 3");
	    facts.add("Chances that a burglary in the United States will be solved: 1 in 7");
	    facts.add("One third of the land in the United States is owned by the government.");
	    facts.add("The hummingbird is the only bird that can fly backwards.");
	    facts.add("Antarctica is the only continent without reptiles or snakes.");
	    facts.add("An eagle can kill a young deer and fly away with it.");
	    facts.add("In the Caribbean there are oysters that can climb trees.");
	    facts.add("Intelligent people have more zinc and copper in their hair.");
	    facts.add("The world's youngest parents were 8 and 9 and lived in China in 1910.");
	    facts.add("The youngest pope was 11 years old.");
	    facts.add("Mark Twain didn't graduate from elementary school.");
	    facts.add("Proportional to their weight, men are stronger than horses.");
	    facts.add("Pilgrims ate popcorn at the first Thanksgiving dinner.");
	    facts.add("They have square watermelons in Japan - they stack better.");
	    facts.add("Iceland consumes more Coca-Cola per capita than any other nation.");
	    facts.add("Heinz Catsup leaving the bottle travels at 25 miles per year.");
	    facts.add("It is possible to lead a cow upstairs but not downstairs.");
	    facts.add("Armadillos can be housebroken.");
	    facts.add("The first Fords had engines made by Dodge.");
	    facts.add("A mole can dig a tunnel 300 feet long in just one night.");
	    facts.add("Peanuts are one of the ingredients in dynamite.");
	    facts.add("Ancient Egyptians slept on pillows made of stone.");
	    facts.add("A hippo can open its mouth wide enough to fit a 4 foot tall child inside.");
	    facts.add("A quarter has 119 grooves on its edge, a dime has one less groove.");
	    facts.add("A hummingbird weighs less than a penny.");
	    facts.add("Until 1796, there was a state in the United States called Franklin. Today it is known as Tennessee.");
	    facts.add("The flashing warning light on the cylindrical Capitol Records tower spells out HOLLYWOOD in Morse code.");
	    facts.add("Every time you lick a stamp, you're consuming 1/10 of a calorie.");
	    facts.add("The average person has over 1,460 dreams a year.");
	    facts.add("One in every 4 Americans has appeared on television.");
	    facts.add("The average American will eat about 11.9 pounds of cereal per year.");
	    facts.add("Over 1,000 birds a year die from smashing into windows.");
	    facts.add("The State of Florida is bigger than England.");
	    facts.add("Ants stretch when they wake up in the morning.");
	    facts.add("It's against the law to have a pet dog in Iceland.");
	    facts.add("Thomas Edison, light bulb inventor, was afraid of the dark.");
	    facts.add("During your lifetime, you'll eat about 60,000 pounds of food. That's the weight of about 6 elephants.");
	    facts.add("Some ribbon worms will eat themselves if they can't find any food.");
	    facts.add("Dolphins sleep with one eye open.");
	    facts.add("The world's oldest piece of chewing gum is 9000 years old.");
	    facts.add("In space, astronauts cannot cry, because there is no gravity, so the tears can't flow.");
	    facts.add("About 3000 years ago, most Egyptians died by the time they were 30.");
	    facts.add("More people use blue toothbrushes than red ones.");
	    facts.add("A sneeze travels out your mouth at over 100 m.p.h.");
	    facts.add("Your ribs move about 5 million times a year, every time you breathe.");
	    facts.add("In the White House, there are 13,092 knives, forks and spoons.");
	    facts.add("Slugs have 4 noses.");
	    facts.add("Recycling one glass jar saves enough energy to watch TV for 3 hours.");
	    facts.add("Lightning strikes about 6,000 times per minute on this planet.");
	    facts.add("Owls are the only birds who can see the color blue.");
	    facts.add("The average American drinks about 600 sodas a year.");
	    facts.add("It's against the law to slam your car door in Switzerland.");
	    facts.add("There wasn't a single pony in the Pony Express, just horses.");
	    facts.add("Honeybees have hair on their eyes.");
	    facts.add("A jellyfish is 95 percent water.");
	    facts.add("In Bangladesh, kids as young as 15 can be jailed for cheating on their finals.");
	    facts.add("A company in Taiwan makes dinnerware out of wheat, so you can eat your plate.");
	    facts.add("The elephant is the only mammal that can't jump.");
	    facts.add("The penguin is the only bird who can swim, but not fly.");
	    facts.add("The most common name in the world is Mohammed.");
	    facts.add("Q is the only letter in the alphabet that does not appear in the name of any of the United States.");
	    facts.add("America once issued a 5-cent bill.");
	    facts.add("You'll eat about 35,000 cookies in your lifetime.");
	    facts.add("Babe Ruth wore a cabbage leaf under is cap to keep him cool. He changed it every 2 innings.");
	    facts.add("Fortune cookies were actually invented in America, in 1918, by Charles Jung.");
	    facts.add("A giraffe can clean its ears with its 21-inch tongue.");
	    facts.add("Chewing gum while peeling onions will keep you from crying.");
	    facts.add("The pitches that Babe Ruth hit for his last-ever homerun and that Joe DiMaggio hit for his first-ever homerun where thrown by the same man.");
	    facts.add("Bats always turn left when exiting a cave.");
	    facts.add("The praying mantis is the only insect that can turn its head.");
	    facts.add("In Tokyo, they sell toupees for dogs.");
	    facts.add("There are over 52.6 million dogs in the U.S.");
	    facts.add("Dogs and cats consume almost $7 billion worth of pet food a year.");
	    facts.add("Baby robins eat 14 feet of earthworms every day.");
	    facts.add("The Pentagon has twice as many restrooms as necessary. When it was built, segregation was still in place in Virginia, so separate restrooms for blacks and whites were required by law.");
	    facts.add("In England, in the 1880's, \"Pants\" was considered a dirty word.");
	    facts.add("Most dust particles in your house are made from dead skin.");
	    facts.add("In 2003, there were 86 days of below-freezing weather in Hell, Michigan");
	    
	    buttonGenerate.setOnClickListener(new OnClickListener(){

	    	  @Override
	    	  public void onClick(View v) {
	    		  int randomIndex = (int)(Math.random() * facts.size());
	    		  String newFact=facts.get(randomIndex);
	    		  textGenerateNumber.setText(newFact);
	    	  }
	    });
	}
}

	


