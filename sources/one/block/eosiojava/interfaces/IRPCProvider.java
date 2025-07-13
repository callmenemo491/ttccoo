package one.block.eosiojava.interfaces;

/* loaded from: classes.dex */
public interface IRPCProvider {
    one.block.eosiojava.models.rpcProvider.response.GetBlockInfoResponse getBlockInfo(one.block.eosiojava.models.rpcProvider.request.GetBlockInfoRequest r1);

    one.block.eosiojava.models.rpcProvider.response.GetInfoResponse getInfo();

    one.block.eosiojava.models.rpcProvider.response.GetRawAbiResponse getRawAbi(one.block.eosiojava.models.rpcProvider.request.GetRawAbiRequest r1);

    one.block.eosiojava.models.rpcProvider.response.GetRequiredKeysResponse getRequiredKeys(one.block.eosiojava.models.rpcProvider.request.GetRequiredKeysRequest r1);

    one.block.eosiojava.models.rpcProvider.response.SendTransactionResponse sendTransaction(one.block.eosiojava.models.rpcProvider.request.SendTransactionRequest r1);
}
