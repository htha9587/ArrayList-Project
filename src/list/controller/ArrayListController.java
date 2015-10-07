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
	{
		firstWords.add("gggggeoprwiiwepnoewgnreiwoneo");
		displayList();
	}
	private void displayList()
	{
		for(int spot = 0; spot < firstWords.size(); spot++)
		{
			arrayDisplay.showList("The contents at " + spot + "are" + firstWords.get(spot));
		}
	}
}
