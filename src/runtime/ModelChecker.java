package runtime;

import java.io.File;
import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;

public class ModelChecker {
	//Weak("weak", "-eweak-bisim"),
	//Strong("strong", "-ebisim"),
	//Trace("trace", "-etrace");

	private static final String eqFlag = "-ebisim";
	//private final String cmd;

	//ModelChecker(String cmd, String eqFlag) {
	//	this.cmd = cmd;
	//	this.eqFlag = eqFlag;
	//}

	//public String toString() {
	//	return cmd;
	//}

	public static final String mcrl2 = ".mcrl2";
	private static final String lps = ".lps";
	private static final String lts = ".lts";

	private static Runtime r = Runtime.getRuntime();

	private static Process exec(String cmd) throws IOException, InterruptedException {
		Process p = r.exec(cmd);
		p.waitFor();
		return p;
	}

	private static final String tmpDir = "/tmp/";
	private static final File tmp = new File(tmpDir);	
	public static final String createTmpFile(String name) throws IOException {
		File f = File.createTempFile(name + ".tmp.", "", tmp);
		return  tmpDir + f.getName();
	}

	public static Process lps(String file) throws IOException, InterruptedException {
		return exec("mcrl22lps " + file + mcrl2 + " " + file + lps);
	}

	public static Process lts(String ifile, String ofile) throws IOException, InterruptedException {
		return exec("lps2lts " + ifile + lps + " " + ofile + lts);
	}

	private static Process bisimulation(String file1, String file2) throws IOException, InterruptedException {
		return exec("ltscompare " + eqFlag + " " + file1 + lts + " " + file2 + lts);
	}

	private static Process ltsgraph(String file) throws IOException, InterruptedException {
		return exec("ltsgraph " + file + lts);
	}

	public static String graph(String file) throws IOException, InterruptedException {
		Process p = lps(file);
		p = lts(file, file);

		p = ltsgraph(file);
		return readOutput(p);
	}

	public static String bisimulationCheck(String file1, String file2) throws IOException, InterruptedException {
		Process p = lps(file1);
		p = lps(file2);
		p = lts(file1, file1);
		p = lts(file2, file2);

		p = bisimulation(file1, file2);
		return readOutput(p);
	}

	private static String readOutput(Process p) throws IOException {
		BufferedReader is = new BufferedReader(new InputStreamReader(p.getErrorStream())); 
		String line, s = "";         
		while((line = is.readLine()) != null)
			s += line;
		return s;
	}
}

