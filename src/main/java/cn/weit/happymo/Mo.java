package cn.weit.happymo;

import cn.weit.happymo.enums.ResultEnum;
import cn.weit.happymo.exception.MoException;
import cn.weit.happymo.server.MoServer;

/**
 * @author weitong
 */
public class Mo {
    private Mo() {
        throw new MoException(ResultEnum.INIT_ERROR);
    }

    public static MoServer moServerBuilder() {
        return new MoServer();
    }
}
