package p459zh;

/* renamed from: zh.f */
/* loaded from: classes.dex */
public final class C7340f {

    /* renamed from: a */
    public static final p459zh.C7350p f28089a = null;

    /* renamed from: b */
    public static final p459zh.C7350p f28090b = null;

    static {
            zh.p r0 = new zh.p
            java.lang.String r1 = "UNDEFINED"
            r0.<init>(r1)
            p459zh.C7340f.f28089a = r0
            zh.p r0 = new zh.p
            java.lang.String r1 = "REUSABLE_CLAIMED"
            r0.<init>(r1)
            p459zh.C7340f.f28090b = r0
            return
    }

    /* renamed from: a */
    public static final <T> void m14417a(p101fh.InterfaceC2172d<? super T> r6, java.lang.Object r7, mh.InterfaceC4620l<? super java.lang.Throwable, ch.C0985l> r8) {
            boolean r0 = r6 instanceof p459zh.C7339e
            if (r0 == 0) goto Lb6
            zh.e r6 = (p459zh.C7339e) r6
            java.lang.Object r8 = p209lh.C4304a.m9604J(r7, r8)
            vh.z r0 = r6.f28085b0
            fh.g r1 = r6.mo5706c()
            boolean r0 = r0.mo1433y0(r1)
            r1 = 1
            if (r0 == 0) goto L26
            r6.f28087d0 = r8
            r6.f26003a0 = r1
            vh.z r7 = r6.f28085b0
            fh.g r8 = r6.mo5706c()
            r7.mo156x0(r8, r6)
            goto Lb9
        L26:
            vh.s1 r0 = p379vh.C6738s1.f26034a
            vh.o0 r0 = p379vh.C6738s1.m13665a()
            boolean r2 = r0.m13646D0()
            if (r2 == 0) goto L3b
            r6.f28087d0 = r8
            r6.f26003a0 = r1
            r0.m13644B0(r6)
            goto Lb9
        L3b:
            r0.m13645C0(r1)
            r2 = 0
            fh.g r3 = r6.mo5706c()     // Catch: java.lang.Throwable -> La9
            vh.b1$b r4 = p379vh.InterfaceC6687b1.b.f25958Y     // Catch: java.lang.Throwable -> La9
            fh.g$a r3 = r3.get(r4)     // Catch: java.lang.Throwable -> La9
            vh.b1 r3 = (p379vh.InterfaceC6687b1) r3     // Catch: java.lang.Throwable -> La9
            if (r3 == 0) goto L6b
            boolean r4 = r3.mo13544a()     // Catch: java.lang.Throwable -> La9
            if (r4 != 0) goto L6b
            java.util.concurrent.CancellationException r3 = r3.mo13551S()     // Catch: java.lang.Throwable -> La9
            boolean r4 = r8 instanceof p379vh.C6742u     // Catch: java.lang.Throwable -> La9
            if (r4 == 0) goto L62
            vh.u r8 = (p379vh.C6742u) r8     // Catch: java.lang.Throwable -> La9
            mh.l<java.lang.Throwable, ch.l> r8 = r8.f26040b     // Catch: java.lang.Throwable -> La9
            r8.mo107b(r3)     // Catch: java.lang.Throwable -> La9
        L62:
            java.lang.Object r8 = p074e9.C1805a.m4520e(r3)     // Catch: java.lang.Throwable -> La9
            r6.mo5707k(r8)     // Catch: java.lang.Throwable -> La9
            r8 = 1
            goto L6c
        L6b:
            r8 = 0
        L6c:
            if (r8 != 0) goto La2
            fh.d<T> r8 = r6.f28086c0     // Catch: java.lang.Throwable -> La9
            java.lang.Object r3 = r6.f28088e0     // Catch: java.lang.Throwable -> La9
            fh.g r4 = r8.mo5706c()     // Catch: java.lang.Throwable -> La9
            java.lang.Object r3 = p459zh.C7352r.m14437b(r4, r3)     // Catch: java.lang.Throwable -> La9
            zh.p r5 = p459zh.C7352r.f28111a     // Catch: java.lang.Throwable -> La9
            if (r3 == r5) goto L83
            vh.u1 r8 = p379vh.C6751x.m13669b(r8, r4, r3)     // Catch: java.lang.Throwable -> La9
            goto L84
        L83:
            r8 = r2
        L84:
            fh.d<T> r5 = r6.f28086c0     // Catch: java.lang.Throwable -> L95
            r5.mo5707k(r7)     // Catch: java.lang.Throwable -> L95
            if (r8 == 0) goto L91
            boolean r7 = r8.m13667b0()     // Catch: java.lang.Throwable -> La9
            if (r7 == 0) goto La2
        L91:
            p459zh.C7352r.m14436a(r4, r3)     // Catch: java.lang.Throwable -> La9
            goto La2
        L95:
            r7 = move-exception
            if (r8 == 0) goto L9e
            boolean r8 = r8.m13667b0()     // Catch: java.lang.Throwable -> La9
            if (r8 == 0) goto La1
        L9e:
            p459zh.C7352r.m14436a(r4, r3)     // Catch: java.lang.Throwable -> La9
        La1:
            throw r7     // Catch: java.lang.Throwable -> La9
        La2:
            boolean r7 = r0.m13647E0()     // Catch: java.lang.Throwable -> La9
            if (r7 != 0) goto La2
            goto Lad
        La9:
            r7 = move-exception
            r6.m13638h(r7, r2)     // Catch: java.lang.Throwable -> Lb1
        Lad:
            r0.m13648z0(r1)
            goto Lb9
        Lb1:
            r6 = move-exception
            r0.m13648z0(r1)
            throw r6
        Lb6:
            r6.mo5707k(r7)
        Lb9:
            return
    }

    /* renamed from: b */
    public static /* synthetic */ void m14418b(p101fh.InterfaceC2172d r0, java.lang.Object r1, mh.InterfaceC4620l r2, int r3) {
            r2 = 0
            m14417a(r0, r1, r2)
            return
    }
}
