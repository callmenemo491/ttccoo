package one.block.eosiojava.session;

/* loaded from: classes.dex */
public class TransactionSession {
    private one.block.eosiojava.interfaces.IABIProvider abiProvider;
    private one.block.eosiojava.interfaces.IRPCProvider rpcProvider;
    private one.block.eosiojava.interfaces.ISerializationProvider serializationProvider;
    private one.block.eosiojava.interfaces.ISignatureProvider signatureProvider;

    public TransactionSession(one.block.eosiojava.interfaces.ISerializationProvider r1, one.block.eosiojava.interfaces.IRPCProvider r2, one.block.eosiojava.interfaces.IABIProvider r3, one.block.eosiojava.interfaces.ISignatureProvider r4) {
            r0 = this;
            r0.<init>()
            r0.serializationProvider = r1
            r0.rpcProvider = r2
            r0.abiProvider = r3
            r0.signatureProvider = r4
            return
    }

    public one.block.eosiojava.interfaces.IABIProvider getAbiProvider() {
            r1 = this;
            one.block.eosiojava.interfaces.IABIProvider r0 = r1.abiProvider
            return r0
    }

    public one.block.eosiojava.interfaces.IRPCProvider getRpcProvider() {
            r1 = this;
            one.block.eosiojava.interfaces.IRPCProvider r0 = r1.rpcProvider
            return r0
    }

    public one.block.eosiojava.interfaces.ISerializationProvider getSerializationProvider() {
            r1 = this;
            one.block.eosiojava.interfaces.ISerializationProvider r0 = r1.serializationProvider
            return r0
    }

    public one.block.eosiojava.interfaces.ISignatureProvider getSignatureProvider() {
            r1 = this;
            one.block.eosiojava.interfaces.ISignatureProvider r0 = r1.signatureProvider
            return r0
    }

    public one.block.eosiojava.session.TransactionProcessor getTransactionProcessor() {
            r5 = this;
            one.block.eosiojava.session.TransactionProcessor r0 = new one.block.eosiojava.session.TransactionProcessor
            one.block.eosiojava.interfaces.ISerializationProvider r1 = r5.serializationProvider
            one.block.eosiojava.interfaces.IRPCProvider r2 = r5.rpcProvider
            one.block.eosiojava.interfaces.IABIProvider r3 = r5.abiProvider
            one.block.eosiojava.interfaces.ISignatureProvider r4 = r5.signatureProvider
            r0.<init>(r1, r2, r3, r4)
            return r0
    }

    public one.block.eosiojava.session.TransactionProcessor getTransactionProcessor(one.block.eosiojava.models.rpcProvider.Transaction r8) {
            r7 = this;
            one.block.eosiojava.session.TransactionProcessor r6 = new one.block.eosiojava.session.TransactionProcessor
            one.block.eosiojava.interfaces.ISerializationProvider r1 = r7.serializationProvider
            one.block.eosiojava.interfaces.IRPCProvider r2 = r7.rpcProvider
            one.block.eosiojava.interfaces.IABIProvider r3 = r7.abiProvider
            one.block.eosiojava.interfaces.ISignatureProvider r4 = r7.signatureProvider
            r0 = r6
            r5 = r8
            r0.<init>(r1, r2, r3, r4, r5)
            return r6
    }
}
