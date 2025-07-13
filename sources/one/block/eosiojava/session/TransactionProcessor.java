package one.block.eosiojava.session;

/* loaded from: classes.dex */
public class TransactionProcessor {
    private static final java.lang.String PACKED_TRANSACTION_V0_PREFIX = "00";
    private one.block.eosiojava.interfaces.IABIProvider abiProvider;
    private java.util.List<java.lang.String> availableKeys;
    private java.lang.String chainId;
    private one.block.eosiojava.models.rpcProvider.ContextFreeData contextFreeData;
    private boolean isTransactionModificationAllowed;
    private one.block.eosiojava.models.rpcProvider.Transaction originalTransaction;
    private java.util.List<java.lang.String> requiredKeys;
    private one.block.eosiojava.interfaces.IRPCProvider rpcProvider;
    private one.block.eosiojava.interfaces.ISerializationProvider serializationProvider;
    public java.lang.String serializedTransaction;
    private one.block.eosiojava.interfaces.ISignatureProvider signatureProvider;
    public java.util.List<java.lang.String> signatures;
    private one.block.eosiojava.models.rpcProvider.Transaction transaction;
    private one.block.eosiojava.models.rpcProvider.TransactionConfig transactionConfig;

    public TransactionProcessor(one.block.eosiojava.interfaces.ISerializationProvider r2, one.block.eosiojava.interfaces.IRPCProvider r3, one.block.eosiojava.interfaces.IABIProvider r4, one.block.eosiojava.interfaces.ISignatureProvider r5) {
            r1 = this;
            r1.<init>()
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r1.signatures = r0
            one.block.eosiojava.models.rpcProvider.TransactionConfig r0 = new one.block.eosiojava.models.rpcProvider.TransactionConfig
            r0.<init>()
            r1.transactionConfig = r0
            r1.serializationProvider = r2
            r1.rpcProvider = r3
            r1.abiProvider = r4
            r1.signatureProvider = r5
            return
    }

    public TransactionProcessor(one.block.eosiojava.interfaces.ISerializationProvider r1, one.block.eosiojava.interfaces.IRPCProvider r2, one.block.eosiojava.interfaces.IABIProvider r3, one.block.eosiojava.interfaces.ISignatureProvider r4, one.block.eosiojava.models.rpcProvider.Transaction r5) {
            r0 = this;
            r0.<init>(r1, r2, r3, r4)
            r0.transaction = r5
            java.util.List r1 = r5.getActions()
            boolean r1 = r1.isEmpty()
            if (r1 != 0) goto L10
            return
        L10:
            one.block.eosiojava.error.session.TransactionProcessorConstructorInputError r1 = new one.block.eosiojava.error.session.TransactionProcessorConstructorInputError
            java.lang.String r2 = "Action list can't be empty!"
            r1.<init>(r2)
            throw r1
    }

    private one.block.eosiojava.models.signatureProvider.EosioTransactionSignatureRequest createSignatureRequest() {
            r8 = this;
            one.block.eosiojava.models.rpcProvider.Transaction r0 = r8.transaction
            if (r0 == 0) goto Lb1
            java.util.List r0 = r0.getActions()
            boolean r0 = r0.isEmpty()
            if (r0 != 0) goto La9
            java.lang.String r2 = r8.serializeTransaction()
            r8.serializedTransaction = r2
            one.block.eosiojava.models.signatureProvider.EosioTransactionSignatureRequest r0 = new one.block.eosiojava.models.signatureProvider.EosioTransactionSignatureRequest
            r3 = 0
            java.lang.String r4 = r8.chainId
            r5 = 0
            boolean r6 = r8.isTransactionModificationAllowed
            one.block.eosiojava.models.rpcProvider.ContextFreeData r1 = r8.contextFreeData
            java.lang.String r7 = r1.getSerialized()
            r1 = r0
            r1.<init>(r2, r3, r4, r5, r6, r7)
            java.util.List<java.lang.String> r1 = r8.requiredKeys
            if (r1 == 0) goto L36
            boolean r1 = r1.isEmpty()
            if (r1 != 0) goto L36
            java.util.List<java.lang.String> r1 = r8.requiredKeys
            r0.setSigningPublicKeys(r1)
            return r0
        L36:
            java.util.List<java.lang.String> r1 = r8.availableKeys
            if (r1 == 0) goto L40
            boolean r1 = r1.isEmpty()
            if (r1 == 0) goto L4e
        L40:
            one.block.eosiojava.interfaces.ISignatureProvider r1 = r8.signatureProvider     // Catch: one.block.eosiojava.error.signatureProvider.GetAvailableKeysError -> La0
            java.util.List r1 = r1.getAvailableKeys()     // Catch: one.block.eosiojava.error.signatureProvider.GetAvailableKeysError -> La0
            r8.availableKeys = r1     // Catch: one.block.eosiojava.error.signatureProvider.GetAvailableKeysError -> La0
            boolean r1 = r1.isEmpty()
            if (r1 != 0) goto L98
        L4e:
            one.block.eosiojava.interfaces.IRPCProvider r1 = r8.rpcProvider     // Catch: one.block.eosiojava.error.rpcProvider.GetRequiredKeysRpcError -> L8f
            one.block.eosiojava.models.rpcProvider.request.GetRequiredKeysRequest r2 = new one.block.eosiojava.models.rpcProvider.request.GetRequiredKeysRequest     // Catch: one.block.eosiojava.error.rpcProvider.GetRequiredKeysRpcError -> L8f
            java.util.List<java.lang.String> r3 = r8.availableKeys     // Catch: one.block.eosiojava.error.rpcProvider.GetRequiredKeysRpcError -> L8f
            one.block.eosiojava.models.rpcProvider.Transaction r4 = r8.transaction     // Catch: one.block.eosiojava.error.rpcProvider.GetRequiredKeysRpcError -> L8f
            r2.<init>(r3, r4)     // Catch: one.block.eosiojava.error.rpcProvider.GetRequiredKeysRpcError -> L8f
            one.block.eosiojava.models.rpcProvider.response.GetRequiredKeysResponse r1 = r1.getRequiredKeys(r2)     // Catch: one.block.eosiojava.error.rpcProvider.GetRequiredKeysRpcError -> L8f
            java.util.List r2 = r1.getRequiredKeys()     // Catch: one.block.eosiojava.error.rpcProvider.GetRequiredKeysRpcError -> L8f
            if (r2 == 0) goto L87
            java.util.List r2 = r1.getRequiredKeys()     // Catch: one.block.eosiojava.error.rpcProvider.GetRequiredKeysRpcError -> L8f
            boolean r2 = r2.isEmpty()     // Catch: one.block.eosiojava.error.rpcProvider.GetRequiredKeysRpcError -> L8f
            if (r2 != 0) goto L87
            java.util.List r1 = r1.getRequiredKeys()     // Catch: one.block.eosiojava.error.rpcProvider.GetRequiredKeysRpcError -> L8f
            java.util.List<java.lang.String> r2 = r8.availableKeys     // Catch: one.block.eosiojava.error.rpcProvider.GetRequiredKeysRpcError -> L8f
            boolean r2 = r2.containsAll(r1)     // Catch: one.block.eosiojava.error.rpcProvider.GetRequiredKeysRpcError -> L8f
            if (r2 == 0) goto L7f
            r8.requiredKeys = r1     // Catch: one.block.eosiojava.error.rpcProvider.GetRequiredKeysRpcError -> L8f
            r0.setSigningPublicKeys(r1)
            return r0
        L7f:
            one.block.eosiojava.error.session.TransactionCreateSignatureRequestRequiredKeysEmptyError r0 = new one.block.eosiojava.error.session.TransactionCreateSignatureRequestRequiredKeysEmptyError     // Catch: one.block.eosiojava.error.rpcProvider.GetRequiredKeysRpcError -> L8f
            java.lang.String r1 = "Required keys from back end are not available in available keys from Signature Provider."
            r0.<init>(r1)     // Catch: one.block.eosiojava.error.rpcProvider.GetRequiredKeysRpcError -> L8f
            throw r0     // Catch: one.block.eosiojava.error.rpcProvider.GetRequiredKeysRpcError -> L8f
        L87:
            one.block.eosiojava.error.session.TransactionCreateSignatureRequestRequiredKeysEmptyError r0 = new one.block.eosiojava.error.session.TransactionCreateSignatureRequestRequiredKeysEmptyError     // Catch: one.block.eosiojava.error.rpcProvider.GetRequiredKeysRpcError -> L8f
            java.lang.String r1 = "GetRequiredKeys RPC returned no required keys"
            r0.<init>(r1)     // Catch: one.block.eosiojava.error.rpcProvider.GetRequiredKeysRpcError -> L8f
            throw r0     // Catch: one.block.eosiojava.error.rpcProvider.GetRequiredKeysRpcError -> L8f
        L8f:
            r0 = move-exception
            one.block.eosiojava.error.session.TransactionCreateSignatureRequestRpcError r1 = new one.block.eosiojava.error.session.TransactionCreateSignatureRequestRpcError
            java.lang.String r2 = "Error happened on calling getRequiredKeys RPC call."
            r1.<init>(r2, r0)
            throw r1
        L98:
            one.block.eosiojava.error.session.TransactionCreateSignatureRequestEmptyAvailableKeyError r0 = new one.block.eosiojava.error.session.TransactionCreateSignatureRequestEmptyAvailableKeyError
            java.lang.String r1 = "Signature provider return no available key"
            r0.<init>(r1)
            throw r0
        La0:
            r0 = move-exception
            one.block.eosiojava.error.session.TransactionCreateSignatureRequestKeyError r1 = new one.block.eosiojava.error.session.TransactionCreateSignatureRequestKeyError
            java.lang.String r2 = "Error happened on getAvailableKeys from SignatureProvider!"
            r1.<init>(r2, r0)
            throw r1
        La9:
            one.block.eosiojava.error.session.TransactionCreateSignatureRequestError r0 = new one.block.eosiojava.error.session.TransactionCreateSignatureRequestError
            java.lang.String r1 = "Action list can't be empty!"
            r0.<init>(r1)
            throw r0
        Lb1:
            one.block.eosiojava.error.session.TransactionCreateSignatureRequestError r0 = new one.block.eosiojava.error.session.TransactionCreateSignatureRequestError
            java.lang.String r1 = "Transaction must be initialized before this method could be called! call prepare for initialize Transaction"
            r0.<init>(r1)
            throw r0
    }

    private void finishPreparing(one.block.eosiojava.models.rpcProvider.Transaction r1, one.block.eosiojava.models.rpcProvider.ContextFreeData r2) {
            r0 = this;
            r0.transaction = r1
            r0.contextFreeData = r2
            java.lang.String r1 = r0.serializedTransaction
            boolean r1 = p185k7.C3828h5.m8605t(r1)
            if (r1 != 0) goto L10
            java.lang.String r1 = ""
            r0.serializedTransaction = r1
        L10:
            return
    }

    private one.block.eosiojava.models.rpcProvider.Transaction getDeepClone() {
            r1 = this;
            one.block.eosiojava.models.rpcProvider.Transaction r0 = r1.transaction
            if (r0 != 0) goto L6
            r0 = 0
            return r0
        L6:
            java.io.Serializable r0 = one.block.eosiojava.utilities.Utils.clone(r0)
            one.block.eosiojava.models.rpcProvider.Transaction r0 = (one.block.eosiojava.models.rpcProvider.Transaction) r0
            return r0
    }

    private one.block.eosiojava.models.signatureProvider.C5328x49c37d4a getSignature(one.block.eosiojava.models.signatureProvider.EosioTransactionSignatureRequest r4) {
            r3 = this;
            one.block.eosiojava.interfaces.ISignatureProvider r0 = r3.signatureProvider     // Catch: one.block.eosiojava.error.signatureProvider.SignatureProviderError -> La4
            one.block.eosiojava.models.signatureProvider.EosioTransactionSignatureResponse r4 = r0.signTransaction(r4)     // Catch: one.block.eosiojava.error.signatureProvider.SignatureProviderError -> La4
            one.block.eosiojava.error.signatureProvider.SignatureProviderError r0 = r4.getError()     // Catch: one.block.eosiojava.error.signatureProvider.SignatureProviderError -> La4
            if (r0 != 0) goto L9f
            java.lang.String r0 = r4.getSerializedTransaction()
            boolean r0 = p185k7.C3828h5.m8605t(r0)
            if (r0 != 0) goto L97
            java.util.List r0 = r4.getSignatures()
            boolean r0 = r0.isEmpty()
            if (r0 != 0) goto L8f
            one.block.eosiojava.models.rpcProvider.Transaction r0 = r3.transaction
            r3.originalTransaction = r0
            java.lang.String r0 = r3.serializedTransaction
            if (r0 == 0) goto L7a
            java.lang.String r1 = r4.getSerializedTransaction()
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L7a
            boolean r0 = r3.isTransactionModificationAllowed
            if (r0 == 0) goto L72
            one.block.eosiojava.interfaces.ISerializationProvider r0 = r3.serializationProvider     // Catch: one.block.eosiojava.error.serializationProvider.DeserializeTransactionError -> L69
            java.lang.String r1 = r4.getSerializedTransaction()     // Catch: one.block.eosiojava.error.serializationProvider.DeserializeTransactionError -> L69
            java.lang.String r0 = r0.deserializeTransaction(r1)     // Catch: one.block.eosiojava.error.serializationProvider.DeserializeTransactionError -> L69
            if (r0 == 0) goto L61
            boolean r1 = r0.isEmpty()     // Catch: one.block.eosiojava.error.serializationProvider.DeserializeTransactionError -> L69
            if (r1 != 0) goto L61
            java.lang.String r1 = "yyyy-MM-dd'T'HH:mm:ss.SSS"
            jb.j r1 = one.block.eosiojava.utilities.Utils.getGson(r1)
            java.lang.Class<one.block.eosiojava.models.rpcProvider.Transaction> r2 = one.block.eosiojava.models.rpcProvider.Transaction.class
            java.lang.Object r0 = r1.m7929c(r0, r2)
            java.lang.Class r1 = p074e9.C1805a.m4513A(r2)
            java.lang.Object r0 = r1.cast(r0)
            one.block.eosiojava.models.rpcProvider.Transaction r0 = (one.block.eosiojava.models.rpcProvider.Transaction) r0
            r3.transaction = r0
            goto L7a
        L61:
            one.block.eosiojava.error.serializationProvider.DeserializeTransactionError r4 = new one.block.eosiojava.error.serializationProvider.DeserializeTransactionError     // Catch: one.block.eosiojava.error.serializationProvider.DeserializeTransactionError -> L69
            java.lang.String r0 = "Deserialized transaction is null or empty"
            r4.<init>(r0)     // Catch: one.block.eosiojava.error.serializationProvider.DeserializeTransactionError -> L69
            throw r4     // Catch: one.block.eosiojava.error.serializationProvider.DeserializeTransactionError -> L69
        L69:
            r4 = move-exception
            one.block.eosiojava.error.session.TransactionGetSignatureDeserializationError r0 = new one.block.eosiojava.error.session.TransactionGetSignatureDeserializationError
            java.lang.String r1 = "Error happened on calling deserializeTransaction to refresh transaction object with new values"
            r0.<init>(r1, r4)
            throw r0
        L72:
            one.block.eosiojava.error.session.TransactionGetSignatureNotAllowModifyTransactionError r4 = new one.block.eosiojava.error.session.TransactionGetSignatureNotAllowModifyTransactionError
            java.lang.String r0 = "The transaction is not allowed to be modified but was modified by signature provider!"
            r4.<init>(r0)
            throw r4
        L7a:
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r3.signatures = r0
            java.util.List r1 = r4.getSignatures()
            r0.addAll(r1)
            java.lang.String r0 = r4.getSerializedTransaction()
            r3.serializedTransaction = r0
            return r4
        L8f:
            one.block.eosiojava.error.session.TransactionGetSignatureSigningError r4 = new one.block.eosiojava.error.session.TransactionGetSignatureSigningError
            java.lang.String r0 = "Signatures come back empty from Signature Provider"
            r4.<init>(r0)
            throw r4
        L97:
            one.block.eosiojava.error.session.TransactionGetSignatureSigningError r4 = new one.block.eosiojava.error.session.TransactionGetSignatureSigningError
            java.lang.String r0 = "Serialized transaction come back empty from Signature Provider"
            r4.<init>(r0)
            throw r4
        L9f:
            one.block.eosiojava.error.signatureProvider.SignatureProviderError r4 = r4.getError()     // Catch: one.block.eosiojava.error.signatureProvider.SignatureProviderError -> La4
            throw r4     // Catch: one.block.eosiojava.error.signatureProvider.SignatureProviderError -> La4
        La4:
            r4 = move-exception
            one.block.eosiojava.error.session.TransactionGetSignatureSigningError r0 = new one.block.eosiojava.error.session.TransactionGetSignatureSigningError
            java.lang.String r1 = "Error happened on calling sign transaction of Signature provider"
            r0.<init>(r1, r4)
            throw r0
    }

    private one.block.eosiojava.models.rpcProvider.response.SendTransactionResponse sendTransaction(one.block.eosiojava.models.rpcProvider.request.SendTransactionRequest r3) {
            r2 = this;
            one.block.eosiojava.interfaces.IRPCProvider r0 = r2.rpcProvider     // Catch: one.block.eosiojava.error.rpcProvider.SendTransactionRpcError -> L7
            one.block.eosiojava.models.rpcProvider.response.SendTransactionResponse r3 = r0.sendTransaction(r3)     // Catch: one.block.eosiojava.error.rpcProvider.SendTransactionRpcError -> L7
            return r3
        L7:
            r3 = move-exception
            one.block.eosiojava.error.session.TransactionSendTransactionError r0 = new one.block.eosiojava.error.session.TransactionSendTransactionError
            java.lang.String r1 = "Error happened on calling sendTransaction RPC call"
            r0.<init>(r1, r3)
            throw r0
    }

    private one.block.eosiojava.models.AbiEosSerializationObject serializeAction(one.block.eosiojava.models.rpcProvider.Action r3, java.lang.String r4, one.block.eosiojava.interfaces.IABIProvider r5) {
            r2 = this;
            one.block.eosiojava.models.AbiEosSerializationObject r4 = r2.setupAbiEosSerializationObject(r3, r4, r5)
            one.block.eosiojava.interfaces.ISerializationProvider r5 = r2.serializationProvider     // Catch: one.block.eosiojava.error.serializationProvider.SerializeError -> La
            r5.serialize(r4)     // Catch: one.block.eosiojava.error.serializationProvider.SerializeError -> La
            return r4
        La:
            r4 = move-exception
            one.block.eosiojava.error.session.TransactionCreateSignatureRequestSerializationError r5 = new one.block.eosiojava.error.session.TransactionCreateSignatureRequestSerializationError
            r0 = 1
            java.lang.Object[] r0 = new java.lang.Object[r0]
            r1 = 0
            java.lang.String r3 = r3.getAccount()
            r0[r1] = r3
            java.lang.String r3 = "Error happened on serializing action [%s]"
            java.lang.String r3 = java.lang.String.format(r3, r0)
            r5.<init>(r3, r4)
            throw r5
    }

    private one.block.eosiojava.models.AbiEosSerializationObject serializeContextFreeAction(one.block.eosiojava.models.rpcProvider.Action r3, java.lang.String r4, one.block.eosiojava.interfaces.IABIProvider r5) {
            r2 = this;
            one.block.eosiojava.models.AbiEosSerializationObject r4 = r2.setupAbiEosSerializationObject(r3, r4, r5)
            boolean r5 = r3.hasData()     // Catch: one.block.eosiojava.error.serializationProvider.SerializeError -> L10
            if (r5 == 0) goto Lf
            one.block.eosiojava.interfaces.ISerializationProvider r5 = r2.serializationProvider     // Catch: one.block.eosiojava.error.serializationProvider.SerializeError -> L10
            r5.serialize(r4)     // Catch: one.block.eosiojava.error.serializationProvider.SerializeError -> L10
        Lf:
            return r4
        L10:
            r4 = move-exception
            one.block.eosiojava.error.session.TransactionCreateSignatureRequestSerializationError r5 = new one.block.eosiojava.error.session.TransactionCreateSignatureRequestSerializationError
            r0 = 1
            java.lang.Object[] r0 = new java.lang.Object[r0]
            r1 = 0
            java.lang.String r3 = r3.getAccount()
            r0[r1] = r3
            java.lang.String r3 = "Error happened on serializing action [%s]"
            java.lang.String r3 = java.lang.String.format(r3, r0)
            r5.<init>(r3, r4)
            throw r5
    }

    private java.lang.String serializeTransaction() {
            r5 = this;
            java.lang.String r0 = "Error happened on cloning transaction."
            one.block.eosiojava.models.rpcProvider.Transaction r1 = r5.getDeepClone()     // Catch: java.lang.ClassNotFoundException -> Lab java.io.IOException -> Lb4
            if (r1 == 0) goto La5
            java.lang.String r0 = r5.chainId
            if (r0 == 0) goto L12
            boolean r0 = r0.isEmpty()
            if (r0 == 0) goto L1e
        L12:
            one.block.eosiojava.interfaces.IRPCProvider r0 = r5.rpcProvider     // Catch: one.block.eosiojava.error.rpcProvider.GetInfoRpcError -> L9c
            one.block.eosiojava.models.rpcProvider.response.GetInfoResponse r0 = r0.getInfo()     // Catch: one.block.eosiojava.error.rpcProvider.GetInfoRpcError -> L9c
            java.lang.String r0 = r0.getChainId()     // Catch: one.block.eosiojava.error.rpcProvider.GetInfoRpcError -> L9c
            r5.chainId = r0     // Catch: one.block.eosiojava.error.rpcProvider.GetInfoRpcError -> L9c
        L1e:
            java.util.List r0 = r1.getActions()
            java.util.Iterator r0 = r0.iterator()
        L26:
            boolean r2 = r0.hasNext()
            if (r2 == 0) goto L42
            java.lang.Object r2 = r0.next()
            one.block.eosiojava.models.rpcProvider.Action r2 = (one.block.eosiojava.models.rpcProvider.Action) r2
            java.lang.String r3 = r5.chainId
            one.block.eosiojava.interfaces.IABIProvider r4 = r5.abiProvider
            one.block.eosiojava.models.AbiEosSerializationObject r3 = r5.serializeAction(r2, r3, r4)
            java.lang.String r3 = r3.getHex()
            r2.setData(r3)
            goto L26
        L42:
            java.util.List r0 = r1.getContextFreeActions()
            boolean r0 = r0.isEmpty()
            if (r0 != 0) goto L70
            java.util.List r0 = r1.getContextFreeActions()
            java.util.Iterator r0 = r0.iterator()
        L54:
            boolean r2 = r0.hasNext()
            if (r2 == 0) goto L70
            java.lang.Object r2 = r0.next()
            one.block.eosiojava.models.rpcProvider.Action r2 = (one.block.eosiojava.models.rpcProvider.Action) r2
            java.lang.String r3 = r5.chainId
            one.block.eosiojava.interfaces.IABIProvider r4 = r5.abiProvider
            one.block.eosiojava.models.AbiEosSerializationObject r3 = r5.serializeContextFreeAction(r2, r3, r4)
            java.lang.String r3 = r3.getHex()
            r2.setData(r3)
            goto L54
        L70:
            r5.transaction = r1
            java.lang.String r0 = "yyyy-MM-dd'T'HH:mm:ss.SSS"
            jb.j r0 = one.block.eosiojava.utilities.Utils.getGson(r0)     // Catch: one.block.eosiojava.error.serializationProvider.SerializeTransactionError -> L93
            java.lang.String r0 = r0.m7935i(r1)     // Catch: one.block.eosiojava.error.serializationProvider.SerializeTransactionError -> L93
            one.block.eosiojava.interfaces.ISerializationProvider r1 = r5.serializationProvider     // Catch: one.block.eosiojava.error.serializationProvider.SerializeTransactionError -> L93
            java.lang.String r0 = r1.serializeTransaction(r0)     // Catch: one.block.eosiojava.error.serializationProvider.SerializeTransactionError -> L93
            if (r0 == 0) goto L8b
            boolean r1 = r0.isEmpty()     // Catch: one.block.eosiojava.error.serializationProvider.SerializeTransactionError -> L93
            if (r1 != 0) goto L8b
            return r0
        L8b:
            one.block.eosiojava.error.session.TransactionCreateSignatureRequestSerializationError r0 = new one.block.eosiojava.error.session.TransactionCreateSignatureRequestSerializationError     // Catch: one.block.eosiojava.error.serializationProvider.SerializeTransactionError -> L93
            java.lang.String r1 = "Serialization of transaction worked fine but got back empty result!"
            r0.<init>(r1)     // Catch: one.block.eosiojava.error.serializationProvider.SerializeTransactionError -> L93
            throw r0     // Catch: one.block.eosiojava.error.serializationProvider.SerializeTransactionError -> L93
        L93:
            r0 = move-exception
            one.block.eosiojava.error.session.TransactionCreateSignatureRequestSerializationError r1 = new one.block.eosiojava.error.session.TransactionCreateSignatureRequestSerializationError
            java.lang.String r2 = "Error happened on serializing transaction"
            r1.<init>(r2, r0)
            throw r1
        L9c:
            r0 = move-exception
            one.block.eosiojava.error.session.TransactionCreateSignatureRequestRpcError r1 = new one.block.eosiojava.error.session.TransactionCreateSignatureRequestRpcError
            java.lang.String r2 = "Error happened on calling GetInfo RPC."
            r1.<init>(r2, r0)
            throw r1
        La5:
            one.block.eosiojava.error.session.TransactionCreateSignatureRequestError r1 = new one.block.eosiojava.error.session.TransactionCreateSignatureRequestError
            r1.<init>(r0)
            throw r1
        Lab:
            r0 = move-exception
            one.block.eosiojava.error.session.TransactionCreateSignatureRequestError r1 = new one.block.eosiojava.error.session.TransactionCreateSignatureRequestError
            java.lang.String r2 = "Transaction class was not found"
            r1.<init>(r2, r0)
            throw r1
        Lb4:
            r1 = move-exception
            one.block.eosiojava.error.session.TransactionCreateSignatureRequestError r2 = new one.block.eosiojava.error.session.TransactionCreateSignatureRequestError
            r2.<init>(r0, r1)
            throw r2
    }

    private one.block.eosiojava.models.AbiEosSerializationObject setupAbiEosSerializationObject(one.block.eosiojava.models.rpcProvider.Action r4, java.lang.String r5, one.block.eosiojava.interfaces.IABIProvider r6) {
            r3 = this;
            one.block.eosiojava.models.EOSIOName r0 = new one.block.eosiojava.models.EOSIOName     // Catch: one.block.eosiojava.error.abiProvider.GetAbiError -> L28
            java.lang.String r1 = r4.getAccount()     // Catch: one.block.eosiojava.error.abiProvider.GetAbiError -> L28
            r0.<init>(r1)     // Catch: one.block.eosiojava.error.abiProvider.GetAbiError -> L28
            java.lang.String r5 = r6.getAbi(r5, r0)     // Catch: one.block.eosiojava.error.abiProvider.GetAbiError -> L28
            one.block.eosiojava.models.AbiEosSerializationObject r6 = new one.block.eosiojava.models.AbiEosSerializationObject
            java.lang.String r0 = r4.getAccount()
            java.lang.String r1 = r4.getName()
            r2 = 0
            r6.<init>(r0, r1, r2, r5)
            java.lang.String r5 = ""
            r6.setHex(r5)
            java.lang.String r4 = r4.getData()
            r6.setJson(r4)
            return r6
        L28:
            r5 = move-exception
            one.block.eosiojava.error.session.TransactionCreateSignatureRequestAbiError r6 = new one.block.eosiojava.error.session.TransactionCreateSignatureRequestAbiError
            r0 = 1
            java.lang.Object[] r0 = new java.lang.Object[r0]
            r1 = 0
            java.lang.String r4 = r4.getAccount()
            r0[r1] = r4
            java.lang.String r4 = "Error happened on getting abi for contract [%s]"
            java.lang.String r4 = java.lang.String.format(r4, r0)
            r6.<init>(r4, r5)
            throw r6
    }

    public one.block.eosiojava.models.rpcProvider.response.SendTransactionResponse broadcast() {
            r5 = this;
            java.lang.String r0 = r5.serializedTransaction
            if (r0 == 0) goto L38
            boolean r0 = r0.isEmpty()
            if (r0 != 0) goto L38
            java.util.List<java.lang.String> r0 = r5.signatures
            boolean r0 = r0.isEmpty()
            if (r0 != 0) goto L30
            one.block.eosiojava.models.rpcProvider.request.SendTransactionRequest r0 = new one.block.eosiojava.models.rpcProvider.request.SendTransactionRequest
            java.util.List<java.lang.String> r1 = r5.signatures
            r2 = 0
            one.block.eosiojava.models.rpcProvider.ContextFreeData r3 = r5.contextFreeData
            java.lang.String r3 = r3.getHexed()
            java.lang.String r4 = r5.serializedTransaction
            r0.<init>(r1, r2, r3, r4)
            one.block.eosiojava.models.rpcProvider.response.SendTransactionResponse r0 = r5.sendTransaction(r0)     // Catch: one.block.eosiojava.error.session.TransactionSendTransactionError -> L27
            return r0
        L27:
            r0 = move-exception
            one.block.eosiojava.error.session.TransactionBroadCastError r1 = new one.block.eosiojava.error.session.TransactionBroadCastError
            java.lang.String r2 = "Error happened on sending transaction to chain!"
            r1.<init>(r2, r0)
            throw r1
        L30:
            one.block.eosiojava.error.session.TransactionBroadCastEmptySignatureError r0 = new one.block.eosiojava.error.session.TransactionBroadCastEmptySignatureError
            java.lang.String r1 = "Can't call broadcast because Signature is empty. Make sure of calling sign before calling broadcast."
            r0.<init>(r1)
            throw r0
        L38:
            one.block.eosiojava.error.session.TransactionBroadCastError r0 = new one.block.eosiojava.error.session.TransactionBroadCastError
            java.lang.String r1 = "Serialized Transaction is empty or has not been populated. Make sure to call prepare then sign before calling broadcast"
            r0.<init>(r1)
            throw r0
    }

    public one.block.eosiojava.models.rpcProvider.ContextFreeData getContextFreeData() {
            r1 = this;
            one.block.eosiojava.models.rpcProvider.ContextFreeData r0 = r1.contextFreeData
            return r0
    }

    public one.block.eosiojava.models.rpcProvider.Transaction getOriginalTransaction() {
            r1 = this;
            one.block.eosiojava.models.rpcProvider.Transaction r0 = r1.originalTransaction
            return r0
    }

    public java.lang.String getPackedTransactionV0() {
            r2 = this;
            java.lang.String r0 = "yyyy-MM-dd'T'HH:mm:ss.SSS"
            jb.j r0 = one.block.eosiojava.utilities.Utils.getGson(r0)
            java.lang.String r1 = r2.toJSON()
            java.lang.String r0 = r0.m7935i(r1)
            one.block.eosiojava.interfaces.ISerializationProvider r1 = r2.serializationProvider
            java.lang.String r0 = r1.serializePackedTransaction(r0)
            java.lang.String r1 = "00"
            java.lang.String r0 = p064e.C1493g.m4049a(r1, r0)
            return r0
    }

    public java.lang.String getSerializedTransaction() {
            r1 = this;
            java.lang.String r0 = r1.serializedTransaction
            return r0
    }

    public java.util.List<java.lang.String> getSignatures() {
            r1 = this;
            java.util.List<java.lang.String> r0 = r1.signatures
            return r0
    }

    public one.block.eosiojava.models.rpcProvider.Transaction getTransaction() {
            r1 = this;
            one.block.eosiojava.models.rpcProvider.Transaction r0 = r1.transaction
            return r0
    }

    public one.block.eosiojava.models.rpcProvider.TransactionConfig getTransactionConfig() {
            r1 = this;
            one.block.eosiojava.models.rpcProvider.TransactionConfig r0 = r1.transactionConfig
            return r0
    }

    public boolean isTransactionModificationAllowed() {
            r1 = this;
            boolean r0 = r1.isTransactionModificationAllowed
            return r0
    }

    public void prepare(java.util.List<one.block.eosiojava.models.rpcProvider.Action> r2) {
            r1 = this;
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r1.prepare(r2, r0)
            return
    }

    public void prepare(java.util.List<one.block.eosiojava.models.rpcProvider.Action> r2, java.util.List<one.block.eosiojava.models.rpcProvider.Action> r3) {
            r1 = this;
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r1.prepare(r2, r3, r0)
            return
    }

    public void prepare(java.util.List<one.block.eosiojava.models.rpcProvider.Action> r12, java.util.List<one.block.eosiojava.models.rpcProvider.Action> r13, java.util.List<java.lang.String> r14) {
            r11 = this;
            boolean r0 = r12.isEmpty()
            if (r0 != 0) goto L113
            one.block.eosiojava.models.rpcProvider.Transaction r0 = new one.block.eosiojava.models.rpcProvider.Transaction
            java.math.BigInteger r7 = java.math.BigInteger.ZERO
            java.util.ArrayList r10 = new java.util.ArrayList
            r10.<init>()
            java.lang.String r2 = ""
            r1 = r0
            r3 = r7
            r4 = r7
            r5 = r7
            r6 = r7
            r8 = r13
            r9 = r12
            r1.<init>(r2, r3, r4, r5, r6, r7, r8, r9, r10)
            one.block.eosiojava.models.rpcProvider.ContextFreeData r12 = new one.block.eosiojava.models.rpcProvider.ContextFreeData
            r12.<init>(r14)
            one.block.eosiojava.interfaces.IRPCProvider r13 = r11.rpcProvider     // Catch: one.block.eosiojava.error.rpcProvider.GetInfoRpcError -> L10a
            one.block.eosiojava.models.rpcProvider.response.GetInfoResponse r13 = r13.getInfo()     // Catch: one.block.eosiojava.error.rpcProvider.GetInfoRpcError -> L10a
            java.lang.String r14 = r11.chainId
            boolean r14 = p185k7.C3828h5.m8605t(r14)
            if (r14 == 0) goto L47
            java.lang.String r14 = r13.getChainId()
            boolean r14 = p185k7.C3828h5.m8605t(r14)
            if (r14 != 0) goto L3f
            java.lang.String r14 = r13.getChainId()
            r11.chainId = r14
            goto L79
        L3f:
            one.block.eosiojava.error.session.TransactionPrepareError r12 = new one.block.eosiojava.error.session.TransactionPrepareError
            java.lang.String r13 = "Chain id from back end is empty!"
            r12.<init>(r13)
            throw r12
        L47:
            java.lang.String r14 = r13.getChainId()
            boolean r14 = p185k7.C3828h5.m8605t(r14)
            if (r14 != 0) goto L79
            java.lang.String r14 = r13.getChainId()
            java.lang.String r1 = r11.chainId
            boolean r14 = r14.equals(r1)
            if (r14 == 0) goto L5e
            goto L79
        L5e:
            one.block.eosiojava.error.session.TransactionPrepareError r12 = new one.block.eosiojava.error.session.TransactionPrepareError
            r14 = 2
            java.lang.Object[] r14 = new java.lang.Object[r14]
            r0 = 0
            java.lang.String r1 = r11.chainId
            r14[r0] = r1
            r0 = 1
            java.lang.String r13 = r13.getChainId()
            r14[r0] = r13
            java.lang.String r13 = "Provided chain id %s does not match chain id %s"
            java.lang.String r13 = java.lang.String.format(r13, r14)
            r12.<init>(r13)
            throw r12
        L79:
            one.block.eosiojava.models.rpcProvider.TransactionConfig r14 = r11.transactionConfig
            boolean r14 = r14.getUseLastIrreversible()
            one.block.eosiojava.models.rpcProvider.TransactionConfig r1 = r11.transactionConfig
            int r1 = r1.getBlocksBehind()
            if (r14 == 0) goto L8c
            java.math.BigInteger r13 = r13.getLastIrreversibleBlockNum()
            goto Lac
        L8c:
            java.math.BigInteger r14 = r13.getHeadBlockNum()
            long r1 = (long) r1
            java.math.BigInteger r3 = java.math.BigInteger.valueOf(r1)
            int r14 = r14.compareTo(r3)
            if (r14 <= 0) goto La8
            java.math.BigInteger r13 = r13.getHeadBlockNum()
            java.math.BigInteger r14 = java.math.BigInteger.valueOf(r1)
            java.math.BigInteger r13 = r13.subtract(r14)
            goto Lac
        La8:
            java.math.BigInteger r13 = java.math.BigInteger.valueOf(r1)
        Lac:
            one.block.eosiojava.interfaces.IRPCProvider r14 = r11.rpcProvider     // Catch: one.block.eosiojava.error.rpcProvider.GetBlockInfoRpcError -> L101
            one.block.eosiojava.models.rpcProvider.request.GetBlockInfoRequest r1 = new one.block.eosiojava.models.rpcProvider.request.GetBlockInfoRequest     // Catch: one.block.eosiojava.error.rpcProvider.GetBlockInfoRpcError -> L101
            r1.<init>(r13)     // Catch: one.block.eosiojava.error.rpcProvider.GetBlockInfoRpcError -> L101
            one.block.eosiojava.models.rpcProvider.response.GetBlockInfoResponse r13 = r14.getBlockInfo(r1)     // Catch: one.block.eosiojava.error.rpcProvider.GetBlockInfoRpcError -> L101
            java.lang.String r14 = r0.getExpiration()
            boolean r14 = r14.isEmpty()
            if (r14 == 0) goto Le4
            java.lang.String r14 = r13.getTimestamp()
            long r1 = one.block.eosiojava.utilities.DateFormatter.convertBackendTimeToMilli(r14)     // Catch: java.text.ParseException -> Ldb
            one.block.eosiojava.models.rpcProvider.TransactionConfig r14 = r11.transactionConfig
            int r14 = r14.getExpiresSeconds()
            int r14 = r14 * 1000
            long r3 = (long) r14
            long r1 = r1 + r3
            java.lang.String r14 = one.block.eosiojava.utilities.DateFormatter.m11630x5f0467e9(r1)
            r0.setExpiration(r14)
            goto Le4
        Ldb:
            r12 = move-exception
            one.block.eosiojava.error.session.TransactionPrepareError r13 = new one.block.eosiojava.error.session.TransactionPrepareError
            java.lang.String r14 = "Failed to parse TAPOS block time"
            r13.<init>(r14, r12)
            throw r13
        Le4:
            java.math.BigInteger r14 = r13.getBlockNum()
            r1 = 65535(0xffff, double:3.23786E-319)
            java.math.BigInteger r1 = java.math.BigInteger.valueOf(r1)
            java.math.BigInteger r14 = r14.and(r1)
            java.math.BigInteger r13 = r13.getRefBlockPrefix()
            r0.setRefBlockNum(r14)
            r0.setRefBlockPrefix(r13)
            r11.finishPreparing(r0, r12)
            return
        L101:
            r12 = move-exception
            one.block.eosiojava.error.session.TransactionPrepareRpcError r13 = new one.block.eosiojava.error.session.TransactionPrepareRpcError
            java.lang.String r14 = "Error happened on calling GetBlockInfo RPC."
            r13.<init>(r14, r12)
            throw r13
        L10a:
            r12 = move-exception
            one.block.eosiojava.error.session.TransactionPrepareRpcError r13 = new one.block.eosiojava.error.session.TransactionPrepareRpcError
            java.lang.String r14 = "Error happened on calling GetInfo RPC."
            r13.<init>(r14, r12)
            throw r13
        L113:
            one.block.eosiojava.error.session.TransactionPrepareInputError r12 = new one.block.eosiojava.error.session.TransactionPrepareInputError
            java.lang.String r13 = "Action list can't be empty!"
            r12.<init>(r13)
            throw r12
    }

    public java.lang.String serialize() {
            r3 = this;
            java.lang.String r0 = r3.serializedTransaction
            if (r0 == 0) goto Ld
            boolean r0 = r0.isEmpty()
            if (r0 != 0) goto Ld
            java.lang.String r0 = r3.serializedTransaction
            return r0
        Ld:
            java.lang.String r0 = r3.serializeTransaction()     // Catch: one.block.eosiojava.error.session.C5317x30aed457 -> L12
            return r0
        L12:
            r0 = move-exception
            one.block.eosiojava.error.session.TransactionSerializeError r1 = new one.block.eosiojava.error.session.TransactionSerializeError
            java.lang.String r2 = "Error happened on calling serializeTransaction"
            r1.<init>(r2, r0)
            throw r1
    }

    public void setAvailableKeys(java.util.List<java.lang.String> r1) {
            r0 = this;
            r0.availableKeys = r1
            return
    }

    public void setChainId(java.lang.String r1) {
            r0 = this;
            r0.chainId = r1
            return
    }

    /* renamed from: setIsTransactionModificationAllowed */
    public void m11629xb21b08fa(boolean r1) {
            r0 = this;
            r0.isTransactionModificationAllowed = r1
            return
    }

    public void setRequiredKeys(java.util.List<java.lang.String> r1) {
            r0 = this;
            r0.requiredKeys = r1
            return
    }

    public void setTransactionConfig(one.block.eosiojava.models.rpcProvider.TransactionConfig r1) {
            r0 = this;
            r0.transactionConfig = r1
            return
    }

    public boolean sign() {
            r3 = this;
            one.block.eosiojava.models.signatureProvider.EosioTransactionSignatureRequest r0 = r3.createSignatureRequest()     // Catch: one.block.eosiojava.error.session.C5317x30aed457 -> L25
            one.block.eosiojava.models.signatureProvider.EosioTransactionSignatureResponse r0 = r3.getSignature(r0)     // Catch: one.block.eosiojava.error.signatureProvider.SignatureProviderError -> L15 one.block.eosiojava.error.session.TransactionGetSignatureError -> L1e
            one.block.eosiojava.error.signatureProvider.SignatureProviderError r1 = r0.getError()     // Catch: one.block.eosiojava.error.signatureProvider.SignatureProviderError -> L15 one.block.eosiojava.error.session.TransactionGetSignatureError -> L1e
            if (r1 != 0) goto L10
            r0 = 1
            return r0
        L10:
            one.block.eosiojava.error.signatureProvider.SignatureProviderError r0 = r0.getError()     // Catch: one.block.eosiojava.error.signatureProvider.SignatureProviderError -> L15 one.block.eosiojava.error.session.TransactionGetSignatureError -> L1e
            throw r0     // Catch: one.block.eosiojava.error.signatureProvider.SignatureProviderError -> L15 one.block.eosiojava.error.session.TransactionGetSignatureError -> L1e
        L15:
            r0 = move-exception
            one.block.eosiojava.error.session.TransactionSignError r1 = new one.block.eosiojava.error.session.TransactionSignError
            java.lang.String r2 = "Error happened on the response of getSignature."
            r1.<init>(r2, r0)
            throw r1
        L1e:
            r0 = move-exception
            one.block.eosiojava.error.session.TransactionSignError r1 = new one.block.eosiojava.error.session.TransactionSignError
            r1.<init>(r0)
            throw r1
        L25:
            r0 = move-exception
            one.block.eosiojava.error.session.TransactionSignError r1 = new one.block.eosiojava.error.session.TransactionSignError
            java.lang.String r2 = "Error happened on creating signature request for Signature Provider to sign!"
            r1.<init>(r2, r0)
            throw r1
    }

    public one.block.eosiojava.models.rpcProvider.response.SendTransactionResponse signAndBroadcast() {
            r5 = this;
            one.block.eosiojava.models.signatureProvider.EosioTransactionSignatureRequest r0 = r5.createSignatureRequest()     // Catch: one.block.eosiojava.error.session.C5317x30aed457 -> L4c
            r5.getSignature(r0)     // Catch: one.block.eosiojava.error.session.TransactionGetSignatureError -> L45
            java.lang.String r0 = r5.serializedTransaction
            if (r0 == 0) goto L3d
            boolean r0 = r0.isEmpty()
            if (r0 != 0) goto L3d
            java.util.List<java.lang.String> r0 = r5.signatures
            boolean r0 = r0.isEmpty()
            if (r0 != 0) goto L35
            one.block.eosiojava.models.rpcProvider.request.SendTransactionRequest r0 = new one.block.eosiojava.models.rpcProvider.request.SendTransactionRequest
            java.util.List<java.lang.String> r1 = r5.signatures
            r2 = 0
            one.block.eosiojava.models.rpcProvider.ContextFreeData r3 = r5.contextFreeData
            java.lang.String r3 = r3.getHexed()
            java.lang.String r4 = r5.serializedTransaction
            r0.<init>(r1, r2, r3, r4)
            one.block.eosiojava.models.rpcProvider.response.SendTransactionResponse r0 = r5.sendTransaction(r0)     // Catch: one.block.eosiojava.error.session.TransactionSendTransactionError -> L2e
            return r0
        L2e:
            r0 = move-exception
            one.block.eosiojava.error.session.TransactionSignAndBroadCastError r1 = new one.block.eosiojava.error.session.TransactionSignAndBroadCastError
            r1.<init>(r0)
            throw r1
        L35:
            one.block.eosiojava.error.session.TransactionSignAndBroadCastError r0 = new one.block.eosiojava.error.session.TransactionSignAndBroadCastError
            java.lang.String r1 = "Can't call sign and broadcast because Signature is empty. Make sure of calling sign before calling sign and broadcast."
            r0.<init>(r1)
            throw r0
        L3d:
            one.block.eosiojava.error.session.TransactionSignAndBroadCastError r0 = new one.block.eosiojava.error.session.TransactionSignAndBroadCastError
            java.lang.String r1 = "Serialized Transaction is empty or has not been populated. Make sure to call prepare then sign before calling sign and broadcast"
            r0.<init>(r1)
            throw r0
        L45:
            r0 = move-exception
            one.block.eosiojava.error.session.TransactionSignAndBroadCastError r1 = new one.block.eosiojava.error.session.TransactionSignAndBroadCastError
            r1.<init>(r0)
            throw r1
        L4c:
            r0 = move-exception
            one.block.eosiojava.error.session.TransactionSignAndBroadCastError r1 = new one.block.eosiojava.error.session.TransactionSignAndBroadCastError
            r1.<init>(r0)
            throw r1
    }

    public java.lang.String toJSON() {
            r2 = this;
            java.lang.String r0 = "yyyy-MM-dd'T'HH:mm:ss.SSS"
            jb.j r0 = one.block.eosiojava.utilities.Utils.getGson(r0)
            one.block.eosiojava.models.rpcProvider.Transaction r1 = r2.transaction
            java.lang.String r0 = r0.m7935i(r1)
            return r0
    }
}
