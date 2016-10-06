package com.main;

import java.io.File;
import java.io.IOException;

import com.mpatric.mp3agic.ID3v1;
import com.mpatric.mp3agic.ID3v2;
import com.mpatric.mp3agic.InvalidDataException;
import com.mpatric.mp3agic.Mp3File;
import com.mpatric.mp3agic.NotSupportedException;
import com.mpatric.mp3agic.UnsupportedTagException;

public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		File file = new File("G:/06.Music/07. New/zingmp3/tinh ca nam 2000");
		if(file.isDirectory()){
			File[] listFiles = file.listFiles();
			for(File f : listFiles){
				try {
					if(f.isDirectory())
						continue;
					Mp3File mp3file = new Mp3File(f);
					
					if (mp3file.hasId3v2Tag()) {
//												 printInfoID3V2(mp3file);
						ID3v2 id3v2Tag = mp3file.getId3v2Tag();
						id3v2Tag.setAlbum("tinh ca nam 2000");
						mp3file.save(file.getAbsolutePath()+"/convert/" + f.getName());
					}

				} catch (UnsupportedTagException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				} catch (InvalidDataException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				} catch (NotSupportedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				} 

			}
		}
	}

	static void printInfoID3V2(Mp3File mp3file){
		ID3v2 id3v2Tag = mp3file.getId3v2Tag();
		System.out.println("Track: " + id3v2Tag.getTrack());
		System.out.println("Artist: " + id3v2Tag.getArtist());
		System.out.println("Title: " + id3v2Tag.getTitle());
		System.out.println("Album: " + id3v2Tag.getAlbum());
		System.out.println("Year: " + id3v2Tag.getYear());
		System.out.println("Genre: " + id3v2Tag.getGenre() + " (" + id3v2Tag.getGenreDescription() + ")");
		System.out.println("Comment: " + id3v2Tag.getComment());
		System.out.println("Composer: " + id3v2Tag.getComposer());
		System.out.println("Publisher: " + id3v2Tag.getPublisher());
		System.out.println("Original artist: " + id3v2Tag.getOriginalArtist());
		System.out.println("Album artist: " + id3v2Tag.getAlbumArtist());
		System.out.println("Copyright: " + id3v2Tag.getCopyright());
		System.out.println("URL: " + id3v2Tag.getUrl());
		System.out.println("Encoder: " + id3v2Tag.getEncoder());
		byte[] albumImageData = id3v2Tag.getAlbumImage();
		if (albumImageData != null) {
			System.out.println("Have album image data, length: " + albumImageData.length + " bytes");
			System.out.println("Album image mime type: " + id3v2Tag.getAlbumImageMimeType());
		}
	}
}
