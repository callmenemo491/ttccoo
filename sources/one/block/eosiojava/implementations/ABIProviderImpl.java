package one.block.eosiojava.implementations;

/* loaded from: classes.dex */
public class ABIProviderImpl implements one.block.eosiojava.interfaces.IABIProvider {
    private java.util.Map<java.lang.String, java.lang.String> abiCache;
    private one.block.eosiojava.interfaces.IRPCProvider rpcProvider;
    private one.block.eosiojava.interfaces.ISerializationProvider serializationProvider;

    public ABIProviderImpl(one.block.eosiojava.interfaces.IRPCProvider r2, one.block.eosiojava.interfaces.ISerializationProvider r3) {
            r1 = this;
            r1.<init>()
            java.util.concurrent.ConcurrentHashMap r0 = new java.util.concurrent.ConcurrentHashMap
            r0.<init>()
            r1.abiCache = r0
            r1.rpcProvider = r2
            r1.serializationProvider = r3
            return
    }

    @Override // one.block.eosiojava.interfaces.IABIProvider
    public java.lang.String getAbi(java.lang.String r5, one.block.eosiojava.models.EOSIOName r6) {
            r4 = this;
            java.lang.StringBuilder r5 = android.support.v4.media.C0144c.m256a(r5)
            java.lang.String r0 = r6.getAccountName()
            r5.append(r0)
            java.lang.String r5 = r5.toString()
            java.util.Map<java.lang.String, java.lang.String> r0 = r4.abiCache
            java.lang.Object r0 = r0.get(r5)
            java.lang.String r0 = (java.lang.String) r0
            boolean r1 = p185k7.C3828h5.m8605t(r0)
            if (r1 != 0) goto L1e
            return r0
        L1e:
            one.block.eosiojava.models.rpcProvider.request.GetRawAbiRequest r0 = new one.block.eosiojava.models.rpcProvider.request.GetRawAbiRequest
            java.lang.String r1 = r6.getAccountName()
            r0.<init>(r1)
            one.block.eosiojava.interfaces.IRPCProvider r1 = r4.rpcProvider     // Catch: java.lang.Exception -> La3
            one.block.eosiojava.models.rpcProvider.response.GetRawAbiResponse r0 = r1.getRawAbi(r0)     // Catch: java.lang.Exception -> La3
            if (r0 == 0) goto L9b
            java.lang.String r1 = r0.getAbi()     // Catch: java.lang.Exception -> La3
            boolean r2 = p185k7.C3828h5.m8605t(r1)     // Catch: java.lang.Exception -> La3
            if (r2 != 0) goto L93
            one.block.eosiojava.utilities.ByteFormatter r1 = one.block.eosiojava.utilities.ByteFormatter.createFromBase64(r1)     // Catch: java.lang.Exception -> La3
            one.block.eosiojava.utilities.ByteFormatter r2 = r1.sha256()     // Catch: java.lang.Exception -> La3
            java.lang.String r2 = r2.toHex()     // Catch: java.lang.Exception -> La3
            java.lang.String r2 = r2.toLowerCase()     // Catch: java.lang.Exception -> La3
            java.lang.String r3 = r0.getAbiHash()     // Catch: java.lang.Exception -> La3
            java.lang.String r3 = r3.toLowerCase()     // Catch: java.lang.Exception -> La3
            boolean r2 = r2.equals(r3)     // Catch: java.lang.Exception -> La3
            if (r2 == 0) goto L8b
            java.lang.String r6 = r6.getAccountName()     // Catch: java.lang.Exception -> La3
            java.lang.String r0 = r0.getAccountName()     // Catch: java.lang.Exception -> La3
            boolean r6 = r6.equals(r0)     // Catch: java.lang.Exception -> La3
            if (r6 == 0) goto L83
            one.block.eosiojava.interfaces.ISerializationProvider r6 = r4.serializationProvider     // Catch: java.lang.Exception -> La3
            java.lang.String r0 = r1.toHex()     // Catch: java.lang.Exception -> La3
            java.lang.String r6 = r6.deserializeAbi(r0)     // Catch: java.lang.Exception -> La3
            boolean r0 = r6.isEmpty()     // Catch: java.lang.Exception -> La3
            if (r0 != 0) goto L7b
            java.util.Map<java.lang.String, java.lang.String> r0 = r4.abiCache     // Catch: java.lang.Exception -> La3
            r0.put(r5, r6)     // Catch: java.lang.Exception -> La3
            return r6
        L7b:
            one.block.eosiojava.error.abiProvider.GetAbiError r5 = new one.block.eosiojava.error.abiProvider.GetAbiError     // Catch: java.lang.Exception -> La3
            java.lang.String r6 = "No ABI found for requested account name."
            r5.<init>(r6)     // Catch: java.lang.Exception -> La3
            throw r5     // Catch: java.lang.Exception -> La3
        L83:
            one.block.eosiojava.error.abiProvider.GetAbiError r5 = new one.block.eosiojava.error.abiProvider.GetAbiError     // Catch: java.lang.Exception -> La3
            java.lang.String r6 = "Requested account name does not match returned account name."
            r5.<init>(r6)     // Catch: java.lang.Exception -> La3
            throw r5     // Catch: java.lang.Exception -> La3
        L8b:
            one.block.eosiojava.error.abiProvider.GetAbiError r5 = new one.block.eosiojava.error.abiProvider.GetAbiError     // Catch: java.lang.Exception -> La3
            java.lang.String r6 = "Calculated ABI hash does not match returned hash."
            r5.<init>(r6)     // Catch: java.lang.Exception -> La3
            throw r5     // Catch: java.lang.Exception -> La3
        L93:
            one.block.eosiojava.error.abiProvider.GetAbiError r5 = new one.block.eosiojava.error.abiProvider.GetAbiError     // Catch: java.lang.Exception -> La3
            java.lang.String r6 = "Missing ABI from GetRawAbiResponse."
            r5.<init>(r6)     // Catch: java.lang.Exception -> La3
            throw r5     // Catch: java.lang.Exception -> La3
        L9b:
            one.block.eosiojava.error.abiProvider.GetAbiError r5 = new one.block.eosiojava.error.abiProvider.GetAbiError     // Catch: java.lang.Exception -> La3
            java.lang.String r6 = "No response retrieving ABI."
            r5.<init>(r6)     // Catch: java.lang.Exception -> La3
            throw r5     // Catch: java.lang.Exception -> La3
        La3:
            r5 = move-exception
            one.block.eosiojava.error.abiProvider.GetAbiError r6 = new one.block.eosiojava.error.abiProvider.GetAbiError
            java.lang.String r0 = "Error retrieving ABI from the chain."
            r6.<init>(r0, r5)
            throw r6
    }

    @Override // one.block.eosiojava.interfaces.IABIProvider
    public java.util.Map<java.lang.String, java.lang.String> getAbis(java.lang.String r4, java.util.List<one.block.eosiojava.models.EOSIOName> r5) {
            r3 = this;
            java.util.HashMap r0 = new java.util.HashMap
            r0.<init>()
            java.util.ArrayList r1 = new java.util.ArrayList
            java.util.HashSet r2 = new java.util.HashSet
            r2.<init>(r5)
            r1.<init>(r2)
            java.util.Iterator r5 = r1.iterator()
        L13:
            boolean r1 = r5.hasNext()
            if (r1 == 0) goto L2b
            java.lang.Object r1 = r5.next()
            one.block.eosiojava.models.EOSIOName r1 = (one.block.eosiojava.models.EOSIOName) r1
            java.lang.String r2 = r3.getAbi(r4, r1)
            java.lang.String r1 = r1.getAccountName()
            r0.put(r1, r2)
            goto L13
        L2b:
            return r0
    }
}
