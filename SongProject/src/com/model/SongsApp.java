package com.model;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class SongsApp 
{
	List<Optional<Songs>> al=new ArrayList<Optional<Songs>>();
	boolean isEmpty=true;
	public void addSongs(String lineToParse)
	{
		String[] tokens=lineToParse.split("/");
		Songs userSong=new Songs(tokens[0],tokens[1],tokens[2],tokens[3]);
	    al.add(Optional.of(userSong));
	}
	
	public void displayRecords() throws EmptyException
	{
		if(isEmpty==true)
			throw new EmptyException("Song list is empty.");
		al.stream().map(m->m).forEach(s->System.out.println(s.get().getAlbumName()+" "+s.get().getSingerName()+" "+s.get().getRating()+" "+s.get().getGenre()));
	}
	
	public void sortRecords() throws EmptyException
	{
		if(isEmpty==true)
			throw new EmptyException("Song list is empty.");
		else
		    al.stream().sorted((s1,s2)->s1.get().getSingerName().compareTo(s2.get().getSingerName())).map(m->m).forEach(s->System.out.println(s));
	}
	
	public void filterRecords() throws EmptyException
	{
		if(isEmpty==true)
			throw new EmptyException("Song list is empty.");
		
		List<Optional<Songs>> a=al.stream().filter(s->s.get().getRating().equalsIgnoreCase("high")).collect(Collectors.toList());
		System.out.println(a);
		
	}
	

	
	public void getSongs()
	{
		try
		{
			File file=new File("songs.txt");
			BufferedReader reader=new BufferedReader(new FileReader(file));
			
			String line=null;
			
			
			while((line=reader.readLine())!=null)
			{
				isEmpty=false;
				addSongs(line);
			}
			
			if(isEmpty==true)
			{
				reader.close();
				throw new EmptyException("Song list empty");
			}
			reader.close();
		}
		catch(Exception e)
		{
			System.out.println(e.getMessage());
		}
	}
	
	public void show() throws EmptyException
	{
		getSongs();
	    displayRecords();
	}

}
