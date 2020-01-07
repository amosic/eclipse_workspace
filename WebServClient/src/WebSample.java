import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;

import org.apache.http.HttpResponse;
import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.DefaultHttpClient;
import org.apache.http.impl.client.HttpClients;
import org.json.JSONArray;
import org.json.JSONException;

public class WebSample {
	public static void main(String[] args) {
		/*try {
			String url = "https://www.ecosia.org/search?q=prova";

			CloseableHttpClient httpclient = HttpClients.createDefault();
			HttpGet get = new HttpGet(url);
			HttpResponse response = httpclient.execute(get);
			int responseCode = response.getStatusLine().getStatusCode();

			if (responseCode == 200) {
				InputStream istream = response.getEntity().getContent();
				BufferedReader r = new BufferedReader(new InputStreamReader(istream));
				String s = null;
				StringBuffer sb = new StringBuffer();

				while ((s = r.readLine()) != null) {
					System.out.println(s);
					sb.append(s);
				}
			}
		} catch (Exception e) {
			e.printStackTrace();
		}*/

		String jsonString = "[{\"nome\":\"Antonio\",\n" + "\"cognome\": \"Lezzi\",\n" + "\"cell\": \"32000000\",\n"
				+ "\"eta\":37\n" + "},\n" + "{\"nome\":\"Giovanni\",\n" + "\"cognome\": \"Rana\",\n"
				+ "\"cell\": \"320000001\",\n" + "\"eta\":67\n" + "},\n" + "{\"nome\":\"Mario\",\n"
				+ "\"cognome\": \"Rossi\",\n" + "\"cell\": \"320000002\",\n" + "\"eta\":43\n" + "},\n"
				+ "{\"nome\":\"Giuseppe\",\n" + "\"cognome\": \"Verdi\",\n" + "\"cell\": \"320000003\",\n"
				+ "\"eta\":12\n" + "}\n" + "]";

		
		try {
			JSONArray array = new JSONArray(jsonString);

			for (int i = 0; i < array.length(); i++) {
				String nome = array.getJSONObject(i).getString("nome");
				Integer eta = array.getJSONObject(i).getInt("eta");
				System.out.println(nome + " ha anni " + eta);
			}
		} catch (JSONException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}

/*
 * [{"nome":"Antonio", "cognome": "Lezzi", "cell": "32000000", "eta":37 },
 * {"nome":"Giovanni", "cognome": "Rana", "cell": "320000001", "eta":67 },
 * {"nome":"Mario", "cognome": "Rossi", "cell": "320000002", "eta":43 },
 * {"nome":"Giuseppe", "cognome": "Verdi", "cell": "320000003", "eta":12 } ]
 */
