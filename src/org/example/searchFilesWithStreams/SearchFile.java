package org.example.searchFilesWithStreams;

import java.nio.file.FileSystems;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.Optional;
import java.util.stream.Stream;

public class SearchFile {

	public static void main(String[] args) {

		Path path = FileSystems.getDefault().getPath("files", "hamlet.txt");
		String searchTerm = "To be, or not to be";

		// try with resources, will be closed at the end
		try (Stream<String> lines = Files.lines(path)) {

			// to check null values
			// the string might be or not exist
			Optional<String> line = lines.filter(l -> l.contains(searchTerm)).findFirst();
			if (line.isPresent()) {
				System.out.println("Found: " + line.get());
			} else {
				System.out.println("Not Found");
			}

		} catch (Exception ex) {
			System.out.println("There ws an error" + ex.getMessage());
		}
	}

}
