import java.io.File;
import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.DocumentBuilder;
import org.w3c.dom.Document;
import org.w3c.dom.NodeList;
import org.w3c.dom.Node;
import org.w3c.dom.Element;
import org.w3c.dom.NamedNodeMap;

public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int warningCount = 0;
		int errorCount = 0;
		String aboutInput, aboutDescription = "";
		ArrayList<Integer>errorArray = new ArrayList<Integer>();

		String errorEmail = ("[a-zA-Z0-9_.+-]+@[a-zA-Z0-9-]+\\.[a-zA-Z0-9-.]+");
		String urlValidate = "\\b(https?|ftp|file)://[-a-zA-Z0-9+&@#/%?=~_|!:,.;]*[-a-zA-Z0-9+&@#/%=~_|]";
		String urlValidate2 = "www[.][-A-Za-z0-9+&amp;@#/%?=~_()|!:,.;]*[-A-Za-z0-9+&amp;@#/%=~_()|]";
		
		  try {

			    // Change File to load a different XML file //
			  
			    File fXmlFile = new File("C:/Users/Matthew/Documents/userInfo.xml");
			
			    // Change File to load a different XML file //  
			    
			    DocumentBuilderFactory dbFactory = DocumentBuilderFactory.newInstance();
				DocumentBuilder dBuilder = dbFactory.newDocumentBuilder();
				Document doc = dBuilder.parse(fXmlFile);
						
				doc.getDocumentElement().normalize();

				System.out.println(doc.getDocumentElement().getNodeName());
						
				NodeList nList = doc.getElementsByTagName("users");
							
				System.out.println("----------------------------");

				for (int temp = 1; temp < nList.getLength(); temp++) {

					Node nNode = nList.item(temp);
							
					System.out.println("\nCurrent Element :" + nNode.getNodeName());
				
							
					if (nNode.getNodeType() == Node.ELEMENT_NODE) {

						Element eElement = (Element) nNode;
						
						// Main Profile Start // 
						
						
						System.out.println("First Name : " + eElement.getElementsByTagName("id").item(0).getTextContent());
						System.out.println("First Name : " + eElement.getElementsByTagName("firstName").item(0).getTextContent());
						System.out.println("Last Name : " + eElement.getElementsByTagName("lastName").item(0).getTextContent());
						System.out.println("Nick Name : " + eElement.getElementsByTagName("nickName").item(0).getTextContent());
						System.out.println("Title : " + eElement.getElementsByTagName("title").item(0).getTextContent());
						System.out.println("Looking For : " + eElement.getElementsByTagName("lookingfor").item(0).getTextContent());
						System.out.println("Age Between : " + eElement.getElementsByTagName("ageBetween").item(0).getTextContent());
						System.out.println("Country : " + eElement.getElementsByTagName("country").item(0).getTextContent());
						System.out.println("Postal Code : " + eElement.getElementsByTagName("postalCode").item(0).getTextContent());
						System.out.println("Ethnicity : " + eElement.getElementsByTagName("ethnicity").item(0).getTextContent());
						System.out.println("Height : " + eElement.getElementsByTagName("height").item(0).getTextContent());
						System.out.println("Body Type : " + eElement.getElementsByTagName("bodyType").item(0).getTextContent());
						System.out.println("Hair Color : " + eElement.getElementsByTagName("hairColor").item(0).getTextContent());
						System.out.println("Eye Color : " + eElement.getElementsByTagName("eyeColor").item(0).getTextContent());
						System.out.println("Relationship : " + eElement.getElementsByTagName("relationship").item(0).getTextContent());
						System.out.println("Have Children : " + eElement.getElementsByTagName("haveChildren").item(0).getTextContent());
						System.out.println("Want Children : " + eElement.getElementsByTagName("wantChildren").item(0).getTextContent());
						System.out.println("Religion : " + eElement.getElementsByTagName("religion").item(0).getTextContent());
						System.out.println("Field of Study : " + eElement.getElementsByTagName("fieldOfStudy").item(0).getTextContent());
						System.out.println("Occupation : " + eElement.getElementsByTagName("occupation").item(0).getTextContent());
						System.out.println("Education : " + eElement.getElementsByTagName("education").item(0).getTextContent());
						System.out.println("Income : " + eElement.getElementsByTagName("income").item(0).getTextContent());
						System.out.println("Smokes : " + eElement.getElementsByTagName("smokes").item(0).getTextContent());
						System.out.println("Drinks : " + eElement.getElementsByTagName("drinks").item(0).getTextContent());
						
						
						System.out.println("\nAbout me : " + eElement.getElementsByTagName("about").item(0).getTextContent());
						System.out.println("\nDescription : " + eElement.getElementsByTagName("description").item(0).getTextContent() + "\n");
						
						// Detail Profile Start //
						
						System.out.println("Vegetarian : " + eElement.getElementsByTagName("vegetarian").item(0).getTextContent());
						System.out.println("Gourmet : " + eElement.getElementsByTagName("gourmet").item(0).getTextContent());
						System.out.println("Meat Lover : " + eElement.getElementsByTagName("meatLover").item(0).getTextContent());
						System.out.println("Sweets : " + eElement.getElementsByTagName("sweets").item(0).getTextContent());
						System.out.println("Halal : " + eElement.getElementsByTagName("halal").item(0).getTextContent());
						System.out.println("Balanced : " + eElement.getElementsByTagName("balanced").item(0).getTextContent());
						System.out.println("Fast Food : " + eElement.getElementsByTagName("fastFood").item(0).getTextContent());
						System.out.println("Kosher : " + eElement.getElementsByTagName("kosher").item(0).getTextContent());
						System.out.println("Special Diet : " + eElement.getElementsByTagName("specialDiet").item(0).getTextContent());
						System.out.println("Travel for Fun : " + eElement.getElementsByTagName("travelFun").item(0).getTextContent());
						System.out.println("Travel for Work : " + eElement.getElementsByTagName("travelWork").item(0).getTextContent());
						System.out.println("Humor : " + eElement.getElementsByTagName("humor").item(0).getTextContent());
						System.out.println("Work Habits : " + eElement.getElementsByTagName("workHabits").item(0).getTextContent());
						System.out.println("Physical Fitness : " + eElement.getElementsByTagName("physicalFitness").item(0).getTextContent());
						System.out.println("Political : " + eElement.getElementsByTagName("political").item(0).getTextContent());
						System.out.println("Airline : " + eElement.getElementsByTagName("airline").item(0).getTextContent());
						System.out.println("Celebrity : " + eElement.getElementsByTagName("celebrity").item(0).getTextContent());
						System.out.println("Animal : " + eElement.getElementsByTagName("animal").item(0).getTextContent());
						System.out.println("Artist : " + eElement.getElementsByTagName("artist").item(0).getTextContent());
						System.out.println("Beverage : " + eElement.getElementsByTagName("beverage").item(0).getTextContent());
						System.out.println("Book : " + eElement.getElementsByTagName("book").item(0).getTextContent());
						System.out.println("Brands : " + eElement.getElementsByTagName("brands").item(0).getTextContent());
						System.out.println("Candy : " + eElement.getElementsByTagName("candy").item(0).getTextContent());
						System.out.println("Vehicle : " + eElement.getElementsByTagName("vehicle").item(0).getTextContent());
						System.out.println("City : " + eElement.getElementsByTagName("city").item(0).getTextContent());
						System.out.println("Clothing Store : " + eElement.getElementsByTagName("clothingStore").item(0).getTextContent());
						System.out.println("Comedian : " + eElement.getElementsByTagName("comedian").item(0).getTextContent());
						System.out.println("Films : " + eElement.getElementsByTagName("films").item(0).getTextContent());
						System.out.println("Flowers : " + eElement.getElementsByTagName("flower").item(0).getTextContent());
						System.out.println("Food : " + eElement.getElementsByTagName("food").item(0).getTextContent());
						System.out.println("Gadget : " + eElement.getElementsByTagName("gadget").item(0).getTextContent());
						System.out.println("Game : " + eElement.getElementsByTagName("game").item(0).getTextContent());
						System.out.println("Hero : " + eElement.getElementsByTagName("hero").item(0).getTextContent());
						System.out.println("Holiday : " + eElement.getElementsByTagName("holiday").item(0).getTextContent());
						System.out.println("Hotel : " + eElement.getElementsByTagName("hotel").item(0).getTextContent());
						System.out.println("Indulgence : " + eElement.getElementsByTagName("indulgence").item(0).getTextContent());
						System.out.println("Leisure Activities : " + eElement.getElementsByTagName("leisureActivities").item(0).getTextContent());
						System.out.println("Local Hangout : " + eElement.getElementsByTagName("localHangout").item(0).getTextContent());
						System.out.println("Publication : " + eElement.getElementsByTagName("publication").item(0).getTextContent());
						System.out.println("Music : " + eElement.getElementsByTagName("music").item(0).getTextContent());
						System.out.println("Pets : " + eElement.getElementsByTagName("pets").item(0).getTextContent());
						System.out.println("Place to Live : " + eElement.getElementsByTagName("placetoLive").item(0).getTextContent());
						System.out.println("Political Figures : " + eElement.getElementsByTagName("politicalFigures").item(0).getTextContent());
						System.out.println("Radio Show : " + eElement.getElementsByTagName("radioShow").item(0).getTextContent());
						System.out.println("Season : " + eElement.getElementsByTagName("season").item(0).getTextContent());
						System.out.println("Software : " + eElement.getElementsByTagName("software").item(0).getTextContent());
						System.out.println("Sports Team : " + eElement.getElementsByTagName("sportTeam").item(0).getTextContent());
						System.out.println("Stores : " + eElement.getElementsByTagName("stores").item(0).getTextContent());
						System.out.println("Travel Destination : " + eElement.getElementsByTagName("travelDestination").item(0).getTextContent());
						System.out.println("Turn Ons : " + eElement.getElementsByTagName("turnOns").item(0).getTextContent());
						System.out.println("TV Shows : " + eElement.getElementsByTagName("tvShow").item(0).getTextContent());
						System.out.println("Virtue : " + eElement.getElementsByTagName("virtue").item(0).getTextContent());
						System.out.println("Websites : " + eElement.getElementsByTagName("website").item(0).getTextContent());
						
						// Negative Profile Start //
						
						System.out.println("Activities : " + eElement.getElementsByTagName("activities").item(0).getTextContent());
						System.out.println("Bad Habits : " + eElement.getElementsByTagName("badHabits").item(0).getTextContent());
						System.out.println("Food Hate : " + eElement.getElementsByTagName("foodHate").item(0).getTextContent());
						System.out.println("Evil Doers : " + eElement.getElementsByTagName("evilDoers").item(0).getTextContent());
						System.out.println("Fashion Crime : " + eElement.getElementsByTagName("fashionCrime").item(0).getTextContent());
						System.out.println("Fear : " + eElement.getElementsByTagName("fear").item(0).getTextContent());
						System.out.println("Worst Job : " + eElement.getElementsByTagName("worstJob").item(0).getTextContent());
						System.out.println("Angry : " + eElement.getElementsByTagName("angry").item(0).getTextContent());
						System.out.println("Music Angry : " + eElement.getElementsByTagName("musicAngry").item(0).getTextContent());
						System.out.println("Pet Peeves : " + eElement.getElementsByTagName("petPeeves").item(0).getTextContent());
						System.out.println("Turn Offs : " + eElement.getElementsByTagName("turnOffs").item(0).getTextContent());
						System.out.println("Vices : " + eElement.getElementsByTagName("vices").item(0).getTextContent());
						
						System.out.println("----------------------------");
						System.out.println("Warning Section");
						System.out.println("----------------------------");
												
						// WARNING (LONG) //
						if(eElement.getElementsByTagName("firstName").item(0).getTextContent() == ""){
							
							System.out.println("No first name selected!");
							warningCount = warningCount +1;
						}
						if(eElement.getElementsByTagName("lastName").item(0).getTextContent() == ""){
							
							System.out.println("No last name selected!");
							warningCount = warningCount +1;
						}
						if(eElement.getElementsByTagName("nickName").item(0).getTextContent() == ""){
							
							System.out.println("No nick name selected!");
							warningCount = warningCount +1;
						}
						if(eElement.getElementsByTagName("title").item(0).getTextContent() == ""){
							
							System.out.println("No title selected!");
							warningCount = warningCount +1;
						}
						if(eElement.getElementsByTagName("lookingfor").item(0).getTextContent() == ""){
							
							System.out.println("No looking for selected!");
							warningCount = warningCount +1;
						}
						if(eElement.getElementsByTagName("ageBetween").item(0).getTextContent() == ""){
							
							System.out.println("No age between selected!");
							warningCount = warningCount +1;
						}
						if(eElement.getElementsByTagName("birthDate").item(0).getTextContent() == ""){
							
							System.out.println("No birth date selected!");
							warningCount = warningCount +1;
						}
						if(eElement.getElementsByTagName("country").item(0).getTextContent() == ""){
							
							System.out.println("No country selected!");
							warningCount = warningCount +1;
						}
						if(eElement.getElementsByTagName("postalCode").item(0).getTextContent() == ""){
							
							System.out.println("No postal code selected!");
							warningCount = warningCount +1;
						}
						if(eElement.getElementsByTagName("ethnicity").item(0).getTextContent() == ""){
							
							System.out.println("No ethnicity selected!");
							warningCount = warningCount +1;
						}
						if(eElement.getElementsByTagName("height").item(0).getTextContent() == ""){
							
							System.out.println("No height selected!");
							warningCount = warningCount +1;
						}
						if(eElement.getElementsByTagName("bodyType").item(0).getTextContent() == ""){
							
							System.out.println("No body type selected!");
							warningCount = warningCount +1;
						}
						if(eElement.getElementsByTagName("hairColor").item(0).getTextContent() == ""){
							
							System.out.println("No hair color selected!");
							warningCount = warningCount +1;
						}
						if(eElement.getElementsByTagName("eyeColor").item(0).getTextContent() == ""){
							
							System.out.println("No eye color selected!");
							warningCount = warningCount +1;
						}
						if(eElement.getElementsByTagName("relationship").item(0).getTextContent() == ""){
							
							System.out.println("No relationship selected!");
							warningCount = warningCount +1;
						}
						if(eElement.getElementsByTagName("fieldOfStudy").item(0).getTextContent() == ""){
							
							System.out.println("No field of study selected!");
							warningCount = warningCount +1;
						}
						if(eElement.getElementsByTagName("occupation").item(0).getTextContent() == ""){
							
							System.out.println("No occupation selected!");
							warningCount = warningCount +1;
						}
						if(eElement.getElementsByTagName("education").item(0).getTextContent() == ""){
							
							System.out.println("No education selected!");
							warningCount = warningCount +1;
						}
						if(eElement.getElementsByTagName("income").item(0).getTextContent() == ""){
							
							System.out.println("No income selected!");
							warningCount = warningCount +1;
						}
						if(eElement.getElementsByTagName("smokes").item(0).getTextContent() == ""){
							
							System.out.println("No smokes selected!");
							warningCount = warningCount +1;
						}
						if(eElement.getElementsByTagName("drinks").item(0).getTextContent() == ""){
							
							System.out.println("No drinks selected!");
							warningCount = warningCount +1;
						}
						if(eElement.getElementsByTagName("about").item(0).getTextContent() == ""){
							
							System.out.println("No about selected!");
							warningCount = warningCount +1;
						}
						if(eElement.getElementsByTagName("description").item(0).getTextContent() == ""){
							
							System.out.println("No description selected!");
							warningCount = warningCount +1;
						}
						if(eElement.getElementsByTagName("travelFun").item(0).getTextContent() == ""){
							
							System.out.println("No travel for fun selected!");
							warningCount = warningCount +1;
						}
						if(eElement.getElementsByTagName("travelWork").item(0).getTextContent() == ""){
							
							System.out.println("No travel for work selected!");
							warningCount = warningCount +1;
						}
						if(eElement.getElementsByTagName("humor").item(0).getTextContent() == ""){
							
							System.out.println("No humor selected!  Profile might belong to a robot");
							warningCount = warningCount +1;
						}
						if(eElement.getElementsByTagName("workHabits").item(0).getTextContent() == ""){
							
							System.out.println("No work habits selected!");
							warningCount = warningCount +1;
						}
						if(eElement.getElementsByTagName("physicalFitness").item(0).getTextContent() == ""){
							
							System.out.println("No physical fitness selected!");
							warningCount = warningCount +1;
						}
						if(eElement.getElementsByTagName("political").item(0).getTextContent() == ""){
							
							System.out.println("No politics selected!");
							warningCount = warningCount +1;
						}
						if(eElement.getElementsByTagName("airline").item(0).getTextContent() == ""){
							
							System.out.println("No airline selected!");
							warningCount = warningCount +1;
						}
						if(eElement.getElementsByTagName("celebrity").item(0).getTextContent() == ""){
							
							System.out.println("No celebrity selected!");
							warningCount = warningCount +1;
						}
						if(eElement.getElementsByTagName("animal").item(0).getTextContent() == ""){
							
							System.out.println("No animal selected!");
							warningCount = warningCount +1;
						}
						if(eElement.getElementsByTagName("appliance").item(0).getTextContent() == ""){
							
							System.out.println("No appliance selected!");
							warningCount = warningCount +1;
						}
						if(eElement.getElementsByTagName("artist").item(0).getTextContent() == ""){
							
							System.out.println("No artist selected!");
							warningCount = warningCount +1;
						}
						if(eElement.getElementsByTagName("beverage").item(0).getTextContent() == ""){
							
							System.out.println("No beverage selected!");
							warningCount = warningCount +1;
						}
						if(eElement.getElementsByTagName("book").item(0).getTextContent() == ""){
							
							System.out.println("No book selected!");
							warningCount = warningCount +1;
						}
						if(eElement.getElementsByTagName("brands").item(0).getTextContent() == ""){
							
							System.out.println("No brands selected!");
							warningCount = warningCount +1;
						}
						if(eElement.getElementsByTagName("candy").item(0).getTextContent() == ""){
							
							System.out.println("No candy selected!");
							warningCount = warningCount +1;
						}
						if(eElement.getElementsByTagName("vehicle").item(0).getTextContent() == ""){
							
							System.out.println("No vehicle selected!");
							warningCount = warningCount +1;
						}
						if(eElement.getElementsByTagName("city").item(0).getTextContent() == ""){
							
							System.out.println("No city selected!");
							warningCount = warningCount +1;
						}
						if(eElement.getElementsByTagName("clothingStore").item(0).getTextContent() == ""){
							
							System.out.println("No clothing store selected!");
							warningCount = warningCount +1;
						}
						if(eElement.getElementsByTagName("comedian").item(0).getTextContent() == ""){
							
							System.out.println("No comedian selected!");
							warningCount = warningCount +1;
						}
						if(eElement.getElementsByTagName("films").item(0).getTextContent() == ""){
							
							System.out.println("No films selected!");
							warningCount = warningCount +1;
						}
						if(eElement.getElementsByTagName("flower").item(0).getTextContent() == ""){
							
							System.out.println("No flower selected!");
							warningCount = warningCount +1;
						}
						if(eElement.getElementsByTagName("food").item(0).getTextContent() == ""){
							
							System.out.println("No food selected!");
							warningCount = warningCount +1;
						}
						if(eElement.getElementsByTagName("gadget").item(0).getTextContent() == ""){
							
							System.out.println("No gadget selected!");
							warningCount = warningCount +1;
						}
						if(eElement.getElementsByTagName("game").item(0).getTextContent() == ""){
							
							System.out.println("No game selected!");
							warningCount = warningCount +1;
						}
						if(eElement.getElementsByTagName("hero").item(0).getTextContent() == ""){
							
							System.out.println("No hero selected!");
							warningCount = warningCount +1;
						}
						if(eElement.getElementsByTagName("hobby").item(0).getTextContent() == ""){
							
							System.out.println("No hobby selected!");
							warningCount = warningCount +1;
						}
						if(eElement.getElementsByTagName("holiday").item(0).getTextContent() == ""){
							
							System.out.println("No holiday selected!");
							warningCount = warningCount +1;
						}
						if(eElement.getElementsByTagName("indulgence").item(0).getTextContent() == ""){
							
							System.out.println("No indulgence selected!");
							warningCount = warningCount +1;
						}
						if(eElement.getElementsByTagName("hotel").item(0).getTextContent() == ""){
							
							System.out.println("No hotel show selected!");
							warningCount = warningCount +1;
							
						}
						if(eElement.getElementsByTagName("leisureActivities").item(0).getTextContent() == ""){
							
							System.out.println("No leisure activities selected!");
							warningCount = warningCount +1;
						}
						if(eElement.getElementsByTagName("localHangout").item(0).getTextContent() == ""){
							
							System.out.println("No local hangout selected!");
							warningCount = warningCount +1;
						}
						if(eElement.getElementsByTagName("publication").item(0).getTextContent() == ""){
							
							System.out.println("No publication selected!");
							warningCount = warningCount +1;
						}
						if(eElement.getElementsByTagName("music").item(0).getTextContent() == ""){
							
							System.out.println("No music selected!");
							warningCount = warningCount +1;
						}
						if(eElement.getElementsByTagName("pets").item(0).getTextContent() == ""){
							
							System.out.println("No pets selected!");
							warningCount = warningCount +1;
						}
						if(eElement.getElementsByTagName("placetoLive").item(0).getTextContent() == ""){
							
							System.out.println("No place to live selected!");
							warningCount = warningCount +1;
						}
						if(eElement.getElementsByTagName("politicalFigures").item(0).getTextContent() == ""){
							
							System.out.println("No political figures selected!");
							warningCount = warningCount +1;
						}
						if(eElement.getElementsByTagName("radioShow").item(0).getTextContent() == ""){
							
							System.out.println("No radio show selected!");
							warningCount = warningCount +1;
						}
						if(eElement.getElementsByTagName("season").item(0).getTextContent() == ""){
							
							System.out.println("No season selected!");
							warningCount = warningCount +1;
						}
						if(eElement.getElementsByTagName("software").item(0).getTextContent() == ""){
							
							System.out.println("No software selected!");
							warningCount = warningCount +1;
						}
						if(eElement.getElementsByTagName("sportTeam").item(0).getTextContent() == ""){
							
							System.out.println("No sport team selected!");
							warningCount = warningCount +1;
						}
						if(eElement.getElementsByTagName("stores").item(0).getTextContent() == ""){
							
							System.out.println("No stores selected!");
							warningCount = warningCount +1;
						}
						if(eElement.getElementsByTagName("travelDestination").item(0).getTextContent() == ""){
							
							System.out.println("No travel destination selected!");
							warningCount = warningCount +1;
						}
						if(eElement.getElementsByTagName("turnOns").item(0).getTextContent() == ""){
							
							System.out.println("No turn ons selected!");
							warningCount = warningCount +1;
						}
						if(eElement.getElementsByTagName("tvShow").item(0).getTextContent() == ""){
							
							System.out.println("No tv show selected!");
							warningCount = warningCount +1;
						}
						if(eElement.getElementsByTagName("virtue").item(0).getTextContent() == ""){
							
							System.out.println("No virtue selected!");
							warningCount = warningCount +1;
						}
						if(eElement.getElementsByTagName("website").item(0).getTextContent() == ""){
							
							System.out.println("No drinks selected!");
							warningCount = warningCount +1;
						}
						if(eElement.getElementsByTagName("activities").item(0).getTextContent() == ""){
							
							System.out.println("No activities selected!");
							warningCount = warningCount +1;
						}
						if(eElement.getElementsByTagName("badHabits").item(0).getTextContent() == ""){
							
							System.out.println("No bad habits selected!");
							warningCount = warningCount +1;
						}
						if(eElement.getElementsByTagName("foodHate").item(0).getTextContent() == ""){
							
							System.out.println("No food hate selected!");
							warningCount = warningCount +1;
						}
						if(eElement.getElementsByTagName("evilDoers").item(0).getTextContent() == ""){
							
							System.out.println("No evil doers selected!");
							warningCount = warningCount +1;
						}
						if(eElement.getElementsByTagName("fashionCrime").item(0).getTextContent() == ""){
							
							System.out.println("No fashion crime selected!");
							warningCount = warningCount +1;
						}
						if(eElement.getElementsByTagName("fear").item(0).getTextContent() == ""){
							
							System.out.println("No fear selected!");
							warningCount = warningCount +1;
						}
						if(eElement.getElementsByTagName("worstJob").item(0).getTextContent() == ""){
							
							System.out.println("No worst job selected!");
							warningCount = warningCount +1;
						}
						if(eElement.getElementsByTagName("angry").item(0).getTextContent() == ""){
							
							System.out.println("No angry selected!");
							warningCount = warningCount +1;
						}
						if(eElement.getElementsByTagName("musicAngry").item(0).getTextContent() == ""){
							
							System.out.println("No music angry selected!");
							warningCount = warningCount +1;
						}
						if(eElement.getElementsByTagName("petPeeves").item(0).getTextContent() == ""){
							
							System.out.println("No pet peeves selected!");
							warningCount = warningCount +1;
						}
						if(eElement.getElementsByTagName("turnOffs").item(0).getTextContent() == ""){
							
							System.out.println("No turn offs selected!");
							warningCount = warningCount +1;
						}
						if(eElement.getElementsByTagName("vices").item(0).getTextContent() == ""){
							
							System.out.println("No vices selected!");
							warningCount = warningCount +1;
						}
						
						
						System.out.println("----------------------------");
						System.out.println("Errors Section");
						System.out.println("----------------------------");
	
						
						// ERRORS //
						
						aboutInput = eElement.getElementsByTagName("about").item(0).getTextContent();
					    aboutDescription = eElement.getElementsByTagName("description").item(0).getTextContent();
									
					    // Main Profile End //
					    
					    //  Patterns
						
						Pattern p = Pattern.compile(errorEmail);
						Pattern p2 = Pattern.compile(urlValidate);
						Pattern p3 = Pattern.compile(urlValidate2);

						
						// Matchers
						
						Matcher m = p.matcher(aboutInput);
						Matcher m2 = p2.matcher(aboutInput);
						Matcher m3 = p3.matcher(aboutInput);
						Matcher m4 = p.matcher(aboutDescription);
						Matcher m5 = p2.matcher(aboutDescription);
						Matcher m6 = p3.matcher(aboutDescription);
						
						// Searching for Patterns

						List<String> error = new ArrayList<String>();
						while (m.find()){
							
							System.out.println("Found a Email error in the 'About Myself' : " + m.group());
							error.add(m.group());
							errorCount = errorCount + 1;
							
						}
						
						List<String> urlError = new ArrayList<String>();
						while (m2.find()){
							
							System.out.println("Found a URL error in the 'About Myself' section: " + m2.group());
							urlError.add(m2.group());
							errorCount = errorCount + 1;
							
						}
						
						List<String> urlError2 = new ArrayList<String>();
						while (m3.find()){
							
							System.out.println("Found a URL2 error in the 'About Myself' section : " + m3.group());
							urlError2.add(m3.group());
							errorCount = errorCount +1;
							
						}
					    
						List<String> descriptionError = new ArrayList<String>();
						while (m4.find()){
							
							System.out.println("Found a Email error in the 'What I'm Looking For' section : " + m4.group());
							descriptionError.add(m4.group());
							errorCount = errorCount +1;
						}
						
						List<String> url3Error = new ArrayList<String>();
						while (m5.find()){
							
							System.out.println("Found a URL error in the 'What I'm Looking For' section : " + m5.group());
							url3Error.add(m5.group());
							errorCount = errorCount +1;
							
						}
						
						List<String> urlError4 = new ArrayList<String>();
						while (m6.find()){
							
							System.out.println("Found a URL2 error in the 'What I'm Looking For' section : " + m6.group());
							urlError4.add(m6.group());
							errorCount = errorCount +1;
							
						}

						// PROFILE REPORT
						
						System.out.println("----------------------------");
						System.out.println("Profile Report");
						System.out.println("----------------------------");
						
						System.out.println("There are : " + warningCount + " warnings and incomplete fields in this profile");
						warningCount =0;
						
						if(errorCount == 0){
							
							System.out.println("There are no Errors in this profile");
							
						}else{
							
							System.out.println("WARNING!  THERE ARE " + errorCount+ " ERRORS IN THIS PROFILE!");
							System.out.println("This profile should be reviewed.");
							errorCount =0;
							
						}
						
					}
				}
			    } catch (Exception e) {
				e.printStackTrace();
			    }
		  	 
	}
}


