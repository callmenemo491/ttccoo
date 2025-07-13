package re;

/* renamed from: re.c */
/* loaded from: classes.dex */
public final class C5819c extends p239nh.AbstractC4830j implements mh.InterfaceC4609a<ch.C0985l> {

    /* renamed from: Z */
    public final /* synthetic */ re.C5818b f22553Z;

    /* renamed from: a0 */
    public final /* synthetic */ p344te.C6223e f22554a0;

    public C5819c(re.C5818b r1, p344te.C6223e r2) {
            r0 = this;
            r0.f22553Z = r1
            r0.f22554a0 = r2
            r1 = 0
            r0.<init>(r1)
            return
    }

    @Override // mh.InterfaceC4609a
    /* renamed from: e */
    public ch.C0985l mo15e() {
            r10 = this;
            re.b r0 = r10.f22553Z
            int r1 = re.C5818b.f22542p1
            re.p r0 = r0.m12194P0()
            re.b r1 = r10.f22553Z
            android.content.Context r1 = r1.m1334s0()
            te.e r2 = r10.f22554a0
            java.lang.String r2 = r2.getSaleID()
            java.util.Objects.requireNonNull(r0)
            java.lang.String r3 = "context"
            p214m2.C4339q.m9706k(r1, r3)
            java.lang.String r4 = "saleId"
            p214m2.C4339q.m9706k(r2, r4)
            nd.b0 r4 = r0.f22567c
            long r5 = java.lang.Long.parseLong(r2)
            re.k r7 = new re.k
            r7.<init>(r0, r2)
            java.util.Objects.requireNonNull(r4)
            p214m2.C4339q.m9706k(r1, r3)
            java.lang.String r0 = "completion"
            p214m2.C4339q.m9706k(r7, r0)
            r4.f18918n = r7
            id.b r0 = r4.m10795h()
            if (r0 != 0) goto L40
            goto L7c
        L40:
            java.lang.String r2 = r0.f12559a
            int r3 = r2.length()
            r7 = 1
            if (r3 != 0) goto L4b
            r3 = 1
            goto L4c
        L4b:
            r3 = 0
        L4c:
            if (r3 != 0) goto L7f
            one.block.eosiojava.models.rpcProvider.Authorization r3 = new one.block.eosiojava.models.rpcProvider.Authorization
            java.lang.String r8 = r4.f18911g
            r3.<init>(r2, r8)
            b3.b r2 = new b3.b
            r2.<init>(r7)
            nd.w0 r7 = new nd.w0
            pd.j r8 = new pd.j
            java.lang.String r5 = java.lang.String.valueOf(r5)
            r8.<init>(r5)
            java.util.List r5 = p074e9.C1805a.m4528m(r3)
            java.lang.String r6 = "atomicmarket"
            java.lang.String r9 = "cancelsale"
            r7.<init>(r6, r9, r8, r5)
            r2.m2208c(r7)
            nd.a r5 = p238nd.EnumC4724a.f18861T0
            r2.m2209d(r5, r3)
            r3 = 0
            r4.m10804r(r1, r0, r2, r3)
        L7c:
            ch.l r0 = ch.C0985l.f5061a
            return r0
        L7f:
            java.lang.Exception r0 = new java.lang.Exception
            java.lang.String r1 = "USER_NOT_SIGNED"
            r0.<init>(r1)
            throw r0
    }
}
