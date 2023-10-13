package pdp_deneme;

public class Yorumlar {
	private int singleLineCommentCount;
	private int multiLineCommentCount;
	private int javadocCount;
	
	public Yorumlar(int singleLineCommentCount, int multiLineCommentCount, int javadocCount) {
	    this.singleLineCommentCount = singleLineCommentCount;
	    this.multiLineCommentCount = multiLineCommentCount;
	    this.javadocCount = javadocCount;
	}

	public int getSingleLineCommentCount() {
	    return singleLineCommentCount;
	}

	public int getMultiLineCommentCount() {
	    return multiLineCommentCount;
	}

	public int getJavadocCount() {
	    return javadocCount;
	}
}
