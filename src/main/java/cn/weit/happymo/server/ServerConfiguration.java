package cn.weit.happymo.server;

import com.google.common.collect.Lists;
import io.netty.handler.ssl.SslContext;
import lombok.Data;

import java.net.URI;
import java.util.List;

/**
 * @author weitong
 */
@Data
public class ServerConfiguration {
    private List<URI> addressList = Lists.newArrayList();
    private String userName;
    private String password;
    private SslContext sslContext;

}
