package one.block.p262x418cc3af;

/* loaded from: classes.dex */
public class AbiEosSerializationProviderImpl implements one.block.eosiojava.interfaces.ISerializationProvider {
    private static final java.lang.String CANNOT_CREATE_CONTEXT_ERR_MSG = "Could not create abieos context.";
    private static final java.lang.String NULL_CONTEXT_ERR_MSG = "Null context!  Has destroyContext() already been called?";
    private java.lang.String TAG;
    private java.nio.ByteBuffer context;

    static {
            java.lang.String r0 = "abieos-lib"
            java.lang.System.loadLibrary(r0)
            return
    }

    public AbiEosSerializationProviderImpl() {
            r2 = this;
            r2.<init>()
            java.lang.String r0 = "AbiEosSerializationProviderImpl"
            r2.TAG = r0
            java.nio.ByteBuffer r0 = r2.create()
            r2.context = r0
            if (r0 == 0) goto L10
            return
        L10:
            one.block.eosiojavaabieosserializationprovider.AbieosContextNullError r0 = new one.block.eosiojavaabieosserializationprovider.AbieosContextNullError
            java.lang.String r1 = "Could not create abieos context."
            r0.<init>(r1)
            throw r0
    }

    private java.lang.String getAbiJsonString(java.lang.String r4) {
            r3 = this;
            java.util.Map<java.lang.String, java.lang.String> r0 = one.block.p262x418cc3af.AbiEosJson.abiEosJsonMap
            boolean r1 = r0.containsKey(r4)
            if (r1 == 0) goto Lf
            java.lang.Object r0 = r0.get(r4)
            java.lang.String r0 = (java.lang.String) r0
            goto L27
        Lf:
            java.lang.String r0 = r3.TAG
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "Error, no json in map for: "
            r1.append(r2)
            r1.append(r4)
            java.lang.String r1 = r1.toString()
            android.util.Log.e(r0, r1)
            java.lang.String r0 = ""
        L27:
            if (r0 == 0) goto L30
            boolean r1 = r0.isEmpty()
            if (r1 != 0) goto L30
            return r0
        L30:
            one.block.eosiojava.error.serializationProvider.SerializationProviderError r0 = new one.block.eosiojava.error.serializationProvider.SerializationProviderError
            r1 = 1
            java.lang.Object[] r1 = new java.lang.Object[r1]
            r2 = 0
            r1[r2] = r4
            java.lang.String r4 = "Serialization Provider -- No ABI found for %s"
            java.lang.String r4 = java.lang.String.format(r4, r1)
            r0.<init>(r4)
            throw r0
    }

    private java.lang.String getType(java.lang.String r7, long r8) {
            r6 = this;
            long r4 = r6.stringToName64(r7)
            java.nio.ByteBuffer r1 = r6.context
            r0 = r6
            r2 = r8
            java.lang.String r7 = r0.getTypeForAction(r1, r2, r4)
            return r7
    }

    private void refreshContext() {
            r2 = this;
            r2.destroyContext()
            java.nio.ByteBuffer r0 = r2.create()
            r2.context = r0
            if (r0 == 0) goto Lc
            return
        Lc:
            one.block.eosiojavaabieosserializationprovider.AbieosContextNullError r0 = new one.block.eosiojavaabieosserializationprovider.AbieosContextNullError
            java.lang.String r1 = "Could not create abieos context."
            r0.<init>(r1)
            throw r0
    }

    public native java.lang.String abiBinToJson(java.nio.ByteBuffer r1, byte[] r2);

    public native boolean abiJsonToBin(java.nio.ByteBuffer r1, java.lang.String r2);

    public native java.nio.ByteBuffer create();

    @Override // one.block.eosiojava.interfaces.ISerializationProvider
    public void deserialize(one.block.eosiojava.models.AbiEosSerializationObject r11) {
            r10 = this;
            r10.refreshContext()     // Catch: one.block.eosiojava.error.serializationProvider.SerializationProviderError -> Lcd
            java.lang.String r0 = r11.getHex()     // Catch: one.block.eosiojava.error.serializationProvider.SerializationProviderError -> Lcd
            boolean r0 = r0.isEmpty()     // Catch: one.block.eosiojava.error.serializationProvider.SerializationProviderError -> Lcd
            if (r0 != 0) goto Lc5
            java.lang.String r0 = r11.getContract()     // Catch: one.block.eosiojava.error.serializationProvider.SerializationProviderError -> Lcd
            long r3 = r10.stringToName64(r0)     // Catch: one.block.eosiojava.error.serializationProvider.SerializationProviderError -> Lcd
            java.lang.String r0 = r11.getAbi()     // Catch: one.block.eosiojava.error.serializationProvider.SerializationProviderError -> Lcd
            boolean r0 = r0.isEmpty()     // Catch: one.block.eosiojava.error.serializationProvider.SerializationProviderError -> Lcd
            r1 = 2
            r7 = 1
            java.lang.String r8 = ""
            r9 = 0
            if (r0 == 0) goto L44
            one.block.eosiojava.error.serializationProvider.DeserializeError r0 = new one.block.eosiojava.error.serializationProvider.DeserializeError     // Catch: one.block.eosiojava.error.serializationProvider.SerializationProviderError -> Lcd
            java.lang.String r2 = "deserialize -- No ABI provided for %s %s"
            java.lang.Object[] r1 = new java.lang.Object[r1]     // Catch: one.block.eosiojava.error.serializationProvider.SerializationProviderError -> Lcd
            java.lang.String r3 = r11.getContract()     // Catch: one.block.eosiojava.error.serializationProvider.SerializationProviderError -> Lcd
            if (r3 != 0) goto L34
            java.lang.String r8 = r11.getContract()     // Catch: one.block.eosiojava.error.serializationProvider.SerializationProviderError -> Lcd
        L34:
            r1[r9] = r8     // Catch: one.block.eosiojava.error.serializationProvider.SerializationProviderError -> Lcd
            java.lang.String r11 = r11.getName()     // Catch: one.block.eosiojava.error.serializationProvider.SerializationProviderError -> Lcd
            r1[r7] = r11     // Catch: one.block.eosiojava.error.serializationProvider.SerializationProviderError -> Lcd
            java.lang.String r11 = java.lang.String.format(r2, r1)     // Catch: one.block.eosiojava.error.serializationProvider.SerializationProviderError -> Lcd
            r0.<init>(r11)     // Catch: one.block.eosiojava.error.serializationProvider.SerializationProviderError -> Lcd
            throw r0     // Catch: one.block.eosiojava.error.serializationProvider.SerializationProviderError -> Lcd
        L44:
            java.nio.ByteBuffer r0 = r10.context     // Catch: one.block.eosiojava.error.serializationProvider.SerializationProviderError -> Lcd
            java.lang.String r2 = r11.getAbi()     // Catch: one.block.eosiojava.error.serializationProvider.SerializationProviderError -> Lcd
            boolean r0 = r10.setAbi(r0, r3, r2)     // Catch: one.block.eosiojava.error.serializationProvider.SerializationProviderError -> Lcd
            if (r0 != 0) goto L68
            java.lang.String r11 = r10.error()     // Catch: one.block.eosiojava.error.serializationProvider.SerializationProviderError -> Lcd
            java.lang.String r0 = "deserialize == Unable to set ABI. %s"
            java.lang.Object[] r1 = new java.lang.Object[r7]     // Catch: one.block.eosiojava.error.serializationProvider.SerializationProviderError -> Lcd
            if (r11 != 0) goto L5b
            goto L5c
        L5b:
            r8 = r11
        L5c:
            r1[r9] = r8     // Catch: one.block.eosiojava.error.serializationProvider.SerializationProviderError -> Lcd
            java.lang.String r11 = java.lang.String.format(r0, r1)     // Catch: one.block.eosiojava.error.serializationProvider.SerializationProviderError -> Lcd
            one.block.eosiojava.error.serializationProvider.DeserializeError r0 = new one.block.eosiojava.error.serializationProvider.DeserializeError     // Catch: one.block.eosiojava.error.serializationProvider.SerializationProviderError -> Lcd
            r0.<init>(r11)     // Catch: one.block.eosiojava.error.serializationProvider.SerializationProviderError -> Lcd
            throw r0     // Catch: one.block.eosiojava.error.serializationProvider.SerializationProviderError -> Lcd
        L68:
            java.lang.String r0 = r11.getType()     // Catch: one.block.eosiojava.error.serializationProvider.SerializationProviderError -> Lcd
            if (r0 != 0) goto L77
            java.lang.String r0 = r11.getName()     // Catch: one.block.eosiojava.error.serializationProvider.SerializationProviderError -> Lcd
            java.lang.String r0 = r10.getType(r0, r3)     // Catch: one.block.eosiojava.error.serializationProvider.SerializationProviderError -> Lcd
            goto L7b
        L77:
            java.lang.String r0 = r11.getType()     // Catch: one.block.eosiojava.error.serializationProvider.SerializationProviderError -> Lcd
        L7b:
            r5 = r0
            if (r5 != 0) goto L9c
            java.lang.String r0 = r10.error()     // Catch: one.block.eosiojava.error.serializationProvider.SerializationProviderError -> Lcd
            java.lang.String r2 = "Unable to find type for action %s. %s"
            java.lang.Object[] r1 = new java.lang.Object[r1]     // Catch: one.block.eosiojava.error.serializationProvider.SerializationProviderError -> Lcd
            java.lang.String r11 = r11.getName()     // Catch: one.block.eosiojava.error.serializationProvider.SerializationProviderError -> Lcd
            r1[r9] = r11     // Catch: one.block.eosiojava.error.serializationProvider.SerializationProviderError -> Lcd
            if (r0 != 0) goto L8f
            goto L90
        L8f:
            r8 = r0
        L90:
            r1[r7] = r8     // Catch: one.block.eosiojava.error.serializationProvider.SerializationProviderError -> Lcd
            java.lang.String r11 = java.lang.String.format(r2, r1)     // Catch: one.block.eosiojava.error.serializationProvider.SerializationProviderError -> Lcd
            one.block.eosiojava.error.serializationProvider.DeserializeError r0 = new one.block.eosiojava.error.serializationProvider.DeserializeError     // Catch: one.block.eosiojava.error.serializationProvider.SerializationProviderError -> Lcd
            r0.<init>(r11)     // Catch: one.block.eosiojava.error.serializationProvider.SerializationProviderError -> Lcd
            throw r0     // Catch: one.block.eosiojava.error.serializationProvider.SerializationProviderError -> Lcd
        L9c:
            java.nio.ByteBuffer r2 = r10.context     // Catch: one.block.eosiojava.error.serializationProvider.SerializationProviderError -> Lcd
            java.lang.String r6 = r11.getHex()     // Catch: one.block.eosiojava.error.serializationProvider.SerializationProviderError -> Lcd
            r1 = r10
            java.lang.String r0 = r1.hexToJson(r2, r3, r5, r6)     // Catch: one.block.eosiojava.error.serializationProvider.SerializationProviderError -> Lcd
            if (r0 != 0) goto Lc1
            java.lang.String r11 = r10.error()     // Catch: one.block.eosiojava.error.serializationProvider.SerializationProviderError -> Lcd
            java.lang.String r0 = "Unable to unpack hex to json. %s"
            java.lang.Object[] r1 = new java.lang.Object[r7]     // Catch: one.block.eosiojava.error.serializationProvider.SerializationProviderError -> Lcd
            if (r11 != 0) goto Lb4
            goto Lb5
        Lb4:
            r8 = r11
        Lb5:
            r1[r9] = r8     // Catch: one.block.eosiojava.error.serializationProvider.SerializationProviderError -> Lcd
            java.lang.String r11 = java.lang.String.format(r0, r1)     // Catch: one.block.eosiojava.error.serializationProvider.SerializationProviderError -> Lcd
            one.block.eosiojava.error.serializationProvider.DeserializeError r0 = new one.block.eosiojava.error.serializationProvider.DeserializeError     // Catch: one.block.eosiojava.error.serializationProvider.SerializationProviderError -> Lcd
            r0.<init>(r11)     // Catch: one.block.eosiojava.error.serializationProvider.SerializationProviderError -> Lcd
            throw r0     // Catch: one.block.eosiojava.error.serializationProvider.SerializationProviderError -> Lcd
        Lc1:
            r11.setJson(r0)     // Catch: one.block.eosiojava.error.serializationProvider.SerializationProviderError -> Lcd
            return
        Lc5:
            one.block.eosiojava.error.serializationProvider.DeserializeError r11 = new one.block.eosiojava.error.serializationProvider.DeserializeError     // Catch: one.block.eosiojava.error.serializationProvider.SerializationProviderError -> Lcd
            java.lang.String r0 = "No content to serialize."
            r11.<init>(r0)     // Catch: one.block.eosiojava.error.serializationProvider.SerializationProviderError -> Lcd
            throw r11     // Catch: one.block.eosiojava.error.serializationProvider.SerializationProviderError -> Lcd
        Lcd:
            r11 = move-exception
            one.block.eosiojava.error.serializationProvider.DeserializeError r0 = new one.block.eosiojava.error.serializationProvider.DeserializeError
            r0.<init>(r11)
            throw r0
    }

    @Override // one.block.eosiojava.interfaces.ISerializationProvider
    public java.lang.String deserializeAbi(java.lang.String r4) {
            r3 = this;
            r3.refreshContext()     // Catch: p421xj.C7087c -> L2a one.block.eosiojava.error.serializationProvider.SerializationProviderError -> L31
            byte[] r4 = p421xj.C7089e.m14194a(r4)     // Catch: p421xj.C7087c -> L2a one.block.eosiojava.error.serializationProvider.SerializationProviderError -> L31
            java.nio.ByteBuffer r0 = r3.context     // Catch: p421xj.C7087c -> L2a one.block.eosiojava.error.serializationProvider.SerializationProviderError -> L31
            java.lang.String r4 = r3.abiBinToJson(r0, r4)     // Catch: p421xj.C7087c -> L2a one.block.eosiojava.error.serializationProvider.SerializationProviderError -> L31
            if (r4 != 0) goto L29
            java.lang.String r4 = r3.error()     // Catch: p421xj.C7087c -> L2a one.block.eosiojava.error.serializationProvider.SerializationProviderError -> L31
            java.lang.String r0 = "Unable to unpack abi hex to json. %s"
            r1 = 1
            java.lang.Object[] r1 = new java.lang.Object[r1]     // Catch: p421xj.C7087c -> L2a one.block.eosiojava.error.serializationProvider.SerializationProviderError -> L31
            r2 = 0
            if (r4 != 0) goto L1d
            java.lang.String r4 = ""
        L1d:
            r1[r2] = r4     // Catch: p421xj.C7087c -> L2a one.block.eosiojava.error.serializationProvider.SerializationProviderError -> L31
            java.lang.String r4 = java.lang.String.format(r0, r1)     // Catch: p421xj.C7087c -> L2a one.block.eosiojava.error.serializationProvider.SerializationProviderError -> L31
            one.block.eosiojava.error.serializationProvider.DeserializeError r0 = new one.block.eosiojava.error.serializationProvider.DeserializeError     // Catch: p421xj.C7087c -> L2a one.block.eosiojava.error.serializationProvider.SerializationProviderError -> L31
            r0.<init>(r4)     // Catch: p421xj.C7087c -> L2a one.block.eosiojava.error.serializationProvider.SerializationProviderError -> L31
            throw r0     // Catch: p421xj.C7087c -> L2a one.block.eosiojava.error.serializationProvider.SerializationProviderError -> L31
        L29:
            return r4
        L2a:
            r4 = move-exception
            one.block.eosiojava.error.serializationProvider.DeserializeAbiError r0 = new one.block.eosiojava.error.serializationProvider.DeserializeAbiError
            r0.<init>(r4)
            throw r0
        L31:
            r4 = move-exception
            one.block.eosiojava.error.serializationProvider.DeserializeAbiError r0 = new one.block.eosiojava.error.serializationProvider.DeserializeAbiError
            r0.<init>(r4)
            throw r0
    }

    @Override // one.block.eosiojava.interfaces.ISerializationProvider
    public java.lang.String deserializePackedTransaction(java.lang.String r6) {
            r5 = this;
            r5.refreshContext()     // Catch: one.block.eosiojava.error.serializationProvider.SerializationProviderError -> L1e
            java.lang.String r0 = "packed.transaction.abi.json"
            java.lang.String r0 = r5.getAbiJsonString(r0)     // Catch: one.block.eosiojava.error.serializationProvider.SerializationProviderError -> L1e
            one.block.eosiojava.models.AbiEosSerializationObject r1 = new one.block.eosiojava.models.AbiEosSerializationObject     // Catch: one.block.eosiojava.error.serializationProvider.SerializationProviderError -> L1e
            r2 = 0
            java.lang.String r3 = ""
            java.lang.String r4 = "packed_transaction_v0"
            r1.<init>(r2, r3, r4, r0)     // Catch: one.block.eosiojava.error.serializationProvider.SerializationProviderError -> L1e
            r1.setHex(r6)     // Catch: one.block.eosiojava.error.serializationProvider.SerializationProviderError -> L1e
            r5.deserialize(r1)     // Catch: one.block.eosiojava.error.serializationProvider.SerializationProviderError -> L1e
            java.lang.String r6 = r1.getJson()     // Catch: one.block.eosiojava.error.serializationProvider.SerializationProviderError -> L1e
            return r6
        L1e:
            r6 = move-exception
            one.block.eosiojava.error.serializationProvider.DeserializePackedTransactionError r0 = new one.block.eosiojava.error.serializationProvider.DeserializePackedTransactionError
            r0.<init>(r6)
            throw r0
    }

    @Override // one.block.eosiojava.interfaces.ISerializationProvider
    public java.lang.String deserializeTransaction(java.lang.String r6) {
            r5 = this;
            java.lang.String r0 = "transaction.abi.json"
            java.lang.String r0 = r5.getAbiJsonString(r0)     // Catch: one.block.eosiojava.error.serializationProvider.SerializationProviderError -> L1b
            one.block.eosiojava.models.AbiEosSerializationObject r1 = new one.block.eosiojava.models.AbiEosSerializationObject     // Catch: one.block.eosiojava.error.serializationProvider.SerializationProviderError -> L1b
            r2 = 0
            java.lang.String r3 = ""
            java.lang.String r4 = "transaction"
            r1.<init>(r2, r3, r4, r0)     // Catch: one.block.eosiojava.error.serializationProvider.SerializationProviderError -> L1b
            r1.setHex(r6)     // Catch: one.block.eosiojava.error.serializationProvider.SerializationProviderError -> L1b
            r5.deserialize(r1)     // Catch: one.block.eosiojava.error.serializationProvider.SerializationProviderError -> L1b
            java.lang.String r6 = r1.getJson()     // Catch: one.block.eosiojava.error.serializationProvider.SerializationProviderError -> L1b
            return r6
        L1b:
            r6 = move-exception
            one.block.eosiojava.error.serializationProvider.DeserializeTransactionError r0 = new one.block.eosiojava.error.serializationProvider.DeserializeTransactionError
            r0.<init>(r6)
            throw r0
    }

    public native void destroy(java.nio.ByteBuffer r1);

    public void destroyContext() {
            r1 = this;
            java.nio.ByteBuffer r0 = r1.context
            if (r0 == 0) goto La
            r1.destroy(r0)
            r0 = 0
            r1.context = r0
        La:
            return
    }

    public java.lang.String error() {
            r2 = this;
            java.nio.ByteBuffer r0 = r2.context
            if (r0 == 0) goto L9
            java.lang.String r0 = r2.getError(r0)
            return r0
        L9:
            one.block.eosiojavaabieosserializationprovider.AbieosContextNullError r0 = new one.block.eosiojavaabieosserializationprovider.AbieosContextNullError
            java.lang.String r1 = "Null context!  Has destroyContext() already been called?"
            r0.<init>(r1)
            throw r0
    }

    public native java.nio.ByteBuffer getBinData(java.nio.ByteBuffer r1);

    public native java.lang.String getBinHex(java.nio.ByteBuffer r1);

    public native int getBinSize(java.nio.ByteBuffer r1);

    public native java.lang.String getError(java.nio.ByteBuffer r1);

    public native java.lang.String getTypeForAction(java.nio.ByteBuffer r1, long r2, long r4);

    public native java.lang.String hexToJson(java.nio.ByteBuffer r1, long r2, java.lang.String r4, java.lang.String r5);

    public native boolean jsonToBin(java.nio.ByteBuffer r1, long r2, java.lang.String r4, java.lang.String r5, boolean r6);

    public java.lang.String name64ToString(long r2) {
            r1 = this;
            java.nio.ByteBuffer r0 = r1.context
            if (r0 == 0) goto L9
            java.lang.String r2 = r1.nameToString(r0, r2)
            return r2
        L9:
            one.block.eosiojavaabieosserializationprovider.AbieosContextNullError r2 = new one.block.eosiojavaabieosserializationprovider.AbieosContextNullError
            java.lang.String r3 = "Null context!  Has destroyContext() already been called?"
            r2.<init>(r3)
            throw r2
    }

    public native java.lang.String nameToString(java.nio.ByteBuffer r1, long r2);

    @Override // one.block.eosiojava.interfaces.ISerializationProvider
    public void serialize(one.block.eosiojava.models.AbiEosSerializationObject r12) {
            r11 = this;
            r11.refreshContext()     // Catch: one.block.eosiojava.error.serializationProvider.SerializationProviderError -> Lde
            java.lang.String r0 = r12.getJson()     // Catch: one.block.eosiojava.error.serializationProvider.SerializationProviderError -> Lde
            boolean r0 = r0.isEmpty()     // Catch: one.block.eosiojava.error.serializationProvider.SerializationProviderError -> Lde
            if (r0 != 0) goto Ld6
            java.lang.String r0 = r12.getContract()     // Catch: one.block.eosiojava.error.serializationProvider.SerializationProviderError -> Lde
            long r3 = r11.stringToName64(r0)     // Catch: one.block.eosiojava.error.serializationProvider.SerializationProviderError -> Lde
            java.lang.String r0 = r12.getAbi()     // Catch: one.block.eosiojava.error.serializationProvider.SerializationProviderError -> Lde
            boolean r0 = r0.isEmpty()     // Catch: one.block.eosiojava.error.serializationProvider.SerializationProviderError -> Lde
            r1 = 2
            r8 = 1
            java.lang.String r9 = ""
            r10 = 0
            if (r0 == 0) goto L44
            one.block.eosiojava.error.serializationProvider.SerializeError r0 = new one.block.eosiojava.error.serializationProvider.SerializeError     // Catch: one.block.eosiojava.error.serializationProvider.SerializationProviderError -> Lde
            java.lang.String r2 = "serialize -- No ABI provided for %s %s"
            java.lang.Object[] r1 = new java.lang.Object[r1]     // Catch: one.block.eosiojava.error.serializationProvider.SerializationProviderError -> Lde
            java.lang.String r3 = r12.getContract()     // Catch: one.block.eosiojava.error.serializationProvider.SerializationProviderError -> Lde
            if (r3 != 0) goto L34
            java.lang.String r9 = r12.getContract()     // Catch: one.block.eosiojava.error.serializationProvider.SerializationProviderError -> Lde
        L34:
            r1[r10] = r9     // Catch: one.block.eosiojava.error.serializationProvider.SerializationProviderError -> Lde
            java.lang.String r12 = r12.getName()     // Catch: one.block.eosiojava.error.serializationProvider.SerializationProviderError -> Lde
            r1[r8] = r12     // Catch: one.block.eosiojava.error.serializationProvider.SerializationProviderError -> Lde
            java.lang.String r12 = java.lang.String.format(r2, r1)     // Catch: one.block.eosiojava.error.serializationProvider.SerializationProviderError -> Lde
            r0.<init>(r12)     // Catch: one.block.eosiojava.error.serializationProvider.SerializationProviderError -> Lde
            throw r0     // Catch: one.block.eosiojava.error.serializationProvider.SerializationProviderError -> Lde
        L44:
            java.nio.ByteBuffer r0 = r11.context     // Catch: one.block.eosiojava.error.serializationProvider.SerializationProviderError -> Lde
            java.lang.String r2 = r12.getAbi()     // Catch: one.block.eosiojava.error.serializationProvider.SerializationProviderError -> Lde
            boolean r0 = r11.setAbi(r0, r3, r2)     // Catch: one.block.eosiojava.error.serializationProvider.SerializationProviderError -> Lde
            if (r0 != 0) goto L68
            java.lang.String r12 = r11.error()     // Catch: one.block.eosiojava.error.serializationProvider.SerializationProviderError -> Lde
            java.lang.String r0 = "Json to hex == Unable to set ABI. %s"
            java.lang.Object[] r1 = new java.lang.Object[r8]     // Catch: one.block.eosiojava.error.serializationProvider.SerializationProviderError -> Lde
            if (r12 != 0) goto L5b
            goto L5c
        L5b:
            r9 = r12
        L5c:
            r1[r10] = r9     // Catch: one.block.eosiojava.error.serializationProvider.SerializationProviderError -> Lde
            java.lang.String r12 = java.lang.String.format(r0, r1)     // Catch: one.block.eosiojava.error.serializationProvider.SerializationProviderError -> Lde
            one.block.eosiojava.error.serializationProvider.SerializeError r0 = new one.block.eosiojava.error.serializationProvider.SerializeError     // Catch: one.block.eosiojava.error.serializationProvider.SerializationProviderError -> Lde
            r0.<init>(r12)     // Catch: one.block.eosiojava.error.serializationProvider.SerializationProviderError -> Lde
            throw r0     // Catch: one.block.eosiojava.error.serializationProvider.SerializationProviderError -> Lde
        L68:
            java.lang.String r0 = r12.getType()     // Catch: one.block.eosiojava.error.serializationProvider.SerializationProviderError -> Lde
            if (r0 != 0) goto L77
            java.lang.String r0 = r12.getName()     // Catch: one.block.eosiojava.error.serializationProvider.SerializationProviderError -> Lde
            java.lang.String r0 = r11.getType(r0, r3)     // Catch: one.block.eosiojava.error.serializationProvider.SerializationProviderError -> Lde
            goto L7b
        L77:
            java.lang.String r0 = r12.getType()     // Catch: one.block.eosiojava.error.serializationProvider.SerializationProviderError -> Lde
        L7b:
            r5 = r0
            if (r5 != 0) goto L9c
            java.lang.String r0 = r11.error()     // Catch: one.block.eosiojava.error.serializationProvider.SerializationProviderError -> Lde
            java.lang.String r2 = "Unable to find type for action %s. %s"
            java.lang.Object[] r1 = new java.lang.Object[r1]     // Catch: one.block.eosiojava.error.serializationProvider.SerializationProviderError -> Lde
            java.lang.String r12 = r12.getName()     // Catch: one.block.eosiojava.error.serializationProvider.SerializationProviderError -> Lde
            r1[r10] = r12     // Catch: one.block.eosiojava.error.serializationProvider.SerializationProviderError -> Lde
            if (r0 != 0) goto L8f
            goto L90
        L8f:
            r9 = r0
        L90:
            r1[r8] = r9     // Catch: one.block.eosiojava.error.serializationProvider.SerializationProviderError -> Lde
            java.lang.String r12 = java.lang.String.format(r2, r1)     // Catch: one.block.eosiojava.error.serializationProvider.SerializationProviderError -> Lde
            one.block.eosiojava.error.serializationProvider.SerializeError r0 = new one.block.eosiojava.error.serializationProvider.SerializeError     // Catch: one.block.eosiojava.error.serializationProvider.SerializationProviderError -> Lde
            r0.<init>(r12)     // Catch: one.block.eosiojava.error.serializationProvider.SerializationProviderError -> Lde
            throw r0     // Catch: one.block.eosiojava.error.serializationProvider.SerializationProviderError -> Lde
        L9c:
            java.nio.ByteBuffer r2 = r11.context     // Catch: one.block.eosiojava.error.serializationProvider.SerializationProviderError -> Lde
            java.lang.String r6 = r12.getJson()     // Catch: one.block.eosiojava.error.serializationProvider.SerializationProviderError -> Lde
            r7 = 1
            r1 = r11
            boolean r0 = r1.jsonToBin(r2, r3, r5, r6, r7)     // Catch: one.block.eosiojava.error.serializationProvider.SerializationProviderError -> Lde
            if (r0 != 0) goto Lc2
            java.lang.String r12 = r11.error()     // Catch: one.block.eosiojava.error.serializationProvider.SerializationProviderError -> Lde
            java.lang.String r0 = "Unable to pack json to bin. %s"
            java.lang.Object[] r1 = new java.lang.Object[r8]     // Catch: one.block.eosiojava.error.serializationProvider.SerializationProviderError -> Lde
            if (r12 != 0) goto Lb5
            goto Lb6
        Lb5:
            r9 = r12
        Lb6:
            r1[r10] = r9     // Catch: one.block.eosiojava.error.serializationProvider.SerializationProviderError -> Lde
            java.lang.String r12 = java.lang.String.format(r0, r1)     // Catch: one.block.eosiojava.error.serializationProvider.SerializationProviderError -> Lde
            one.block.eosiojava.error.serializationProvider.SerializeError r0 = new one.block.eosiojava.error.serializationProvider.SerializeError     // Catch: one.block.eosiojava.error.serializationProvider.SerializationProviderError -> Lde
            r0.<init>(r12)     // Catch: one.block.eosiojava.error.serializationProvider.SerializationProviderError -> Lde
            throw r0     // Catch: one.block.eosiojava.error.serializationProvider.SerializationProviderError -> Lde
        Lc2:
            java.nio.ByteBuffer r0 = r11.context     // Catch: one.block.eosiojava.error.serializationProvider.SerializationProviderError -> Lde
            java.lang.String r0 = r11.getBinHex(r0)     // Catch: one.block.eosiojava.error.serializationProvider.SerializationProviderError -> Lde
            if (r0 == 0) goto Lce
            r12.setHex(r0)     // Catch: one.block.eosiojava.error.serializationProvider.SerializationProviderError -> Lde
            return
        Lce:
            one.block.eosiojava.error.serializationProvider.SerializeError r12 = new one.block.eosiojava.error.serializationProvider.SerializeError     // Catch: one.block.eosiojava.error.serializationProvider.SerializationProviderError -> Lde
            java.lang.String r0 = "Unable to convert binary to hex."
            r12.<init>(r0)     // Catch: one.block.eosiojava.error.serializationProvider.SerializationProviderError -> Lde
            throw r12     // Catch: one.block.eosiojava.error.serializationProvider.SerializationProviderError -> Lde
        Ld6:
            one.block.eosiojava.error.serializationProvider.SerializeError r12 = new one.block.eosiojava.error.serializationProvider.SerializeError     // Catch: one.block.eosiojava.error.serializationProvider.SerializationProviderError -> Lde
            java.lang.String r0 = "No content to serialize."
            r12.<init>(r0)     // Catch: one.block.eosiojava.error.serializationProvider.SerializationProviderError -> Lde
            throw r12     // Catch: one.block.eosiojava.error.serializationProvider.SerializationProviderError -> Lde
        Lde:
            r12 = move-exception
            one.block.eosiojava.error.serializationProvider.SerializeError r0 = new one.block.eosiojava.error.serializationProvider.SerializeError
            r0.<init>(r12)
            throw r0
    }

    @Override // one.block.eosiojava.interfaces.ISerializationProvider
    public java.lang.String serializeAbi(java.lang.String r4) {
            r3 = this;
            r3.refreshContext()     // Catch: one.block.eosiojava.error.serializationProvider.SerializationProviderError -> L36
            java.nio.ByteBuffer r0 = r3.context     // Catch: one.block.eosiojava.error.serializationProvider.SerializationProviderError -> L36
            boolean r4 = r3.abiJsonToBin(r0, r4)     // Catch: one.block.eosiojava.error.serializationProvider.SerializationProviderError -> L36
            if (r4 != 0) goto L25
            java.lang.String r4 = r3.error()     // Catch: one.block.eosiojava.error.serializationProvider.SerializationProviderError -> L36
            java.lang.String r0 = "Unable to pack abi json to bin. %s"
            r1 = 1
            java.lang.Object[] r1 = new java.lang.Object[r1]     // Catch: one.block.eosiojava.error.serializationProvider.SerializationProviderError -> L36
            r2 = 0
            if (r4 != 0) goto L19
            java.lang.String r4 = ""
        L19:
            r1[r2] = r4     // Catch: one.block.eosiojava.error.serializationProvider.SerializationProviderError -> L36
            java.lang.String r4 = java.lang.String.format(r0, r1)     // Catch: one.block.eosiojava.error.serializationProvider.SerializationProviderError -> L36
            one.block.eosiojava.error.serializationProvider.SerializeError r0 = new one.block.eosiojava.error.serializationProvider.SerializeError     // Catch: one.block.eosiojava.error.serializationProvider.SerializationProviderError -> L36
            r0.<init>(r4)     // Catch: one.block.eosiojava.error.serializationProvider.SerializationProviderError -> L36
            throw r0     // Catch: one.block.eosiojava.error.serializationProvider.SerializationProviderError -> L36
        L25:
            java.nio.ByteBuffer r4 = r3.context     // Catch: one.block.eosiojava.error.serializationProvider.SerializationProviderError -> L36
            java.lang.String r4 = r3.getBinHex(r4)     // Catch: one.block.eosiojava.error.serializationProvider.SerializationProviderError -> L36
            if (r4 == 0) goto L2e
            return r4
        L2e:
            one.block.eosiojava.error.serializationProvider.SerializeError r4 = new one.block.eosiojava.error.serializationProvider.SerializeError     // Catch: one.block.eosiojava.error.serializationProvider.SerializationProviderError -> L36
            java.lang.String r0 = "Unable to convert binary to hex."
            r4.<init>(r0)     // Catch: one.block.eosiojava.error.serializationProvider.SerializationProviderError -> L36
            throw r4     // Catch: one.block.eosiojava.error.serializationProvider.SerializationProviderError -> L36
        L36:
            r4 = move-exception
            one.block.eosiojava.error.serializationProvider.SerializeAbiError r0 = new one.block.eosiojava.error.serializationProvider.SerializeAbiError
            r0.<init>(r4)
            throw r0
    }

    @Override // one.block.eosiojava.interfaces.ISerializationProvider
    public java.lang.String serializePackedTransaction(java.lang.String r6) {
            r5 = this;
            java.lang.String r0 = "packed.transaction.abi.json"
            java.lang.String r0 = r5.getAbiJsonString(r0)     // Catch: one.block.eosiojava.error.serializationProvider.SerializationProviderError -> L1b
            one.block.eosiojava.models.AbiEosSerializationObject r1 = new one.block.eosiojava.models.AbiEosSerializationObject     // Catch: one.block.eosiojava.error.serializationProvider.SerializationProviderError -> L1b
            r2 = 0
            java.lang.String r3 = ""
            java.lang.String r4 = "packed_transaction_v0"
            r1.<init>(r2, r3, r4, r0)     // Catch: one.block.eosiojava.error.serializationProvider.SerializationProviderError -> L1b
            r1.setJson(r6)     // Catch: one.block.eosiojava.error.serializationProvider.SerializationProviderError -> L1b
            r5.serialize(r1)     // Catch: one.block.eosiojava.error.serializationProvider.SerializationProviderError -> L1b
            java.lang.String r6 = r1.getHex()     // Catch: one.block.eosiojava.error.serializationProvider.SerializationProviderError -> L1b
            return r6
        L1b:
            r6 = move-exception
            one.block.eosiojava.error.serializationProvider.SerializePackedTransactionError r0 = new one.block.eosiojava.error.serializationProvider.SerializePackedTransactionError
            r0.<init>(r6)
            throw r0
    }

    @Override // one.block.eosiojava.interfaces.ISerializationProvider
    public java.lang.String serializeTransaction(java.lang.String r6) {
            r5 = this;
            java.lang.String r0 = "transaction.abi.json"
            java.lang.String r0 = r5.getAbiJsonString(r0)     // Catch: one.block.eosiojava.error.serializationProvider.SerializationProviderError -> L1b
            one.block.eosiojava.models.AbiEosSerializationObject r1 = new one.block.eosiojava.models.AbiEosSerializationObject     // Catch: one.block.eosiojava.error.serializationProvider.SerializationProviderError -> L1b
            r2 = 0
            java.lang.String r3 = ""
            java.lang.String r4 = "transaction"
            r1.<init>(r2, r3, r4, r0)     // Catch: one.block.eosiojava.error.serializationProvider.SerializationProviderError -> L1b
            r1.setJson(r6)     // Catch: one.block.eosiojava.error.serializationProvider.SerializationProviderError -> L1b
            r5.serialize(r1)     // Catch: one.block.eosiojava.error.serializationProvider.SerializationProviderError -> L1b
            java.lang.String r6 = r1.getHex()     // Catch: one.block.eosiojava.error.serializationProvider.SerializationProviderError -> L1b
            return r6
        L1b:
            r6 = move-exception
            one.block.eosiojava.error.serializationProvider.SerializeTransactionError r0 = new one.block.eosiojava.error.serializationProvider.SerializeTransactionError
            r0.<init>(r6)
            throw r0
    }

    public native boolean setAbi(java.nio.ByteBuffer r1, long r2, java.lang.String r4);

    public native java.lang.String stringFromAbiEos();

    public native long stringToName(java.nio.ByteBuffer r1, java.lang.String r2);

    public long stringToName64(java.lang.String r3) {
            r2 = this;
            java.nio.ByteBuffer r0 = r2.context
            if (r0 == 0) goto L9
            long r0 = r2.stringToName(r0, r3)
            return r0
        L9:
            one.block.eosiojavaabieosserializationprovider.AbieosContextNullError r3 = new one.block.eosiojavaabieosserializationprovider.AbieosContextNullError
            java.lang.String r0 = "Null context!  Has destroyContext() already been called?"
            r3.<init>(r0)
            throw r3
    }
}
