/**
 * 
 */
package nxy;

import java.awt.*;
import java.awt.event.*;
//import redis.clients.jedis.Jedis;
import java.util.*;
import javax.swing.*;
import javax.swing.Timer;

/**
 * @author Yancy
 *
 */
public class Demo {

	/**
	 * @param args
	 * @throws Exception
	 */
	public static void main(String[] args) {
		Pair<String> newPair = new Pair<String>("yancy", "123");
		String[] a = {"Mary", "Yancy", "Middle"};
		newPair = ArrayAlg.minmax(a);
		System.out.println(newPair.getFirst());
		System.out.println(newPair.getSecond());
		System.out.println();
	}

}
