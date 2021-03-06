package com.hyh.commons;

import java.io.File;
import java.util.Collection;

import org.apache.commons.io.FileUtils;
import org.apache.commons.io.filefilter.DirectoryFileFilter;
import org.apache.commons.io.filefilter.EmptyFileFilter;

public class CIOTest02 {
	public static void main(String[] args) {
		Collection<File> files = FileUtils.listFiles(new File("C:\\Users\\HuangYuhan\\Desktop\\IO_study04\\src\\com\\sxt\\commons"), EmptyFileFilter.NOT_EMPTY, null);
		for (File file : files) {
			System.out.println(file.getAbsolutePath());
		}
		System.out.println("--------------------------------");
		files = FileUtils.listFiles(new File("C:\\Users\\HuangYuhan\\Desktop\\IO_study04\\src\\com\\sxt\\commons"), EmptyFileFilter.NOT_EMPTY,DirectoryFileFilter.INSTANCE);
		for (File file : files) {
			System.out.println(file.getAbsolutePath());
		}
	}
}
