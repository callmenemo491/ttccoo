package p238nd;

/* renamed from: nd.u0 */
/* loaded from: classes.dex */
public final class C4779u0 extends p239nh.AbstractC4830j implements mh.InterfaceC4609a<one.block.eosiojava.session.TransactionSession> {

    /* renamed from: Z */
    public final /* synthetic */ p238nd.C4728b0 f19120Z;

    public C4779u0(p238nd.C4728b0 r1) {
            r0 = this;
            r0.f19120Z = r1
            r1 = 0
            r0.<init>(r1)
            return
    }

    @Override // mh.InterfaceC4609a
    /* renamed from: e */
    public one.block.eosiojava.session.TransactionSession mo15e() {
            r5 = this;
            one.block.eosiojavarpcprovider.implementations.EosioJavaRpcProviderImpl r0 = new one.block.eosiojavarpcprovider.implementations.EosioJavaRpcProviderImpl
            nd.b0 r1 = r5.f19120Z
            java.util.Objects.requireNonNull(r1)
            nd.v0 r1 = p238nd.C4781v0.f19121e
            java.lang.String r2 = "Please for EndpointManager us initialize() before getting the instance."
            java.util.Objects.requireNonNull(r1, r2)
            p214m2.C4339q.m9704i(r1)
            java.lang.String r1 = r1.f19124c
            r2 = 0
            r0.<init>(r1, r2)
            one.block.eosiojavaabieosserializationprovider.AbiEosSerializationProviderImpl r1 = new one.block.eosiojavaabieosserializationprovider.AbiEosSerializationProviderImpl
            r1.<init>()
            one.block.eosiojava.implementations.ABIProviderImpl r2 = new one.block.eosiojava.implementations.ABIProviderImpl
            r2.<init>(r0, r1)
            one.block.eosiosoftkeysignatureprovider.SoftKeySignatureProviderImpl r3 = new one.block.eosiosoftkeysignatureprovider.SoftKeySignatureProviderImpl
            r3.<init>()
            one.block.eosiojava.session.TransactionSession r4 = new one.block.eosiojava.session.TransactionSession
            r4.<init>(r1, r0, r2, r3)
            return r4
    }
}
