package week04;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class week04Lab {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// 1. Why would we use a StringBuilder instead of a String?
				// 		a. Instantiate a new StringBuilder
				//		b. Append the characters 0 through 9 to it separated by dashes
				// 				Note:  make sure no dash appears at the end of the StringBuilder
		
		
		//String builders are useful if you know that a sting is going to be changed or altered many times. 
		
		StringBuilder sb = new StringBuilder();
		for (int i = 0; i < 10; i++) {
			sb.append(i);
			if (i != 9) {
				sb.append("-");	
			} 
			}
		System.out.println(sb.toString());
		
		

				
				// 2. List of String:
				//		a. Create a list of Strings 
				//		b. Add 5 Strings to it, each with a different length
		
		List<String> dinosaurs = new ArrayList <String>();;

		dinosaurs.add("carnivores");
		dinosaurs.add("mammals");
		dinosaurs.add("omnivores");            
		dinosaurs.add("aquatic creatures");
		dinosaurs.add("bugs");
		
		//This is another way to do it. You can create an array list.
		//List<String> dinosaurs = Arrays.asList("carnivores", "mammals", "omnivores", "aquatic creatures", "bugs");
		
				
				// 3. Write and test a method that takes a list of strings 
				//			and returns the shortest string
		
		List<String> list = new ArrayList<>();   
		
		list.add("Niko");
		list.add("Sobe");
		list.add("Spring");
		list.add("fly");
		list.add("racoon");
		list.add("tortoise");
		
		System.out.println(findShortestString(list));
		
		

				
				// 4. Write and test a method that takes a list of strings 
				//			and returns the list with the first and last element switched
		
		List<String> names = new ArrayList<>();
		names.add("spider");
		names.add("monkey");
		names.add("wolf");
		names.add("elephant");		

		List<String> swapped = switchElements(names);
		for (String string : swapped) {
			System.out.println(string);
		}
				
				// 5. Write and test a method that takes a list of strings 
				//			and returns a string with all the list elements concatenated to each other,
				// 			separated by a comma
		
		System.out.println(nameAdder(swapped));
		

				
				// 6. Write and test a method that takes a list of strings and a string 
				//			and returns a new list with all strings from the original list
				// 			containing the second string parameter (i.e. like a search method)
		
		List<String> searchResults = search(names, "a");
		for (String result : searchResults) {
			System.out.println(result);
		}
		

				
				// 7. Write and test a method that takes a list of integers 
				//			and returns a List<List<Integer>> with the following conditions specified
				//			for the return value:
				//		a. The first List in the returned value contains any number from the input list 
				//			that is divisible by 2
				//		b. The second List contains values from the input list that are divisible by 3
				//		c. The third containing values divisible by 5, and 
				//		d. The fourth all numbers from the input List not divisible by 2, 3, or 5
		
		List<Integer> ages = new ArrayList<Integer>();
		ages.add(9);
		ages.add(83);
		ages.add(24);
		ages.add(4);
		ages.add(17);
		ages.add(32);
		ages.add(18);
		ages.add(25);
		System.out.println(createNewList(ages));
		System.out.println(dby3(ages));
		System.out.println(dby5(ages));
		System.out.println(notDB235(ages));
		

				
				// 8. Write and test a method that takes a list of strings 
				//			and returns a list of integers that contains the length of each string
		
		List <String> dogs = new ArrayList<String>();
		dogs.add("Red Heeler");
		dogs.add("German Shepard");
		dogs.add("Great Dane");
		dogs.add("Lab");
		dogs.add("Blue Heeler");
		dogs.add("Bull Dog");
		dogs.add("Jack Russell");
		
		System.out.println(listCreator(dogs));
		
		


				
				// 9. Create a set of strings and add 5 values
		
		Set<String> stringSet = new HashSet<String>();
		stringSet.add("ground beef");
		stringSet.add("eggs");
		stringSet.add("bread");
		stringSet.add("coffee");
		stringSet.add("fruit");
		stringSet.add("creamer");
		stringSet.add("cookies");
		stringSet.add("apple sauce");
		stringSet.add("cheese");
		stringSet.add("creamer");

		
				
				
				// 10. Write and test a method that takes a set of strings and a character 
				//			and returns a set of strings consisting of all the strings in the
				// 			input set that start with the character parameter.

		System.out.println(stringsWithSameFirstChar(stringSet));

				
				// 11. Write and test a method that takes a set of strings 
				//			and returns a list of the same strings
		
		System.out.println(convertSetToList(stringSet));
			
				

				// 12. Write and test a method that takes a set of integers 
				//			and returns a new set of integers containing only even numbers 
				//			from the original set
		
		Set<Integer> numbersSet = new HashSet<Integer>();
		numbersSet.add(4);
		numbersSet.add(8);
		numbersSet.add(16);
		numbersSet.add(7);
		numbersSet.add(1);
		numbersSet.add(99);
		numbersSet.add(24);

		System.out.println(returnEvenNumbers(numbersSet));

				
				// 13. Create a map of string and string and add 3 items to it where the key of each
				// 			is a word and the value is the definition of the word
		
		Map<String, String> stringMap = new HashMap<String, String>();
		stringMap.put("flabergasted", "to feel or show intense shock, surprise, or wonder, or to be utterly astonished. ");
		stringMap.put("hog", "domesticated pig, especially one over 120 pounds (54 kg) and reared for slaughter.");
		stringMap.put("moist", "slightly wet; damp or humid.");
		
		

			
				
				// 14. Write and test a method that takes a Map<String, String> and a string 
				// 			and returns the value for a key in the map that matches the
				// 			string parameter (i.e. like a language dictionary lookup)

		
		String value = returnDefinition(stringMap, "hog");
		System.out.println(value);
				
				// 15. Write and test a method that takes a List<String> 
				//			and returns a Map<Character, Integer> containing a count of 
				//			all the strings that start with a given character
				
		
		List<String> randomList = new ArrayList<String>();
		randomList.add("cockroach");
		randomList.add("plateau");
		randomList.add("blanket");
		randomList.add("chile");
		randomList.add("macaroni");
		randomList.add("Jacrispy");
		randomList.add("armadillo");
		randomList.add("corn");
		randomList.add("elephant");
		randomList.add("eagle");
		randomList.add("tree");
		
		Map<Character, Integer> counts = wordsThatStartWith(randomList);
		for (Character character : counts.keySet()) 
			System.out.println(character + "-" + counts.get(character));
			
		}
		
		
			// Method 15:
	
	public static Map<Character, Integer> wordsThatStartWith(List<String> randomList) {
		Map <Character, Integer> cWord = new HashMap <Character, Integer>();
		for (String word : randomList) {
			char c = word.charAt(0);
			if (cWord.get(c) == null) {
				cWord.put(c, 1);
			} else {
				cWord.put(c, cWord.get(c) + 1);
			}
		}
		return cWord;
	}
			
			
			
			// Method 14:
	
	
	public static String returnDefinition(Map<String, String> stringMap, String str) {
		for (String key : stringMap.keySet()) {
			if (key.equals(str)) {
				return stringMap.get(key);
			}
		}
		return "";
		
	}
			

			
			// Method 12:
	
	public static Set<Integer> returnEvenNumbers(Set<Integer> numbersSet) {
		Set<Integer> evenSet = new HashSet<Integer>();
		for (int number : numbersSet) {
			if (number % 2 == 0) {
				evenSet.add(number);
			}
		}
		return evenSet;
	}
			

			
			// Method 11:
	
	public static List<String> convertSetToList(Set<String> stringSet) {
		List<String> newList = new ArrayList<String>();
		for (String str : stringSet) {
			newList.add(str);
			
		}
		return newList;
	}
			


			// Method 10:
	
	
	public static Set<String> stringsWithSameFirstChar(Set<String> stringSet) {
		Set<String> newStringSet = new HashSet<String>();
		for (String str : stringSet) {
			if (str.charAt(0) == 'c' || str.charAt(0) == 'C') {
				newStringSet.add(str);
			}
		}
		
		return newStringSet;
	}
	
			

			
			// Method 8:
	
	public static List<String> listCreator(List<String> dogs) {
		List<String> lengthList = new ArrayList<String>();
		for (String dog : dogs) {
		for (int i = 0; i < dog.length(); i++) {
		}	
			
		String number = " ";
		lengthList.add(dog.length() + number);
		}
		return lengthList;
	}	
	
			

			
			// Method 7:
	
	
	public static List<Integer> createNewList(List<Integer> ages) {
		List<Integer> specialList = new ArrayList<Integer>();
	for (int age : ages) {
		if (age % 2 == 0) {
			specialList.add(age);
		}
	}
	return specialList;
			
	}
	
	public static List<Integer> dby3(List<Integer> ages) {
		List<Integer> divisibleby3 = new ArrayList<Integer>();
		for (int age : ages) {
			if (age % 3 == 0) {
				divisibleby3.add(age);
			}
		}
	return divisibleby3;
	}
	
	public static List<Integer> dby5(List<Integer> ages) {
		List<Integer> divisibleby5 = new ArrayList<Integer>();
		for (int age : ages) {
			if (age % 5 == 0) {
				divisibleby5.add(age);
			}
		}
	return divisibleby5;
	}
	
	public static List<Integer> notDB235(List<Integer> ages) {
		List<Integer> notDB235List = new ArrayList<Integer>();
		for (int age : ages) {
			if (!(age % 2 == 0  || age % 3 == 0 || age % 5 == 0)) {
				notDB235List.add(age);
			}
		}
	return notDB235List;
	}
			
			// Method 6:
	
	public static List<String> search(List<String> list, String query) {
		List<String> results = new ArrayList<String>();
		for (String string : list) {
			if (string.contains(query)) {
				results.add(string);	
			}
			
		}
		return results;
	}
			

			
			// Method 5:
	
	public static String nameAdder(List<String> names) {
		StringBuilder result = new StringBuilder();
		for (String string : names) {
			result.append(string + ", ");
		}
		return result.toString();	
	}
			
			
			
			// Method 4:
	
	public static List<String> switchElements(List<String> names) {
		String temp = names.get(0);
		names.set(0, names.get(names.size() -1));
		names.set(names.size()-1, temp);
		return names;
	}
			
			
			
			// Method 3:

	public static String findShortestString(List<String> list) {
		String shortest = list.get(0);
		for (String string : list) {
			if (string.length() < shortest.length()) {
				shortest = string;
			}
		}
		return shortest;
		} 

	
}   




	
	


