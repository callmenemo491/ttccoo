package fi;

/* renamed from: fi.a */
/* loaded from: classes.dex */
public final class C2179a implements bi.InterfaceC0804x {

    /* renamed from: a */
    public static final fi.C2179a f9921a = null;

    static {
            fi.a r0 = new fi.a
            r0.<init>()
            fi.C2179a.f9921a = r0
            return
    }

    public C2179a() {
            r0 = this;
            r0.<init>()
            return
    }

    @Override // bi.InterfaceC0804x
    /* renamed from: a */
    public bi.C0783g0 mo2456a(bi.InterfaceC0804x.a r12) {
            r11 = this;
            gi.g r12 = (gi.C2397g) r12
            fi.c r0 = r12.f10782b
            java.util.Objects.requireNonNull(r0)
            monitor-enter(r0)
            boolean r1 = r0.f9950j0     // Catch: java.lang.Throwable -> Laf
            if (r1 == 0) goto La3
            boolean r1 = r0.f9949i0     // Catch: java.lang.Throwable -> Laf
            r2 = 1
            r1 = r1 ^ r2
            if (r1 == 0) goto L97
            boolean r1 = r0.f9948h0     // Catch: java.lang.Throwable -> Laf
            r1 = r1 ^ r2
            if (r1 == 0) goto L8b
            monitor-exit(r0)
            zb.e r1 = r0.f9944d0
            p214m2.C4339q.m9704i(r1)
            bi.a0 r10 = r0.f9954n0
            java.lang.String r3 = "client"
            p214m2.C4339q.m9706k(r10, r3)
            int r4 = r12.f10787g     // Catch: java.io.IOException -> L7a fi.C2187i -> L84
            int r5 = r12.f10788h     // Catch: java.io.IOException -> L7a fi.C2187i -> L84
            int r6 = r12.f10789i     // Catch: java.io.IOException -> L7a fi.C2187i -> L84
            r7 = 0
            boolean r8 = r10.f4143d0     // Catch: java.io.IOException -> L7a fi.C2187i -> L84
            bi.c0 r3 = r12.f10786f     // Catch: java.io.IOException -> L7a fi.C2187i -> L84
            java.lang.String r3 = r3.f4195c     // Catch: java.io.IOException -> L7a fi.C2187i -> L84
            java.lang.String r9 = "GET"
            boolean r3 = p214m2.C4339q.m9702c(r3, r9)     // Catch: java.io.IOException -> L7a fi.C2187i -> L84
            r9 = r3 ^ 1
            r3 = r1
            fi.g r3 = r3.m14382b(r4, r5, r6, r7, r8, r9)     // Catch: java.io.IOException -> L7a fi.C2187i -> L84
            gi.d r3 = r3.m5771j(r10, r12)     // Catch: java.io.IOException -> L7a fi.C2187i -> L84
            fi.b r4 = new fi.b
            bi.s r5 = r0.f9940Z
            r4.<init>(r0, r5, r1, r3)
            r0.f9947g0 = r4
            r0.f9952l0 = r4
            monitor-enter(r0)
            r0.f9948h0 = r2     // Catch: java.lang.Throwable -> L77
            r0.f9949i0 = r2     // Catch: java.lang.Throwable -> L77
            monitor-exit(r0)
            boolean r0 = r0.f9951k0
            if (r0 != 0) goto L6f
            r1 = 0
            r3 = 0
            r5 = 0
            r6 = 0
            r7 = 0
            r8 = 61
            r0 = r12
            r2 = r4
            r4 = r5
            r5 = r6
            r6 = r7
            r7 = r8
            gi.g r0 = gi.C2397g.m6148b(r0, r1, r2, r3, r4, r5, r6, r7)
            bi.c0 r12 = r12.f10786f
            bi.g0 r12 = r0.m6150c(r12)
            return r12
        L6f:
            java.io.IOException r12 = new java.io.IOException
            java.lang.String r0 = "Canceled"
            r12.<init>(r0)
            throw r12
        L77:
            r12 = move-exception
            monitor-exit(r0)
            throw r12
        L7a:
            r12 = move-exception
            r1.m14385e(r12)
            fi.i r0 = new fi.i
            r0.<init>(r12)
            throw r0
        L84:
            r12 = move-exception
            java.io.IOException r0 = r12.f9989Y
            r1.m14385e(r0)
            throw r12
        L8b:
            java.lang.String r12 = "Check failed."
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException     // Catch: java.lang.Throwable -> Laf
            java.lang.String r12 = r12.toString()     // Catch: java.lang.Throwable -> Laf
            r1.<init>(r12)     // Catch: java.lang.Throwable -> Laf
            throw r1     // Catch: java.lang.Throwable -> Laf
        L97:
            java.lang.String r12 = "Check failed."
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException     // Catch: java.lang.Throwable -> Laf
            java.lang.String r12 = r12.toString()     // Catch: java.lang.Throwable -> Laf
            r1.<init>(r12)     // Catch: java.lang.Throwable -> Laf
            throw r1     // Catch: java.lang.Throwable -> Laf
        La3:
            java.lang.String r12 = "released"
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException     // Catch: java.lang.Throwable -> Laf
            java.lang.String r12 = r12.toString()     // Catch: java.lang.Throwable -> Laf
            r1.<init>(r12)     // Catch: java.lang.Throwable -> Laf
            throw r1     // Catch: java.lang.Throwable -> Laf
        Laf:
            r12 = move-exception
            monitor-exit(r0)
            throw r12
    }
}
