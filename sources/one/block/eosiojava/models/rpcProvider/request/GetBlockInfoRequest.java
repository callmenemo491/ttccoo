package one.block.eosiojava.models.rpcProvider.request;

/* loaded from: classes.dex */
public class GetBlockInfoRequest {

    @p189kb.InterfaceC4079b("block_num_or_id")
    private java.math.BigInteger blockNum;

    public GetBlockInfoRequest(java.math.BigInteger r1) {
            r0 = this;
            r0.<init>()
            r0.blockNum = r1
            return
    }

    public java.math.BigInteger getBlockNum() {
            r1 = this;
            java.math.BigInteger r0 = r1.blockNum
            return r0
    }

    public void setBlockNum(java.math.BigInteger r1) {
            r0 = this;
            r0.blockNum = r1
            return
    }
}
