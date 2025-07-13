package p172jf;

/* renamed from: jf.c */
/* loaded from: classes.dex */
public final class C3594c extends p239nh.AbstractC4830j implements mh.InterfaceC4609a<ch.C0985l> {

    /* renamed from: Z */
    public final /* synthetic */ p192kf.C4118o f15758Z;

    /* renamed from: a0 */
    public final /* synthetic */ p172jf.C3593b f15759a0;

    /* renamed from: b0 */
    public final /* synthetic */ java.lang.String f15760b0;

    /* renamed from: c0 */
    public final /* synthetic */ p192kf.C4120q f15761c0;

    public C3594c(p192kf.C4118o r1, p172jf.C3593b r2, java.lang.String r3, p192kf.C4120q r4) {
            r0 = this;
            r0.f15758Z = r1
            r0.f15759a0 = r2
            r0.f15760b0 = r3
            r0.f15761c0 = r4
            r1 = 0
            r0.<init>(r1)
            return
    }

    @Override // mh.InterfaceC4609a
    /* renamed from: e */
    public ch.C0985l mo15e() {
            r13 = this;
            kf.o r0 = r13.f15758Z
            r1 = 0
            java.lang.String r2 = "farminggames"
            java.lang.String r3 = "USER_NOT_SIGNED"
            r4 = 0
            java.lang.String r5 = "completion"
            java.lang.String r6 = "assetId"
            java.lang.String r7 = "context"
            r8 = 1
            if (r0 == 0) goto L85
            jf.b r0 = r13.f15759a0
            int r9 = p172jf.C3593b.f15733q1
            jf.g r0 = r0.m8019Q0()
            jf.b r9 = r13.f15759a0
            android.content.Context r9 = r9.m1334s0()
            kf.o r10 = r13.f15758Z
            java.util.Objects.requireNonNull(r0)
            p214m2.C4339q.m9706k(r9, r7)
            java.lang.String r11 = "innerAsset"
            p214m2.C4339q.m9706k(r10, r11)
            nd.b0 r11 = r0.f15768c
            java.lang.String r10 = r10.f17112a
            jf.p r12 = new jf.p
            r12.<init>(r0)
            java.util.Objects.requireNonNull(r11)
            p214m2.C4339q.m9706k(r9, r7)
            p214m2.C4339q.m9706k(r10, r6)
            p214m2.C4339q.m9706k(r12, r5)
            r11.f18918n = r12
            id.b r0 = r11.m10795h()
            if (r0 != 0) goto L4b
            goto L120
        L4b:
            java.lang.String r5 = r0.f12559a
            int r6 = r5.length()
            if (r6 != 0) goto L54
            r4 = 1
        L54:
            if (r4 != 0) goto L7f
            one.block.eosiojava.models.rpcProvider.Authorization r3 = new one.block.eosiojava.models.rpcProvider.Authorization
            java.lang.String r4 = r11.f18911g
            r3.<init>(r5, r4)
            b3.b r4 = new b3.b
            r4.<init>(r8)
            nd.w0 r6 = new nd.w0
            pd.j1 r7 = new pd.j1
            r7.<init>(r5, r10)
            java.util.List r5 = p074e9.C1805a.m4528m(r3)
            java.lang.String r8 = "rmvanimal"
            r6.<init>(r2, r8, r7, r5)
            r4.m2208c(r6)
            nd.a r2 = p238nd.EnumC4724a.f18891u0
            r4.m2209d(r2, r3)
            r11.m10804r(r9, r0, r4, r1)
            goto L120
        L7f:
            java.lang.Exception r0 = new java.lang.Exception
            r0.<init>(r3)
            throw r0
        L85:
            java.lang.String r0 = r13.f15760b0
            if (r0 == 0) goto L9e
            jf.b r0 = r13.f15759a0
            int r1 = p172jf.C3593b.f15733q1
            jf.g r0 = r0.m8019Q0()
            jf.b r1 = r13.f15759a0
            android.content.Context r1 = r1.m1334s0()
            java.lang.String r2 = r13.f15760b0
            r0.m8036q(r1, r2)
            goto L120
        L9e:
            kf.q r0 = r13.f15761c0
            if (r0 == 0) goto L120
            jf.b r0 = r13.f15759a0
            int r9 = p172jf.C3593b.f15733q1
            jf.g r0 = r0.m8019Q0()
            jf.b r9 = r13.f15759a0
            android.content.Context r9 = r9.m1334s0()
            kf.q r10 = r13.f15761c0
            java.util.Objects.requireNonNull(r0)
            p214m2.C4339q.m9706k(r9, r7)
            java.lang.String r11 = "garden"
            p214m2.C4339q.m9706k(r10, r11)
            int r11 = r10.f17140i
            r12 = 3245(0xcad, float:4.547E-42)
            if (r11 == r12) goto Lc9
            java.lang.String r1 = r10.f17132a
            r0.m8036q(r9, r1)
            goto L120
        Lc9:
            nd.b0 r11 = r0.f15768c
            java.lang.String r10 = r10.f17132a
            jf.q r12 = new jf.q
            r12.<init>(r0)
            java.util.Objects.requireNonNull(r11)
            p214m2.C4339q.m9706k(r9, r7)
            p214m2.C4339q.m9706k(r10, r6)
            p214m2.C4339q.m9706k(r12, r5)
            r11.f18918n = r12
            id.b r0 = r11.m10795h()
            if (r0 != 0) goto Le7
            goto L120
        Le7:
            java.lang.String r5 = r0.f12559a
            int r6 = r5.length()
            if (r6 != 0) goto Lf0
            r4 = 1
        Lf0:
            if (r4 != 0) goto L11a
            one.block.eosiojava.models.rpcProvider.Authorization r3 = new one.block.eosiojava.models.rpcProvider.Authorization
            java.lang.String r4 = r11.f18911g
            r3.<init>(r5, r4)
            b3.b r4 = new b3.b
            r4.<init>(r8)
            nd.w0 r6 = new nd.w0
            pd.j1 r7 = new pd.j1
            r7.<init>(r5, r10)
            java.util.List r5 = p074e9.C1805a.m4528m(r3)
            java.lang.String r8 = "rmvflower"
            r6.<init>(r2, r8, r7, r5)
            r4.m2208c(r6)
            nd.a r2 = p238nd.EnumC4724a.f18889s0
            r4.m2209d(r2, r3)
            r11.m10804r(r9, r0, r4, r1)
            goto L120
        L11a:
            java.lang.Exception r0 = new java.lang.Exception
            r0.<init>(r3)
            throw r0
        L120:
            ch.l r0 = ch.C0985l.f5061a
            return r0
    }
}
