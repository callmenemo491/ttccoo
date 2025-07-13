package p005a4;

/* renamed from: a4.h */
/* loaded from: classes.dex */
public final /* synthetic */ class RunnableC0019h implements java.lang.Runnable {

    /* renamed from: Y */
    public final /* synthetic */ p005a4.C0020i f33Y;

    /* renamed from: Z */
    public final /* synthetic */ p385w3.AbstractC6787i f34Z;

    /* renamed from: a0 */
    public final /* synthetic */ int f35a0;

    /* renamed from: b0 */
    public final /* synthetic */ java.lang.Runnable f36b0;

    public /* synthetic */ RunnableC0019h(p005a4.C0020i r1, p385w3.AbstractC6787i r2, int r3, java.lang.Runnable r4) {
            r0 = this;
            r0.<init>()
            r0.f33Y = r1
            r0.f34Z = r2
            r0.f35a0 = r3
            r0.f36b0 = r4
            return
    }

    @Override // java.lang.Runnable
    public final void run() {
            r8 = this;
            a4.i r0 = r8.f33Y
            w3.i r1 = r8.f34Z
            int r2 = r8.f35a0
            java.lang.Runnable r3 = r8.f36b0
            java.util.Objects.requireNonNull(r0)
            r4 = 1
            c4.b r5 = r0.f42f     // Catch: java.lang.Throwable -> L45 p034c4.C0866a -> L47
            b4.c r6 = r0.f39c     // Catch: java.lang.Throwable -> L45 p034c4.C0866a -> L47
            java.util.Objects.requireNonNull(r6)     // Catch: java.lang.Throwable -> L45 p034c4.C0866a -> L47
            u3.b r7 = new u3.b     // Catch: java.lang.Throwable -> L45 p034c4.C0866a -> L47
            r7.<init>(r6)     // Catch: java.lang.Throwable -> L45 p034c4.C0866a -> L47
            r5.mo2235a(r7)     // Catch: java.lang.Throwable -> L45 p034c4.C0866a -> L47
            android.content.Context r5 = r0.f37a     // Catch: java.lang.Throwable -> L45 p034c4.C0866a -> L47
            java.lang.String r6 = "connectivity"
            java.lang.Object r5 = r5.getSystemService(r6)     // Catch: java.lang.Throwable -> L45 p034c4.C0866a -> L47
            android.net.ConnectivityManager r5 = (android.net.ConnectivityManager) r5     // Catch: java.lang.Throwable -> L45 p034c4.C0866a -> L47
            android.net.NetworkInfo r5 = r5.getActiveNetworkInfo()     // Catch: java.lang.Throwable -> L45 p034c4.C0866a -> L47
            if (r5 == 0) goto L33
            boolean r5 = r5.isConnected()     // Catch: java.lang.Throwable -> L45 p034c4.C0866a -> L47
            if (r5 == 0) goto L33
            r5 = 1
            goto L34
        L33:
            r5 = 0
        L34:
            if (r5 != 0) goto L41
            c4.b r5 = r0.f42f     // Catch: java.lang.Throwable -> L45 p034c4.C0866a -> L47
            a4.e r6 = new a4.e     // Catch: java.lang.Throwable -> L45 p034c4.C0866a -> L47
            r6.<init>(r0, r1, r2)     // Catch: java.lang.Throwable -> L45 p034c4.C0866a -> L47
            r5.mo2235a(r6)     // Catch: java.lang.Throwable -> L45 p034c4.C0866a -> L47
            goto L4d
        L41:
            r0.m26a(r1, r2)     // Catch: java.lang.Throwable -> L45 p034c4.C0866a -> L47
            goto L4d
        L45:
            r0 = move-exception
            goto L51
        L47:
            a4.l r0 = r0.f40d     // Catch: java.lang.Throwable -> L45
            int r2 = r2 + r4
            r0.mo22b(r1, r2)     // Catch: java.lang.Throwable -> L45
        L4d:
            r3.run()
            return
        L51:
            r3.run()
            throw r0
    }
}
