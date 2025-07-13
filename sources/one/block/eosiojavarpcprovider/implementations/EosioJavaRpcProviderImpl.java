package one.block.eosiojavarpcprovider.implementations;

/* loaded from: classes.dex */
public class EosioJavaRpcProviderImpl implements one.block.eosiojava.interfaces.IRPCProvider {
    private java.lang.String baseURL;
    private p082ek.C1885b0 retrofit;
    private one.block.eosiojavarpcprovider.implementations.IEosioJavaRpcProviderApi rpcProviderApi;

    public EosioJavaRpcProviderImpl(java.lang.String r2) {
            r1 = this;
            r0 = 0
            r1.<init>(r2, r0)
            return
    }

    public EosioJavaRpcProviderImpl(java.lang.String r13, boolean r14) {
            r12 = this;
            r12.<init>()
            if (r13 == 0) goto L193
            boolean r0 = r13.isEmpty()
            if (r0 != 0) goto L193
            r12.baseURL = r13
            bi.a0$a r13 = new bi.a0$a
            r13.<init>()
            if (r14 == 0) goto L2c
            ni.a r14 = new ni.a
            r14.<init>()
            ni.a$a r0 = ni.C4841a.a.f19240a0
            java.lang.String r1 = "level"
            p214m2.C4339q.m9706k(r0, r1)
            r14.f19236b = r0
            java.lang.String r0 = "interceptor"
            p214m2.C4339q.m9706k(r14, r0)
            java.util.List<bi.x> r0 = r13.f4165c
            r0.add(r14)
        L2c:
            ek.u r14 = p082ek.C1908u.f8250c
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            java.lang.String r2 = r12.baseURL
            java.lang.String r3 = "baseUrl == null"
            java.util.Objects.requireNonNull(r2, r3)
            java.lang.String r3 = "$this$toHttpUrl"
            p214m2.C4339q.m9706k(r2, r3)
            bi.w$a r3 = new bi.w$a
            r3.<init>()
            r4 = 0
            r3.m2450d(r4, r2)
            bi.w r7 = r3.m2447a()
            java.util.List<java.lang.String> r2 = r7.f4351g
            int r3 = r2.size()
            int r3 = r3 + (-1)
            java.lang.Object r2 = r2.get(r3)
            java.lang.String r3 = ""
            boolean r2 = r3.equals(r2)
            if (r2 == 0) goto L17c
            jb.j r2 = new jb.j
            r2.<init>()
            fk.a r3 = new fk.a
            r3.<init>(r2)
            r0.add(r3)
            bi.a0 r6 = new bi.a0
            r6.<init>(r13)
            java.util.concurrent.Executor r10 = r14.mo4685a()
            java.util.ArrayList r13 = new java.util.ArrayList
            r13.<init>(r1)
            ek.g r1 = new ek.g
            r1.<init>(r10)
            boolean r2 = r14.f8251a
            r3 = 0
            r4 = 1
            if (r2 == 0) goto L99
            r2 = 2
            ek.c$a[] r2 = new p082ek.InterfaceC1886c.a[r2]
            ek.c$a r5 = p082ek.C1890e.f8153a
            r2[r3] = r5
            r2[r4] = r1
            java.util.List r1 = java.util.Arrays.asList(r2)
            goto L9d
        L99:
            java.util.List r1 = java.util.Collections.singletonList(r1)
        L9d:
            r13.addAll(r1)
            java.util.ArrayList r1 = new java.util.ArrayList
            int r2 = r0.size()
            int r2 = r2 + r4
            boolean r5 = r14.f8251a
            int r2 = r2 + r5
            r1.<init>(r2)
            ek.a r2 = new ek.a
            r2.<init>()
            r1.add(r2)
            r1.addAll(r0)
            boolean r14 = r14.f8251a
            if (r14 == 0) goto Lc3
            ek.f$a r14 = p082ek.C1904q.f8207a
            java.util.List r14 = java.util.Collections.singletonList(r14)
            goto Lc7
        Lc3:
            java.util.List r14 = java.util.Collections.emptyList()
        Lc7:
            r1.addAll(r14)
            ek.b0 r14 = new ek.b0
            java.util.List r8 = java.util.Collections.unmodifiableList(r1)
            java.util.List r9 = java.util.Collections.unmodifiableList(r13)
            r11 = 0
            r5 = r14
            r5.<init>(r6, r7, r8, r9, r10, r11)
            r12.retrofit = r14
            java.lang.Class<one.block.eosiojavarpcprovider.implementations.IEosioJavaRpcProviderApi> r13 = one.block.eosiojavarpcprovider.implementations.IEosioJavaRpcProviderApi.class
            java.util.Objects.requireNonNull(r14)
            boolean r0 = r13.isInterface()
            if (r0 == 0) goto L174
            java.util.ArrayDeque r0 = new java.util.ArrayDeque
            r0.<init>(r4)
            r0.add(r13)
        Lee:
            boolean r1 = r0.isEmpty()
            if (r1 != 0) goto L12f
            java.lang.Object r1 = r0.removeFirst()
            java.lang.Class r1 = (java.lang.Class) r1
            java.lang.reflect.TypeVariable[] r2 = r1.getTypeParameters()
            int r2 = r2.length
            if (r2 == 0) goto L127
            java.lang.StringBuilder r14 = new java.lang.StringBuilder
            java.lang.String r0 = "Type parameters are unsupported on "
            r14.<init>(r0)
            java.lang.String r0 = r1.getName()
            r14.append(r0)
            if (r1 == r13) goto L11d
            java.lang.String r0 = " which is an interface of "
            r14.append(r0)
            java.lang.String r13 = r13.getName()
            r14.append(r13)
        L11d:
            java.lang.IllegalArgumentException r13 = new java.lang.IllegalArgumentException
            java.lang.String r14 = r14.toString()
            r13.<init>(r14)
            throw r13
        L127:
            java.lang.Class[] r1 = r1.getInterfaces()
            java.util.Collections.addAll(r0, r1)
            goto Lee
        L12f:
            boolean r0 = r14.f8152f
            if (r0 == 0) goto L15e
            ek.u r0 = p082ek.C1908u.f8250c
            java.lang.reflect.Method[] r1 = r13.getDeclaredMethods()
            int r2 = r1.length
            r5 = 0
        L13b:
            if (r5 >= r2) goto L15e
            r6 = r1[r5]
            boolean r7 = r0.f8251a
            if (r7 == 0) goto L14b
            boolean r7 = r6.isDefault()
            if (r7 == 0) goto L14b
            r7 = 1
            goto L14c
        L14b:
            r7 = 0
        L14c:
            if (r7 != 0) goto L15b
            int r7 = r6.getModifiers()
            boolean r7 = java.lang.reflect.Modifier.isStatic(r7)
            if (r7 != 0) goto L15b
            r14.m4649b(r6)
        L15b:
            int r5 = r5 + 1
            goto L13b
        L15e:
            java.lang.ClassLoader r0 = r13.getClassLoader()
            java.lang.Class[] r1 = new java.lang.Class[r4]
            r1[r3] = r13
            ek.a0 r2 = new ek.a0
            r2.<init>(r14, r13)
            java.lang.Object r13 = java.lang.reflect.Proxy.newProxyInstance(r0, r1, r2)
            one.block.eosiojavarpcprovider.implementations.IEosioJavaRpcProviderApi r13 = (one.block.eosiojavarpcprovider.implementations.IEosioJavaRpcProviderApi) r13
            r12.rpcProviderApi = r13
            return
        L174:
            java.lang.IllegalArgumentException r13 = new java.lang.IllegalArgumentException
            java.lang.String r14 = "API declarations must be interfaces."
            r13.<init>(r14)
            throw r13
        L17c:
            java.lang.IllegalArgumentException r13 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r14 = new java.lang.StringBuilder
            r14.<init>()
            java.lang.String r0 = "baseUrl must end in /: "
            r14.append(r0)
            r14.append(r7)
            java.lang.String r14 = r14.toString()
            r13.<init>(r14)
            throw r13
        L193:
            one.block.eosiojavarpcprovider.error.EosioJavaRpcProviderInitializerError r13 = new one.block.eosiojavarpcprovider.error.EosioJavaRpcProviderInitializerError
            java.lang.String r14 = "Base URL cannot be empty or null."
            r13.<init>(r14)
            throw r13
    }

    private <O> O processCall(p082ek.InterfaceC1884b<O> r7) {
            r6 = this;
            ek.z r7 = r7.mo4644h()
            boolean r0 = r7.m4697a()
            if (r0 != 0) goto L67
            r0 = 0
            bi.h0 r1 = r7.f8307c
            if (r1 == 0) goto L3d
            jb.j r0 = new jb.j
            r0.<init>()
            bi.h0 r1 = r7.f8307c
            java.io.Reader r1 = r1.m2393a()
            java.lang.Class<one.block.eosiojava.models.rpcProvider.response.RPCResponseError> r2 = one.block.eosiojava.models.rpcProvider.response.RPCResponseError.class
            qb.a r1 = r0.m7933g(r1)
            java.lang.Object r0 = r0.m7930d(r1, r2)
            p169jb.C3467j.m7927a(r0, r1)
            java.lang.Class r1 = p074e9.C1805a.m4513A(r2)
            java.lang.Object r0 = r1.cast(r0)
            one.block.eosiojava.models.rpcProvider.response.RPCResponseError r0 = (one.block.eosiojava.models.rpcProvider.response.RPCResponseError) r0
            if (r0 != 0) goto L3a
            bi.h0 r1 = r7.f8307c
            java.lang.String r1 = r1.m2397n()
            goto L3f
        L3a:
            java.lang.String r1 = "See further error information in RPCProviderError."
            goto L3f
        L3d:
            java.lang.String r1 = "No further error information available."
        L3f:
            java.util.Locale r2 = java.util.Locale.getDefault()
            r3 = 3
            java.lang.Object[] r3 = new java.lang.Object[r3]
            r4 = 0
            bi.g0 r5 = r7.f8305a
            int r5 = r5.f4228b0
            java.lang.Integer r5 = java.lang.Integer.valueOf(r5)
            r3[r4] = r5
            r4 = 1
            bi.g0 r7 = r7.f8305a
            java.lang.String r7 = r7.f4227a0
            r3[r4] = r7
            r7 = 2
            r3[r7] = r1
            java.lang.String r7 = "Bad status code: %d (%s), returned from server. Additional error information: %s"
            java.lang.String r7 = java.lang.String.format(r2, r7, r3)
            one.block.eosiojavarpcprovider.error.EosioJavaRpcProviderCallError r1 = new one.block.eosiojavarpcprovider.error.EosioJavaRpcProviderCallError
            r1.<init>(r7, r0)
            throw r1
        L67:
            T r7 = r7.f8306b
            if (r7 == 0) goto L6c
            return r7
        L6c:
            one.block.eosiojavarpcprovider.error.EosioJavaRpcProviderCallError r7 = new one.block.eosiojavarpcprovider.error.EosioJavaRpcProviderCallError
            java.lang.String r0 = "Empty response returned from the server."
            r7.<init>(r0)
            throw r7
    }

    public java.lang.String getAbi(bi.AbstractC0781f0 r3) {
            r2 = this;
            one.block.eosiojavarpcprovider.implementations.IEosioJavaRpcProviderApi r0 = r2.rpcProviderApi     // Catch: java.lang.Exception -> L20
            ek.b r3 = r0.getAbi(r3)     // Catch: java.lang.Exception -> L20
            java.lang.Object r3 = r2.processCall(r3)     // Catch: java.lang.Exception -> L20
            bi.h0 r3 = (bi.AbstractC0785h0) r3     // Catch: java.lang.Exception -> L20
            java.lang.String r0 = r3.m2397n()     // Catch: java.lang.Throwable -> L14
            r3.close()     // Catch: java.lang.Exception -> L20
            return r0
        L14:
            r0 = move-exception
            if (r3 == 0) goto L1f
            r3.close()     // Catch: java.lang.Throwable -> L1b
            goto L1f
        L1b:
            r3 = move-exception
            r0.addSuppressed(r3)     // Catch: java.lang.Exception -> L20
        L1f:
            throw r0     // Catch: java.lang.Exception -> L20
        L20:
            r3 = move-exception
            one.block.eosiojava.error.rpcProvider.RpcProviderError r0 = new one.block.eosiojava.error.rpcProvider.RpcProviderError
            java.lang.String r1 = "Error get abi."
            r0.<init>(r1, r3)
            throw r0
    }

    public java.lang.String getAccount(bi.AbstractC0781f0 r3) {
            r2 = this;
            one.block.eosiojavarpcprovider.implementations.IEosioJavaRpcProviderApi r0 = r2.rpcProviderApi     // Catch: java.lang.Exception -> L20
            ek.b r3 = r0.getAccount(r3)     // Catch: java.lang.Exception -> L20
            java.lang.Object r3 = r2.processCall(r3)     // Catch: java.lang.Exception -> L20
            bi.h0 r3 = (bi.AbstractC0785h0) r3     // Catch: java.lang.Exception -> L20
            java.lang.String r0 = r3.m2397n()     // Catch: java.lang.Throwable -> L14
            r3.close()     // Catch: java.lang.Exception -> L20
            return r0
        L14:
            r0 = move-exception
            if (r3 == 0) goto L1f
            r3.close()     // Catch: java.lang.Throwable -> L1b
            goto L1f
        L1b:
            r3 = move-exception
            r0.addSuppressed(r3)     // Catch: java.lang.Exception -> L20
        L1f:
            throw r0     // Catch: java.lang.Exception -> L20
        L20:
            r3 = move-exception
            one.block.eosiojava.error.rpcProvider.RpcProviderError r0 = new one.block.eosiojava.error.rpcProvider.RpcProviderError
            java.lang.String r1 = "Error get account."
            r0.<init>(r1, r3)
            throw r0
    }

    public java.lang.String getActions(bi.AbstractC0781f0 r3) {
            r2 = this;
            one.block.eosiojavarpcprovider.implementations.IEosioJavaRpcProviderApi r0 = r2.rpcProviderApi     // Catch: java.lang.Exception -> L20
            ek.b r3 = r0.getActions(r3)     // Catch: java.lang.Exception -> L20
            java.lang.Object r3 = r2.processCall(r3)     // Catch: java.lang.Exception -> L20
            bi.h0 r3 = (bi.AbstractC0785h0) r3     // Catch: java.lang.Exception -> L20
            java.lang.String r0 = r3.m2397n()     // Catch: java.lang.Throwable -> L14
            r3.close()     // Catch: java.lang.Exception -> L20
            return r0
        L14:
            r0 = move-exception
            if (r3 == 0) goto L1f
            r3.close()     // Catch: java.lang.Throwable -> L1b
            goto L1f
        L1b:
            r3 = move-exception
            r0.addSuppressed(r3)     // Catch: java.lang.Exception -> L20
        L1f:
            throw r0     // Catch: java.lang.Exception -> L20
        L20:
            r3 = move-exception
            one.block.eosiojava.error.rpcProvider.RpcProviderError r0 = new one.block.eosiojava.error.rpcProvider.RpcProviderError
            java.lang.String r1 = "Error get action."
            r0.<init>(r1, r3)
            throw r0
    }

    public one.block.eosiojava.models.rpcProvider.response.GetBlockResponse getBlock(one.block.eosiojava.models.rpcProvider.request.GetBlockRequest r3) {
            r2 = this;
            one.block.eosiojavarpcprovider.implementations.IEosioJavaRpcProviderApi r0 = r2.rpcProviderApi     // Catch: java.lang.Exception -> Ld
            ek.b r3 = r0.getBlock(r3)     // Catch: java.lang.Exception -> Ld
            java.lang.Object r3 = r2.processCall(r3)     // Catch: java.lang.Exception -> Ld
            one.block.eosiojava.models.rpcProvider.response.GetBlockResponse r3 = (one.block.eosiojava.models.rpcProvider.response.GetBlockResponse) r3     // Catch: java.lang.Exception -> Ld
            return r3
        Ld:
            r3 = move-exception
            one.block.eosiojava.error.rpcProvider.GetBlockRpcError r0 = new one.block.eosiojava.error.rpcProvider.GetBlockRpcError
            java.lang.String r1 = "Error retrieving block information."
            r0.<init>(r1, r3)
            throw r0
    }

    public java.lang.String getBlockHeaderState(bi.AbstractC0781f0 r3) {
            r2 = this;
            one.block.eosiojavarpcprovider.implementations.IEosioJavaRpcProviderApi r0 = r2.rpcProviderApi     // Catch: java.lang.Exception -> L20
            ek.b r3 = r0.getBlockHeaderState(r3)     // Catch: java.lang.Exception -> L20
            java.lang.Object r3 = r2.processCall(r3)     // Catch: java.lang.Exception -> L20
            bi.h0 r3 = (bi.AbstractC0785h0) r3     // Catch: java.lang.Exception -> L20
            java.lang.String r0 = r3.m2397n()     // Catch: java.lang.Throwable -> L14
            r3.close()     // Catch: java.lang.Exception -> L20
            return r0
        L14:
            r0 = move-exception
            if (r3 == 0) goto L1f
            r3.close()     // Catch: java.lang.Throwable -> L1b
            goto L1f
        L1b:
            r3 = move-exception
            r0.addSuppressed(r3)     // Catch: java.lang.Exception -> L20
        L1f:
            throw r0     // Catch: java.lang.Exception -> L20
        L20:
            r3 = move-exception
            one.block.eosiojava.error.rpcProvider.RpcProviderError r0 = new one.block.eosiojava.error.rpcProvider.RpcProviderError
            java.lang.String r1 = "Error get block header state."
            r0.<init>(r1, r3)
            throw r0
    }

    @Override // one.block.eosiojava.interfaces.IRPCProvider
    public one.block.eosiojava.models.rpcProvider.response.GetBlockInfoResponse getBlockInfo(one.block.eosiojava.models.rpcProvider.request.GetBlockInfoRequest r3) {
            r2 = this;
            one.block.eosiojavarpcprovider.implementations.IEosioJavaRpcProviderApi r0 = r2.rpcProviderApi     // Catch: java.lang.Exception -> Ld
            ek.b r3 = r0.getBlockInfo(r3)     // Catch: java.lang.Exception -> Ld
            java.lang.Object r3 = r2.processCall(r3)     // Catch: java.lang.Exception -> Ld
            one.block.eosiojava.models.rpcProvider.response.GetBlockInfoResponse r3 = (one.block.eosiojava.models.rpcProvider.response.GetBlockInfoResponse) r3     // Catch: java.lang.Exception -> Ld
            return r3
        Ld:
            r3 = move-exception
            one.block.eosiojava.error.rpcProvider.GetBlockInfoRpcError r0 = new one.block.eosiojava.error.rpcProvider.GetBlockInfoRpcError
            java.lang.String r1 = "Error retrieving block information."
            r0.<init>(r1, r3)
            throw r0
    }

    public java.lang.String getCode(bi.AbstractC0781f0 r3) {
            r2 = this;
            one.block.eosiojavarpcprovider.implementations.IEosioJavaRpcProviderApi r0 = r2.rpcProviderApi     // Catch: java.lang.Exception -> L20
            ek.b r3 = r0.getCode(r3)     // Catch: java.lang.Exception -> L20
            java.lang.Object r3 = r2.processCall(r3)     // Catch: java.lang.Exception -> L20
            bi.h0 r3 = (bi.AbstractC0785h0) r3     // Catch: java.lang.Exception -> L20
            java.lang.String r0 = r3.m2397n()     // Catch: java.lang.Throwable -> L14
            r3.close()     // Catch: java.lang.Exception -> L20
            return r0
        L14:
            r0 = move-exception
            if (r3 == 0) goto L1f
            r3.close()     // Catch: java.lang.Throwable -> L1b
            goto L1f
        L1b:
            r3 = move-exception
            r0.addSuppressed(r3)     // Catch: java.lang.Exception -> L20
        L1f:
            throw r0     // Catch: java.lang.Exception -> L20
        L20:
            r3 = move-exception
            one.block.eosiojava.error.rpcProvider.RpcProviderError r0 = new one.block.eosiojava.error.rpcProvider.RpcProviderError
            java.lang.String r1 = "Error get code."
            r0.<init>(r1, r3)
            throw r0
    }

    public java.lang.String getControlledAccounts(bi.AbstractC0781f0 r3) {
            r2 = this;
            one.block.eosiojavarpcprovider.implementations.IEosioJavaRpcProviderApi r0 = r2.rpcProviderApi     // Catch: java.lang.Exception -> L20
            ek.b r3 = r0.getControlledAccounts(r3)     // Catch: java.lang.Exception -> L20
            java.lang.Object r3 = r2.processCall(r3)     // Catch: java.lang.Exception -> L20
            bi.h0 r3 = (bi.AbstractC0785h0) r3     // Catch: java.lang.Exception -> L20
            java.lang.String r0 = r3.m2397n()     // Catch: java.lang.Throwable -> L14
            r3.close()     // Catch: java.lang.Exception -> L20
            return r0
        L14:
            r0 = move-exception
            if (r3 == 0) goto L1f
            r3.close()     // Catch: java.lang.Throwable -> L1b
            goto L1f
        L1b:
            r3 = move-exception
            r0.addSuppressed(r3)     // Catch: java.lang.Exception -> L20
        L1f:
            throw r0     // Catch: java.lang.Exception -> L20
        L20:
            r3 = move-exception
            one.block.eosiojava.error.rpcProvider.RpcProviderError r0 = new one.block.eosiojava.error.rpcProvider.RpcProviderError
            java.lang.String r1 = "Error get controlled accounts."
            r0.<init>(r1, r3)
            throw r0
    }

    public java.lang.String getCurrencyBalance(bi.AbstractC0781f0 r3) {
            r2 = this;
            one.block.eosiojavarpcprovider.implementations.IEosioJavaRpcProviderApi r0 = r2.rpcProviderApi     // Catch: java.lang.Exception -> L20
            ek.b r3 = r0.getCurrencyBalance(r3)     // Catch: java.lang.Exception -> L20
            java.lang.Object r3 = r2.processCall(r3)     // Catch: java.lang.Exception -> L20
            bi.h0 r3 = (bi.AbstractC0785h0) r3     // Catch: java.lang.Exception -> L20
            java.lang.String r0 = r3.m2397n()     // Catch: java.lang.Throwable -> L14
            r3.close()     // Catch: java.lang.Exception -> L20
            return r0
        L14:
            r0 = move-exception
            if (r3 == 0) goto L1f
            r3.close()     // Catch: java.lang.Throwable -> L1b
            goto L1f
        L1b:
            r3 = move-exception
            r0.addSuppressed(r3)     // Catch: java.lang.Exception -> L20
        L1f:
            throw r0     // Catch: java.lang.Exception -> L20
        L20:
            r3 = move-exception
            one.block.eosiojava.error.rpcProvider.RpcProviderError r0 = new one.block.eosiojava.error.rpcProvider.RpcProviderError
            java.lang.String r1 = "Error get current balance."
            r0.<init>(r1, r3)
            throw r0
    }

    public java.lang.String getCurrencyStats(bi.AbstractC0781f0 r3) {
            r2 = this;
            one.block.eosiojavarpcprovider.implementations.IEosioJavaRpcProviderApi r0 = r2.rpcProviderApi     // Catch: java.lang.Exception -> L20
            ek.b r3 = r0.getCurrencyStats(r3)     // Catch: java.lang.Exception -> L20
            java.lang.Object r3 = r2.processCall(r3)     // Catch: java.lang.Exception -> L20
            bi.h0 r3 = (bi.AbstractC0785h0) r3     // Catch: java.lang.Exception -> L20
            java.lang.String r0 = r3.m2397n()     // Catch: java.lang.Throwable -> L14
            r3.close()     // Catch: java.lang.Exception -> L20
            return r0
        L14:
            r0 = move-exception
            if (r3 == 0) goto L1f
            r3.close()     // Catch: java.lang.Throwable -> L1b
            goto L1f
        L1b:
            r3 = move-exception
            r0.addSuppressed(r3)     // Catch: java.lang.Exception -> L20
        L1f:
            throw r0     // Catch: java.lang.Exception -> L20
        L20:
            r3 = move-exception
            one.block.eosiojava.error.rpcProvider.RpcProviderError r0 = new one.block.eosiojava.error.rpcProvider.RpcProviderError
            java.lang.String r1 = "Error get current stats."
            r0.<init>(r1, r3)
            throw r0
    }

    @Override // one.block.eosiojava.interfaces.IRPCProvider
    public one.block.eosiojava.models.rpcProvider.response.GetInfoResponse getInfo() {
            r3 = this;
            one.block.eosiojavarpcprovider.implementations.IEosioJavaRpcProviderApi r0 = r3.rpcProviderApi     // Catch: java.lang.Exception -> Ld
            ek.b r0 = r0.getInfo()     // Catch: java.lang.Exception -> Ld
            java.lang.Object r0 = r3.processCall(r0)     // Catch: java.lang.Exception -> Ld
            one.block.eosiojava.models.rpcProvider.response.GetInfoResponse r0 = (one.block.eosiojava.models.rpcProvider.response.GetInfoResponse) r0     // Catch: java.lang.Exception -> Ld
            return r0
        Ld:
            r0 = move-exception
            one.block.eosiojava.error.rpcProvider.GetInfoRpcError r1 = new one.block.eosiojava.error.rpcProvider.GetInfoRpcError
            java.lang.String r2 = "Error retrieving chain information."
            r1.<init>(r2, r0)
            throw r1
    }

    public java.lang.String getKeyAccounts(bi.AbstractC0781f0 r3) {
            r2 = this;
            one.block.eosiojavarpcprovider.implementations.IEosioJavaRpcProviderApi r0 = r2.rpcProviderApi     // Catch: java.lang.Exception -> L20
            ek.b r3 = r0.getKeyAccounts(r3)     // Catch: java.lang.Exception -> L20
            java.lang.Object r3 = r2.processCall(r3)     // Catch: java.lang.Exception -> L20
            bi.h0 r3 = (bi.AbstractC0785h0) r3     // Catch: java.lang.Exception -> L20
            java.lang.String r0 = r3.m2397n()     // Catch: java.lang.Throwable -> L14
            r3.close()     // Catch: java.lang.Exception -> L20
            return r0
        L14:
            r0 = move-exception
            if (r3 == 0) goto L1f
            r3.close()     // Catch: java.lang.Throwable -> L1b
            goto L1f
        L1b:
            r3 = move-exception
            r0.addSuppressed(r3)     // Catch: java.lang.Exception -> L20
        L1f:
            throw r0     // Catch: java.lang.Exception -> L20
        L20:
            r3 = move-exception
            one.block.eosiojava.error.rpcProvider.RpcProviderError r0 = new one.block.eosiojava.error.rpcProvider.RpcProviderError
            java.lang.String r1 = "Error get key accounts."
            r0.<init>(r1, r3)
            throw r0
    }

    public java.lang.String getKvTableRows(bi.AbstractC0781f0 r3) {
            r2 = this;
            one.block.eosiojavarpcprovider.implementations.IEosioJavaRpcProviderApi r0 = r2.rpcProviderApi     // Catch: java.lang.Exception -> L20
            ek.b r3 = r0.getKvTableRows(r3)     // Catch: java.lang.Exception -> L20
            java.lang.Object r3 = r2.processCall(r3)     // Catch: java.lang.Exception -> L20
            bi.h0 r3 = (bi.AbstractC0785h0) r3     // Catch: java.lang.Exception -> L20
            java.lang.String r0 = r3.m2397n()     // Catch: java.lang.Throwable -> L14
            r3.close()     // Catch: java.lang.Exception -> L20
            return r0
        L14:
            r0 = move-exception
            if (r3 == 0) goto L1f
            r3.close()     // Catch: java.lang.Throwable -> L1b
            goto L1f
        L1b:
            r3 = move-exception
            r0.addSuppressed(r3)     // Catch: java.lang.Exception -> L20
        L1f:
            throw r0     // Catch: java.lang.Exception -> L20
        L20:
            r3 = move-exception
            one.block.eosiojava.error.rpcProvider.RpcProviderError r0 = new one.block.eosiojava.error.rpcProvider.RpcProviderError
            java.lang.String r1 = "Error get kv table rows."
            r0.<init>(r1, r3)
            throw r0
    }

    public java.lang.String getProducers(bi.AbstractC0781f0 r3) {
            r2 = this;
            one.block.eosiojavarpcprovider.implementations.IEosioJavaRpcProviderApi r0 = r2.rpcProviderApi     // Catch: java.lang.Exception -> L20
            ek.b r3 = r0.getProducers(r3)     // Catch: java.lang.Exception -> L20
            java.lang.Object r3 = r2.processCall(r3)     // Catch: java.lang.Exception -> L20
            bi.h0 r3 = (bi.AbstractC0785h0) r3     // Catch: java.lang.Exception -> L20
            java.lang.String r0 = r3.m2397n()     // Catch: java.lang.Throwable -> L14
            r3.close()     // Catch: java.lang.Exception -> L20
            return r0
        L14:
            r0 = move-exception
            if (r3 == 0) goto L1f
            r3.close()     // Catch: java.lang.Throwable -> L1b
            goto L1f
        L1b:
            r3 = move-exception
            r0.addSuppressed(r3)     // Catch: java.lang.Exception -> L20
        L1f:
            throw r0     // Catch: java.lang.Exception -> L20
        L20:
            r3 = move-exception
            one.block.eosiojava.error.rpcProvider.RpcProviderError r0 = new one.block.eosiojava.error.rpcProvider.RpcProviderError
            java.lang.String r1 = "Error get producers."
            r0.<init>(r1, r3)
            throw r0
    }

    @Override // one.block.eosiojava.interfaces.IRPCProvider
    public one.block.eosiojava.models.rpcProvider.response.GetRawAbiResponse getRawAbi(one.block.eosiojava.models.rpcProvider.request.GetRawAbiRequest r3) {
            r2 = this;
            one.block.eosiojavarpcprovider.implementations.IEosioJavaRpcProviderApi r0 = r2.rpcProviderApi     // Catch: java.lang.Exception -> Ld
            ek.b r3 = r0.getRawAbi(r3)     // Catch: java.lang.Exception -> Ld
            java.lang.Object r3 = r2.processCall(r3)     // Catch: java.lang.Exception -> Ld
            one.block.eosiojava.models.rpcProvider.response.GetRawAbiResponse r3 = (one.block.eosiojava.models.rpcProvider.response.GetRawAbiResponse) r3     // Catch: java.lang.Exception -> Ld
            return r3
        Ld:
            r3 = move-exception
            one.block.eosiojava.error.rpcProvider.GetRawAbiRpcError r0 = new one.block.eosiojava.error.rpcProvider.GetRawAbiRpcError
            java.lang.String r1 = "Error retrieving raw ABI."
            r0.<init>(r1, r3)
            throw r0
    }

    public java.lang.String getRawCodeAndAbi(bi.AbstractC0781f0 r3) {
            r2 = this;
            one.block.eosiojavarpcprovider.implementations.IEosioJavaRpcProviderApi r0 = r2.rpcProviderApi     // Catch: java.lang.Exception -> L20
            ek.b r3 = r0.getRawCodeAndAbi(r3)     // Catch: java.lang.Exception -> L20
            java.lang.Object r3 = r2.processCall(r3)     // Catch: java.lang.Exception -> L20
            bi.h0 r3 = (bi.AbstractC0785h0) r3     // Catch: java.lang.Exception -> L20
            java.lang.String r0 = r3.m2397n()     // Catch: java.lang.Throwable -> L14
            r3.close()     // Catch: java.lang.Exception -> L20
            return r0
        L14:
            r0 = move-exception
            if (r3 == 0) goto L1f
            r3.close()     // Catch: java.lang.Throwable -> L1b
            goto L1f
        L1b:
            r3 = move-exception
            r0.addSuppressed(r3)     // Catch: java.lang.Exception -> L20
        L1f:
            throw r0     // Catch: java.lang.Exception -> L20
        L20:
            r3 = move-exception
            one.block.eosiojava.error.rpcProvider.RpcProviderError r0 = new one.block.eosiojava.error.rpcProvider.RpcProviderError
            java.lang.String r1 = "Error get raw code and abi."
            r0.<init>(r1, r3)
            throw r0
    }

    @Override // one.block.eosiojava.interfaces.IRPCProvider
    public one.block.eosiojava.models.rpcProvider.response.GetRequiredKeysResponse getRequiredKeys(one.block.eosiojava.models.rpcProvider.request.GetRequiredKeysRequest r3) {
            r2 = this;
            one.block.eosiojavarpcprovider.implementations.IEosioJavaRpcProviderApi r0 = r2.rpcProviderApi     // Catch: java.lang.Exception -> Ld
            ek.b r3 = r0.getRequiredKeys(r3)     // Catch: java.lang.Exception -> Ld
            java.lang.Object r3 = r2.processCall(r3)     // Catch: java.lang.Exception -> Ld
            one.block.eosiojava.models.rpcProvider.response.GetRequiredKeysResponse r3 = (one.block.eosiojava.models.rpcProvider.response.GetRequiredKeysResponse) r3     // Catch: java.lang.Exception -> Ld
            return r3
        Ld:
            r3 = move-exception
            one.block.eosiojava.error.rpcProvider.GetRequiredKeysRpcError r0 = new one.block.eosiojava.error.rpcProvider.GetRequiredKeysRpcError
            java.lang.String r1 = "Error retrieving required keys."
            r0.<init>(r1, r3)
            throw r0
    }

    public java.lang.String getTableByScope(bi.AbstractC0781f0 r3) {
            r2 = this;
            one.block.eosiojavarpcprovider.implementations.IEosioJavaRpcProviderApi r0 = r2.rpcProviderApi     // Catch: java.lang.Exception -> L20
            ek.b r3 = r0.getTableByScope(r3)     // Catch: java.lang.Exception -> L20
            java.lang.Object r3 = r2.processCall(r3)     // Catch: java.lang.Exception -> L20
            bi.h0 r3 = (bi.AbstractC0785h0) r3     // Catch: java.lang.Exception -> L20
            java.lang.String r0 = r3.m2397n()     // Catch: java.lang.Throwable -> L14
            r3.close()     // Catch: java.lang.Exception -> L20
            return r0
        L14:
            r0 = move-exception
            if (r3 == 0) goto L1f
            r3.close()     // Catch: java.lang.Throwable -> L1b
            goto L1f
        L1b:
            r3 = move-exception
            r0.addSuppressed(r3)     // Catch: java.lang.Exception -> L20
        L1f:
            throw r0     // Catch: java.lang.Exception -> L20
        L20:
            r3 = move-exception
            one.block.eosiojava.error.rpcProvider.RpcProviderError r0 = new one.block.eosiojava.error.rpcProvider.RpcProviderError
            java.lang.String r1 = "Error get table by scope."
            r0.<init>(r1, r3)
            throw r0
    }

    public java.lang.String getTableRows(bi.AbstractC0781f0 r3) {
            r2 = this;
            one.block.eosiojavarpcprovider.implementations.IEosioJavaRpcProviderApi r0 = r2.rpcProviderApi     // Catch: java.lang.Exception -> L20
            ek.b r3 = r0.getTableRows(r3)     // Catch: java.lang.Exception -> L20
            java.lang.Object r3 = r2.processCall(r3)     // Catch: java.lang.Exception -> L20
            bi.h0 r3 = (bi.AbstractC0785h0) r3     // Catch: java.lang.Exception -> L20
            java.lang.String r0 = r3.m2397n()     // Catch: java.lang.Throwable -> L14
            r3.close()     // Catch: java.lang.Exception -> L20
            return r0
        L14:
            r0 = move-exception
            if (r3 == 0) goto L1f
            r3.close()     // Catch: java.lang.Throwable -> L1b
            goto L1f
        L1b:
            r3 = move-exception
            r0.addSuppressed(r3)     // Catch: java.lang.Exception -> L20
        L1f:
            throw r0     // Catch: java.lang.Exception -> L20
        L20:
            r3 = move-exception
            one.block.eosiojava.error.rpcProvider.RpcProviderError r0 = new one.block.eosiojava.error.rpcProvider.RpcProviderError
            java.lang.String r1 = "Error get table rows."
            r0.<init>(r1, r3)
            throw r0
    }

    public java.lang.String getTransaction(bi.AbstractC0781f0 r3) {
            r2 = this;
            one.block.eosiojavarpcprovider.implementations.IEosioJavaRpcProviderApi r0 = r2.rpcProviderApi     // Catch: java.lang.Exception -> L20
            ek.b r3 = r0.getTransaction(r3)     // Catch: java.lang.Exception -> L20
            java.lang.Object r3 = r2.processCall(r3)     // Catch: java.lang.Exception -> L20
            bi.h0 r3 = (bi.AbstractC0785h0) r3     // Catch: java.lang.Exception -> L20
            java.lang.String r0 = r3.m2397n()     // Catch: java.lang.Throwable -> L14
            r3.close()     // Catch: java.lang.Exception -> L20
            return r0
        L14:
            r0 = move-exception
            if (r3 == 0) goto L1f
            r3.close()     // Catch: java.lang.Throwable -> L1b
            goto L1f
        L1b:
            r3 = move-exception
            r0.addSuppressed(r3)     // Catch: java.lang.Exception -> L20
        L1f:
            throw r0     // Catch: java.lang.Exception -> L20
        L20:
            r3 = move-exception
            one.block.eosiojava.error.rpcProvider.RpcProviderError r0 = new one.block.eosiojava.error.rpcProvider.RpcProviderError
            java.lang.String r1 = "Error get transaction."
            r0.<init>(r1, r3)
            throw r0
    }

    public one.block.eosiojava.models.rpcProvider.response.PushTransactionResponse pushTransaction(one.block.eosiojava.models.rpcProvider.request.PushTransactionRequest r3) {
            r2 = this;
            one.block.eosiojavarpcprovider.implementations.IEosioJavaRpcProviderApi r0 = r2.rpcProviderApi     // Catch: java.lang.Exception -> Ld
            ek.b r3 = r0.pushTransaction(r3)     // Catch: java.lang.Exception -> Ld
            java.lang.Object r3 = r2.processCall(r3)     // Catch: java.lang.Exception -> Ld
            one.block.eosiojava.models.rpcProvider.response.PushTransactionResponse r3 = (one.block.eosiojava.models.rpcProvider.response.PushTransactionResponse) r3     // Catch: java.lang.Exception -> Ld
            return r3
        Ld:
            r3 = move-exception
            one.block.eosiojava.error.rpcProvider.PushTransactionRpcError r0 = new one.block.eosiojava.error.rpcProvider.PushTransactionRpcError
            java.lang.String r1 = "Error pushing transaction."
            r0.<init>(r1, r3)
            throw r0
    }

    public java.lang.String pushTransactions(bi.AbstractC0781f0 r3) {
            r2 = this;
            one.block.eosiojavarpcprovider.implementations.IEosioJavaRpcProviderApi r0 = r2.rpcProviderApi     // Catch: java.lang.Exception -> L20
            ek.b r3 = r0.pushTransactions(r3)     // Catch: java.lang.Exception -> L20
            java.lang.Object r3 = r2.processCall(r3)     // Catch: java.lang.Exception -> L20
            bi.h0 r3 = (bi.AbstractC0785h0) r3     // Catch: java.lang.Exception -> L20
            java.lang.String r0 = r3.m2397n()     // Catch: java.lang.Throwable -> L14
            r3.close()     // Catch: java.lang.Exception -> L20
            return r0
        L14:
            r0 = move-exception
            if (r3 == 0) goto L1f
            r3.close()     // Catch: java.lang.Throwable -> L1b
            goto L1f
        L1b:
            r3 = move-exception
            r0.addSuppressed(r3)     // Catch: java.lang.Exception -> L20
        L1f:
            throw r0     // Catch: java.lang.Exception -> L20
        L20:
            r3 = move-exception
            one.block.eosiojava.error.rpcProvider.RpcProviderError r0 = new one.block.eosiojava.error.rpcProvider.RpcProviderError
            java.lang.String r1 = "Error pushing transactions."
            r0.<init>(r1, r3)
            throw r0
    }

    @Override // one.block.eosiojava.interfaces.IRPCProvider
    public one.block.eosiojava.models.rpcProvider.response.SendTransactionResponse sendTransaction(one.block.eosiojava.models.rpcProvider.request.SendTransactionRequest r3) {
            r2 = this;
            one.block.eosiojavarpcprovider.implementations.IEosioJavaRpcProviderApi r0 = r2.rpcProviderApi     // Catch: java.lang.Exception -> Ld
            ek.b r3 = r0.sendTransaction(r3)     // Catch: java.lang.Exception -> Ld
            java.lang.Object r3 = r2.processCall(r3)     // Catch: java.lang.Exception -> Ld
            one.block.eosiojava.models.rpcProvider.response.SendTransactionResponse r3 = (one.block.eosiojava.models.rpcProvider.response.SendTransactionResponse) r3     // Catch: java.lang.Exception -> Ld
            return r3
        Ld:
            r3 = move-exception
            one.block.eosiojava.error.rpcProvider.SendTransactionRpcError r0 = new one.block.eosiojava.error.rpcProvider.SendTransactionRpcError
            java.lang.String r1 = "Error sending transaction."
            r0.<init>(r1, r3)
            throw r0
    }
}
