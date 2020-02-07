import java.io.IOException;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.Set;
import java.util.TreeSet;
import opennlp.tools.stemmer.Stemmer;
import opennlp.tools.stemmer.snowball.SnowballStemmer;

/**
 * Utility class for parsing and stemming text and text files into collections of stemmed words.
 *
 * @author CS 212 Software Development
 * @author University of San Francisco
 * @version Spring 2020
 *
 * @see TextParser
 */
public class TextFileStemmer {

  /** The default stemmer algorithm used by this class. */
  public static final SnowballStemmer.ALGORITHM DEFAULT = SnowballStemmer.ALGORITHM.ENGLISH;

  // TODO Add helper methods as needed (optional)

  /**
   * Returns a list of cleaned and stemmed words parsed from the provided line.
   *
   * @param line the line of words to clean, split, and stem
   * @param stemmer the stemmer to use
   * @return a list of cleaned and stemmed words
   *
   * @see Stemmer#stem(CharSequence)
   * @see TextParser#parse(String)
   */
  public static ArrayList<String> listStems(String line, Stemmer stemmer) {
    // TODO Fill in listStems(String, Stemmer)
    throw new UnsupportedOperationException("Not yet implemented.");
  }

  /**
   * Returns a list of cleaned and stemmed words parsed from the provided line.
   *
   * @param line the line of words to clean, split, and stem
   * @return a list of cleaned and stemmed words
   *
   * @see SnowballStemmer
   * @see #DEFAULT
   * @see #listStems(String, Stemmer)
   */
  public static ArrayList<String> listStems(String line) {
    // THIS IS PROVIDED FOR YOU; NO NEED TO MODIFY
    return listStems(line, new SnowballStemmer(DEFAULT));
  }

  /**
   * Returns a set of unique (no duplicates) cleaned and stemmed words parsed from the provided
   * line.
   *
   * @param line the line of words to clean, split, and stem
   * @param stemmer the stemmer to use
   * @return a sorted set of unique cleaned and stemmed words
   *
   * @see Stemmer#stem(CharSequence)
   * @see TextParser#parse(String)
   */
  public static TreeSet<String> uniqueStems(String line, Stemmer stemmer) {
    // TODO Fill in uniqueStems(String, Stemmer)
    throw new UnsupportedOperationException("Not yet implemented.");
  }

  /**
   * Returns a set of unique (no duplicates) cleaned and stemmed words parsed from the provided
   * line.
   *
   * @param line the line of words to clean, split, and stem
   * @return a sorted set of unique cleaned and stemmed words
   *
   * @see SnowballStemmer
   * @see #DEFAULT
   * @see #uniqueStems(String, Stemmer)
   */
  public static TreeSet<String> uniqueStems(String line) {
    // THIS IS PROVIDED FOR YOU; NO NEED TO MODIFY
    return uniqueStems(line, new SnowballStemmer(DEFAULT));
  }

  /**
   * Reads a file line by line, parses each line into cleaned and stemmed words, and then adds those
   * words to a set.
   *
   * @param inputFile the input file to parse
   * @return a sorted set of stems from file
   * @throws IOException if unable to read or parse file
   *
   * @see #uniqueStems(String)
   * @see TextParser#parse(String)
   */
  public static TreeSet<String> uniqueStems(Path inputFile) throws IOException {
    // TODO Fill in uniqueStems(Path)
    throw new UnsupportedOperationException("Not yet implemented.");
  }

  /**
   * Reads a file line by line, parses each line into cleaned and stemmed words, and then adds those
   * words to a set.
   *
   * @param inputFile the input file to parse
   * @return a sorted set of stems from file
   * @throws IOException if unable to read or parse file
   *
   * @see #uniqueStems(String)
   * @see TextParser#parse(String)
   */
  public static ArrayList<String> listStems(Path inputFile) throws IOException {
    // TODO Fill in uniqueStems(Path)
    throw new UnsupportedOperationException("Not yet implemented.");
  }

  /**
   * A simple main method that demonstrates this class.
   *
   * @param args unused
   * @throws IOException if an I/O error occurs
   */
  public static void main(String[] args) throws IOException {
    String text = "practic practical practice practiced practicer practices "
        + "practicing practis practisants practise practised practiser "
        + "practisers practises practising practitioner practitioners";

    System.out.println(uniqueStems(text));
    System.out.println(listStems(text));

    Path inputPath = Path.of("test", "animals.text");
    Set<String> actual = TextFileStemmer.uniqueStems(inputPath);
    System.out.println(actual);
  }
}
