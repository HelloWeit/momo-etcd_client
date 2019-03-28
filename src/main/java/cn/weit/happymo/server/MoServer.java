package cn.weit.happymo.server;

import com.google.common.collect.Lists;
import lombok.NoArgsConstructor;
import lombok.extern.slf4j.Slf4j;

import java.net.URI;
import java.net.URISyntaxException;
import java.util.Arrays;
import java.util.List;

/**
 * @author weitong
 */
@Slf4j
@NoArgsConstructor
public class MoServer {
    private List<URI> addressList = Lists.newArrayList();
    private String userName;
    private String password;

    public MoServer withIpAndPort(String ip, int port, boolean isHttps) throws URISyntaxException {
        String scheme = "http://";
        if (isHttps) {
            scheme = "https://";
        }
        addressList.add(new URI(scheme + ip + ":" + port));
        return this;
    }

    public MoServer withUri(URI... uri) {
        addressList.addAll(Arrays.asList(uri));
        return this;
    }




}
