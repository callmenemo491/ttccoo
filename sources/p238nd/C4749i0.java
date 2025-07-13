package p238nd;

/* renamed from: nd.i0 */
/* loaded from: classes.dex */
public final class C4749i0 implements mh.InterfaceC4609a<ch.C0985l> {

    /* renamed from: Y */
    public final /* synthetic */ p238nd.C4728b0 f19052Y;

    /* renamed from: Z */
    public final /* synthetic */ java.util.List<one.block.eosiojava.models.rpcProvider.Action> f19053Z;

    public C4749i0(p238nd.C4728b0 r1, java.util.List<? extends one.block.eosiojava.models.rpcProvider.Action> r2) {
            r0 = this;
            r0.f19052Y = r1
            r0.f19053Z = r2
            r0.<init>()
            return
    }

    @Override // mh.InterfaceC4609a
    /* renamed from: e */
    public ch.C0985l mo15e() {
            r8 = this;
            nd.b0 r0 = r8.f19052Y
            one.block.eosiojava.session.TransactionSession r0 = r0.m10796i()
            if (r0 != 0) goto L12
            r1 = 0
            java.lang.Object[] r1 = new java.lang.Object[r1]
            hk.a$b r2 = hk.C3053a.f12282b
            java.lang.String r3 = "ERROR: No TransactionSession found."
            r2.mo7467a(r3, r1)
        L12:
            if (r0 != 0) goto L15
            goto L2e
        L15:
            one.block.eosiojava.session.TransactionProcessor r0 = r0.getTransactionProcessor()
            nd.b0 r1 = r8.f19052Y
            r1.f18915k = r0
            vh.v0 r2 = p379vh.C6746v0.f26044Y
            r3 = 0
            nd.h0 r5 = new nd.h0
            java.util.List<one.block.eosiojava.models.rpcProvider.Action> r4 = r8.f19053Z
            r6 = 0
            r5.<init>(r0, r4, r1, r6)
            r6 = 3
            r4 = 0
            r7 = 0
            p101fh.C2174f.m5714d(r2, r3, r4, r5, r6, r7)
        L2e:
            ch.l r0 = ch.C0985l.f5061a
            return r0
    }
}
