import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.util.StringTokenizer;

public class For_InputSum3_10950 {
	public static void main(String[] args)throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer st;
		int a,b,num;
		num = Integer.parseInt(br.readLine());
		for(int i=0; i<num; i++) {
			st = new StringTokenizer(br.readLine());
			a = Integer.parseInt(st.nextToken());
			b = Integer.parseInt(st.nextToken());
			bw.append(String.valueOf(a+b)).append("\n");
		}
		bw.flush();
	}
}