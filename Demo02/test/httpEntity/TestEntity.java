package httpEntity;

import java.io.InputStream;

import org.apache.http.HttpEntity;
import org.apache.http.HttpResponse;
import org.apache.http.entity.BasicHttpEntity;
import org.junit.Test;

public class TestEntity {

	@Test
	public void testHttpEntities() throws Exception {

		HttpResponse response = null;

		HttpEntity entity = response.getEntity();

		BasicHttpEntity basicHttpEntity = new BasicHttpEntity();

		if (entity != null) {

			InputStream inputStream = entity.getContent();

			basicHttpEntity.setContent(inputStream);

			basicHttpEntity.setContentLength(120L);

			try {

			} finally {

				inputStream.close();

			}

		}

	}

}
