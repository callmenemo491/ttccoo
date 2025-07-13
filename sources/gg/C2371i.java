package gg;

/* renamed from: gg.i */
/* loaded from: classes.dex */
public final class C2371i extends p239nh.AbstractC4830j implements mh.InterfaceC4620l<java.util.List<? extends java.lang.String>, ch.C0985l> {

    /* renamed from: Z */
    public final /* synthetic */ gg.C2369g f10751Z;

    /* renamed from: a0 */
    public final /* synthetic */ android.content.Context f10752a0;

    public C2371i(gg.C2369g r1, android.content.Context r2) {
            r0 = this;
            r0.f10751Z = r1
            r0.f10752a0 = r2
            r1 = 1
            r0.<init>(r1)
            return
    }

    @Override // mh.InterfaceC4620l
    /* renamed from: b */
    public ch.C0985l mo107b(java.util.List<? extends java.lang.String> r10) {
            r9 = this;
            java.util.List r10 = (java.util.List) r10
            java.lang.String r0 = "landsIds"
            p214m2.C4339q.m9706k(r10, r0)
            gg.g r0 = r9.f10751Z
            nd.b0 r1 = r0.f10708c
            android.content.Context r2 = r9.f10752a0
            gg.h r3 = new gg.h
            r3.<init>(r0)
            java.util.Objects.requireNonNull(r1)
            java.lang.String r0 = "context"
            p214m2.C4339q.m9706k(r2, r0)
            java.lang.String r0 = "landIds"
            p214m2.C4339q.m9706k(r10, r0)
            java.lang.String r0 = "completion"
            p214m2.C4339q.m9706k(r3, r0)
            r1.f18918n = r3
            id.b r0 = r1.m10795h()
            if (r0 != 0) goto L2d
            goto L65
        L2d:
            java.lang.String r3 = r0.f12559a
            int r4 = r3.length()
            r5 = 1
            if (r4 != 0) goto L38
            r4 = 1
            goto L39
        L38:
            r4 = 0
        L39:
            if (r4 != 0) goto L68
            one.block.eosiojava.models.rpcProvider.Authorization r4 = new one.block.eosiojava.models.rpcProvider.Authorization
            java.lang.String r6 = r1.f18911g
            r4.<init>(r3, r6)
            b3.b r6 = new b3.b
            r6.<init>(r5)
            nd.w0 r5 = new nd.w0
            pd.t0 r7 = new pd.t0
            r7.<init>(r3, r10)
            java.util.List r10 = p074e9.C1805a.m4528m(r4)
            java.lang.String r3 = "l.rplanet"
            java.lang.String r8 = "claim"
            r5.<init>(r3, r8, r7, r10)
            r6.m2208c(r5)
            nd.a r10 = p238nd.EnumC4724a.f18873c0
            r6.m2209d(r10, r4)
            r10 = 0
            r1.m10804r(r2, r0, r6, r10)
        L65:
            ch.l r10 = ch.C0985l.f5061a
            return r10
        L68:
            java.lang.Exception r10 = new java.lang.Exception
            java.lang.String r0 = "USER_NOT_SIGNED"
            r10.<init>(r0)
            throw r10
    }
}
