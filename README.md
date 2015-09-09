<h1> Telstra WIFI API </h1>

The following project exposes the Telstra WIFI API using a a spring boot application that has a RESTful method to invoke 
the Telstra WIFI API.

![alt tag](https://dl.dropboxusercontent.com/u/15829935/bluemix-docs/telstraapi-bluemix/images/telstra-wifi.png)

manifest.yml

```
applications:
- name: pas-telstawifiapi
  memory: 512M
  instances: 1
  host: pas-telstawifiapi
  domain: mybluemix.net
  path: ./target/TelstraWIFIApiDemo-0.0.1-SNAPSHOT.jar
  env:
   JBP_CONFIG_IBMJDK: "version: 1.8.+"
 ```

Once deployed you can access the RESTful method as follows

```
#!/usr/bin/env bash

curl http://pas-telstawifiapi.mybluemix.net/sample

echo ""
echo ""

curl "http://pas-telstawifiapi.mybluemix.net/findhotspots?latitude=-37.818496&longitude=144.953240&radius=100"

echo ""
echo ""
```

Pas Apicella [pasapi at au1.ibm.com] is a Bluemix Technical Specialist at IBM Australia