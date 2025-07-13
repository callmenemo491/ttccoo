package p238nd;

/* renamed from: nd.d0 */
/* loaded from: classes.dex */
public final class C4734d0 implements mh.InterfaceC4609a<ch.C0985l> {

    /* renamed from: Y */
    public final /* synthetic */ p238nd.C4728b0 f19004Y;

    /* renamed from: Z */
    public final /* synthetic */ java.lang.String f19005Z;

    public C4734d0(p238nd.C4728b0 r1, java.lang.String r2) {
            r0 = this;
            r0.f19004Y = r1
            r0.f19005Z = r2
            r0.<init>()
            return
    }

    @Override // mh.InterfaceC4609a
    /* renamed from: e */
    public ch.C0985l mo15e() {
            r9 = this;
            nd.b0 r0 = r9.f19004Y
            one.block.eosiojava.session.TransactionSession r0 = r0.m10796i()
            if (r0 != 0) goto L12
            r1 = 0
            java.lang.Object[] r1 = new java.lang.Object[r1]
            hk.a$b r2 = hk.C3053a.f12282b
            java.lang.String r3 = "ERROR: No TransactionSession found."
            r2.mo7467a(r3, r1)
        L12:
            if (r0 != 0) goto L15
            goto L3c
        L15:
            one.block.eosiojava.session.TransactionProcessor r0 = r0.getTransactionProcessor()
            nd.b0 r1 = r9.f19004Y
            r1.f18915k = r0
            java.lang.String r2 = "processor"
            p214m2.C4339q.m9705j(r0, r2)
            nd.b0 r2 = r9.f19004Y
            java.lang.String r3 = r9.f19005Z
            b3.b r2 = p238nd.C4728b0.m10788b(r2, r3)
            java.util.List r2 = r2.m2211g()
            vh.v0 r3 = p379vh.C6746v0.f26044Y
            nd.r0 r6 = new nd.r0
            r4 = 0
            r6.<init>(r0, r2, r1, r4)
            r7 = 3
            r8 = 0
            r5 = 0
            p101fh.C2174f.m5714d(r3, r4, r5, r6, r7, r8)
        L3c:
            ch.l r0 = ch.C0985l.f5061a
            return r0
    }
}
