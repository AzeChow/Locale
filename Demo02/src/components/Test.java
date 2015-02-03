package components;

import java.util.Arrays;

import org.apache.http.Header;
import org.apache.http.HttpRequest;
import org.apache.http.HttpResponse;
import org.apache.http.HttpStatus;
import org.apache.http.HttpVersion;
import org.apache.http.message.BasicHttpRequest;
import org.apache.http.message.BasicHttpResponse;

public class Test {

	public static void main(String[] args) {

		System.out.println(Arrays.toString(args));

		HttpRequest request = new BasicHttpRequest("GET", "/",
				HttpVersion.HTTP_1_1);

		System.out.println(request.getRequestLine().getMethod());

		System.out.println(request.getRequestLine().getUri());

		System.out.println(request.getProtocolVersion());

		System.out.println(request.getRequestLine().toString());

		HttpResponse response = new BasicHttpResponse(HttpVersion.HTTP_1_1,
				HttpStatus.SC_OK, "OK");

		System.out.println(response.getProtocolVersion());

		System.out.println(response.getStatusLine().getStatusCode());

		System.out.println(response.getStatusLine().getReasonPhrase());

		System.out.println(response.getStatusLine().toString());

		response.addHeader("Set-Cookie", "c1=a;path=/;domain=localhost");

		response.addHeader("Set-Cookie",
				"c2=b;path=\"/\",c3=c;domain=\"localhost\"");

		Header header = response.getFirstHeader("Set-Cookie");

		System.out.println(header);

		Header header2 = response.getLastHeader("Set-Cookie");

		System.out.println(header2);

		Header[] headers = response.getHeaders("Set-Cookie");

		System.out.println(Arrays.toString(headers));

	}

}
