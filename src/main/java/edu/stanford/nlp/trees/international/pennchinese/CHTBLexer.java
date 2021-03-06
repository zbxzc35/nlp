/* The following code was generated by JFlex 1.4.3 on 3/28/09 2:50 PM */

package edu.stanford.nlp.trees.international.pennchinese;

import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.io.UnsupportedEncodingException;

/** 
 * A lexer for the Penn Chinese Treebank.  Supports Chinese characters.
 *
 * @author Roger Levy
 * @author Christopher Manning (redid to accept most stuff, add CTB 4-6 XML entities)
 */


class CHTBLexer {

  /** This character denotes the end of file */
  public static final int YYEOF = -1;

  /** initial size of the lookahead buffer */
  private static final int ZZ_BUFFERSIZE = 16384;

  /** lexical states */
  public static final int DATETIME = 8;
  public static final int DATEINHEADER = 14;
  public static final int HEADER = 12;
  public static final int PREAMBLE = 16;
  public static final int DOCNO = 2;
  public static final int SRCID = 10;
  public static final int YYINITIAL = 0;
  public static final int DOCID = 4;
  public static final int DOCTYPE = 6;

  /**
   * ZZ_LEXSTATE[l] is the state in the DFA for the lexical state l
   * ZZ_LEXSTATE[l+1] is the state in the DFA for the lexical state l
   *                  at the beginning of a line
   * l is of the form l = 2*k, k a non negative integer
   */
  private static final int ZZ_LEXSTATE[] = { 
     0,  0,  1,  1,  2,  2,  3,  3,  4,  4,  5,  5,  6,  6,  7,  7, 
     8, 8
  };

  /** 
   * Translates characters to character classes
   */
  private static final String ZZ_CMAP_PACKED = 
    "\11\0\1\30\1\26\1\27\1\27\1\25\22\0\1\30\7\0\1\24"+
    "\1\24\5\0\1\10\14\0\1\1\1\0\1\2\2\0\1\5\1\22"+
    "\1\12\1\6\1\4\2\0\1\3\1\14\2\0\1\23\1\20\1\13"+
    "\1\11\1\17\1\0\1\7\1\21\1\15\4\0\1\16\53\0\1\27"+
    "\u1fa2\0\1\27\1\27\udfd6\0";

  /** 
   * Translates characters to character classes
   */
  private static final char [] ZZ_CMAP = zzUnpackCMap(ZZ_CMAP_PACKED);

  /** 
   * Translates DFA states to action switch labels.
   */
  private static final int [] ZZ_ACTION = zzUnpackAction();

  private static final String ZZ_ACTION_PACKED_0 =
    "\11\0\3\1\4\2\1\3\1\4\6\3\6\1\11\0"+
    "\1\2\6\1\11\0\5\1\11\0\7\1\10\0\1\1"+
    "\1\5\5\1\5\0\1\6\4\0\2\1\1\7\1\1"+
    "\1\10\1\1\2\0\1\11\4\0\1\12\2\0\1\13"+
    "\2\1\1\0\2\1\1\14\2\0\1\15\4\0\2\1"+
    "\1\0\1\16\1\1\3\0\1\17\2\0\2\1\1\0"+
    "\1\20\1\21\4\0\1\1\3\0\1\22\1\1\1\0"+
    "\1\1\1\0\2\1\2\0\1\1\1\0";

  private static int [] zzUnpackAction() {
    int [] result = new int[166];
    int offset = 0;
    offset = zzUnpackAction(ZZ_ACTION_PACKED_0, offset, result);
    return result;
  }

  private static int zzUnpackAction(String packed, int offset, int [] result) {
    int i = 0;       /* index in packed string  */
    int j = offset;  /* index in unpacked array */
    int l = packed.length();
    while (i < l) {
      int count = packed.charAt(i++);
      int value = packed.charAt(i++);
      do result[j++] = value; while (--count > 0);
    }
    return j;
  }


  /** 
   * Translates a state to a row index in the transition table
   */
  private static final int [] ZZ_ROWMAP = zzUnpackRowMap();

  private static final String ZZ_ROWMAP_PACKED_0 =
    "\0\0\0\31\0\62\0\113\0\144\0\175\0\226\0\257"+
    "\0\310\0\341\0\372\0\u0113\0\u012c\0\u0113\0\u0145\0\u015e"+
    "\0\u0177\0\u0113\0\u0190\0\u01a9\0\u01c2\0\u01db\0\u01f4\0\u020d"+
    "\0\u0226\0\u023f\0\u0258\0\u0271\0\u028a\0\u02a3\0\u02bc\0\u02d5"+
    "\0\u02ee\0\u0307\0\u0320\0\u0339\0\u0352\0\u036b\0\u0384\0\341"+
    "\0\u039d\0\u03b6\0\u03cf\0\u03e8\0\u0401\0\u041a\0\u0433\0\u044c"+
    "\0\u0465\0\u047e\0\u0497\0\u04b0\0\u04c9\0\u04e2\0\u04fb\0\u0514"+
    "\0\u052d\0\u0546\0\u055f\0\u0578\0\u0591\0\u05aa\0\u05c3\0\u05dc"+
    "\0\u05f5\0\u060e\0\u0627\0\u0640\0\u0659\0\u0672\0\u068b\0\u06a4"+
    "\0\u06bd\0\u06d6\0\u06ef\0\u0708\0\u0721\0\u073a\0\u0753\0\u076c"+
    "\0\u0785\0\u079e\0\u07b7\0\u07d0\0\u07e9\0\341\0\u0802\0\u081b"+
    "\0\u0834\0\u084d\0\u0866\0\u087f\0\u0898\0\u08b1\0\u08ca\0\u08e3"+
    "\0\u0113\0\u08fc\0\u0915\0\u092e\0\u0947\0\u0960\0\u0979\0\u0992"+
    "\0\u09ab\0\341\0\u09c4\0\u09dd\0\u09f6\0\u0113\0\u0a0f\0\u0a28"+
    "\0\u0a41\0\u0a5a\0\u0113\0\u0a73\0\u0a8c\0\341\0\u0aa5\0\u0abe"+
    "\0\u0ad7\0\u0af0\0\u0b09\0\u0113\0\u0b22\0\u0b3b\0\u0113\0\u0b54"+
    "\0\u0b6d\0\u0b86\0\u0b9f\0\u0bb8\0\u0bd1\0\u0bea\0\341\0\u0c03"+
    "\0\u0c1c\0\u0c35\0\u0c4e\0\u0113\0\u0c67\0\u0c80\0\u0c99\0\u0cb2"+
    "\0\u0ccb\0\341\0\u0113\0\u0ce4\0\u0cfd\0\u0d16\0\u0d2f\0\u0d48"+
    "\0\u0d61\0\u0d7a\0\u0d93\0\u0113\0\u0dac\0\u0dc5\0\u0dde\0\u0df7"+
    "\0\u0e10\0\u0e29\0\u0e42\0\u0e5b\0\u0e74\0\u0e8d";

  private static int [] zzUnpackRowMap() {
    int [] result = new int[166];
    int offset = 0;
    offset = zzUnpackRowMap(ZZ_ROWMAP_PACKED_0, offset, result);
    return result;
  }

  private static int zzUnpackRowMap(String packed, int offset, int [] result) {
    int i = 0;  /* index in packed string  */
    int j = offset;  /* index in unpacked array */
    int l = packed.length();
    while (i < l) {
      int high = packed.charAt(i++) << 16;
      result[j++] = high | packed.charAt(i++);
    }
    return j;
  }

  /** 
   * The transition table of the DFA
   */
  private static final int [] ZZ_TRANS = zzUnpackTrans();

  private static final String ZZ_TRANS_PACKED_0 =
    "\1\12\1\13\22\12\1\14\1\15\2\16\1\17\1\20"+
    "\1\21\27\20\31\22\1\20\1\23\30\20\1\24\30\20"+
    "\1\25\30\20\1\26\30\20\1\27\30\20\1\30\27\20"+
    "\24\12\5\0\2\31\1\12\1\32\2\31\1\33\3\31"+
    "\1\34\4\31\1\35\1\31\1\36\2\31\5\37\57\0"+
    "\1\16\32\0\1\17\1\20\1\0\27\20\10\0\1\40"+
    "\30\0\1\41\30\0\1\42\30\0\1\43\26\0\1\44"+
    "\1\0\1\45\30\0\1\46\30\0\1\47\20\0\2\31"+
    "\1\50\21\31\5\37\2\31\1\50\1\31\1\51\17\31"+
    "\5\37\2\31\1\50\2\31\1\52\3\31\1\53\12\31"+
    "\5\37\2\31\1\50\12\31\1\54\6\31\5\37\2\31"+
    "\1\50\4\31\1\55\14\31\5\37\2\31\1\50\4\31"+
    "\1\56\14\31\7\37\1\16\26\37\6\0\1\57\30\0"+
    "\1\60\30\0\1\61\34\0\1\62\6\0\1\63\14\0"+
    "\1\64\26\0\1\65\33\0\1\66\41\0\1\67\11\0"+
    "\2\31\1\50\2\31\1\70\16\31\5\37\2\31\1\50"+
    "\12\31\1\71\6\31\5\37\2\31\1\50\7\31\1\72"+
    "\11\31\5\37\2\31\1\50\17\31\1\73\1\31\5\37"+
    "\2\31\1\50\1\31\1\74\17\31\5\37\2\31\1\50"+
    "\7\31\1\73\11\31\5\37\11\0\1\75\30\0\1\76"+
    "\24\0\1\77\40\0\1\100\22\0\1\101\36\0\1\102"+
    "\17\0\1\103\31\0\1\104\32\0\1\105\21\0\2\31"+
    "\1\50\3\31\1\106\15\31\5\37\2\31\1\50\1\31"+
    "\1\107\17\31\5\37\2\31\1\50\10\31\1\110\1\111"+
    "\1\112\6\31\5\37\2\31\1\50\11\31\1\113\7\31"+
    "\5\37\2\31\1\50\2\31\1\114\16\31\5\37\12\0"+
    "\1\115\30\0\1\116\33\0\1\117\35\0\1\120\20\0"+
    "\1\120\22\0\1\121\31\0\1\122\40\0\1\123\17\0"+
    "\1\124\24\0\2\31\1\50\1\31\1\125\17\31\5\37"+
    "\2\31\1\126\5\31\1\127\13\31\5\37\2\31\1\50"+
    "\6\31\1\130\12\31\5\37\2\31\1\50\3\31\1\130"+
    "\15\31\5\37\2\31\1\50\13\31\1\131\5\31\5\37"+
    "\2\31\1\50\3\31\1\132\15\31\5\37\2\31\1\50"+
    "\15\31\1\133\3\31\5\37\13\0\1\134\1\135\31\0"+
    "\1\136\17\0\1\137\40\0\1\140\16\0\1\141\5\0"+
    "\1\142\26\0\1\143\26\0\1\144\31\0\1\145\23\0"+
    "\2\31\1\50\4\31\1\146\14\31\5\37\2\31\1\50"+
    "\12\31\1\147\6\31\5\37\2\31\1\150\21\31\5\37"+
    "\2\31\1\50\14\31\1\151\4\31\5\37\2\31\1\152"+
    "\21\31\5\37\2\31\1\50\17\31\1\153\1\31\5\37"+
    "\11\0\1\154\25\0\1\154\40\0\1\155\14\0\1\156"+
    "\5\0\1\157\26\0\1\160\37\0\1\161\17\0\1\162"+
    "\26\0\1\163\5\0\1\164\40\0\1\165\10\0\2\31"+
    "\1\166\21\31\5\37\2\31\1\50\11\31\1\167\7\31"+
    "\5\37\1\170\1\12\22\170\5\171\2\31\1\50\1\31"+
    "\1\172\17\31\5\37\2\31\1\50\20\31\1\173\5\37"+
    "\2\0\1\174\45\0\1\175\26\0\1\176\15\0\1\177"+
    "\42\0\1\200\23\0\1\201\36\0\1\202\35\0\1\203"+
    "\6\0\2\31\1\50\15\31\1\204\3\31\5\37\1\170"+
    "\1\205\22\170\6\171\1\206\27\171\2\31\1\207\21\31"+
    "\5\37\2\31\1\50\1\31\1\210\17\31\5\37\4\0"+
    "\1\211\40\0\1\212\34\0\1\213\12\0\1\214\42\0"+
    "\1\215\37\0\1\216\5\0\2\31\1\50\1\31\1\217"+
    "\17\31\5\37\10\12\1\220\13\12\15\0\1\221\20\0"+
    "\2\31\1\222\21\31\5\37\2\0\1\223\46\0\1\224"+
    "\14\0\1\225\44\0\1\226\14\0\1\227\24\0\2\31"+
    "\1\126\21\31\5\37\6\12\1\230\15\12\13\0\1\231"+
    "\26\0\1\232\26\0\1\141\32\0\1\233\26\0\1\234"+
    "\26\0\11\12\1\235\12\12\16\0\1\236\21\0\1\156"+
    "\30\0\1\163\26\0\12\12\1\237\11\12\17\0\1\240"+
    "\16\0\13\12\1\241\1\242\7\12\20\0\1\243\1\244"+
    "\14\0\11\12\1\245\12\12\5\0\6\12\1\245\15\12"+
    "\16\0\1\246\25\0\1\246\22\0\2\12\1\50\21\12"+
    "\7\0\1\16\26\0";

  private static int [] zzUnpackTrans() {
    int [] result = new int[3750];
    int offset = 0;
    offset = zzUnpackTrans(ZZ_TRANS_PACKED_0, offset, result);
    return result;
  }

  private static int zzUnpackTrans(String packed, int offset, int [] result) {
    int i = 0;       /* index in packed string  */
    int j = offset;  /* index in unpacked array */
    int l = packed.length();
    while (i < l) {
      int count = packed.charAt(i++);
      int value = packed.charAt(i++);
      value--;
      do result[j++] = value; while (--count > 0);
    }
    return j;
  }


  /* error codes */
  private static final int ZZ_UNKNOWN_ERROR = 0;
  private static final int ZZ_NO_MATCH = 1;
  private static final int ZZ_PUSHBACK_2BIG = 2;

  /* error messages for the codes above */
  private static final String ZZ_ERROR_MSG[] = {
    "Unkown internal scanner error",
    "Error: could not match input",
    "Error: pushback value was too large"
  };

  /**
   * ZZ_ATTRIBUTE[aState] contains the attributes of state <code>aState</code>
   */
  private static final int [] ZZ_ATTRIBUTE = zzUnpackAttribute();

  private static final String ZZ_ATTRIBUTE_PACKED_0 =
    "\11\0\2\1\1\11\1\1\1\11\3\1\1\11\14\1"+
    "\11\0\7\1\11\0\5\1\11\0\7\1\10\0\7\1"+
    "\5\0\1\11\4\0\6\1\2\0\1\11\4\0\1\11"+
    "\2\0\3\1\1\0\2\1\1\11\2\0\1\11\4\0"+
    "\2\1\1\0\2\1\3\0\1\11\2\0\2\1\1\0"+
    "\1\1\1\11\4\0\1\1\3\0\1\11\1\1\1\0"+
    "\1\1\1\0\2\1\2\0\1\1\1\0";

  private static int [] zzUnpackAttribute() {
    int [] result = new int[166];
    int offset = 0;
    offset = zzUnpackAttribute(ZZ_ATTRIBUTE_PACKED_0, offset, result);
    return result;
  }

  private static int zzUnpackAttribute(String packed, int offset, int [] result) {
    int i = 0;       /* index in packed string  */
    int j = offset;  /* index in unpacked array */
    int l = packed.length();
    while (i < l) {
      int count = packed.charAt(i++);
      int value = packed.charAt(i++);
      do result[j++] = value; while (--count > 0);
    }
    return j;
  }

  /** the input device */
  private java.io.Reader zzReader;

  /** the current state of the DFA */
  private int zzState;

  /** the current lexical state */
  private int zzLexicalState = YYINITIAL;

  /** this buffer contains the current text to be matched and is
      the source of the yytext() string */
  private char zzBuffer[] = new char[ZZ_BUFFERSIZE];

  /** the textposition at the last accepting state */
  private int zzMarkedPos;

  /** the current text position in the buffer */
  private int zzCurrentPos;

  /** startRead marks the beginning of the yytext() string in the buffer */
  private int zzStartRead;

  /** endRead marks the last character in the buffer, that has been read
      from input */
  private int zzEndRead;

  /** number of newlines encountered up to the start of the matched text */
  private int yyline;

  /** the number of characters up to the start of the matched text */
  private int yychar;

  /**
   * the number of characters from the last newline up to the start of the 
   * matched text
   */
  private int yycolumn;

  /** 
   * zzAtBOL == true <=> the scanner is currently at the beginning of a line
   */
  private boolean zzAtBOL = true;

  /** zzAtEOF == true <=> the scanner is at the EOF */
  private boolean zzAtEOF;

  /** denotes if the user-EOF-code has already been executed */
  private boolean zzEOFDone;

  /* user code: */

  public static final int IGNORE = 0;
  public static final int ACCEPT = 1;

  public void pushback(int n) {
    yypushback(n);
  }

  public String match() {
    return yytext();
  }

  private static void reportError(String yytext) {
    try {
      PrintWriter p = new PrintWriter(new OutputStreamWriter(System.err,
                                                "GB18030"), true);
      p.println("chtbl.flex tokenization error: \"" + yytext + "\"");
      if (yytext.length() >= 1) {
	p.println("First character is: " + yytext.charAt(0));
	if (yytext.length() >= 2) {
	  p.println("Second character is: " + yytext.charAt(1));
        }
      }		
    } catch (UnsupportedEncodingException e) {
      System.err.println("chtbl.flex tokenization and encoding present error");
    }
  }



  /**
   * Creates a new scanner
   * There is also a java.io.InputStream version of this constructor.
   *
   * @param   in  the java.io.Reader to read input from.
   */
  CHTBLexer(java.io.Reader in) {
    this.zzReader = in;
  }

  /**
   * Creates a new scanner.
   * There is also java.io.Reader version of this constructor.
   *
   * @param   in  the java.io.Inputstream to read input from.
   */
  CHTBLexer(java.io.InputStream in) {
    this(new java.io.InputStreamReader(in));
  }

  /** 
   * Unpacks the compressed character translation table.
   *
   * @param packed   the packed character translation table
   * @return         the unpacked character translation table
   */
  private static char [] zzUnpackCMap(String packed) {
    char [] map = new char[0x10000];
    int i = 0;  /* index in packed string  */
    int j = 0;  /* index in unpacked array */
    while (i < 88) {
      int  count = packed.charAt(i++);
      char value = packed.charAt(i++);
      do map[j++] = value; while (--count > 0);
    }
    return map;
  }


  /**
   * Refills the input buffer.
   *
   * @return      <code>false</code>, iff there was new input.
   * 
   * @exception   java.io.IOException  if any I/O-Error occurs
   */
  private boolean zzRefill() throws java.io.IOException {

    /* first: make room (if you can) */
    if (zzStartRead > 0) {
      System.arraycopy(zzBuffer, zzStartRead,
                       zzBuffer, 0,
                       zzEndRead-zzStartRead);

      /* translate stored positions */
      zzEndRead-= zzStartRead;
      zzCurrentPos-= zzStartRead;
      zzMarkedPos-= zzStartRead;
      zzStartRead = 0;
    }

    /* is the buffer big enough? */
    if (zzCurrentPos >= zzBuffer.length) {
      /* if not: blow it up */
      char newBuffer[] = new char[zzCurrentPos*2];
      System.arraycopy(zzBuffer, 0, newBuffer, 0, zzBuffer.length);
      zzBuffer = newBuffer;
    }

    /* finally: fill the buffer with new input */
    int numRead = zzReader.read(zzBuffer, zzEndRead,
                                            zzBuffer.length-zzEndRead);

    if (numRead > 0) {
      zzEndRead+= numRead;
      return false;
    }
    // unlikely but not impossible: read 0 characters, but not at end of stream    
    if (numRead == 0) {
      int c = zzReader.read();
      if (c == -1) {
        return true;
      } else {
        zzBuffer[zzEndRead++] = (char) c;
        return false;
      }     
    }

	// numRead < 0
    return true;
  }

    
  /**
   * Closes the input stream.
   */
  public final void yyclose() throws java.io.IOException {
    zzAtEOF = true;            /* indicate end of file */
    zzEndRead = zzStartRead;  /* invalidate buffer    */

    if (zzReader != null)
      zzReader.close();
  }


  /**
   * Resets the scanner to read from a new input stream.
   * Does not close the old reader.
   *
   * All internal variables are reset, the old input stream 
   * <b>cannot</b> be reused (internal buffer is discarded and lost).
   * Lexical state is set to <tt>ZZ_INITIAL</tt>.
   *
   * @param reader   the new input stream 
   */
  public final void yyreset(java.io.Reader reader) {
    zzReader = reader;
    zzAtBOL  = true;
    zzAtEOF  = false;
    zzEOFDone = false;
    zzEndRead = zzStartRead = 0;
    zzCurrentPos = zzMarkedPos = 0;
    yyline = yychar = yycolumn = 0;
    zzLexicalState = YYINITIAL;
  }


  /**
   * Returns the current lexical state.
   */
  public final int yystate() {
    return zzLexicalState;
  }


  /**
   * Enters a new lexical state
   *
   * @param newState the new lexical state
   */
  public final void yybegin(int newState) {
    zzLexicalState = newState;
  }


  /**
   * Returns the text matched by the current regular expression.
   */
  public final String yytext() {
    return new String( zzBuffer, zzStartRead, zzMarkedPos-zzStartRead );
  }


  /**
   * Returns the character at position <tt>pos</tt> from the 
   * matched text. 
   * 
   * It is equivalent to yytext().charAt(pos), but faster
   *
   * @param pos the position of the character to fetch. 
   *            A value from 0 to yylength()-1.
   *
   * @return the character at position pos
   */
  public final char yycharat(int pos) {
    return zzBuffer[zzStartRead+pos];
  }


  /**
   * Returns the length of the matched text region.
   */
  public final int yylength() {
    return zzMarkedPos-zzStartRead;
  }


  /**
   * Reports an error that occured while scanning.
   *
   * In a wellformed scanner (no or only correct usage of 
   * yypushback(int) and a match-all fallback rule) this method 
   * will only be called with things that "Can't Possibly Happen".
   * If this method is called, something is seriously wrong
   * (e.g. a JFlex bug producing a faulty scanner etc.).
   *
   * Usual syntax/scanner level error handling should be done
   * in error fallback rules.
   *
   * @param   errorCode  the code of the errormessage to display
   */
  private void zzScanError(int errorCode) {
    String message;
    try {
      message = ZZ_ERROR_MSG[errorCode];
    }
    catch (ArrayIndexOutOfBoundsException e) {
      message = ZZ_ERROR_MSG[ZZ_UNKNOWN_ERROR];
    }

    throw new Error(message);
  } 


  /**
   * Pushes the specified amount of characters back into the input stream.
   *
   * They will be read again by then next call of the scanning method
   *
   * @param number  the number of characters to be read again.
   *                This number must not be greater than yylength()!
   */
  public void yypushback(int number)  {
    if ( number > yylength() )
      zzScanError(ZZ_PUSHBACK_2BIG);

    zzMarkedPos -= number;
  }


  /**
   * Resumes scanning until the next regular expression is matched,
   * the end of input is encountered or an I/O-Error occurs.
   *
   * @return      the next token
   * @exception   java.io.IOException  if any I/O-Error occurs
   */
  public int yylex() throws java.io.IOException {
    int zzInput;
    int zzAction;

    // cached fields:
    int zzCurrentPosL;
    int zzMarkedPosL;
    int zzEndReadL = zzEndRead;
    char [] zzBufferL = zzBuffer;
    char [] zzCMapL = ZZ_CMAP;

    int [] zzTransL = ZZ_TRANS;
    int [] zzRowMapL = ZZ_ROWMAP;
    int [] zzAttrL = ZZ_ATTRIBUTE;

    while (true) {
      zzMarkedPosL = zzMarkedPos;

      zzAction = -1;

      zzCurrentPosL = zzCurrentPos = zzStartRead = zzMarkedPosL;
  
      zzState = ZZ_LEXSTATE[zzLexicalState];


      zzForAction: {
        while (true) {
    
          if (zzCurrentPosL < zzEndReadL)
            zzInput = zzBufferL[zzCurrentPosL++];
          else if (zzAtEOF) {
            zzInput = YYEOF;
            break zzForAction;
          }
          else {
            // store back cached positions
            zzCurrentPos  = zzCurrentPosL;
            zzMarkedPos   = zzMarkedPosL;
            boolean eof = zzRefill();
            // get translated positions and possibly new buffer
            zzCurrentPosL  = zzCurrentPos;
            zzMarkedPosL   = zzMarkedPos;
            zzBufferL      = zzBuffer;
            zzEndReadL     = zzEndRead;
            if (eof) {
              zzInput = YYEOF;
              break zzForAction;
            }
            else {
              zzInput = zzBufferL[zzCurrentPosL++];
            }
          }
          int zzNext = zzTransL[ zzRowMapL[zzState] + zzCMapL[zzInput] ];
          if (zzNext == -1) break zzForAction;
          zzState = zzNext;

          int zzAttributes = zzAttrL[zzState];
          if ( (zzAttributes & 1) == 1 ) {
            zzAction = zzState;
            zzMarkedPosL = zzCurrentPosL;
            if ( (zzAttributes & 8) == 8 ) break zzForAction;
          }

        }
      }

      // store back cached position
      zzMarkedPos = zzMarkedPosL;

      switch (zzAction < 0 ? zzAction : ZZ_ACTION[zzAction]) {
        case 4: 
          { System.out.print(yytext());
          }
        case 19: break;
        case 8: 
          { //System.err.println("Transitioning to SRCID");
                          yybegin(SRCID); return IGNORE;
          }
        case 20: break;
        case 10: 
          { yybegin(HEADER); return IGNORE;
          }
        case 21: break;
        case 14: 
          { //System.err.println("Transitioning to DOCTYPE");
                          yybegin(DOCTYPE); return IGNORE;
          }
        case 22: break;
        case 9: 
          { //System.err.println("Transitioning to YYINITIAL");
                   yybegin(YYINITIAL); return IGNORE;
          }
        case 23: break;
        case 17: 
          { //System.err.println("Transitioning to YYINITIAL");
                  yybegin(YYINITIAL); return IGNORE;
          }
        case 24: break;
        case 5: 
          { //System.err.println("Transitioning to DATETIME");
                          yybegin(DATETIME); return IGNORE;
          }
        case 25: break;
        case 6: 
          { yybegin(DATEINHEADER); return IGNORE;
          }
        case 26: break;
        case 12: 
          { // System.err.println("Transitioning to YYINITIAL");
                yybegin(YYINITIAL); return IGNORE;
          }
        case 27: break;
        case 18: 
          { yybegin(YYINITIAL); return IGNORE;
          }
        case 28: break;
        case 7: 
          { // System.err.println("Transitioning to DOCNO");
                          yybegin(DOCNO); return IGNORE;
          }
        case 29: break;
        case 2: 
          { return IGNORE;
          }
        case 30: break;
        case 13: 
          { //System.err.println("In SRCID; Transitioning to YYINITIAL");
                yybegin(YYINITIAL); return IGNORE;
          }
        case 31: break;
        case 15: 
          { //System.err.println("Transitioning to YYINITIAL");
                yybegin(YYINITIAL); return IGNORE;
          }
        case 32: break;
        case 16: 
          { yybegin(PREAMBLE); return IGNORE;
          }
        case 33: break;
        case 1: 
          { return ACCEPT;
          }
        case 34: break;
        case 3: 
          { reportError(yytext());
          }
        case 35: break;
        case 11: 
          { //System.err.println("Transitioning to HEADER");
                          yybegin(HEADER); return IGNORE;
          }
        case 36: break;
        default: 
          if (zzInput == YYEOF && zzStartRead == zzCurrentPos) {
            zzAtEOF = true;
            return YYEOF;
          } 
          else {
            zzScanError(ZZ_NO_MATCH);
          }
      }
    }
  }

  /**
   * Runs the scanner on input files.
   *
   * This is a standalone scanner, it will print any unmatched
   * text to System.out unchanged.
   *
   * @param argv   the command line, contains the filenames to run
   *               the scanner on.
   */
  public static void main(String argv[]) {
    if (argv.length == 0) {
      System.out.println("Usage : java CHTBLexer <inputfile>");
    }
    else {
      for (int i = 0; i < argv.length; i++) {
        CHTBLexer scanner = null;
        try {
          scanner = new CHTBLexer( new java.io.FileReader(argv[i]) );
          while ( !scanner.zzAtEOF ) scanner.yylex();
        }
        catch (java.io.FileNotFoundException e) {
          System.out.println("File not found : \""+argv[i]+"\"");
        }
        catch (java.io.IOException e) {
          System.out.println("IO error scanning file \""+argv[i]+"\"");
          System.out.println(e);
        }
        catch (Exception e) {
          System.out.println("Unexpected exception:");
          e.printStackTrace();
        }
      }
    }
  }


}
