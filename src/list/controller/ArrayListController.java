package list.controller;

import java.util.ArrayList;
import list.view.ListViewer;

public class ArrayListController 
{
	private ArrayList<String> firstWords;
	private ListViewer arrayDisplay;
	
	public ArrayListController()
	{
		firstWords = new ArrayList<String>();
		arrayDisplay = new ListViewer();
	}
	
	public void start()
	/**
	 * Shows gradual evolution of man.
	 */
	{
		firstWords.add("gggggeoprwiiwepnoewgnreiwoneo");
		firstWords.add("bbababababababababaab");
		displayList();
	}
	private void displayList()
	{
		for(int spot = 0; spot < firstWords.size(); spot++)
			/**
			 * Gets list information from our method.
			 */
		{
			arrayDisplay.showList("The contents at " + spot + "are" + firstWords.get(spot));
		}
	}
}
