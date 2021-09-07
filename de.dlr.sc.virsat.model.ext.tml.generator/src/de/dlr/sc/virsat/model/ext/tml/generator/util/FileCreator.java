/*******************************************************************************
 * Copyright (c) 2008-2019 German Aerospace Center (DLR), Simulation and Software Technology, Germany.
 *
 * This program and the accompanying materials are made available under the
 * terms of the Eclipse Public License 2.0 which is available at
 * http://www.eclipse.org/legal/epl-2.0.
 *
 * SPDX-License-Identifier: EPL-2.0
 *******************************************************************************/
package de.dlr.sc.virsat.model.ext.tml.generator.util;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Paths;

/**
 * Util class for creating and writing into files
 * @author fran_tb
 *
 */
public class FileCreator {

	FileWriter writer;
	File file;
	String path = "";
	String manPath = "";

	/**
	 * Empty constructor
	 */
	public FileCreator() {
	}

	/**
	 * Constructor with paths where to create the files 
	 * @param genPath relative path of the src-gen folder
	 * @param manPath relative path of folders for files generated only once
	 */
	public FileCreator(String genPath, String manPath) {
		path = genPath.trim();
		this.manPath = manPath.trim();
		System.out.println(path);
	}

	/**
	 * Set the path
	 * @param filePath The path of the file
	 */
	public void setPath(String filePath) {
		path = filePath.trim();
	}

	/**
	 * Append an existing path
	 * @param filePath appendix
	 */
	public void appendPath(String filePath) {
		path = Paths.get(path, filePath.trim()).toString();
	}

	/**
	 * Create and write into a file
	 * @param filePath Where to create the file
	 * @param fileName The name of the source file
	 * @param text The content of the file
	 * @param overwrite Should file be overwritten at next generation?
	 */
	public void generate(String filePath, String fileName, String text, Boolean overwrite) {
		// File anlegen
		file = Paths.get(path, filePath.trim(), fileName.trim()).toFile(); //new File(path + filePath + fileName);
		if ((!file.exists() || overwrite)) {
			file.getParentFile().mkdirs();
			try {
				writer = new FileWriter(file, false);
				writer.write(text);
				writer.flush();
				writer.close();

			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}

	/**
	 * Create and write to file, but only if it is not existing yet
	 * @param filePath Where to create the file
	 * @param fileName The name of the source file
	 * @param text The content of the file
	 */
	public void generateOnce(String filePath, String fileName, String text) {
		// File anlegen
		file = Paths.get(manPath, filePath.trim(), fileName.trim()).toFile();
		if (!file.exists()) {
			file.getParentFile().mkdirs();
			try {
				writer = new FileWriter(file, false);
				writer.write(text);
				writer.flush();
				writer.close();

			} catch (IOException e) {
				e.printStackTrace();
			}
		} else {
			System.out.println("File " + fileName + " not generated, due to it exists!");
		}
	}

	/**
	 * Check if file for a generate-once creation already exists
	 * @param fileName file name
	 * @return true if exist, false otherwise
	 */
	public boolean checkIfMan(String fileName) {
		File check = Paths.get(manPath, fileName.trim()).toFile();
		return check.exists();
	}

	/**
	 * Not implemented yet
	 */
	public void installCMake() {

	}
}
