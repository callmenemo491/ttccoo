package one.block.eosiojavarpcprovider.implementations;

/* loaded from: classes.dex */
public interface IEosioJavaRpcProviderApi {
    @p115gk.InterfaceC2419o("v1/chain/get_abi")
    p082ek.InterfaceC1884b<bi.AbstractC0785h0> getAbi(@p115gk.InterfaceC2405a bi.AbstractC0781f0 r1);

    @p115gk.InterfaceC2419o("v1/chain/get_account")
    p082ek.InterfaceC1884b<bi.AbstractC0785h0> getAccount(@p115gk.InterfaceC2405a bi.AbstractC0781f0 r1);

    @p115gk.InterfaceC2419o("v1/history/get_actions")
    p082ek.InterfaceC1884b<bi.AbstractC0785h0> getActions(@p115gk.InterfaceC2405a bi.AbstractC0781f0 r1);

    @p115gk.InterfaceC2419o("v1/chain/get_block")
    p082ek.InterfaceC1884b<one.block.eosiojava.models.rpcProvider.response.GetBlockResponse> getBlock(@p115gk.InterfaceC2405a one.block.eosiojava.models.rpcProvider.request.GetBlockRequest r1);

    @p115gk.InterfaceC2419o("v1/chain/get_block_header_state")
    p082ek.InterfaceC1884b<bi.AbstractC0785h0> getBlockHeaderState(@p115gk.InterfaceC2405a bi.AbstractC0781f0 r1);

    @p115gk.InterfaceC2419o("v1/chain/get_block")
    p082ek.InterfaceC1884b<one.block.eosiojava.models.rpcProvider.response.GetBlockInfoResponse> getBlockInfo(@p115gk.InterfaceC2405a one.block.eosiojava.models.rpcProvider.request.GetBlockInfoRequest r1);

    @p115gk.InterfaceC2419o("v1/chain/get_code")
    p082ek.InterfaceC1884b<bi.AbstractC0785h0> getCode(@p115gk.InterfaceC2405a bi.AbstractC0781f0 r1);

    @p115gk.InterfaceC2419o("v1/history/get_controlled_accounts")
    p082ek.InterfaceC1884b<bi.AbstractC0785h0> getControlledAccounts(@p115gk.InterfaceC2405a bi.AbstractC0781f0 r1);

    @p115gk.InterfaceC2419o("v1/chain/get_currency_balance")
    p082ek.InterfaceC1884b<bi.AbstractC0785h0> getCurrencyBalance(@p115gk.InterfaceC2405a bi.AbstractC0781f0 r1);

    @p115gk.InterfaceC2419o("v1/chain/get_currency_stats")
    p082ek.InterfaceC1884b<bi.AbstractC0785h0> getCurrencyStats(@p115gk.InterfaceC2405a bi.AbstractC0781f0 r1);

    @p115gk.InterfaceC2419o("v1/chain/get_info")
    p082ek.InterfaceC1884b<one.block.eosiojava.models.rpcProvider.response.GetInfoResponse> getInfo();

    @p115gk.InterfaceC2419o("v1/history/get_key_accounts")
    p082ek.InterfaceC1884b<bi.AbstractC0785h0> getKeyAccounts(@p115gk.InterfaceC2405a bi.AbstractC0781f0 r1);

    @p115gk.InterfaceC2419o("v1/chain/get_kv_table_rows")
    p082ek.InterfaceC1884b<bi.AbstractC0785h0> getKvTableRows(@p115gk.InterfaceC2405a bi.AbstractC0781f0 r1);

    @p115gk.InterfaceC2419o("v1/chain/get_producers")
    p082ek.InterfaceC1884b<bi.AbstractC0785h0> getProducers(@p115gk.InterfaceC2405a bi.AbstractC0781f0 r1);

    @p115gk.InterfaceC2419o("v1/chain/get_raw_abi")
    p082ek.InterfaceC1884b<one.block.eosiojava.models.rpcProvider.response.GetRawAbiResponse> getRawAbi(@p115gk.InterfaceC2405a one.block.eosiojava.models.rpcProvider.request.GetRawAbiRequest r1);

    @p115gk.InterfaceC2419o("v1/chain/get_raw_code_and_abi")
    p082ek.InterfaceC1884b<bi.AbstractC0785h0> getRawCodeAndAbi(@p115gk.InterfaceC2405a bi.AbstractC0781f0 r1);

    @p115gk.InterfaceC2419o("v1/chain/get_required_keys")
    p082ek.InterfaceC1884b<one.block.eosiojava.models.rpcProvider.response.GetRequiredKeysResponse> getRequiredKeys(@p115gk.InterfaceC2405a one.block.eosiojava.models.rpcProvider.request.GetRequiredKeysRequest r1);

    @p115gk.InterfaceC2419o("v1/chain/get_table_by_scope")
    p082ek.InterfaceC1884b<bi.AbstractC0785h0> getTableByScope(@p115gk.InterfaceC2405a bi.AbstractC0781f0 r1);

    @p115gk.InterfaceC2419o("v1/chain/get_table_rows")
    p082ek.InterfaceC1884b<bi.AbstractC0785h0> getTableRows(@p115gk.InterfaceC2405a bi.AbstractC0781f0 r1);

    @p115gk.InterfaceC2419o("v1/history/get_transaction")
    p082ek.InterfaceC1884b<bi.AbstractC0785h0> getTransaction(@p115gk.InterfaceC2405a bi.AbstractC0781f0 r1);

    @p115gk.InterfaceC2419o("v1/chain/push_transaction")
    p082ek.InterfaceC1884b<one.block.eosiojava.models.rpcProvider.response.PushTransactionResponse> pushTransaction(@p115gk.InterfaceC2405a one.block.eosiojava.models.rpcProvider.request.PushTransactionRequest r1);

    @p115gk.InterfaceC2419o("v1/chain/push_transactions")
    p082ek.InterfaceC1884b<bi.AbstractC0785h0> pushTransactions(@p115gk.InterfaceC2405a bi.AbstractC0781f0 r1);

    @p115gk.InterfaceC2419o("v1/chain/send_transaction")
    p082ek.InterfaceC1884b<one.block.eosiojava.models.rpcProvider.response.SendTransactionResponse> sendTransaction(@p115gk.InterfaceC2405a one.block.eosiojava.models.rpcProvider.request.SendTransactionRequest r1);
}
